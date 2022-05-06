package GameServise;

import java.io.*;

public class ResultFile {

    public void fileCOrWResult(Player player) throws IOException {
        File filePath = new File("result");
        filePath.mkdir();
        File file = new File(filePath + "\\result.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(player.toString());
        bufferWriter.close();

    }
}
