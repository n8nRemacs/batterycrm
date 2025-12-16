package com.avito.android.esia_redirect_screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaRedirectModule_ProvideButtonsBundleBenefitAdapterPresenter$_avito_gig_esia_redirect_screen_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148035a;

    public n(u uVar) {
        this.f148035a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f148035a.get();
        m.f148034a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
