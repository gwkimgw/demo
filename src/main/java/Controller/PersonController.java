package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/info")
    public Person getPerson() {
        Person person = new Person();
        person.setName("GWKIM");
        person.setAge(25);
        person.setAddress("서울");
        person.setJob("대학생");
        return person;
    }
}