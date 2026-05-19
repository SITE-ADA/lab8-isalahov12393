package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDto {

    @Schema(description = "Kursun adı", example = "Data Structures")
    @NotBlank(message = "Kursun adını qeyd edin!")
    private String title;

    @Schema(description = "Kursun kodu", example = "CS201")
    @NotBlank(message = "Kursun kodunu qeyd edin!")
    private String code;

    @Schema(description = "Kredit sayı", example = "4")
    @Positive(message = "Kredit sayı natural ədəd olmalıdır!")
    private Integer credits;

    @Schema(description = "Şərt kursun ID-si (yoxdursa null)", example = "null")
    private Long prerequisiteId;
}
