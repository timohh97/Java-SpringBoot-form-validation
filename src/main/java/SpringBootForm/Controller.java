package SpringBootForm;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/login")
    public String showForm(User user)
    {
        return "login";
    }

    @PostMapping("/login")
    public String validate(@Valid User user, Errors er, Model model)
    {
        if(er.hasErrors())
        {
            return "login";
        }
        else
        {
            model.addAttribute("message","Login successfully");
            return "login";
        }

    }

}
