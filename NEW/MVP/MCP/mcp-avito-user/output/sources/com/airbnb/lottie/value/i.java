package com.airbnb.lottie.value;

import android.graphics.PointF;

/* compiled from: LottieRelativePointValueCallback.java */
/* loaded from: classes10.dex */
public class i extends j<PointF> {

    /* renamed from: c, reason: collision with root package name */
    public final PointF f60156c = new PointF();

    @Override // com.airbnb.lottie.value.j
    public final PointF a(b<PointF> bVar) {
        PointF pointF = this.f60156c;
        pointF.set(com.airbnb.lottie.utils.j.f(bVar.f60151c.x, bVar.f60152d.x, bVar.f60154f), com.airbnb.lottie.utils.j.f(bVar.f60151c.y, bVar.f60152d.y, bVar.f60154f));
        Object obj = this.f60158b;
        if (obj == null) {
            throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        PointF pointF2 = (PointF) obj;
        pointF.offset(pointF2.x, pointF2.y);
        return pointF;
    }
}
