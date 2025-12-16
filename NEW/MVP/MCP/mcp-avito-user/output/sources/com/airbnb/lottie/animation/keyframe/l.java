package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.value.k f59342i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f59342i = new com.airbnb.lottie.value.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        T t12;
        T t13 = aVar.f60134b;
        if (t13 == 0 || (t12 = aVar.f60135c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.k kVar = (com.airbnb.lottie.value.k) t13;
        com.airbnb.lottie.value.k kVar2 = (com.airbnb.lottie.value.k) t12;
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        if (jVar != 0) {
            com.airbnb.lottie.value.k kVar3 = (com.airbnb.lottie.value.k) jVar.b(aVar.f60139g, aVar.f60140h.floatValue(), kVar, kVar2, f12, e(), this.f59310d);
            if (kVar3 != null) {
                return kVar3;
            }
        }
        float f13 = com.airbnb.lottie.utils.j.f(kVar.f60159a, kVar2.f60159a, f12);
        float f14 = com.airbnb.lottie.utils.j.f(kVar.f60160b, kVar2.f60160b, f12);
        com.airbnb.lottie.value.k kVar4 = this.f59342i;
        kVar4.f60159a = f13;
        kVar4.f60160b = f14;
        return kVar4;
    }
}
