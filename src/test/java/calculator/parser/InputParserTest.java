package calculator.parser;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputParserTest {
    private static InputParser inputParser;
    private static String[] expected;

    @BeforeAll
    static void setUp() {
        inputParser = InputParser.getInstance();
        expected = new String[]{ "1", "2", "3" };
    }

    @Test
    @DisplayName("쉼표를 기준으로 숫자를 분리할 수 있다.")
    public void separateByCommaTest() {
        // given
        String input = "1,2,3";

        // when
        String[] real = inputParser.separate(input);

        // then
        assertThat(real).isEqualTo(expected);
    }

    @Test
    @DisplayName("콜론을 기준으로 숫자를 분리할 수 있다.")
    public void separateByColonTest() {
        // given
        String input = "1:2:3";

        // when
        String[] real = inputParser.separate(input);

        // then
        assertThat(real).isEqualTo(expected);
    }

    @Test
    @DisplayName("쉼표와 콜론 둘 다를 기준으로 숫자를 분리할 수 있다.")
    public void separateByCommaAndColonTest() {
        // given
        String input = "1,2:3";

        // when
        String[] real = inputParser.separate(input);

        // then
        assertThat(real).isEqualTo(expected);
    }

    @Test
    @DisplayName("커스텀 구분자를 기준으로 숫자를 분리할 수 있다.")
    public void separateByCustomDelimiterTest() {
        // given
        String input = "//;\\n1;2;3";

        // when
        String[] real = inputParser.separate(input);

        // then
        assertThat(real).isEqualTo(expected);
    }

    @Test
    @DisplayName("이스케이프 문자가 포함된 커스텀 구분자를 기준으로 숫자를 분리할 수 있다.")
    public void customDelimiterTest() {
        // given
        String input = "//,\\\\n1,\\2,\\3";

        // when
        String[] real = inputParser.separate(input);

        // then
        assertThat(real).isEqualTo(expected);
    }

    @Test
    @DisplayName("빈 입력이 입력 되면, 이를 0으로 바꾸는 데 성공 한다.")
    public void changeBlankToZeroTest() {
        // given
        String[] input = new String[]{""};
        int expected = 0;

        // when
        inputParser.blankToZero(input);

        // then
        int real = Integer.parseInt(input[0]);
        assertThat(real).isEqualTo(expected);
    }
}
