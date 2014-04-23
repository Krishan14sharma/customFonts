package View;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class Sanstxtview extends TextView {
	static Typeface typeface;

	public Sanstxtview(Context context) {
		// TODO Auto-generated constructor stub
		super(context);
		initypeface(context);
	}

	public Sanstxtview(Context cont, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(cont, attrs);
		initypeface(cont);
	}

	public Sanstxtview(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		initypeface(context);
	}

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
