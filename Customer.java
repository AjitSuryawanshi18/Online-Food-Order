package Online_Food_Order;

public class Customer {
	//Attributes 
private String cName;
private String cAddress;
private String cCNO;
private String cProduct;
//constructor  
    public Customer(String cName, String cAddress, String cCNO, String cProduct) {
	
	this.cName = cName;
	this.cAddress = cAddress;
	this.cCNO = cCNO;
	this.cProduct = cProduct;
  }
// getters and setters
public String getcName() {
	return cName;
}

public void setcName(String cName) {
	this.cName = cName;
}

public String getcAddress() {
	return cAddress;
}

public void setcAddress(String cAddress) {
	this.cAddress = cAddress;
}

public String getcCNO() {
	return cCNO;
}

public void setcCNO(String cCNO) {
	this.cCNO = cCNO;
}

public String getcProduct() {
	return cProduct;
}

public void setcProduct(String cProduct) {
	this.cProduct = cProduct;
}

}
