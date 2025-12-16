package com.avito.android.extended_profile_adverts.di;

import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideSpanProvider$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150818a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<h1> f150819b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Integer> f150820c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150821d;

    public k(C30493b c30493b, Provider provider, Provider provider2, dagger.internal.l lVar) {
        this.f150818a = c30493b;
        this.f150819b = provider;
        this.f150820c = provider2;
        this.f150821d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h1 h1Var = this.f150819b.get();
        int iIntValue = this.f150820c.get().intValue();
        com.avito.android.ui.adapter.f fVar = (com.avito.android.ui.adapter.f) this.f150821d.f393949a;
        this.f150818a.getClass();
        Z0 z02 = new Z0(iIntValue, h1Var);
        z02.f268509c = fVar;
        return z02;
    }
}
