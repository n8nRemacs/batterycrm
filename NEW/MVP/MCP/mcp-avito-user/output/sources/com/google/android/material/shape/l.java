package com.google.android.material.shape;

import com.google.android.material.shape.q;
import j.N;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes6.dex */
class l implements q.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357075b;

    public l(float f12) {
        this.f357075b = f12;
    }

    @Override // com.google.android.material.shape.q.c
    @N
    public final e a(@N e eVar) {
        return eVar instanceof o ? eVar : new b(this.f357075b, eVar);
    }
}
