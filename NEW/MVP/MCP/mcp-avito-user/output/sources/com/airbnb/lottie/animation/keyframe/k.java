package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f59341i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f59341i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        return h(aVar, f12, f12, f12);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final PointF h(com.airbnb.lottie.value.a<PointF> aVar, float f12, float f13, float f14) {
        PointF pointF;
        PointF pointF2 = aVar.f60134b;
        if (pointF2 == null || (pointF = aVar.f60135c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        if (jVar != 0) {
            PointF pointF5 = (PointF) jVar.b(aVar.f60139g, aVar.f60140h.floatValue(), pointF3, pointF4, f12, e(), this.f59310d);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.f59341i;
        float f15 = pointF3.x;
        float fC2 = androidx.appcompat.app.r.c(pointF4.x, f15, f13, f15);
        float f16 = pointF3.y;
        pointF6.set(fC2, androidx.appcompat.app.r.c(pointF4.y, f16, f14, f16));
        return pointF6;
    }
}
