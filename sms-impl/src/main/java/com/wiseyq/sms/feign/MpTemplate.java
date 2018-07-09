package com.wiseyq.sms.feign;

import java.util.Date;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;


/**
 * @Description: MP - 信息模板
 * @author: zhanglq
 * @date: 2018-06-06 09:58:47
 */
public class MpTemplate implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		
	/**
	 * 记录标识
	 */
	@Length(max=32)
	private String id;	
	/**
	 * 标题
	 */
	@Length(max=50)
	private String code;	
	/**
	 * 名称
	 */
	@Length(max=100)
	private String name;	
	/**
	 * 内容
	 */
	@Length(max=21845)
	private String content;	
	/**
	 * 所属园区
	 */
	@Length(max=32)
	private String parkId;	
	/**
	 * 模板类别:关联字典
	 */
	@Length(max=32)
	private String tmplType;	
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createTime;	
	/**
	 * 创建人
	 */
	@Length(max=32)
	private String createBy;	
	/**
	 * 更新时间
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date updateTime;	
	/**
	 * 更新人
	 */
	@Length(max=32)
	private String updateBy;	
	/**
	 * 备注
	 */
	@Length(max=200)
	private String remark;	
	/**
	 * 状态：1正常、-1删除  
	 */
	@Length(max=8)
	private String status1;	
	/**
	 * 状态
	 */
	@Length(max=8)
	private String status2;	
	/**
	 * 备用
	 */
	@Length(max=50)
	private String ext1;	
	/**
	 * 
	 */
	@Length(max=50)
	private String ext2;	
	/**
	 * 
	 */
	@Length(max=50)
	private String ext3;	
	/**
	 * 
	 */
	@Length(max=50)
	private String ext4;	
	/**
	 * 
	 */
	@Length(max=50)
	private String ext5;	
	/**
	 * 
	 */
	@Length(max=50)
	private String ext6;	


 	public void setId(String id){	
 		this.id=id;	
 	}	
 
 	public String getId(){	
 		return this.id;	
 	}	
 
 	public void setCode(String code){	
 		this.code=code;	
 	}	
 
 	public String getCode(){	
 		return this.code;	
 	}	
 
 	public void setName(String name){	
 		this.name=name;	
 	}	
 
 	public String getName(){	
 		return this.name;	
 	}	
 
 	public void setContent(String content){	
 		this.content=content;	
 	}	
 
 	public String getContent(){	
 		return this.content;	
 	}	
 
 	public void setParkId(String parkId){	
 		this.parkId=parkId;	
 	}	
 
 	public String getParkId(){	
 		return this.parkId;	
 	}	
 
 	public void setTmplType(String tmplType){	
 		this.tmplType=tmplType;	
 	}	
 
 	public String getTmplType(){	
 		return this.tmplType;	
 	}	
 
 	public void setCreateTime(Date createTime){	
 		this.createTime=createTime;	
 	}	
 
 	public Date getCreateTime(){	
 		return this.createTime;	
 	}	
 
 	public void setCreateBy(String createBy){	
 		this.createBy=createBy;	
 	}	
 
 	public String getCreateBy(){	
 		return this.createBy;	
 	}	
 
 	public void setUpdateTime(Date updateTime){	
 		this.updateTime=updateTime;	
 	}	
 
 	public Date getUpdateTime(){	
 		return this.updateTime;	
 	}	
 
 	public void setUpdateBy(String updateBy){	
 		this.updateBy=updateBy;	
 	}	
 
 	public String getUpdateBy(){	
 		return this.updateBy;	
 	}	
 
 	public void setRemark(String remark){	
 		this.remark=remark;	
 	}	
 
 	public String getRemark(){	
 		return this.remark;	
 	}	
 
 	public void setStatus1(String status1){	
 		this.status1=status1;	
 	}	
 
 	public String getStatus1(){	
 		return this.status1;	
 	}	
 
 	public void setStatus2(String status2){	
 		this.status2=status2;	
 	}	
 
 	public String getStatus2(){	
 		return this.status2;	
 	}	
 
 	public void setExt1(String ext1){	
 		this.ext1=ext1;	
 	}	
 
 	public String getExt1(){	
 		return this.ext1;	
 	}	
 
 	public void setExt2(String ext2){	
 		this.ext2=ext2;	
 	}	
 
 	public String getExt2(){	
 		return this.ext2;	
 	}	
 
 	public void setExt3(String ext3){	
 		this.ext3=ext3;	
 	}	
 
 	public String getExt3(){	
 		return this.ext3;	
 	}	
 
 	public void setExt4(String ext4){	
 		this.ext4=ext4;	
 	}	
 
 	public String getExt4(){	
 		return this.ext4;	
 	}	
 
 	public void setExt5(String ext5){	
 		this.ext5=ext5;	
 	}	
 
 	public String getExt5(){	
 		return this.ext5;	
 	}	
 
 	public void setExt6(String ext6){	
 		this.ext6=ext6;	
 	}	
 
 	public String getExt6(){	
 		return this.ext6;	
 	}	
 

}

