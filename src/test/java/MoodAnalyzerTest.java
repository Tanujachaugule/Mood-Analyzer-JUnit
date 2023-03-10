import com.moodAnalyzer.MoodAnalyzer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void givenMessage_whenNotSad_shouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenMessage_WhenNull_shouldReturnHappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("Happy"));
    }
}
