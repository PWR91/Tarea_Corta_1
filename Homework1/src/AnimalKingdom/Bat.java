package AnimalKingdom;

public  class Bat extends AnimalsCharact{
	
	 protected int age;	    
	 protected String name;
	 protected int wings = 2;
	    
	 @Override
	   	public void id() {
	   		System.out.println("------------------------------------------------- \n");
			System.out.println("ID: Murcielago \n");
		}
	    
	   	public String habitat() {
			return "Habitat: Viven en cuevas, grietas, árboles, troncos y otros"
					+ " lugares huecos y húmedos para descansar e hibernar";
	   	}
	   	
    public boolean mammal() {
        return true;
    }
	
    public void batType() {
        System.out.println("El murciélago es el único ave de tipo mamífero? "+ mammal() );
    }

    public void batCharact() {
        System.out.println("El murcielago: " + name + ", tiene: "+ age + " años");
        System.out.println("Posee: " + this.wings + " alas");
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

	@Override
	protected String typeOfAnimal() {
		return null;
	}




}
