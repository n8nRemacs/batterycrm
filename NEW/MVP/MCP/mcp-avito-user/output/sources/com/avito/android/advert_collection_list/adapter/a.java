package com.avito.android.advert_collection_list.adapter;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.advert_collection_list.adapter.advert_collection.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionListPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.recycler.data_aware.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF162200b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF162200b()) : null) || !(aVar instanceof AdvertCollectionItem) || !(aVar2 instanceof AdvertCollectionItem)) {
            return null;
        }
        AdvertCollectionItem advertCollectionItem = (AdvertCollectionItem) aVar2;
        return new c(advertCollectionItem.f82031e, advertCollectionItem.f82032f);
    }
}
