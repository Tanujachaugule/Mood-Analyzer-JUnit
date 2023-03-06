package com.moodAnalyzer;

public class InvalidMood {
    private String message;

    InvalidMood(){}

    InvalidMood(String message){
        this.message = message;
    }
    public String analyzeMood() {
        try{
            if(message.length() == 0){
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "EmptyMood");
            }
            if(message.contains("Sad")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "Happy");
        }
    }
}
