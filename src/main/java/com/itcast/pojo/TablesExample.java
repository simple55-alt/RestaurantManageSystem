package com.itcast.pojo;

import java.util.ArrayList;
import java.util.List;

public class TablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TablesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNumIsNull() {
            addCriterion("t_num is null");
            return (Criteria) this;
        }

        public Criteria andTNumIsNotNull() {
            addCriterion("t_num is not null");
            return (Criteria) this;
        }

        public Criteria andTNumEqualTo(Integer value) {
            addCriterion("t_num =", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotEqualTo(Integer value) {
            addCriterion("t_num <>", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumGreaterThan(Integer value) {
            addCriterion("t_num >", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_num >=", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumLessThan(Integer value) {
            addCriterion("t_num <", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumLessThanOrEqualTo(Integer value) {
            addCriterion("t_num <=", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumIn(List<Integer> values) {
            addCriterion("t_num in", values, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotIn(List<Integer> values) {
            addCriterion("t_num not in", values, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumBetween(Integer value1, Integer value2) {
            addCriterion("t_num between", value1, value2, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotBetween(Integer value1, Integer value2) {
            addCriterion("t_num not between", value1, value2, "tNum");
            return (Criteria) this;
        }

        public Criteria andTStateIsNull() {
            addCriterion("t_state is null");
            return (Criteria) this;
        }

        public Criteria andTStateIsNotNull() {
            addCriterion("t_state is not null");
            return (Criteria) this;
        }

        public Criteria andTStateEqualTo(Boolean value) {
            addCriterion("t_state =", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotEqualTo(Boolean value) {
            addCriterion("t_state <>", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThan(Boolean value) {
            addCriterion("t_state >", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_state >=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThan(Boolean value) {
            addCriterion("t_state <", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThanOrEqualTo(Boolean value) {
            addCriterion("t_state <=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateIn(List<Boolean> values) {
            addCriterion("t_state in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotIn(List<Boolean> values) {
            addCriterion("t_state not in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state not between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTCommIsNull() {
            addCriterion("t_comm is null");
            return (Criteria) this;
        }

        public Criteria andTCommIsNotNull() {
            addCriterion("t_comm is not null");
            return (Criteria) this;
        }

        public Criteria andTCommEqualTo(String value) {
            addCriterion("t_comm =", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommNotEqualTo(String value) {
            addCriterion("t_comm <>", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommGreaterThan(String value) {
            addCriterion("t_comm >", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommGreaterThanOrEqualTo(String value) {
            addCriterion("t_comm >=", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommLessThan(String value) {
            addCriterion("t_comm <", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommLessThanOrEqualTo(String value) {
            addCriterion("t_comm <=", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommLike(String value) {
            addCriterion("t_comm like", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommNotLike(String value) {
            addCriterion("t_comm not like", value, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommIn(List<String> values) {
            addCriterion("t_comm in", values, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommNotIn(List<String> values) {
            addCriterion("t_comm not in", values, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommBetween(String value1, String value2) {
            addCriterion("t_comm between", value1, value2, "tComm");
            return (Criteria) this;
        }

        public Criteria andTCommNotBetween(String value1, String value2) {
            addCriterion("t_comm not between", value1, value2, "tComm");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}