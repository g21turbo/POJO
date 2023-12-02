public class Main {

    // A POJO, plain old java object, is a class that generally only has instance fields
    // It's used to house data, and pass data, between functional classes
    // It usually has few, if any, methods other than getters and setters
    // Many database frameworks use POJOs to read data from, or to write data to, databases, files or streams
    // Also known as a bean or a JavaBean.
    // A JavaBean is just a POJO with some extra rules applied to it.
    // A POJO is sometimes called an Entity, because it mirrors database entities.
    // Another acronym is DTO, Data Transfer Object
    // A DTO is a description of an object that can be modeled as just data


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S11110" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Bob";
                case 4 -> "Tom";
                case 5 -> "Moe";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S99991", "Ann",
                "5/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S99992", "Bill",
                "5/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());



    }


}
