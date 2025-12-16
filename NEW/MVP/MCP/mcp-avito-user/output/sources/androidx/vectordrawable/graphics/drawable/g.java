package androidx.vectordrawable.graphics.drawable;

import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;

/* compiled from: PathInterpolatorCompat.java */
@RestrictTo
/* loaded from: classes10.dex */
public class g implements Interpolator {
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
