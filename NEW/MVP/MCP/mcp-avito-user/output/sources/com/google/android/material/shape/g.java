package com.google.android.material.shape;

import j.N;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes6.dex */
public class g extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f357031a = -1.0f;

    @Override // com.google.android.material.shape.f
    public final void a(@N t tVar, float f12, float f13) {
        tVar.f(0.0f, f13 * f12, 180.0f, 90.0f);
        double d12 = f13;
        double d13 = f12;
        tVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d12 * d13), (float) (Math.sin(Math.toRadians(0.0f)) * d12 * d13));
    }
}
