package in.ac.nitk.recyclerviewdemo;

public class UserDetail {

    private String userName;
    private String userDesc;


    UserDetail(){

    }

    public UserDetail(String userName, String userDesc) {
        this.userName = userName;
        this.userDesc = userDesc;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserDesc() {
        return userDesc;
    }
}
