package academetrics.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    // DTO for viewing users - Fields like password are not transferred
    private String userName;
    private String mail;
    private String honorific;
    private String initials;
    private String lastName;
    private String role;
    private String contact;
    private String deptId;
    private String deptName;
}
