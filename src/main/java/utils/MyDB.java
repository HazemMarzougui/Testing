public class MyDB {

    public final String URL = "jdbc:mysql://localhost:3306/pidev";
    public final String USERNAME = "root";
    public final String PWD = "";
    private Connection connection;

    // Create a variable of type MyDB for the instance
    public static MyDB instance;

    // Make the constructor private
    private MyDB() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            System.out.println("Connected successfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Create a method getInstance
    public static MyDB getInstance() {
        if (instance == null)
            instance = new MyDB();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
