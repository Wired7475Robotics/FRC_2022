/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clientcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        BBClient classUnderTest = new BBClient();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
