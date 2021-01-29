package Main;

import AnimalKingdom.Bat;
import AnimalKingdom.Cat;
import AnimalKingdom.Frog;
import AnimalKingdom.Giraffe;
import AnimalKingdom.Shark;

public class MainLogic {

    	public void Main() {
    		
    		Giraffe g = new Giraffe();
    		g.setAge(4);
    		g.setName("Amelie");
    		g.id();
    		System.out.println(g.typeOfAnimal());
    		System.out.println(g.habitat());
    		g.GiraffeCharact();

    		Shark s = new Shark();
    		s.setAge(6);
    		s.setName("Blue");
    		s.id();
    		System.out.println(s.typeOfAnimal());
    		System.out.println(s.habitat());
    		s.sharkCharact();
    		
    		Cat c = new Cat();
    		c.setAge(5);
    		c.setName("Kirara");
    		c.id();
    		System.out.println(c.typeOfAnimal());
    		System.out.println(c.habitat());
    		c.catCharact();
    		
    		Bat b = new Bat();
    		b.setAge(5);
    		b.setName("Mr. Wayne");
    		b.id();
    		b.batType();
    		System.out.println(b.habitat());
    		b.batCharact();
    		
    		Frog f = new Frog();
    		f.setAge(1);
    		f.setName("Rene");
    		f.id();
    		System.out.println(f.typeOfAnimal());
    		System.out.println(f.habitat());
    		f.frogCharact();
    		

		
	}
		

}
