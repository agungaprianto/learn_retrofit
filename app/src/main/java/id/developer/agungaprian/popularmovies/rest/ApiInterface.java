package id.developer.agungaprian.popularmovies.rest;

import id.developer.agungaprian.popularmovies.model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by agungaprian on 30/07/17.
 */

public interface ApiInterface {
    @GET("movie/{sort}")
    Call<MovieResponse> getTopRatedFilm(@Path("sort") String sorting , @Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetail(@Path("id") int id , @Query("api_key") String apiKey);
}