package com.avito.android.services_onboarding.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f279863a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f279864b;

    public m(u uVar, Provider provider) {
        this.f279863a = uVar;
        this.f279864b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f279863a.get();
        com.avito.konveyor.a aVar2 = this.f279864b.get();
        f.f279852a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
