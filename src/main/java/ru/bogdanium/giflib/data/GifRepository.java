package ru.bogdanium.giflib.data;

import org.springframework.stereotype.Component;
import ru.bogdanium.giflib.model.Gif;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(2018, 1, 17), "John Doe", false),
            new Gif("ben-and-mike", 2, LocalDate.of(2018, 1, 17), "Jane Doe", false),
            new Gif("book-dominos", 3, LocalDate.of(2018, 1, 17), "John Doe", true),
            new Gif("compiler-bot", 3, LocalDate.of(2018, 1, 17), "Jane Doe", false),
            new Gif("cowboy-coder", 1, LocalDate.of(2018, 1, 17), "John Doe", false),
            new Gif("infinite-andrew", 2, LocalDate.of(2018, 1, 17), "Jane Doe", true)
    );

    public Gif findByName(String name) {
        for (Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


}
