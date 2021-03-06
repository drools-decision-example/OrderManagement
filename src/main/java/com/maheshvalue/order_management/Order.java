package com.maheshvalue.order_management;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Order_Table")
public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ORDER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ORDER_ID_GENERATOR", sequenceName = "ORDER_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("orderCode")
	private java.lang.String orderCode;

	@org.kie.api.definition.type.Label("orderType")
	private java.lang.String orderType;

	@org.kie.api.definition.type.Label("orderDate")
	private java.lang.String orderDate;

	@org.kie.api.definition.type.Label("orderQty")
	private java.lang.Integer orderQty;

	@org.kie.api.definition.type.Label("orderTotal")
	private java.lang.Integer orderTotal;

	@org.kie.api.definition.type.Label("supplierName")
	private java.lang.String supplierName;

	@org.kie.api.definition.type.Label("supplierCode")
	private java.lang.String supplierCode;

	public Order() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(java.lang.String orderCode) {
		this.orderCode = orderCode;
	}

	public java.lang.String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(java.lang.String orderType) {
		this.orderType = orderType;
	}

	public java.lang.String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(java.lang.String orderDate) {
		this.orderDate = orderDate;
	}

	public java.lang.Integer getOrderQty() {
		return this.orderQty;
	}

	public void setOrderQty(java.lang.Integer orderQty) {
		this.orderQty = orderQty;
	}

	public java.lang.Integer getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(java.lang.Integer orderTotal) {
		this.orderTotal = orderTotal;
	}

	public java.lang.String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(java.lang.String supplierName) {
		this.supplierName = supplierName;
	}

	public java.lang.String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(java.lang.String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public Order(java.lang.Long id, java.lang.String orderCode,
			java.lang.String orderType, java.lang.String orderDate,
			java.lang.Integer orderQty, java.lang.Integer orderTotal,
			java.lang.String supplierName, java.lang.String supplierCode) {
		this.id = id;
		this.orderCode = orderCode;
		this.orderType = orderType;
		this.orderDate = orderDate;
		this.orderQty = orderQty;
		this.orderTotal = orderTotal;
		this.supplierName = supplierName;
		this.supplierCode = supplierCode;
	}

}