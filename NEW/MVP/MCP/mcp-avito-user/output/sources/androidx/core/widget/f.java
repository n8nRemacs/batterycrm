package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import j.N;
import j.X;

/* compiled from: EdgeEffectCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: EdgeEffectCompat.java */
    @X
    public static class a {
        private a() {
        }

        public static void a(EdgeEffect edgeEffect, float f12, float f13) {
            edgeEffect.onPull(f12, f13);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    @X
    public static class b {
        private b() {
        }

        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f12, float f13) {
            try {
                return edgeEffect.onPullDistance(f12, f13);
            } catch (Throwable unused) {
                edgeEffect.onPull(f12, f13);
                return 0.0f;
            }
        }
    }

    public static float a(@N EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void b(@N EdgeEffect edgeEffect, float f12, float f13) {
        a.a(edgeEffect, f12, f13);
    }

    public static float c(@N EdgeEffect edgeEffect, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f12, f13);
        }
        a.a(edgeEffect, f12, f13);
        return f12;
    }
}
