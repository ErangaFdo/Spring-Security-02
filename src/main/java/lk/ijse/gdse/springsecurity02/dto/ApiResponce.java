package lk.ijse.gdse.springsecurity02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponce {
    private int status;
    private String message;
    private Object data;
}
