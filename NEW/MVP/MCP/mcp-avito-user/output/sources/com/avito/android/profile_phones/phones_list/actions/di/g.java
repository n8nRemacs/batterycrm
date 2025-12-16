package com.avito.android.profile_phones.phones_list.actions.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneActionsModule_ProvideAdapterPresenter$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227492a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227493b;

    public g(d dVar, u uVar) {
        this.f227492a = dVar;
        this.f227493b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f227493b.get();
        this.f227492a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
