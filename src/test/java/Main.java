
public class Main {

    public static void main(String[] args) {
        RegisterTest Register = new RegisterTest();
        LoginTest login = new LoginTest();
        Register.validRegisterTest();
        login.loginWithValidCredentialsTest();
        login.loginWithInvalidEmail();
        login.loginWithInvalidPasswordTest();
        login.loginWithoutCredentialsTest();
    }

}
