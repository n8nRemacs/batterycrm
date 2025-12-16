package com.avito.android.services_onboarding.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingModule_ProvideDataAwareAdapterPresenterImpl$_avito_services_onboarding_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f279854a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f279855b;

    /* renamed from: c, reason: collision with root package name */
    public final u f279856c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f279854a = provider;
        this.f279855b = provider2;
        this.f279856c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f279854a);
        com.avito.konveyor.adapter.h hVar = this.f279855b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f279856c.get();
        f.f279852a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
