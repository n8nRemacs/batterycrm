package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class cpi {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbK = wy1.k("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbK.append(i3);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(ho7.g("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final void b(Activity activity) {
        View currentFocus;
        if (activity == null || (currentFocus = activity.getWindow().getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static final void c(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        view.clearFocus();
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static final Set d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int iD = vmf.D(str, ",", 0, false, 4);
        if (iD == -1) {
            return Collections.singleton(str);
        }
        xs xsVar = new xs(10);
        int i = 0;
        do {
            xsVar.add(str.substring(i, iD));
            i = iD + 1;
            iD = vmf.D(str, ",", i, false, 4);
        } while (iD != -1);
        xsVar.add(str.substring(i, str.length()));
        return xsVar;
    }
}
