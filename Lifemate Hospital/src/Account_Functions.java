import java.io.IOException;

public interface Account_Functions {

    public String login(String x, String y) throws IOException;

    public abstract String signup(String x, String y, String z) throws IOException, InvalidNumberException;

}
