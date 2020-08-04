import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
public class StudentDao {
	
	public static void save(String name,String studentid,String temperature) throws IOException {
            File file = new File("StudentList.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Name:"+name);
            br.write("\n");
            br.write("Student Id:"+studentid);
            br.write("\n");
            br.write("temperature:"+temperature);
            br.write("\n");
            br.write("----------------------------");
            br.write("\n");

br.close();
fr.close();

	}
}
