package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 医生
 *
 * @author 
 * @email
 */
@TableName("yisheng")
public class YishengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengEntity() {

	}

	public YishengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 医生工号
     */
    @TableField(value = "yisheng_uuid_number")

    private String yishengUuidNumber;


    /**
     * 医生姓名
     */
    @TableField(value = "yisheng_name")

    private String yishengName;


    /**
     * 医生手机号
     */
    @TableField(value = "yisheng_phone")

    private String yishengPhone;


    /**
     * 医生身份证号
     */
    @TableField(value = "yisheng_id_number")

    private String yishengIdNumber;


    /**
     * 医生头像
     */
    @TableField(value = "yisheng_photo")

    private String yishengPhoto;


    /**
     * 医生擅长
     */
    @TableField(value = "yisheng_shanchang")

    private String yishengShanchang;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 科室
     */
    @TableField(value = "keshi_types")

    private Integer keshiTypes;


    /**
     * 职位
     */
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 挂号费
     */
    @TableField(value = "guahaofei")

    private Double guahaofei;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 医生详细介绍
     */
    @TableField(value = "yisheng_content")

    private String yishengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医生工号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }
    /**
	 * 获取：医生工号
	 */

    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 设置：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }
    /**
	 * 获取：医生姓名
	 */

    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 设置：医生手机号
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }
    /**
	 * 获取：医生手机号
	 */

    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 设置：医生身份证号
	 */
    public String getYishengIdNumber() {
        return yishengIdNumber;
    }
    /**
	 * 获取：医生身份证号
	 */

    public void setYishengIdNumber(String yishengIdNumber) {
        this.yishengIdNumber = yishengIdNumber;
    }
    /**
	 * 设置：医生头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }
    /**
	 * 获取：医生头像
	 */

    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 设置：医生擅长
	 */
    public String getYishengShanchang() {
        return yishengShanchang;
    }
    /**
	 * 获取：医生擅长
	 */

    public void setYishengShanchang(String yishengShanchang) {
        this.yishengShanchang = yishengShanchang;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：科室
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }
    /**
	 * 获取：科室
	 */

    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }
    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：挂号费
	 */
    public Double getGuahaofei() {
        return guahaofei;
    }
    /**
	 * 获取：挂号费
	 */

    public void setGuahaofei(Double guahaofei) {
        this.guahaofei = guahaofei;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：医生详细介绍
	 */
    public String getYishengContent() {
        return yishengContent;
    }
    /**
	 * 获取：医生详细介绍
	 */

    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yisheng{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yishengUuidNumber=" + yishengUuidNumber +
            ", yishengName=" + yishengName +
            ", yishengPhone=" + yishengPhone +
            ", yishengIdNumber=" + yishengIdNumber +
            ", yishengPhoto=" + yishengPhoto +
            ", yishengShanchang=" + yishengShanchang +
            ", sexTypes=" + sexTypes +
            ", keshiTypes=" + keshiTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", guahaofei=" + guahaofei +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", yishengContent=" + yishengContent +
            ", createTime=" + createTime +
        "}";
    }
}
