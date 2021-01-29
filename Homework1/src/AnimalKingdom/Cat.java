package AnimalKingdom;

public  class Cat extends AnimalsCharact{

	protected int age;	    
	protected String name;
	
	@Override
	    public void id() {
	    	System.out.println("------------------------------------------------- \n");
			System.out.println("ID: Gato \n");
		}
	    
	public String  typeOfAnimal() {
		return "Tipo de animal: Los gatos son mamíferos";
		
	}
	
	public String habitat() {
		return "Habitat: Han sido domesticados, por lo tanto en su mayoría habitan en hogares junto a sus humanos";
		
	}

     public void catCharact() {
         System.out.println("El gatito " + this.getName() + ", tiene: "+ this.getAge() + " años y hace Meooow!!!");
     }
     
     //Getters and Setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
