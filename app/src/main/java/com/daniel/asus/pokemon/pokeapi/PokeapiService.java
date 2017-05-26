package com.daniel.asus.pokemon.pokeapi;

import com.daniel.asus.pokemon.models.Pokemon;
import com.daniel.asus.pokemon.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ASUS on 21/05/2017.
 */

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit,@Query("offset") int offset);

    @GET("pokemon/{id}/")
    Call<Pokemon> obtenerPokemon(@Path("id")int id);



}
