package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import androidx.appcompat.app.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f46645a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46646b;

    public d(float[] fArr) {
        this.f46645a = fArr;
        this.f46646b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f12) {
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f46645a;
        int iMin = Math.min((int) ((fArr.length - 1) * f12), fArr.length - 2);
        float f13 = this.f46646b;
        float f14 = (f12 - (iMin * f13)) / f13;
        float f15 = fArr[iMin];
        return r.c(fArr[iMin + 1], f15, f14, f15);
    }
}
