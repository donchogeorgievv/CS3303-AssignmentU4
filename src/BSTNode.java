public class BSTNode{
	int value;
	BSTNode leftChild;
	BSTNode rightChild;
	
	//Recreating the default constructor 
	public BSTNode() {
		
	}
	
	//Creating constructor to create new nodes with no children and a value
	public BSTNode(int initialValue) {
		this.value = initialValue;
	}
}