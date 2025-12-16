package com.avito.android.registration_self_employment_redirect_screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f252724a;

    /* renamed from: b, reason: collision with root package name */
    public final f f252725b;

    public h(u uVar, f fVar) {
        this.f252724a = uVar;
        this.f252725b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f252724a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f252725b.get();
        e.f252721a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
