package board.boardspring.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    // given
    @Test
    public void DtoTest() {
        String name = "somsom";
        String nickname = "dog";

        // when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, nickname);

        // then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getNickname()).isEqualTo(nickname);
    }
}
