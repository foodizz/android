package foodizz.com.foodizz;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {

        super(Application.class);
        Parse.enableLocalDatastore(getContext());

        Parse.initialize(getContext(), "30KElsKAsvLqPCYfX4VLzfgBNyM9GPAXuOo3Mctt", "Ekr15MKudZt6ewfgnC4yDR6AMhZlmSpMYHghUilQ");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}