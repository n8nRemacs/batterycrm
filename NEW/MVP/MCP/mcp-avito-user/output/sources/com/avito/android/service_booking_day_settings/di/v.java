package com.avito.android.service_booking_day_settings.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SettingsRecyclerModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f277168a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f277169b;

    public v(dagger.internal.u uVar, Provider provider) {
        this.f277168a = uVar;
        this.f277169b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f277168a.get();
        com.avito.konveyor.a aVar2 = this.f277169b.get();
        r.f277162a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
