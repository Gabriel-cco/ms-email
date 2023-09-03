package br.com.msemail.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
public class EmailDTO {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String title;
    @NotBlank
    private String text;
}
