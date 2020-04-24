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
public class User {

    @NotNull
    @Size(min=6,max=15,message="The length should be between 6 and 15 characters!")
    private String username;

    @NotEmpty(message = "Please enter your email.")
    @Email(regexp = "^(.+)@(.+)$",message = "The email is not valid!")
    private String email;

    @NotNull
    @Size(min=6,max=15,message="The length should be between 6 and 15 characters!")
    private String password;


}
