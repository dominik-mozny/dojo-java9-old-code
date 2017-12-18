package ch.adesso.dojo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

public class OldCode {
    public static void main(String[] args) throws Exception {
        oldWayToWriteCode$Collections();
        oldWayToPrintCode1(Arrays.asList("B", "A", "B", "C"));
        oldWayToPrintCode2(Arrays.asList(1, 27, 2, 27));
        oldWayToWorkWithOptional(Optional.empty());
        oldWayToWorkWithOptional(Optional.of("not empty"));
        oldWayToPrint5LastDays();
        scannerParsing("ralf donald ralfie alf olaf");
        matcherParsing("ralf donald ralfie alf olaf");
        completableFuture();
        printAllRunningProcesses();
        startTwoProcesses();
    }

    /**
     * Rewrite initializing of collection items
     */
    private static void oldWayToWriteCode$Collections() {
        List<String> list = Arrays.asList("This", "array", "is", "created", "in", "not", "so", "nice", "way");
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("And", "this", "set", "is", "even", "worse"));
        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        set2.add("also");
        set2.add("not");
        set2.add("nice");
        System.out.println(set2);
    }

    /**
     * Keep printing {@code strings} to output until first string which start with "A" is found.
     * Note: Write ideally both new Java 9 ways how to do it
     */
    private static void oldWayToPrintCode1(List<String> strings) {
        System.out.print("All strings until the first occurrence of string which start with \"A\": ");
        for (String string : strings) {
            if (string.startsWith("A")) {
                break;
            }
            System.out.print(string + " ");
        }
        System.out.println();
    }

    /**
     * Keep printing {@code numbers} which follow first occurrence of number 27.
     */
    private static void oldWayToPrintCode2(List<Integer> numbers) {
        Integer index = null;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 27) {
                index = i;
                break;
            }
        }
        System.out.print("All number which follow first occurrence of number 27: ");
        if (index == null) {
            return;
        }
        numbers.subList(index + 1, numbers.size()).stream().forEach(i -> System.out.print(i + " "));
        System.out.println();
    }


    /**
     * Write "value found" if optional is not empty, otherwise write "value not found"
     */
    private static void oldWayToWorkWithOptional(Optional<String> value) {
        if (value.isPresent()) {
            System.out.println("value found");
        }
        else {
            System.out.println("value not found");
        }
    }

    /**
     * Print last 6 Dates as {@code LocalDate}.
     */
    private static void oldWayToPrint5LastDays() {
        IntStream.rangeClosed(0, 5).forEach(i -> System.out.println(LocalDate.now().minusDays(i)));
    }

    /**
     * In given {@code strToParse} print all words containing string "alf" with Scanner class
     */
    private static void scannerParsing(String strToParse) {
        //to be implemented
    }

    /**
     * In given {@code strToParse} print all words containing string "alf" with Pattern and Matcher classes
     */
    private static void matcherParsing(String strToParse) {
        //to be implemented
    }

    /**
     * Create 5 Tasks
     * Each task will contain Thread.sleep with random period 1000-3000ms.
     * Each task will return random value between 3-8.
     * If Task run longer than 2000ms then it will be stopped and default value of 5 will be used.
     * When task ends, its return value (or default value) will be added to sum and this will be
     * printed out to standard output.
     * Feel free to print any other information which you find useful (when Task run longer then 2000ms etc.)
     */
    private static void completableFuture() {
        //to be implemented
    }

    /**
     * For all running processes: print command used to run this process or PID if this command
     * isn't available.
     */
    private static void printAllRunningProcesses() {
        //to be implemented
    }

    /**
     * Start two notepad programs (or any others) and write message to standard output when both of those programs
     * are stopped. Don't stop those programs from code.
     * Add Thread.sleep(10000) so you have chance to stop those two programs manually.
     */
    private static void startTwoProcesses() {
        //to be implemented
    }
}

