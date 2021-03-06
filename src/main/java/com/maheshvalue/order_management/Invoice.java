package com.maheshvalue.order_management;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Invoice")
public class Invoice implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INVOICE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "INVOICE_ID_GENERATOR", sequenceName = "INVOICE_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("customerName")
	private java.lang.String customerName;

	@org.kie.api.definition.type.Label("customerCode")
	private java.lang.String customerCode;

	@org.kie.api.definition.type.Label("supplierName")
	private java.lang.String supplierName;

	@org.kie.api.definition.type.Label("supplierCode")
	private java.lang.String supplierCode;

	@org.kie.api.definition.type.Label("invoiceDate")
	private java.lang.String invoiceDate;

	@org.kie.api.definition.type.Label("invoiceNumber")
	private java.lang.Integer invoiceNumber;

	@org.kie.api.definition.type.Label("totalPrice")
	private java.lang.Integer totalPrice;

	@org.kie.api.definition.type.Label("taxRate")
	private java.lang.Integer taxRate;

	public Invoice() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(java.lang.String customerName) {
		this.customerName = customerName;
	}

	public java.lang.String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(java.lang.String customerCode) {
		this.customerCode = customerCode;
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

	public java.lang.String getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(java.lang.String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public java.lang.Integer getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(java.lang.Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public java.lang.Integer getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(java.lang.Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public java.lang.Integer getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(java.lang.Integer taxRate) {
		this.taxRate = taxRate;
	}

	public Invoice(java.lang.Long id, java.lang.String customerName,
			java.lang.String customerCode, java.lang.String supplierName,
			java.lang.String supplierCode, java.lang.String invoiceDate,
			java.lang.Integer invoiceNumber, java.lang.Integer totalPrice,
			java.lang.Integer taxRate) {
		this.id = id;
		this.customerName = customerName;
		this.customerCode = customerCode;
		this.supplierName = supplierName;
		this.supplierCode = supplierCode;
		this.invoiceDate = invoiceDate;
		this.invoiceNumber = invoiceNumber;
		this.totalPrice = totalPrice;
		this.taxRate = taxRate;
	}

}