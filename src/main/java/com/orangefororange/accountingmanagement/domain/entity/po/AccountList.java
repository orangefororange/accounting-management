package com.orangefororange.accountingmanagement.domain.entity.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "account_list")
public class AccountList {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 关联的用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 消费类型 100 吃，200穿，300交通，400生活用品，500教育，600房租（房贷），700工资，800红包，900其他
     */
    private Integer way;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 支出100，收入200
     */
    private Integer type;

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
     * 获取关联的用户id
     *
     * @return user_id - 关联的用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置关联的用户id
     *
     * @param userId 关联的用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取消费类型 100 吃，200穿，300交通，400生活用品，500教育，600房租（房贷），700工资，800红包，900其他
     *
     * @return way - 消费类型 100 吃，200穿，300交通，400生活用品，500教育，600房租（房贷），700工资，800红包，900其他
     */
    public Integer getWay() {
        return way;
    }

    /**
     * 设置消费类型 100 吃，200穿，300交通，400生活用品，500教育，600房租（房贷），700工资，800红包，900其他
     *
     * @param way 消费类型 100 吃，200穿，300交通，400生活用品，500教育，600房租（房贷），700工资，800红包，900其他
     */
    public void setWay(Integer way) {
        this.way = way;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取支出100，收入200
     *
     * @return type - 支出100，收入200
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置支出100，收入200
     *
     * @param type 支出100，收入200
     */
    public void setType(Integer type) {
        this.type = type;
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