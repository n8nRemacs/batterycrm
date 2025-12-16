package com.avito.android.extended_profile_serp.di;

import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideSpanProvider$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Integer> f152667a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<h1> f152668b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f152669c;

    public E(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f152667a = provider;
        this.f152668b = provider2;
        this.f152669c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = this.f152667a.get().intValue();
        h1 h1Var = this.f152668b.get();
        com.avito.android.ui.adapter.f fVar = (com.avito.android.ui.adapter.f) this.f152669c.f393949a;
        C30538h.f152853a.getClass();
        Z0 z02 = new Z0(iIntValue, h1Var);
        z02.f268509c = fVar;
        return z02;
    }
}
