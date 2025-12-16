package com.avito.android.travel_search.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<FromPageSource> {

    /* compiled from: TravelSearchModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final s f303082a = new s();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p.f303076a.getClass();
        FromPageSource.TravelSearch travelSearch = FromPageSource.TravelSearch.f82339c;
        dagger.internal.t.d(travelSearch);
        return travelSearch;
    }
}
