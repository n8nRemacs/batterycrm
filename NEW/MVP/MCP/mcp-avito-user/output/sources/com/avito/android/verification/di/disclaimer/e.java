package com.avito.android.verification.di.disclaimer;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationDisclaimerListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f323550b;

    public e(u uVar, Provider provider) {
        this.f323549a = uVar;
        this.f323550b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f323549a.get();
        com.avito.konveyor.a aVar2 = this.f323550b.get();
        d.f323548a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
