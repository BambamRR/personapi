package one.digitalinnovation.personapi.dto.request;

import com.sun.istack.NotNull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;

import java.util.List;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PersonDTO {

    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String lastName;

    @NotEmpty
    @Size(min = 11, max = 11)
    private String cpf;

    @NotNull
    private String birthDate;

    @NotEmpty
    @Valid
    private List<PhoneDTO> phones;
}
