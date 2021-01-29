package AnimalKingdom;

public  class Giraffe extends AnimalsCharact{

	    protected int age;	    
	    protected String name;
	    

	    @Override
	    
	   	public void id() {
	   		System.out.println("------------------------------------------------- \n");
			System.out.println("ID: Jirafa \n");
		}
	    
	
	public String  typeOfAnimal() {
		return "Tipo de animal: Es un mamífero";
	}
	
	public String habitat() {
		return "Habitat: Habita exclusivamente en las sabanas de África";
	}
	
	  public void GiraffeCharact() {
	         System.out.println("La jirafa " + name + " tiene: "+ age + " años");
	     }
	  
	  
	  //Getters and Setters

	  public int getAge() {
		return age;
	}

	public int setAge(int age) {
		return this.age = age;
	}

	public String setName(String name) {
		return this.name = name;
	}


	@Override
	protected String Name() {
		return null;
	}


	@Override
	protected int Age() {
		return 0;
	}


	
}
