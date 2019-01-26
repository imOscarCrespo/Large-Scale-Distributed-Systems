import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface Splitter {

    List<String> split(long sizeBytes, List<Path> files) throws IOException;
}
