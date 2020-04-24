package SpringBootForm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessage {

    @NotNull
    @Size(min=2,max=20,message="The length should be between 2 and 20 characters!")
    private String name;

    @NotEmpty(message = "Please enter your email.")
    @Email(regexp = "^(.+)@(.+)$",message = "The email is not valid!")
    private String email;

    @NotNull
    @Size(min=3,max=15,message="The length should be between 3 and 15 characters!")
    private String subject;

    @NotNull
    @Size(min=15,max=60,message="The length should be between 15 and 60 characters!")
    private String message;


}
