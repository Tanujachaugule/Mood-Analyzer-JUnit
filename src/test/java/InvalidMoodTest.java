import com.moodAnalyzer.MoodAnalyzer;

import com.moodAnalyzer.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;
public class InvalidMoodTest {
    @Test

    public void givenMessage_whenNull_shouldThrowException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            String mood = moodAnalyzer.analyzeMood();
        }catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL,e.type);
        }
    }

    @Test

    public void givenMessage_whenEmpty_shouldThrowException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try{
            String mood = moodAnalyzer.analyzeMood();
        }catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
        }
    }
}
