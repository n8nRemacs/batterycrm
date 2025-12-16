package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class afh {
    public static void a(View view, ffh ffhVar) {
        z0f z0fVar = (z0f) view.getTag(gzc.tag_unhandled_key_listeners);
        if (z0fVar == null) {
            z0fVar = new z0f(0);
            view.setTag(gzc.tag_unhandled_key_listeners, z0fVar);
        }
        Objects.requireNonNull(ffhVar);
        View.OnUnhandledKeyEventListener zehVar = new zeh();
        z0fVar.put(ffhVar, zehVar);
        view.addOnUnhandledKeyEventListener(zehVar);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, ffh ffhVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        z0f z0fVar = (z0f) view.getTag(gzc.tag_unhandled_key_listeners);
        if (z0fVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) z0fVar.get(ffhVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, hc0 hc0Var) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
