package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.RestrictTo;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;

/* compiled from: CamColor.java */
@RestrictTo
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f44645a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44646b;

    /* renamed from: c, reason: collision with root package name */
    public final float f44647c;

    /* renamed from: d, reason: collision with root package name */
    public final float f44648d;

    /* renamed from: e, reason: collision with root package name */
    public final float f44649e;

    /* renamed from: f, reason: collision with root package name */
    public final float f44650f;

    public a(float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f44645a = f12;
        this.f44646b = f13;
        this.f44647c = f14;
        this.f44648d = f15;
        this.f44649e = f16;
        this.f44650f = f17;
    }

    @N
    public static a a(@InterfaceC42156l int i12) {
        m mVar = m.f44684k;
        float fB2 = b.b(Color.red(i12));
        float fB3 = b.b(Color.green(i12));
        float fB4 = b.b(Color.blue(i12));
        float[][] fArr = b.f44654d;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[2] * fB4) + (fArr2[1] * fB3) + (fArr2[0] * fB2);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[2] * fB4) + (fArr3[1] * fB3) + (fArr3[0] * fB2);
        float[] fArr4 = fArr[2];
        float f14 = (fB4 * fArr4[2]) + (fB3 * fArr4[1]) + (fB2 * fArr4[0]);
        float[][] fArr5 = b.f44651a;
        float[] fArr6 = fArr5[0];
        float f15 = (fArr6[2] * f14) + (fArr6[1] * f13) + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f16 = (fArr7[2] * f14) + (fArr7[1] * f13) + (fArr7[0] * f12);
        float[] fArr8 = fArr5[2];
        float f17 = (f14 * fArr8[2]) + (f13 * fArr8[1]) + (f12 * fArr8[0]);
        float[] fArr9 = mVar.f44691g;
        float f18 = fArr9[0] * f15;
        float f19 = fArr9[1] * f16;
        float f22 = fArr9[2] * f17;
        float fAbs = Math.abs(f18);
        float f23 = mVar.f44692h;
        float fPow = (float) Math.pow((fAbs * f23) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f19) * f23) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f22) * f23) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d12 = fSignum3;
        float f24 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d12)) / 11.0f;
        float f25 = ((float) ((fSignum + fSignum2) - (d12 * 2.0d))) / 9.0f;
        float f26 = fSignum2 * 20.0f;
        float f27 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f26)) / 20.0f;
        float f28 = (((fSignum * 40.0f) + f26) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f29 = fAtan2;
        float f32 = (3.1415927f * f29) / 180.0f;
        float f33 = f28 * mVar.f44686b;
        float f34 = mVar.f44685a;
        float f35 = mVar.f44688d;
        float fPow4 = ((float) Math.pow(f33 / f34, mVar.f44694j * f35)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f36 = f34 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f44690f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f29) < 20.14d ? 360.0f + f29 : f29) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f44689e) * mVar.f44687c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (f27 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f37 = mVar.f44693i * fPow5;
        Math.sqrt((r3 * f35) / f36);
        float f38 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f37 * 0.0228f) + 1.0f)) * 43.85965f;
        double d13 = f32;
        return new a(f29, fPow5, fPow4, f38, fLog * ((float) Math.cos(d13)), fLog * ((float) Math.sin(d13)));
    }

    @N
    public static a b(@InterfaceC42167x float f12, @InterfaceC42167x float f13, @InterfaceC42167x float f14) {
        m mVar = m.f44684k;
        float f15 = mVar.f44688d;
        Math.sqrt(f12 / 100.0d);
        float f16 = mVar.f44685a + 4.0f;
        float f17 = mVar.f44693i * f13;
        Math.sqrt(((f13 / ((float) Math.sqrt(r1))) * mVar.f44688d) / f16);
        float f18 = (1.7f * f12) / ((0.007f * f12) + 1.0f);
        float fLog = ((float) Math.log((f17 * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (3.1415927f * f14) / 180.0f;
        return new a(f14, f13, f12, f18, fLog * ((float) Math.cos(d12)), fLog * ((float) Math.sin(d12)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @j.InterfaceC42156l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(@j.N androidx.core.content.res.m r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.a.c(androidx.core.content.res.m):int");
    }
}
