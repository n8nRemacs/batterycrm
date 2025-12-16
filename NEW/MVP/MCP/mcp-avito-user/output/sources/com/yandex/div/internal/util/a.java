package com.yandex.div.internal.util;

import android.animation.TypeEvaluator;
import j.N;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes7.dex */
public class a implements TypeEvaluator<Integer> {
    static {
        new a();
    }

    @Override // android.animation.TypeEvaluator
    @N
    public final Integer evaluate(float f12, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f13 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f14 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fC2 = androidx.appcompat.app.r.c(f14, f13, f12, f13);
        float fC3 = androidx.appcompat.app.r.c(fPow4, fPow, f12, fPow);
        float fC4 = androidx.appcompat.app.r.c(fPow5, fPow2, f12, fPow2);
        float fC5 = androidx.appcompat.app.r.c(fPow6, fPow3, f12, fPow3);
        float fPow7 = ((float) Math.pow(fC3, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fC4, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fC5, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fC2 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
