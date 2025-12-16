package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;

/* compiled from: ArgbEvaluator.java */
@RestrictTo
/* loaded from: classes10.dex */
public class f implements TypeEvaluator {
    static {
        new f();
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f12, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f13 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f14 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fC2 = r.c(f14, f13, f12, f13);
        float fC3 = r.c(fPow4, fPow, f12, fPow);
        float fC4 = r.c(fPow5, fPow2, f12, fPow2);
        float fC5 = r.c(fPow6, fPow3, f12, fPow3);
        float fPow7 = ((float) Math.pow(fC3, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fC4, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fC5, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fC2 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
