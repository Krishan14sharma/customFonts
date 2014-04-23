package View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**Sets typeface 
 * @author Krishan
 *
 */
public class SansedtView extends EditText {

	public SansedtView(Context context) {
		// TODO Auto-generated constructor stub
		super(context);
		initypeface(context);
	}

	public SansedtView(Context cont, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(cont, attrs);
		initypeface(cont);
	}

	public SansedtView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		initypeface(context);
	}

	private void initypeface(Context cont) {
		if(isInEditMode())
		{
			return;
		}
			setTypeface(TypefaceManager.obtaintTypeface(cont));
		}
	}

