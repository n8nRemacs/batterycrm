package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public abstract class x9j {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return k85.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return k85.c(edgeEffect, f, f2);
        }
        j85.a(edgeEffect, f, f2);
        return f;
    }

    public static final void c(esg esgVar) {
        esgVar.d(598, new b4e(13));
        esgVar.d(599, new b4e(14));
    }
}
