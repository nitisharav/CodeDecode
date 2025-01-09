package abstract_factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {
		if(typeOfProfession==null) return null;
		else if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		} 
		else if(typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
				
		}
		return null;
	}

}
