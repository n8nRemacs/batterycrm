package com.avito.android.advert_collection.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: AdvertCollectionModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes10.dex */
public final class u implements dagger.internal.h<FromPageSource> {

    /* compiled from: AdvertCollectionModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final u f81485a = new u();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s.f81480a.getClass();
        FromPageSource.AdvertCollection advertCollection = FromPageSource.AdvertCollection.f82323c;
        dagger.internal.t.d(advertCollection);
        return advertCollection;
    }
}
