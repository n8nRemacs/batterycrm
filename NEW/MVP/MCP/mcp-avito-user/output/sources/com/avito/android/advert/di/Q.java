package com.avito.android.advert.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: AdvertFragmentModule_ProvideFromPageSource$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes10.dex */
public final class Q implements dagger.internal.h<FromPageSource> {

    /* compiled from: AdvertFragmentModule_ProvideFromPageSource$_avito_advert_details_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Q f69118a = new Q();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C27710t.f69463a.getClass();
        FromPageSource.Advert advert = FromPageSource.Advert.f82322c;
        dagger.internal.t.d(advert);
        return advert;
    }
}
