package com.airbnb.lottie.value;

/* compiled from: LottieRelativeFloatValueCallback.java */
/* loaded from: classes10.dex */
public class g extends j<Float> {
    @Override // com.airbnb.lottie.value.j
    public final Float a(b<Float> bVar) {
        float f12 = com.airbnb.lottie.utils.j.f(bVar.f60151c.floatValue(), bVar.f60152d.floatValue(), bVar.f60154f);
        Object obj = this.f60158b;
        if (obj != null) {
            return Float.valueOf(((Float) obj).floatValue() + f12);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
