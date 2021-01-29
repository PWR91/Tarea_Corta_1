package AnimalKingdom;

public class Frog extends AnimalsCharact{

	
	  protected int age;	    
	  protected String name;
	    
	
	
@Override

	public void id() {
	System.out.println("------------------------------------------------- \n");
	System.out.println("ID: Rana \n");
	
	}

	public String  typeOfAnimal() {
		return "Tipo de animal: Las ranas pertenecen al grupo de los anfibios y son ovíparas";
}
	
	public String habitat() {
		return "Habitat: Habitan en los ríos y todo tipo de humedales, incluyendo lagunas, embalses o charcos temporales";
		
	}

	public void frogCharact() {
        System.out.println("La rana " + name + " tiene: "+ age + " año");
    }

	
	// Getters and Setters
	
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
