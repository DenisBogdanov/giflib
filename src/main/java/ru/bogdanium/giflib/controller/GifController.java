package ru.bogdanium.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bogdanium.giflib.model.Gif;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2018, 1, 17),
                "Denis", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
