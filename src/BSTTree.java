public class BSTTree{
	BSTNode root = null;
	int stepsTaken = 0;
	//Method to add new items to the tree
	public void Insert(int value){
		if(root == null) { //Empty tree, and the first node we add is the root
			root = new BSTNode(value);
		}
		else {
			InsertNewNode(root, value);
		}
	}
	
	//Helper method, to handle the inserting nodes recursivley
	public void InsertNewNode(BSTNode currentNode, int value) {
		//value is less than the value of the current node, so we have to place it on the left
		if(value < currentNode.value) {
			if(currentNode.leftChild == null) { //Left child is empty, so we create a new node
				currentNode.leftChild = new BSTNode(value);
			}
			else {
				InsertNewNode(currentNode.leftChild, value); //Left child is not null, so we take its left child
			}
		}
		
		//The value we need to insert s bigger or equal to the value of the current node
		//so we place it on the right
		else { 
			if(currentNode.rightChild == null) { //Right child is empty, so we create a new node
				currentNode.rightChild = new BSTNode(value);
			}
			else {
				InsertNewNode(currentNode.rightChild, value); //Right child is not null, so we take its right child
			}
		}
	}
	


	//Method to return the number of steps taken to find the value
	//if the value was not found, the method will return -1
	public int FindItem(int value){
		if(root == null) {
			return -1; //tree is empty
		}
		if(root.value == value) {
			return 1;
		}
		BSTNode currentNode = root;
		while(currentNode != null) {
			stepsTaken++;
			if(currentNode.value == value) {
				return stepsTaken;
			}
			else if(currentNode.value > value){
				currentNode = currentNode.leftChild;
			}
			else {
				currentNode = currentNode.rightChild;
			}
		}
		
		return -1; //traversed the tree, the value was not found
	}


}