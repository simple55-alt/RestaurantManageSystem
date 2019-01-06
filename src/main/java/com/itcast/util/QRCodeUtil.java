package com.itcast.util;

import com.swetake.util.Qrcode;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 生成二维码的工具类，需要提供url，这里返回一个二维码图片
 *
 * 使用技术为Java Image I/O API 和 BASE64Encoder编码。
 *
 * 1、先把图片保存为base64串，返回该base64串供前台解码
 * 2、将图片保存到本地
 *
 * */

public class QRCodeUtil {

    public String getQRCodeImg() throws IOException {

        //计算二维码图片的高宽比
        // API文档规定计算图片宽高的方式 ，v是本次测试的版本号
        int v =7;
        int width =  67 + 12 * (v - 1);;
        int height =  67 + 12 * (v - 1);;


        Qrcode x = new Qrcode();
        /**
         * 纠错等级分为
         * level L : 最大 7% 的错误能够被纠正；
         * level M : 最大 15% 的错误能够被纠正；
         * level Q : 最大 25% 的错误能够被纠正；
         * level H : 最大 30% 的错误能够被纠正；
         */
        x.setQrcodeErrorCorrect('L');
        x.setQrcodeEncodeMode('B');//注意版本信息 N代表数字 、A代表 a-z,A-Z、B代表 其他)
        x.setQrcodeVersion(v);//版本号  1-40
        String qrData = "http://192.168.2.196:8080/";//内容信息

        byte[] d = qrData.getBytes("utf-8");//汉字转格式需要抛出异常

        //缓冲区
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);

        //绘图
        Graphics2D gs = bufferedImage.createGraphics();

        gs.setBackground(Color.WHITE);
        gs.setColor(Color.BLACK);
        gs.clearRect(0, 0, width, height);

        //偏移量
        int pixoff = 2;


        /**
         * 容易踩坑的地方
         * 1.注意for循环里面的i，j的顺序，
         *   s[j][i]二维数组的j，i的顺序要与这个方法中的 gs.fillRect(j*3+pixoff,i*3+pixoff, 3, 3);
         *   顺序匹配，否则会出现解析图片是一串数字
         * 2.注意此判断if (d.length > 0 && d.length < 120)
         *   是否会引起字符串长度大于120导致生成代码不执行，二维码空白
         *   根据自己的字符串大小来设置此配置
         */
        if (d.length > 0 && d.length < 120) {
            boolean[][] s = x.calQrcode(d);

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (s[j][i]) {
                        gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                    }
                }
            }
        }
        gs.dispose();
        bufferedImage.flush();

        //实例化io流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //将ImageIp写入流中
        ImageIO.write(bufferedImage, "png", baos);
        //ByteArrayOutputStream流转换成字节
        byte[] bytes = baos.toByteArray();
        /*BASE64Encoder编码*/
        BASE64Encoder encoder = new BASE64Encoder();
        /*将字节转换为base64串*/
        String png_base64 =  encoder.encodeBuffer(bytes).trim();
        /*删除base64串生成多余的 \r\n*/
        png_base64 = png_base64.replaceAll("\n", "").replaceAll("\r", "");


        /*设置图片名称*/
        String tableQrcode = "qrcode";
        /*输出二维码*/
        ImageIO.write(bufferedImage, "png", new File("H:\\work\\IntelliJ-IDEA\\maven-project\\orderSystemManager\\src\\main\\webapp\\WEB-INF\\img\\qrcode\\"+tableQrcode+".png"));
        System.out.println("二维码生成完毕");


        return png_base64;
    }

}
