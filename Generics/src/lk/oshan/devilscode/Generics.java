package lk.oshan.devilscode;

//A class that is type of any data type
class devilscode<T> {
	T IdNumber;

	public T getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(T idNumber) {
		IdNumber = idNumber;
	}

	public void getType() {
		System.out.println(IdNumber.getClass().getName());
	}
}

//A class that accepts any data type under Number branch
//T extends Number tells that the type parameter 't' is bounded to type of Number
class devilsnumcode<T extends Number>{
	T IdNumber;

	public T getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(T idNumber) {
		IdNumber = idNumber;
	}

	public void getType() {
		System.out.println(IdNumber.getClass().getName());
	}
}

public class Generics {
	
	public static void main(String[] args) {
		
		//Any Branch of data type
		devilscode<String> obj = new devilscode<>();
		obj.setIdNumber("osh1234");
		obj.getType();
		
		//Any Branch of data type
		devilscode<Integer> obj1 = new devilscode<>();
		obj1.setIdNumber(2342434);
		obj1.getType();
		
		//Branch of Number data type (Branches are Integer, Double and Number Branch itself)
		devilsnumcode<Number> obj3 = new devilsnumcode<>();
		devilsnumcode<Integer> obj4 = new devilsnumcode<>();
		devilsnumcode<Double> obj5 = new devilsnumcode<>();
		devilsnumcode<Float> obj6 = new devilsnumcode<>();
	}
	
}
