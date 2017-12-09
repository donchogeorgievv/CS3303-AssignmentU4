
public class MyBST {

	public static void main(String[] args) {
		int[] devArray = {10,5,12,3,1,13,7,2,4,14,9,8,6,11};
		BSTTree tree = new BSTTree();
		for(int i=0; i < devArray.length; i++) {
			tree.Insert(devArray[i]);
		}
	}
	

}




