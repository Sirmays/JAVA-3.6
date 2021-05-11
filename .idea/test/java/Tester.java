import Main.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class Tester {

    @ParameterizedTest
    @MethodSource("incomingData1")
    void shouldCheckIfMethodCanFindTheLastFourFromArray(int[] incomingarray1, int[] expectedarray1) {
        Assertions.assertArrayEquals(expectedarray1, Main.findAllFiguresAfterLastFour(incomingarray1));

    }

    private static Stream<Arguments> incomingData1() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 5, 8, 9, 0, 8, 4, 0, 8, 8, 9, 4, 1, 3}, new int[]{1, 3}),
                Arguments.arguments(new int[]{1, 5, 8, 9, 0, 8, 4, 0, 8, 8, 9, 7, 1, 3}, new int[]{0, 8, 8, 9, 7, 1, 3}),
                Arguments.arguments(new int[]{1, 4, 1}, new int[]{1}));

    }

    @ParameterizedTest
    @MethodSource("incomingData2")
    void shouldCheckIfMethodCanFindOneOrFour(int[] incomingarray2, boolean a) {
        Assertions.assertEquals(Main.findOneOrFour(incomingarray2), a);

    }

    private static Stream<Arguments> incomingData2() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 4, 1, 4}, true),
                Arguments.arguments(new int[]{0, 0, 0, 0, 0}, false));

    }


}
