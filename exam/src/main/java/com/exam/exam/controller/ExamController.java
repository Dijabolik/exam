package com.exam.exam.controller;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import com.exam.exam.repository.PhoneRepository;
    import com.exam.exam.entity.Phone;

    import java.util.List;
@RestController
public class ExamController {
    @Autowired
    PhoneRepository phoneRepository;

    @RequestMapping("/phones")
    public ResponseEntity<List<Phone>>
    getAllDogs(){
        System.out.println("GET ALL DOGS CALLED");
        List<Phone> list = (List<Phone>) phoneRepository.findAll();

        return new ResponseEntity<List<Phone>>(list, HttpStatus.OK);
    }

}
