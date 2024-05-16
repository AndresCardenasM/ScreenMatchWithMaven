package com.example.aluracursos.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record SerieData(
    String Title,
    Integer totalSeasons,
    @JsonAlias("imdbRating") String rating ) //We use JsonAlias to map info from API{
{

}
