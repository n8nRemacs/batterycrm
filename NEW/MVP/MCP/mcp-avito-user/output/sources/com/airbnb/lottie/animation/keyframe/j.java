package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f59336i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f59337j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f59338k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f59339l;

    /* renamed from: m, reason: collision with root package name */
    public i f59340m;

    public j(ArrayList arrayList) {
        super(arrayList);
        this.f59336i = new PointF();
        this.f59337j = new float[2];
        this.f59338k = new float[2];
        this.f59339l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        i iVar = (i) aVar;
        Path path = iVar.f59334q;
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        if (jVar != 0 && aVar.f60140h != null) {
            PointF pointF = (PointF) jVar.b(iVar.f60139g, iVar.f60140h.floatValue(), (PointF) iVar.f60134b, (PointF) iVar.f60135c, e(), f12, this.f59310d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f60134b;
        }
        i iVar2 = this.f59340m;
        PathMeasure pathMeasure = this.f59339l;
        if (iVar2 != iVar) {
            pathMeasure.setPath(path, false);
            this.f59340m = iVar;
        }
        float length = pathMeasure.getLength();
        float f13 = f12 * length;
        float[] fArr = this.f59337j;
        float[] fArr2 = this.f59338k;
        pathMeasure.getPosTan(f13, fArr, fArr2);
        PointF pointF2 = this.f59336i;
        pointF2.set(fArr[0], fArr[1]);
        if (f13 < 0.0f) {
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
            return pointF2;
        }
        if (f13 <= length) {
            return pointF2;
        }
        float f14 = f13 - length;
        pointF2.offset(fArr2[0] * f14, fArr2[1] * f14);
        return pointF2;
    }
}
