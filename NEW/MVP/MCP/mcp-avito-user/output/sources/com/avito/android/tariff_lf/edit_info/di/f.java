package com.avito.android.tariff_lf.edit_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditInfoModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.f> f298844a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.b> f298845b;

    /* renamed from: c, reason: collision with root package name */
    public final u f298846c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f298844a = provider;
        this.f298845b = provider2;
        this.f298846c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.f fVar = this.f298844a.get();
        com.avito.android.recycler.data_aware.b bVar = this.f298845b.get();
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f298846c.get();
        c cVar = c.f298839a;
        return new com.avito.android.recycler.data_aware.i(bVar, fVar, true, aVar);
    }
}
