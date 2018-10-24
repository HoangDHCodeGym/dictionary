package Controller;

import Model.DictionaryEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class DictionaryController {
    @GetMapping
    public String TraTu() {
        return "index";
    }

    @PostMapping
    public ModelAndView GiaiNghia(@RequestParam("word") String word) {
        DictionaryEngine.init();
        String translated = DictionaryEngine.getTranslate(word.toLowerCase());
        ModelAndView model;
        if (translated != null) {
            model = new ModelAndView("translate");
            model.addObject("word" , word);
            model.addObject("translated", translated);
        } else {
            model = new ModelAndView("notFound");
        }
        return model;
    }
}
