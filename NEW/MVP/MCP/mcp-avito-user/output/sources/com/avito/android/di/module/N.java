package com.avito.android.di.module;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideResourcesProvider$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class N implements dagger.internal.h<com.avito.android.constructor_advert.ui.serp.constructor.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f144077a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144078b;

    public N(dagger.internal.u uVar, Provider provider) {
        this.f144077a = provider;
        this.f144078b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f144077a.get();
        int iIntValue = ((Integer) this.f144078b.get()).intValue();
        D d12 = D.f143878a;
        return new com.avito.android.constructor_advert.ui.serp.constructor.i(resources, iIntValue);
    }
}
