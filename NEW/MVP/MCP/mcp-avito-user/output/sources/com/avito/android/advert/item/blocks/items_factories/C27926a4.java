package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.safedeal.info.AdvertDetailsSafeDealInfoItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.safedeal.SafeDeal;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealInfoItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/a4;", "Lcom/avito/android/advert/item/blocks/items_factories/Z3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.a4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27926a4 implements Z3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73911a;

    @Inject
    public C27926a4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73911a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Z3
    @Y61.l
    public final AdvertDetailsSafeDealInfoItem a(@Y61.k AdvertDetails advertDetails) {
        SafeDeal safeDeal = advertDetails.getSafeDeal();
        SafeDeal.Info info = safeDeal != null ? safeDeal.getInfo() : null;
        if (info != null) {
            return new AdvertDetailsSafeDealInfoItem(0L, null, info, this.f73911a.a(), null, null, 51, null);
        }
        return null;
    }
}
