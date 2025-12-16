package com.airbnb.lottie.animation.keyframe;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class d extends g<Float> {
    public d() {
        throw null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        return Float.valueOf(n(aVar, f12));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(com.airbnb.lottie.value.a<Float> aVar, float f12) {
        if (aVar.f60134b == null || aVar.f60135c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        Float f13 = aVar.f60134b;
        if (jVar != 0) {
            Float f14 = aVar.f60135c;
            float fE2 = e();
            float f15 = this.f59310d;
            Float f16 = (Float) jVar.b(aVar.f60139g, aVar.f60140h.floatValue(), f13, f14, f12, fE2, f15);
            if (f16 != null) {
                return f16.floatValue();
            }
        }
        if (aVar.f60141i == -3987645.8f) {
            aVar.f60141i = f13.floatValue();
        }
        float f17 = aVar.f60141i;
        if (aVar.f60142j == -3987645.8f) {
            aVar.f60142j = aVar.f60135c.floatValue();
        }
        return com.airbnb.lottie.utils.j.f(f17, aVar.f60142j, f12);
    }
}
