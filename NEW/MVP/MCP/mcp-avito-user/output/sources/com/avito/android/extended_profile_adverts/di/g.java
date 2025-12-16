package com.avito.android.extended_profile_adverts.di;

import Oi0.C14700d;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideGridAppendingAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150802a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C14700d> f150803b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<h1> f150804c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150805d;

    public g(C30493b c30493b, Provider provider, Provider provider2, dagger.internal.l lVar) {
        this.f150802a = c30493b;
        this.f150803b = provider;
        this.f150804c = provider2;
        this.f150805d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C14700d c14700d = this.f150803b.get();
        h1 h1Var = this.f150804c.get();
        com.avito.android.ui.adapter.f fVar = (com.avito.android.ui.adapter.f) this.f150805d.f393949a;
        this.f150802a.getClass();
        com.avito.android.ui.adapter.l lVar = new com.avito.android.ui.adapter.l(h1Var, false, 2, null);
        lVar.f304571d = fVar;
        return new com.avito.android.ui.adapter.h(c14700d, lVar);
    }
}
