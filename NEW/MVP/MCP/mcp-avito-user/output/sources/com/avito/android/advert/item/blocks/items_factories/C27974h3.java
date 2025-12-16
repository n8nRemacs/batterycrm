package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.popularity_info.AdvertDetailsPopularityInfoItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.popularity.PopularityInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPopularityInfoFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/h3;", "Lcom/avito/android/advert/item/blocks/items_factories/g3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27974h3 implements InterfaceC27967g3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73963a;

    @Inject
    public C27974h3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73963a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27967g3
    @Y61.l
    public final AdvertDetailsPopularityInfoItem a(@Y61.k AdvertDetails advertDetails) {
        PopularityInfo popularityInfo = advertDetails.getPopularityInfo();
        if (popularityInfo == null) {
            return null;
        }
        return new AdvertDetailsPopularityInfoItem(0L, null, popularityInfo, this.f73963a.a(), null, null, 51, null);
    }
}
