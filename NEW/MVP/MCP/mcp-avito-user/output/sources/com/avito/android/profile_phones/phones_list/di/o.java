package com.avito.android.profile_phones.phones_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhonesListModule_ProvideDevicesAdapterPresenter$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227720a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227721b;

    public o(l lVar, u uVar) {
        this.f227720a = lVar;
        this.f227721b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f227721b.get();
        this.f227720a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
