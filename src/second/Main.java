package second;

public class Main {
    public static void main(String[] args) throws ClassroomException {
        // No Error
        var newClassroom = new Classroom("Aula 1", 1, 1);

        // Constructor Error
        var newClassroomConstructorError = new Classroom("", 1, 1);
        var newClassroomConstructorErrorVariant = new Classroom(null, 1, 1);
        var newClassroomConstructorErrorVariantSpace = new Classroom(" ", 1, 1);

        // Setter Error
        var newClassroomSetterError = new Classroom("Aula 1", 1, 1);
        newClassroomSetterError.setClassroom(null);
        newClassroomSetterError.setClassroom("");
    }
}
