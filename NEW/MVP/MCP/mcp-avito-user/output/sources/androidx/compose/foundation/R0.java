package androidx.compose.foundation;

import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Metadata;

/* compiled from: EdgeEffectCompat.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/R0;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final R0 f26833a = new R0();

    public static float a(@Y61.k EdgeEffect edgeEffect, float f12, float f13, @Y61.k androidx.compose.ui.unit.d dVar) {
        float f14 = S0.f26838a;
        double f42846b = dVar.getF42846b() * 386.0878f * 160.0f * 0.84f;
        double d12 = S0.f26838a * f42846b;
        if (((float) (Math.exp((S0.f26839b / S0.f26840c) * Math.log((Math.abs(f12) * 0.35f) / d12)) * d12)) > b(edgeEffect) * f13) {
            return 0.0f;
        }
        c(edgeEffect, kotlin.math.b.b(f12));
        return f12;
    }

    public static float b(@Y61.k EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        C21091y.f32322a.getClass();
        return C21091y.b(edgeEffect);
    }

    public static void c(@Y61.k EdgeEffect edgeEffect, int i12) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i12);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i12);
        }
    }

    public static float d(@Y61.k EdgeEffect edgeEffect, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 31) {
            C21091y.f32322a.getClass();
            return C21091y.c(edgeEffect, f12, f13);
        }
        edgeEffect.onPull(f12, f13);
        return f12;
    }

    public static void e(@Y61.k EdgeEffect edgeEffect, float f12) {
        if (!(edgeEffect instanceof C20530i1)) {
            edgeEffect.onRelease();
            return;
        }
        C20530i1 c20530i1 = (C20530i1) edgeEffect;
        float f13 = c20530i1.f28132b + f12;
        c20530i1.f28132b = f13;
        if (Math.abs(f13) > c20530i1.f28131a) {
            c20530i1.onRelease();
        }
    }
}
