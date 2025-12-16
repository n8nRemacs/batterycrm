package com.avito.android.advert.di;

import com.avito.android.advert.di.t0;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideHeaderSafeDealViewCreator$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class U implements dagger.internal.h<com.avito.android.advert_core.safedeal.u<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f69121a;

    public U(Provider<com.avito.android.util.text.a> provider) {
        this.f69121a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) ((t0.b.C27749n) this.f69121a).get();
        C27710t.f69463a.getClass();
        return new com.avito.android.advert.item.safedeal.components.creators.e(aVar);
    }
}
