package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class awe implements Interpolator {
    public final float a;
    public final /* synthetic */ bwe b;

    public awe(long j, long j2, bwe bweVar) {
        this.b = bweVar;
        this.a = j / j2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        float fB = n7j.b(f, 0.0f, 1.0f);
        float f2 = this.a;
        bwe bweVar = this.b;
        if (fB >= f2) {
            return bweVar.p.getInterpolation(1.0f);
        }
        return bweVar.p.getInterpolation(fB / f2);
    }
}
