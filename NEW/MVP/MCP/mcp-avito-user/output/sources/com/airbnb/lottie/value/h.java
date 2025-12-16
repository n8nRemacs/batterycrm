package com.airbnb.lottie.value;

import android.graphics.PointF;

/* compiled from: LottieRelativeIntegerValueCallback.java */
/* loaded from: classes10.dex */
public class h extends j<Integer> {
    @Override // com.airbnb.lottie.value.j
    public final Integer a(b<Integer> bVar) {
        int iIntValue = bVar.f60151c.intValue();
        int iIntValue2 = bVar.f60152d.intValue();
        float f12 = bVar.f60154f;
        PointF pointF = com.airbnb.lottie.utils.j.f60122a;
        int i12 = (int) ((f12 * (iIntValue2 - iIntValue)) + iIntValue);
        Object obj = this.f60158b;
        if (obj != null) {
            return Integer.valueOf(((Integer) obj).intValue() + i12);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
