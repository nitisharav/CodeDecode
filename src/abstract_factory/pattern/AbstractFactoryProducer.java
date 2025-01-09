package abstract_factory.pattern;

//this is factory of factory, gives u factory instance which will in turn gives class instance
public class AbstractFactoryProducer {
  public static AbstractFactory getProfession(boolean isTrainee) {
	  if(isTrainee) {
		  return new TraineeProfessionAbstractFactory();
	  }
	  else 
		  return new ProfessionAbstractFactory();
	  
  }
}
