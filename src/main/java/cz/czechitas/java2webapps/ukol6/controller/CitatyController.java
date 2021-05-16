package cz.czechitas.java2webapps.ukol6.controller;
import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Random;


// @Controller <= anotace cele tridy
// @Autowired <= anotace metody, pri pouziti vice kontroleru rika, ktery konstruktor ma pouzit
// @GetMapping <= anotace metody
// @PathVariable <= anotace parametru v metode

@Controller
public class CitatyController {

  private final CitatyService service;

  @Autowired
  public CitatyController(CitatyService service) {
    this.service = service;
  }

  @GetMapping("/")
  public ModelAndView nahodnyCitat() {
    return new ModelAndView("citat")
            .addObject("citat", service.nahodnyCitat());
  }

//  puvodni metoda

//  @GetMapping("/")
//  public ModelAndView nahodnyCitat() {
//    int index = random.nextInt(seznamCitatu.size());
//    ModelAndView modelAndView = new ModelAndView("citat");
//    modelAndView.addObject("citat", seznamCitatu.get(index));
//    return modelAndView;
//  }


  @GetMapping("/{cislo}")
  public ModelAndView konkretniCitat(@PathVariable int cislo) {
    return new ModelAndView("citat")
            .addObject("citat", service.konkretniCitat(cislo));
  }


}
