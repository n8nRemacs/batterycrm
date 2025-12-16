package com.avito.android.profile_phones.phones_list.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhonesListModule_ProvideDevicesAdapter$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227717a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227718b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f227719c;

    public n(l lVar, u uVar, Provider provider) {
        this.f227717a = lVar;
        this.f227718b = uVar;
        this.f227719c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f227718b.get();
        com.avito.konveyor.a aVar2 = this.f227719c.get();
        this.f227717a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
