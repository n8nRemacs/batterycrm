package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.rich_geo_block.AdvertDetailsRichGeoBlockItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.rich_geo_block.RichGeoBlock;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRichGeoBlockItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/X3;", "Lcom/avito/android/advert/item/blocks/items_factories/W3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X3 implements W3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73887a;

    @Inject
    public X3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73887a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W3
    @Y61.l
    public final AdvertDetailsRichGeoBlockItem a(@Y61.k AdvertDetails advertDetails) {
        RichGeoBlock richGeoBlock = advertDetails.getRichGeoBlock();
        if (richGeoBlock == null) {
            return null;
        }
        return new AdvertDetailsRichGeoBlockItem(0L, null, this.f73887a.a(), richGeoBlock, 3, null);
    }
}
