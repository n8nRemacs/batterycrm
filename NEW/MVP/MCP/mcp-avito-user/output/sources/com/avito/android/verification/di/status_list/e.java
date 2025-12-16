package com.avito.android.verification.di.status_list;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323856a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f323857b;

    public e(u uVar, Provider provider) {
        this.f323856a = uVar;
        this.f323857b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f323856a.get();
        com.avito.konveyor.a aVar2 = this.f323857b.get();
        d.f323855a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
