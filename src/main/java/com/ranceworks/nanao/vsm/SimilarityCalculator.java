package com.ranceworks.nanao.vsm;
import java.util.List;
import java.util.Map;


public class SimilarityCalculator {

    public List<TitleScore> calcSimilarity(String text, Map<String, String> compared) {
         return com.ranceworks.nanao.vsm.SimilarityCalc$.MODULE$.calcSimilarity(text, compared);
    }
}
