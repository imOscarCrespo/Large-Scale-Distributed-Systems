import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String args[]){
        Splitter s = new Splitter() {
            @Override
            public List<String> split(long sizeBytes, List<Path> files) throws IOException {

                return null;
            }
        };
        


    }
}
