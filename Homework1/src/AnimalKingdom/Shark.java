package AnimalKingdom;

public class Shark extends AnimalsCharact{

	protected int size = 6;
	protected int fins = 2;
	protected int age;	    
	protected String name;
	 
	
	@Override
	    public void id() {
	   		System.out.println("------------------------------------------------- \n");
			System.out.println("ID: Tiburon \n");
		}
	    
		public String  typeOfAnimal() {
			return "Tipo de animal: Los tiburones son oviparos y ovoviviparos";
			
		}
		
		public String habitat() {
			return "Habitat: Habitan exclusivamente en el oceano";
			
		}

	     public void sharkCharact() {
	         System.out.println("El tiburon: " + name + ", tiene: "+ age + " años");
	         System.out.println("Mide aproximadamente: " + this.size + " metros de largo");
	         System.out.println("Posee: " + this.fins + " aletas");
	     }

		@Override
		protected String Name() {
			return null;
		}

		@Override
		protected int Age() {
			return 0;
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
	}