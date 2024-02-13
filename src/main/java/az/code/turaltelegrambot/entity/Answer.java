package az.code.turaltelegrambot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    Question question;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    Session session;

    @OneToMany(mappedBy = "answer")
    List<AnswerLocale> localeList;
}
