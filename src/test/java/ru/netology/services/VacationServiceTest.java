package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {
    @Test

    public void test1() {
        VacationService service = new VacationService();

        int expected = 3;

        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test2() {
        VacationService service = new VacationService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
//[INFO]  T E S T S
//[INFO] -------------------------------------------------------
//        [INFO] Running ru.netology.services.VacationServiceTest
//[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.065 s - in ru.netology.services.VacationServiceTest
//[INFO]
//        [INFO] Results:
//        [INFO]
//        [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
//        [INFO]
//        [INFO] ------------------------------------------------------------------------
//        [INFO] BUILD SUCCESS
//[INFO] ------------------------------------------------------------------------
//        [INFO] Total time:  9.796 s
//[INFO] Finished at: 2024-02-24T14:50:03+03:00
//        [INFO] ------------------------------------------------------------------------

//Process finished with exit code 0
