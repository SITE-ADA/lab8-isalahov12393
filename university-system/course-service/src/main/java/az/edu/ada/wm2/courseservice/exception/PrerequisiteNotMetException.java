package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotMetException extends RuntimeException {
    public PrerequisiteNotMetException(Long prerequisiteCourseId) {
        super("Tələbə şərt kursunu tamamlamayıb. Tələb olunan kursun ID-si: " + prerequisiteCourseId);
    }
}