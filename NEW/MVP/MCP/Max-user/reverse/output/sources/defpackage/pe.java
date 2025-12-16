package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public final class pe implements TimeInterpolator {
    public final PathInterpolator a;
    public final PathInterpolator b;

    public pe(PathInterpolator pathInterpolator, PathInterpolator pathInterpolator2) {
        this.a = pathInterpolator;
        this.b = pathInterpolator2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fB = n7j.b(f, 0.0f, 1.0f);
        if (fB < 0.316f) {
            return this.a.getInterpolation(fB / 0.316f) * 0.316f;
        }
        return (this.b.getInterpolation((fB - 0.316f) / 0.684f) * 0.684f) + 0.316f;
    }
}
