package com.avito.android.edit_carousel.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditCarouselModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f146374a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f146375b;

    public d(u uVar, Provider provider) {
        this.f146374a = uVar;
        this.f146375b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f146374a.get();
        com.avito.konveyor.a aVar2 = this.f146375b.get();
        c.f146373a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
