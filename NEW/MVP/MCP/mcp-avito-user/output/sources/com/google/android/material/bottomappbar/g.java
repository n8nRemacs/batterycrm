package com.google.android.material.bottomappbar;

import androidx.appcompat.app.r;
import com.google.android.material.shape.h;
import com.google.android.material.shape.t;
import j.N;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes6.dex */
public class g extends h implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public float f355956b;

    /* renamed from: c, reason: collision with root package name */
    public float f355957c;

    /* renamed from: d, reason: collision with root package name */
    public float f355958d;

    /* renamed from: e, reason: collision with root package name */
    public float f355959e;

    /* renamed from: f, reason: collision with root package name */
    public float f355960f;

    /* renamed from: g, reason: collision with root package name */
    public float f355961g;

    @Override // com.google.android.material.shape.h
    public final void b(float f12, float f13, float f14, @N t tVar) {
        float f15;
        float f16;
        float f17 = this.f355958d;
        if (f17 == 0.0f) {
            tVar.d(f12, 0.0f);
            return;
        }
        float f18 = ((this.f355957c * 2.0f) + f17) / 2.0f;
        float f19 = f14 * this.f355956b;
        float f22 = f13 + this.f355960f;
        float fC2 = r.c(1.0f, f14, f18, this.f355959e * f14);
        if (fC2 / f18 >= 1.0f) {
            tVar.d(f12, 0.0f);
            return;
        }
        float f23 = this.f355961g;
        float f24 = f23 * f14;
        boolean z12 = f23 == -1.0f || Math.abs((f23 * 2.0f) - f17) < 0.1f;
        if (z12) {
            f15 = fC2;
            f16 = 0.0f;
        } else {
            f16 = 1.75f;
            f15 = 0.0f;
        }
        float f25 = f18 + f19;
        float f26 = f15 + f19;
        float fSqrt = (float) Math.sqrt((f25 * f25) - (f26 * f26));
        float f27 = f22 - fSqrt;
        float f28 = f22 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f26));
        float f29 = (90.0f - degrees) + f16;
        tVar.d(f27, 0.0f);
        float f32 = f19 * 2.0f;
        tVar.a(f27 - f19, 0.0f, f27 + f19, f32, 270.0f, degrees);
        if (z12) {
            tVar.a(f22 - f18, (-f18) - f15, f22 + f18, f18 - f15, 180.0f - f29, (f29 * 2.0f) - 180.0f);
        } else {
            float f33 = this.f355957c;
            float f34 = f24 * 2.0f;
            float f35 = f22 - f18;
            tVar.a(f35, -(f24 + f33), f35 + f33 + f34, f33 + f24, 180.0f - f29, ((f29 * 2.0f) - 180.0f) / 2.0f);
            float f36 = f22 + f18;
            float f37 = this.f355957c;
            tVar.d(f36 - ((f37 / 2.0f) + f24), f37 + f24);
            float f38 = this.f355957c;
            tVar.a(f36 - (f34 + f38), -(f24 + f38), f36, f38 + f24, 90.0f, f29 - 90.0f);
        }
        tVar.a(f28 - f19, 0.0f, f28 + f19, f32, 270.0f - degrees, degrees);
        tVar.d(f12, 0.0f);
    }
}
