package com.avito.android.advert_collection_adding.di;

import com.avito.android.advert_collection_shared.tracker.FavoritesCollectionsCreateScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionAddingModule_ProvidePerfScreenData$_avito_advert_collection_adding_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final f f81792a;

    /* renamed from: b, reason: collision with root package name */
    public final l f81793b;

    public g(f fVar, l lVar) {
        this.f81792a = fVar;
        this.f81793b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f81793b.f393949a;
        this.f81792a.getClass();
        return new C28478k(FavoritesCollectionsCreateScreen.f82318d, rVar, null, 4, null);
    }
}
