package vn.study.ChatTools.Main;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private ChatType type;
    private String content;
    private String sender;
}
