package GameServise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LoggerFile {
    File logFilePath = new File("log");
    File logFile = new File(logFilePath + "\\process.log");
    File logFileResult = new File(logFilePath + "\\result.log");

    public LoggerFile() throws URISyntaxException {

    }

    public void createLoggerFolder() {
        logFilePath.mkdir();
    }

    public void info(String info) throws IOException, URISyntaxException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true));
        printWriter.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + " Info: " + info);
        printWriter.close();
    }

    public void warn(String warn) throws IOException, URISyntaxException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true));
        printWriter.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + " Warn: " + warn);
        printWriter.close();
    }

    public void result(String result) throws IOException{
        PrintWriter printWriter = new PrintWriter(new FileWriter(logFileResult, true));
        printWriter.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + " Result:\n" + result);
        printWriter.close();
    }

    public void logDateTime() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true));
        PrintWriter printWriterR = new PrintWriter(new FileWriter(logFileResult, true));
        printWriter.println();
        printWriterR.println();
        printWriter.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.uuuu")) +
                " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        printWriterR.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.uuuu")) +
                " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        printWriter.close();
        printWriterR.close();
    }

}
