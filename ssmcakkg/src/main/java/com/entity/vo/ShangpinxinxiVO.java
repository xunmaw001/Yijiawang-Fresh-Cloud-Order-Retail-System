package com.entity.vo;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 09:10:00
 */
public class ShangpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
