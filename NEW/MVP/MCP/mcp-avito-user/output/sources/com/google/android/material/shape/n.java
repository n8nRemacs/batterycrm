package com.google.android.material.shape;

import j.N;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes6.dex */
public final class n extends h {

    /* renamed from: b, reason: collision with root package name */
    public final j f357076b;

    /* renamed from: c, reason: collision with root package name */
    public final float f357077c;

    public n(@N j jVar, float f12) {
        this.f357076b = jVar;
        this.f357077c = f12;
    }

    @Override // com.google.android.material.shape.h
    public final boolean a() {
        this.f357076b.getClass();
        return true;
    }

    @Override // com.google.android.material.shape.h
    public final void b(float f12, float f13, float f14, @N t tVar) {
        this.f357076b.b(f12, f13 - this.f357077c, f14, tVar);
    }
}
