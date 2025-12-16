package com.avito.android.extended_profile_adverts.di;

import com.avito.android.serp.adapter.C34690c0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideGridPositionProvider$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<h1> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f150807b;

    public h(C30493b c30493b, Provider<Integer> provider) {
        this.f150806a = c30493b;
        this.f150807b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = this.f150807b.get().intValue();
        this.f150806a.getClass();
        return new C34690c0(iIntValue);
    }
}
