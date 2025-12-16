package com.avito.android.extended_profile_serp.di;

import Oi0.C14700d;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideGridAppendingAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C14700d> f152869a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<h1> f152870b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f152871c;

    public v(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f152869a = provider;
        this.f152870b = provider2;
        this.f152871c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C14700d c14700d = this.f152869a.get();
        h1 h1Var = this.f152870b.get();
        com.avito.android.ui.adapter.f fVar = (com.avito.android.ui.adapter.f) this.f152871c.f393949a;
        C30538h.f152853a.getClass();
        com.avito.android.ui.adapter.l lVar = new com.avito.android.ui.adapter.l(h1Var, false, 2, null);
        lVar.f304571d = fVar;
        return new com.avito.android.ui.adapter.h(c14700d, lVar);
    }
}
