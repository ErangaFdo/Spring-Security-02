package lk.ijse.gdse.springsecurity02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RejisterDto {
    private String username;
    private String password;
    private String role;
}
