package com.avito.android.advert_collection_list.di;

import com.avito.android.advert_collection_list.tracker.FavoritesCollectionsListScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionListModule_ProvidePerfScreenData$_avito_advert_collection_list_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f82093a;

    public j(dagger.internal.l lVar) {
        this.f82093a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f82093a.f393949a;
        c.f82083a.getClass();
        return new C28478k(FavoritesCollectionsListScreen.f82314d, rVar, null, 4, null);
    }
}
