package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: TypedValueCompat.java */
/* loaded from: classes.dex */
public class V {

    /* compiled from: TypedValueCompat.java */
    @X
    public static class a {
        public static float a(float f12, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(1, f12, displayMetrics);
        }
    }

    /* compiled from: TypedValueCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface b {
    }

    public static float a(float f12, @j.N DisplayMetrics displayMetrics) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(f12, displayMetrics);
        }
        float f13 = displayMetrics.density;
        if (f13 == 0.0f) {
            return 0.0f;
        }
        return f12 / f13;
    }
}
