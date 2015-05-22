package com.sanluan.cms.entities.cms;

// Generated 2015-5-6 15:49:39 by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsChapter generated by hbm2java
 */
@Entity
@Table(name = "cms_chapter")
public class CmsChapter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@MyColumn(title = "内容", condition = true)
	private int contentId;
	@MyColumn(title = "分类ID", condition = true)
	private Integer categoryId;
	@MyColumn(title = "标题", condition = true, like = true)
	private String title;
	@MyColumn(title = "图片", condition = true)
	private String image;
	private Date publishDate;
	private Date createDate;
	@MyColumn(title = "描述")
	private String description;
	@MyColumn(title = "扩展字段1", condition = true)
	private String extend1;
	@MyColumn(title = "扩展字段2", condition = true)
	private String extend2;
	@MyColumn(title = "扩展字段3", condition = true)
	private String extend3;
	@MyColumn(title = "扩展字段4", condition = true)
	private String extend4;
	@MyColumn(title = "扩展数字字段1", condition = true)
	private Integer extendNumber1;
	@MyColumn(title = "扩展数字字段2", condition = true)
	private Integer extendNumber2;
	@MyColumn(title = "扩展数字字段3", condition = true)
	private Integer extendNumber3;
	@MyColumn(title = "扩展数字字段4", condition = true)
	private Integer extendNumber4;

	public CmsChapter() {
	}

	public CmsChapter(int contentId, String title, Date publishDate, Date createDate, String description) {
		this.contentId = contentId;
		this.title = title;
		this.publishDate = publishDate;
		this.createDate = createDate;
		this.description = description;
	}

	public CmsChapter(int contentId, Integer categoryId, String title, String image, Date publishDate, Date createDate,
			String description, String extend1, String extend2, String extend3, String extend4, Integer extendNumber1,
			Integer extendNumber2, Integer extendNumber3, Integer extendNumber4) {
		this.contentId = contentId;
		this.categoryId = categoryId;
		this.title = title;
		this.image = image;
		this.publishDate = publishDate;
		this.createDate = createDate;
		this.description = description;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
		this.extendNumber1 = extendNumber1;
		this.extendNumber2 = extendNumber2;
		this.extendNumber3 = extendNumber3;
		this.extendNumber4 = extendNumber4;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "content_id", nullable = false)
	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	@Column(name = "category_id")
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "title", nullable = false, length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "publish_date", nullable = false, length = 19)
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "description", nullable = false, length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "extend1", length = 200)
	public String getExtend1() {
		return this.extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	@Column(name = "extend2", length = 200)
	public String getExtend2() {
		return this.extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	@Column(name = "extend3", length = 200)
	public String getExtend3() {
		return this.extend3;
	}

	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}

	@Column(name = "extend4", length = 200)
	public String getExtend4() {
		return this.extend4;
	}

	public void setExtend4(String extend4) {
		this.extend4 = extend4;
	}

	@Column(name = "extend_number1")
	public Integer getExtendNumber1() {
		return this.extendNumber1;
	}

	public void setExtendNumber1(Integer extendNumber1) {
		this.extendNumber1 = extendNumber1;
	}

	@Column(name = "extend_number2")
	public Integer getExtendNumber2() {
		return this.extendNumber2;
	}

	public void setExtendNumber2(Integer extendNumber2) {
		this.extendNumber2 = extendNumber2;
	}

	@Column(name = "extend_number3")
	public Integer getExtendNumber3() {
		return this.extendNumber3;
	}

	public void setExtendNumber3(Integer extendNumber3) {
		this.extendNumber3 = extendNumber3;
	}

	@Column(name = "extend_number4")
	public Integer getExtendNumber4() {
		return this.extendNumber4;
	}

	public void setExtendNumber4(Integer extendNumber4) {
		this.extendNumber4 = extendNumber4;
	}

}
