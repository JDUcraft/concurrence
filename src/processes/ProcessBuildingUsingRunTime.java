package processes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProcessBuildingUsingRunTime {

    public static void main(String[] args) throws Exception {
        Runtime monApplication = Runtime.getRuntime();

        Process p1 = monApplication.exec("echo P1");
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(p1.getInputStream()));
        lineReader.lines().forEach(System.out::println);
    }
}
