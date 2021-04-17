/*
 */
package verma.com;

public class LoginVO {

    private String username;
    private String password;
    private String title;

    public LoginVO(String username, String password, String title) {
        this.username = username;
        this.password = password;
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LoginVO{" + "username=" + username + ", password=" + password + ", title=" + title + '}';
    }
    
    
}
