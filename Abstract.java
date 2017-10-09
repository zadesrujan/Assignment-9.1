package abstractmethod;
//here we cretaed abstractmethod as sum which that organizes a set of related classes and interfaces.
public class Abstract {

	public static void main(String[] args) {
				//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
				//void : returns to no value.
				//main : is special because it will start the program.
		// TODO Auto-generated method stub
		dog obj = new Petdog();
		//here we cannot  instantiate the object class 
        
		obj.bow();
		//obj taken as bow
		obj.run();
		//obj taken as run
		obj.dance();
		//obj taken as dance
		obj.eat();
		//obj taken as eat
	}
}
    abstract class dog{            
    	//a class is declared as abstract is known as abstract class
    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class
    
    	public void bow(){       
    		//here  i have created a method and i have declared and defined it 
    		   System.out.println("dog has a property of shouting bow....");
    		 //system : is a class in java language pacakge.
    			//out : static member of the system class.
    			//println : to print what is output.
    	   }
   
    	public abstract void run();  
    	//here i have declared  the abstract methods and implemented them in the child class  
        public abstract void dance();
        //methods are run,dance,eat
        public abstract void eat();
       }

  class Petdog extends dog{   
	  //here i have extended the parent to the child class
	   public void run(){  
		   //void as no return type 
		   //here i have implemented the methods  in this class
		   System.out.println("pet dog can run ....");
		 //system : is a class in java language pacakge.
			//out : static member of the system class.
			//Println is used to print text pet dog can run and gives output
		   
	   }
	   public  void dance (){
		   //void as no return type
		   System.out.println("pet dog can  also dance...");  
		 //system : is a class in java language pacakge.
			//out : static member of the system class.
			//Println is used to print text pet dog can also dance and gives output
	   }
	   public  void eat(){
		   //void as no return type
		   System.out.println("pet dog eat well");
		 //system : is a class in java language pacakge.
			//out : static member of the system class.
			//Println is used to print text pet dog eat well and gives output
	   }
   
	}


