package com.avito.android.registration_self_employment_redirect_screen.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectModule_ProvideListAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f252723a;

    public g(f fVar) {
        this.f252723a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f252723a.get();
        e.f252721a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
