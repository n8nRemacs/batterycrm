package com.avito.android.profile_settings_basic.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicProfileSettingsModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f228740a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f228741b;

    public c(u uVar, Provider provider) {
        this.f228740a = uVar;
        this.f228741b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f228740a.get();
        com.avito.konveyor.a aVar2 = this.f228741b.get();
        b bVar = b.f228739a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
