class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 20) {
            throw new InvalidAgeException("Not valid"+"\n");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(19);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("Rest of the code...");
    }
}
