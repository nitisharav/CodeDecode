package abstract_factory.pattern;

public class AbstractFactoryPatternMainClass {
  public static void main(String[] args) {
	  
	  //first get factory instance from factory of factory class, if u want trainees
	AbstractFactory abstractFactory= AbstractFactoryProducer.getProfession(false);
	Profession prof= abstractFactory.getProfession("Engineer");
	prof.print();
}
}
