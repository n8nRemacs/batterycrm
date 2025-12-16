package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class weh {
    public static g4i a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        g4i g4iVarH = g4i.h(null, rootWindowInsets);
        e4i e4iVar = g4iVarH.a;
        e4iVar.q(g4iVarH);
        e4iVar.d(view.getRootView());
        return g4iVarH;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
