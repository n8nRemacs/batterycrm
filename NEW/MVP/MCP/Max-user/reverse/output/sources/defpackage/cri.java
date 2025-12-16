package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class cri {
    public static void a(String str, String str2) {
        if (Log.isLoggable(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static final void b(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        if (m8j.d(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void c(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i4 & 8) != 0) {
            i3 = view.getMeasuredHeight() + i2;
        }
        b(view, i, i2, measuredWidth, i3);
    }

    public static void d(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
