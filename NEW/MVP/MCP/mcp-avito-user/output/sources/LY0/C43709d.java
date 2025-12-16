package lY0;

import android.animation.TypeEvaluator;
import androidx.appcompat.app.r;
import j.N;

/* compiled from: ArgbEvaluatorCompat.java */
/* renamed from: lY0.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43709d implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C43709d f413884a = new C43709d();

    @N
    public static Integer a(float f12, Integer num, Integer num2) {
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
        float fC2 = r.c(f14, f13, f12, f13);
        float fC3 = r.c(fPow4, fPow, f12, fPow);
        float fC4 = r.c(fPow5, fPow2, f12, fPow2);
        float fC5 = r.c(fPow6, fPow3, f12, fPow3);
        float fPow7 = ((float) Math.pow(fC3, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fC4, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fC5, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fC2 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    @N
    public final /* bridge */ /* synthetic */ Integer evaluate(float f12, Integer num, Integer num2) {
        return a(f12, num, num2);
    }
}
