package processes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProcessBuildingUsingProcessBuilder {

    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("echo", "P2");
        Process p2 = pb.start();
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        lineReader.lines().forEach(System.out::println);

        p2.waitFor();
    }
}
