package foodizz.com.foodizz;

import android.app.Activity;
import android.content.Context;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by ohad on 4/30/15.
 */
public class Init {
    public static boolean Init(Context context) {

        Parse.enableLocalDatastore(context);

        Parse.initialize(context, "30KElsKAsvLqPCYfX4VLzfgBNyM9GPAXuOo3Mctt", "Ekr15MKudZt6ewfgnC4yDR6AMhZlmSpMYHghUilQ");

        return true;
    }
}
