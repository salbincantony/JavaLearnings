/**
 * 
 * @author Salbin
 * 
 * String is immutable,
 * if you try to alter their values, another object gets created
 */
public class StringLearings {

	/**
	 * @param args
	 * String is immutable  ( once created can not be changed )object  . 
	 * The object created as a String is stored in the  Constant String Pool  
	 * Every immutable object in Java is thread safe ,
	 * that implies String is also thread safe . 
	 * String can not be used by two threads simultaneously.
	 * String  once assigned can not be changed.
	 */
	public static void main(String[] args) {

	System.out.println("*****string datatype*****");
	String str = "Hello";
	// The above object is stored in constant string
	//pool and its value can not be modified.
	System.out.println("Old str : " + str.hashCode());
	str +=  "World";
	System.out.println("New str :" + str.hashCode());
	 //string is created in constant pool and referenced by the demo variable            
	 // "hello" string still exists in string constant pool 
	 //and its value is not overrided but we lost reference to the  "hello"string  
	
	String s1 = new String("Hello");
	System.out.println("S1 is in memory :" + s1.hashCode());
	s1+= "salbin";
	System.out.println("S1 is in memory post value change :" + s1.hashCode());

	}

}
