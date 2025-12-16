package H91;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes9.dex */
public abstract class b {
    public static final Rect a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
            if (defaultDisplay != null) {
            }
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int b(Context context, int i12) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return typedValue.data;
    }

    public static Drawable c(int i12, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return androidx.core.content.d.getDrawable(context, typedValue.resourceId);
    }

    public static int d(int i12, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return typedValue.data;
    }
}
