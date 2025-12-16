package O2;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.RestrictTo;
import j.N;

/* compiled from: CubicCurveData.java */
@RestrictTo
/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f11929a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f11930b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f11931c;

    public a() {
        this.f11929a = new PointF();
        this.f11930b = new PointF();
        this.f11931c = new PointF();
    }

    @N
    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        PointF pointF = this.f11931c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f11929a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f11930b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f11929a = pointF;
        this.f11930b = pointF2;
        this.f11931c = pointF3;
    }
}
