package View;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class SanschkbxView extends CheckBox {
	static Typeface typeface;

	public SanschkbxView(Context context) {
		// TODO Auto-generated constructor stub
		super(context);
		initypeface(context);
	}

	public SanschkbxView(Context cont, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(cont, attrs);
		initypeface(cont);
	}

	public SanschkbxView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		initypeface(context);
	}

	/** Initializes font
	 * @param cont
	 */
	private void initypeface(Context cont) {
		if(isInEditMode())
		{
			return;
		}
		if (typeface == null) {
			typeface = Typeface.createFromAsset(cont.getAssets(),"OpenSans.ttf");
			setTypeface(typeface);
		} else {
			setTypeface(typeface);
		}
	}

}
