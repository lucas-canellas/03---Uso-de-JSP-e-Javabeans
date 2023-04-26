package beans;

import java.io.Serializable;

public class MyBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String language, message;

    public MyBean() {
    }

    public void setLanguage(String value) {
        language = value;
    }

    public String getMessage() {
        String msg = "";
        String lang = this.language;
        if (lang != null) {
            if (lang.equals("en")) {
                msg = "Hello world";
            } else if (lang.equals("de")) {
                msg = "Hallo Welt";
            } else if (lang.equals("fr")) {
                msg = "Bonjour le monde";
            } else if (lang.equals("it")) {
                msg = "Ciao mondo";
            } else {
                msg = "Alô mundo";
            }
        } else {
            msg = "Alô mundo";
        }
        return msg;
    }
}