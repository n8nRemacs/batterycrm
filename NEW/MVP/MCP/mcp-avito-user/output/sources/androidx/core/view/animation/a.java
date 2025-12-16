package androidx.core.view.animation;

import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: classes.dex */
class a implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        throw null;
    }
}
