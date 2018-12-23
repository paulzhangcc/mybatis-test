package com.zhijiansihang.gen.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * user
     */
    protected String orderByClause;

    /**
     * user
     */
    protected boolean distinct;

    /**
     * user
     */
    protected List<Criteria> oredCriteria;

    public UserExample() {
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

    /**
     * user null
     */
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthIsNull() {
            addCriterion("is_name_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthIsNotNull() {
            addCriterion("is_name_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthEqualTo(Byte value) {
            addCriterion("is_name_auth =", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthNotEqualTo(Byte value) {
            addCriterion("is_name_auth <>", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthGreaterThan(Byte value) {
            addCriterion("is_name_auth >", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_name_auth >=", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthLessThan(Byte value) {
            addCriterion("is_name_auth <", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthLessThanOrEqualTo(Byte value) {
            addCriterion("is_name_auth <=", value, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthIn(List<Byte> values) {
            addCriterion("is_name_auth in", values, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthNotIn(List<Byte> values) {
            addCriterion("is_name_auth not in", values, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthBetween(Byte value1, Byte value2) {
            addCriterion("is_name_auth between", value1, value2, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsNameAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("is_name_auth not between", value1, value2, "isNameAuth");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNull() {
            addCriterion("is_frozen is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNotNull() {
            addCriterion("is_frozen is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenEqualTo(Byte value) {
            addCriterion("is_frozen =", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotEqualTo(Byte value) {
            addCriterion("is_frozen <>", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThan(Byte value) {
            addCriterion("is_frozen >", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_frozen >=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThan(Byte value) {
            addCriterion("is_frozen <", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThanOrEqualTo(Byte value) {
            addCriterion("is_frozen <=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIn(List<Byte> values) {
            addCriterion("is_frozen in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotIn(List<Byte> values) {
            addCriterion("is_frozen not in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenBetween(Byte value1, Byte value2) {
            addCriterion("is_frozen between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotBetween(Byte value1, Byte value2) {
            addCriterion("is_frozen not between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgIsNull() {
            addCriterion("is_register_jg is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgIsNotNull() {
            addCriterion("is_register_jg is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgEqualTo(Byte value) {
            addCriterion("is_register_jg =", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgNotEqualTo(Byte value) {
            addCriterion("is_register_jg <>", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgGreaterThan(Byte value) {
            addCriterion("is_register_jg >", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_register_jg >=", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgLessThan(Byte value) {
            addCriterion("is_register_jg <", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgLessThanOrEqualTo(Byte value) {
            addCriterion("is_register_jg <=", value, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgIn(List<Byte> values) {
            addCriterion("is_register_jg in", values, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgNotIn(List<Byte> values) {
            addCriterion("is_register_jg not in", values, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgBetween(Byte value1, Byte value2) {
            addCriterion("is_register_jg between", value1, value2, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andIsRegisterJgNotBetween(Byte value1, Byte value2) {
            addCriterion("is_register_jg not between", value1, value2, "isRegisterJg");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(Short value) {
            addCriterion("roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(Short value) {
            addCriterion("roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(Short value) {
            addCriterion("roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(Short value) {
            addCriterion("roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(Short value) {
            addCriterion("roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(Short value) {
            addCriterion("roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<Short> values) {
            addCriterion("roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<Short> values) {
            addCriterion("roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(Short value1, Short value2) {
            addCriterion("roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(Short value1, Short value2) {
            addCriterion("roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("`source` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`source` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Short value) {
            addCriterion("`source` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Short value) {
            addCriterion("`source` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Short value) {
            addCriterion("`source` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("`source` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Short value) {
            addCriterion("`source` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Short value) {
            addCriterion("`source` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Short> values) {
            addCriterion("`source` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Short> values) {
            addCriterion("`source` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Short value1, Short value2) {
            addCriterion("`source` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Short value1, Short value2) {
            addCriterion("`source` not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdIsNull() {
            addCriterion("institution_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdIsNotNull() {
            addCriterion("institution_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdEqualTo(Long value) {
            addCriterion("institution_user_id =", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdNotEqualTo(Long value) {
            addCriterion("institution_user_id <>", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdGreaterThan(Long value) {
            addCriterion("institution_user_id >", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("institution_user_id >=", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdLessThan(Long value) {
            addCriterion("institution_user_id <", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdLessThanOrEqualTo(Long value) {
            addCriterion("institution_user_id <=", value, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdIn(List<Long> values) {
            addCriterion("institution_user_id in", values, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdNotIn(List<Long> values) {
            addCriterion("institution_user_id not in", values, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdBetween(Long value1, Long value2) {
            addCriterion("institution_user_id between", value1, value2, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionUserIdNotBetween(Long value1, Long value2) {
            addCriterion("institution_user_id not between", value1, value2, "institutionUserId");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNull() {
            addCriterion("institution_name is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNotNull() {
            addCriterion("institution_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameEqualTo(String value) {
            addCriterion("institution_name =", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotEqualTo(String value) {
            addCriterion("institution_name <>", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThan(String value) {
            addCriterion("institution_name >", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("institution_name >=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThan(String value) {
            addCriterion("institution_name <", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("institution_name <=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLike(String value) {
            addCriterion("institution_name like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotLike(String value) {
            addCriterion("institution_name not like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIn(List<String> values) {
            addCriterion("institution_name in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotIn(List<String> values) {
            addCriterion("institution_name not in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameBetween(String value1, String value2) {
            addCriterion("institution_name between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("institution_name not between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelIsNull() {
            addCriterion("risk_assessment_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelIsNotNull() {
            addCriterion("risk_assessment_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelEqualTo(Short value) {
            addCriterion("risk_assessment_level =", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelNotEqualTo(Short value) {
            addCriterion("risk_assessment_level <>", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelGreaterThan(Short value) {
            addCriterion("risk_assessment_level >", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("risk_assessment_level >=", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelLessThan(Short value) {
            addCriterion("risk_assessment_level <", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelLessThanOrEqualTo(Short value) {
            addCriterion("risk_assessment_level <=", value, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelIn(List<Short> values) {
            addCriterion("risk_assessment_level in", values, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelNotIn(List<Short> values) {
            addCriterion("risk_assessment_level not in", values, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelBetween(Short value1, Short value2) {
            addCriterion("risk_assessment_level between", value1, value2, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andRiskAssessmentLevelNotBetween(Short value1, Short value2) {
            addCriterion("risk_assessment_level not between", value1, value2, "riskAssessmentLevel");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * user null
     */
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