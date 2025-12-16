package com.avito.android.tariff_lf.bar;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298734a;

    public c(u uVar) {
        this.f298734a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298734a.get());
    }
}
