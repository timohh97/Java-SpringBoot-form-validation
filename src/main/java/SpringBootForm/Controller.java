package SpringBootForm;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/contact")
    public String showForm(ContactMessage contactMessage)
    {
        return "contact";
    }

    @PostMapping("/contact")
    public String validate(@Valid  ContactMessage contactMessage, Errors er, Model model)
    {
        if(er.hasErrors())
        {
            return "contact";
        }
        else
        {
            model.addAttribute("message","Thank you for your message.");
            return "contact";
        }

    }

}
