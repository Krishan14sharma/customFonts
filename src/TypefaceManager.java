package View;

import android.content.Context;
import android.graphics.Typeface;

/**Manages Typeface for views
 * @author Krishan
 *
 */
public class TypefaceManager {
	
	private static Typeface myTypeface;
	
	/**Returns typeface 
	 * @param context
	 * @return
	 */
	public static Typeface obtaintTypeface(Context context){
		if (myTypeface == null) {
			myTypeface =  Typeface.createFromAsset(context.getAssets(),"OpenSans.ttf");
		}
		return myTypeface;
	}

}
