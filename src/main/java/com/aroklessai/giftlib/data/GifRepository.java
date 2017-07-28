package com.aroklessai.giftlib.data;

import com.aroklessai.giftlib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(2017, 7, 27), "Jo arok", true),
            new Gif("ben-and-mike", 2, LocalDate.of(2017, 7, 12), "Jo arok", false),
            new Gif("book-dominos", 3, LocalDate.of(2017, 7, 29), "yong sa nim", true),
            new Gif("compiler-bot", 3, LocalDate.of(2017, 6, 22), "gobugi", false),
            new Gif("cowboy-coder", 1, LocalDate.of(2017, 5, 23), "mr.shon", false),
            new Gif("infinite-andrew", 2, LocalDate.of(2017, 3, 28), "hoshon", true)
    );

    public Gif findByName(String name) {
        for(Gif gif: ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
