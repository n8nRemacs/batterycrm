package com.google.android.material.shape;

import j.N;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes6.dex */
public final class j extends h {

    /* renamed from: b, reason: collision with root package name */
    public final float f357032b;

    public j(float f12) {
        this.f357032b = f12 - 0.001f;
    }

    @Override // com.google.android.material.shape.h
    public final void b(float f12, float f13, float f14, @N t tVar) {
        double d12 = this.f357032b;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d12) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d12, 2.0d) - Math.pow(fSqrt, 2.0d));
        tVar.f(f13 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d12) - d12))) + fSqrt2, 270.0f, 0.0f);
        tVar.d(f13, (float) (-((Math.sqrt(2.0d) * d12) - d12)));
        tVar.d(f13 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d12) - d12))) + fSqrt2);
    }
}
