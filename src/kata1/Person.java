package kata1;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final LocalDate fa;

    public Person(String name, LocalDate birthdate) {
        this.fa = LocalDate.now();
        this.birthdate = birthdate; 
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) (Period.between(birthdate, fa).getYears());
    }
    
    

}
