package com.zhijiansihang.gen.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 登录密码
     */
    private String passwd;

    /**
     * 是否实名认证 1:为已认证 0:未认证
     */
    private Byte isNameAuth;

    /**
     * 是否冻结 1:为冻结 0:未冻结
     */
    private Byte isFrozen;

    /**
     * 是否极注册 1:为注册 0:未注册
     */
    private Byte isRegisterJg;

    /**
     * 
     */
    private String logo;

    /**
     * 用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 
     */
    private Short roles;

    /**
     * 注册来源:1平台后台创建 2:ios 3:安卓
     */
    private Short source;

    /**
     * 所属机构id即父userid
     */
    private Long institutionUserId;

    /**
     * 所属机构id即父userid
     */
    private String institutionName;

    /**
     * 风险测评等级冗余
     */
    private Short riskAssessmentLevel;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 身份证号
     * @return id_card 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 登录密码
     * @return passwd 登录密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 登录密码
     * @param passwd 登录密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * 是否实名认证 1:为已认证 0:未认证
     * @return is_name_auth 是否实名认证 1:为已认证 0:未认证
     */
    public Byte getIsNameAuth() {
        return isNameAuth;
    }

    /**
     * 是否实名认证 1:为已认证 0:未认证
     * @param isNameAuth 是否实名认证 1:为已认证 0:未认证
     */
    public void setIsNameAuth(Byte isNameAuth) {
        this.isNameAuth = isNameAuth;
    }

    /**
     * 是否冻结 1:为冻结 0:未冻结
     * @return is_frozen 是否冻结 1:为冻结 0:未冻结
     */
    public Byte getIsFrozen() {
        return isFrozen;
    }

    /**
     * 是否冻结 1:为冻结 0:未冻结
     * @param isFrozen 是否冻结 1:为冻结 0:未冻结
     */
    public void setIsFrozen(Byte isFrozen) {
        this.isFrozen = isFrozen;
    }

    /**
     * 是否极注册 1:为注册 0:未注册
     * @return is_register_jg 是否极注册 1:为注册 0:未注册
     */
    public Byte getIsRegisterJg() {
        return isRegisterJg;
    }

    /**
     * 是否极注册 1:为注册 0:未注册
     * @param isRegisterJg 是否极注册 1:为注册 0:未注册
     */
    public void setIsRegisterJg(Byte isRegisterJg) {
        this.isRegisterJg = isRegisterJg;
    }

    /**
     * 
     * @return logo 
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo 
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 
     * @return roles 用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 
     */
    public Short getRoles() {
        return roles;
    }

    /**
     * 用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 
     * @param roles 用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 
     */
    public void setRoles(Short roles) {
        this.roles = roles;
    }

    /**
     * 注册来源:1平台后台创建 2:ios 3:安卓
     * @return source 注册来源:1平台后台创建 2:ios 3:安卓
     */
    public Short getSource() {
        return source;
    }

    /**
     * 注册来源:1平台后台创建 2:ios 3:安卓
     * @param source 注册来源:1平台后台创建 2:ios 3:安卓
     */
    public void setSource(Short source) {
        this.source = source;
    }

    /**
     * 所属机构id即父userid
     * @return institution_user_id 所属机构id即父userid
     */
    public Long getInstitutionUserId() {
        return institutionUserId;
    }

    /**
     * 所属机构id即父userid
     * @param institutionUserId 所属机构id即父userid
     */
    public void setInstitutionUserId(Long institutionUserId) {
        this.institutionUserId = institutionUserId;
    }

    /**
     * 所属机构id即父userid
     * @return institution_name 所属机构id即父userid
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * 所属机构id即父userid
     * @param institutionName 所属机构id即父userid
     */
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName == null ? null : institutionName.trim();
    }

    /**
     * 风险测评等级冗余
     * @return risk_assessment_level 风险测评等级冗余
     */
    public Short getRiskAssessmentLevel() {
        return riskAssessmentLevel;
    }

    /**
     * 风险测评等级冗余
     * @param riskAssessmentLevel 风险测评等级冗余
     */
    public void setRiskAssessmentLevel(Short riskAssessmentLevel) {
        this.riskAssessmentLevel = riskAssessmentLevel;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", mobile=").append(mobile);
        sb.append(", realName=").append(realName);
        sb.append(", idCard=").append(idCard);
        sb.append(", nickName=").append(nickName);
        sb.append(", passwd=").append(passwd);
        sb.append(", isNameAuth=").append(isNameAuth);
        sb.append(", isFrozen=").append(isFrozen);
        sb.append(", isRegisterJg=").append(isRegisterJg);
        sb.append(", logo=").append(logo);
        sb.append(", roles=").append(roles);
        sb.append(", source=").append(source);
        sb.append(", institutionUserId=").append(institutionUserId);
        sb.append(", institutionName=").append(institutionName);
        sb.append(", riskAssessmentLevel=").append(riskAssessmentLevel);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}