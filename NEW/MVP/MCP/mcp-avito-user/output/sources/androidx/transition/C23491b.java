package androidx.transition;

import android.graphics.Path;

/* compiled from: ArcMotion.java */
/* renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23491b extends B {

    /* renamed from: b, reason: collision with root package name */
    public static final float f54733b = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public final float f54734a = f54733b;

    @Override // androidx.transition.B
    @j.N
    public final Path a(float f12, float f13, float f14, float f15) {
        float fC2;
        float fC3;
        Path path = new Path();
        path.moveTo(f12, f13);
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = (f12 + f14) / 2.0f;
        float f22 = (f13 + f15) / 2.0f;
        float f23 = 0.25f * f18;
        boolean z12 = f13 > f15;
        if (Math.abs(f16) < Math.abs(f17)) {
            float fAbs = Math.abs(f18 / (f17 * 2.0f));
            if (z12) {
                fC3 = fAbs + f15;
                fC2 = f14;
            } else {
                fC3 = fAbs + f13;
                fC2 = f12;
            }
        } else {
            float f24 = f18 / (f16 * 2.0f);
            if (z12) {
                fC3 = f13;
                fC2 = f24 + f12;
            } else {
                fC2 = f14 - f24;
                fC3 = f15;
            }
        }
        float f25 = f23 * 0.0f * 0.0f;
        float f26 = f19 - fC2;
        float f27 = f22 - fC3;
        float f28 = (f27 * f27) + (f26 * f26);
        float f29 = this.f54734a;
        float f32 = f23 * f29 * f29;
        if (f28 >= f25) {
            f25 = f28 > f32 ? f32 : 0.0f;
        }
        if (f25 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f25 / f28);
            fC2 = androidx.appcompat.app.r.c(fC2, f19, fSqrt, f19);
            fC3 = androidx.appcompat.app.r.c(fC3, f22, fSqrt, f22);
        }
        path.cubicTo((f12 + fC2) / 2.0f, (f13 + fC3) / 2.0f, (fC2 + f14) / 2.0f, (fC3 + f15) / 2.0f, f14, f15);
        return path;
    }
}
