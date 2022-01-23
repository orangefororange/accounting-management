package com.orangefororange.accountingmanagement.domain.entity.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_user")
public class AccountUser {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 0 未删除，1 已删除
     */
    private Byte dr;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "updated_date")
    private Date updatedDate;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取0 未删除，1 已删除
     *
     * @return dr - 0 未删除，1 已删除
     */
    public Byte getDr() {
        return dr;
    }

    /**
     * 设置0 未删除，1 已删除
     *
     * @param dr 0 未删除，1 已删除
     */
    public void setDr(Byte dr) {
        this.dr = dr;
    }

    /**
     * 获取创建时间
     *
     * @return created_date - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取修改时间
     *
     * @return updated_date - 修改时间
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 设置修改时间
     *
     * @param updatedDate 修改时间
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}