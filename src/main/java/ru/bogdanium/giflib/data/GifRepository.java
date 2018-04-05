package ru.bogdanium.giflib.data;

import org.springframework.stereotype.Component;
import ru.bogdanium.giflib.model.Gif;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(2018, 1, 17), "John Doe", false),
            new Gif("ben-and-mike", 2, LocalDate.of(2018, 1, 28), "Jane Doe", false),
            new Gif("book-dominos", 3, LocalDate.of(2018, 3, 17), "John Doe", true),
            new Gif("compiler-bot", 3, LocalDate.of(2018, 2, 17), "Jane Doe", false),
            new Gif("cowboy-coder", 1, LocalDate.of(2018, 4, 3), "John Doe", false),
            new Gif("infinite-andrew", 2, LocalDate.of(2018, 4, 2), "Jane Doe", true)
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

    public List<Gif> findByCategoryId(int id) {

        return ALL_GIFS.stream()
                .filter(gif -> gif.getCategoryId() == id)
                .collect(Collectors.toList());
    }

    public List<Gif> getFavorites() {
        return ALL_GIFS.stream()
                .filter(Gif::isFavorite)
                .collect(Collectors.toList());
    }
}
