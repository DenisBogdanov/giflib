package ru.bogdanium.giflib.data;

import org.springframework.stereotype.Component;
import ru.bogdanium.giflib.model.Gif;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2018, 1, 17), "John Doe", false),
            new Gif("ben-and-mike", LocalDate.of(2018, 1, 17), "Jane Doe", false),
            new Gif("book-dominos", LocalDate.of(2018, 1, 17), "John Doe", true),
            new Gif("compiler-bot", LocalDate.of(2018, 1, 17), "Jane Doe", false),
            new Gif("cowboy-coder", LocalDate.of(2018, 1, 17), "John Doe", false),
            new Gif("infinite-andrew", LocalDate.of(2018, 1, 17), "Jane Doe", true)
    );

    public Gif findByName(String name) {
        for (Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }


}
