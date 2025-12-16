package com.avito.android.advert_collection.adapter;

import Y61.l;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/c;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.recycler.data_aware.a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF79796b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF79796b()) : null) || !(aVar instanceof FavoriteAdvertItem) || !(aVar2 instanceof FavoriteAdvertItem)) {
            return null;
        }
        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVar2;
        return new com.avito.android.favorites.adapter.advert.c(favoriteAdvertItem.f156394F, favoriteAdvertItem.f156419q);
    }
}
