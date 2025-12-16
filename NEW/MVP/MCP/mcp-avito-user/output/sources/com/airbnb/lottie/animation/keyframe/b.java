package com.airbnb.lottie.animation.keyframe;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class b extends g<Integer> {
    public b() {
        throw null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        return Integer.valueOf(m(aVar, f12));
    }

    public final int m(com.airbnb.lottie.value.a<Integer> aVar, float f12) {
        Float f13;
        if (aVar.f60134b == null || aVar.f60135c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        Integer num = aVar.f60134b;
        if (jVar != 0 && (f13 = aVar.f60140h) != null) {
            Integer num2 = (Integer) jVar.b(aVar.f60139g, f13.floatValue(), num, aVar.f60135c, f12, e(), this.f59310d);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return com.airbnb.lottie.utils.c.c(com.airbnb.lottie.utils.j.b(f12, 0.0f, 1.0f), num.intValue(), aVar.f60135c.intValue());
    }
}
