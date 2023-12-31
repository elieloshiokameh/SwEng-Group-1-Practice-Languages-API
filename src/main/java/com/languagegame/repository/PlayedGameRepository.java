package com.languagegame.repository;

import com.languagegame.domain.PlayedGame;
import com.languagegame.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayedGameRepository extends JpaRepository<PlayedGame, Long> {
    List<PlayedGame> findPlayedGamesByUserOrderByPlayedAt(User user);

    // now this is what I call a method name
    List<PlayedGame> findPlayedGamesByUserAndQuestionLanguageAndAnswerLanguageOrderByPlayedAt(User user, String questionLanguage, String answerLanguage);
}
