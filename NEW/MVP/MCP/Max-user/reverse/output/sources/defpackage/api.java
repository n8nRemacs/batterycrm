package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class api {
    public static final byte a(char c) {
        if (c < '~') {
            return ya2.b[c];
        }
        return (byte) 0;
    }

    public static Integer b(int i, ca3 ca3Var) {
        if (ca3Var.equals(vid.a(x28.class))) {
            return Integer.valueOf(avd.u0);
        }
        if (ca3Var.equals(vid.a(ad.class))) {
            return Integer.valueOf(avd.t0);
        }
        if (ca3Var.equals(vid.a(pha.class))) {
            return Integer.valueOf(avd.v0);
        }
        if (!ca3Var.equals(vid.a(ed5.class))) {
            throw new IllegalStateException("Such validation rule (" + vid.a(ca3.class) + " is not implemented");
        }
        int iV = az1.v(i);
        if (iV == 0) {
            return Integer.valueOf(avd.r0);
        }
        if (iV == 1) {
            return null;
        }
        if (iV == 2) {
            return Integer.valueOf(avd.s0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void c(c54 c54Var) {
        Activity activity = c54Var.getActivity();
        if (activity != null) {
            d(activity);
        }
    }

    public static final void d(Activity activity) {
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

    public static final void e(View view) {
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

    public static void f(View view) {
        if (view != null) {
            view.requestFocus();
            view.post(new qz5(view, 17, view));
        }
    }

    public static final String g(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }
}
