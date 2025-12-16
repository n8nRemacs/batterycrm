package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.recall_me.RecallMeBlockItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.RecallMeBlockDTO;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutoRecallMeItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/E;", "Lcom/avito/android/advert/item/blocks/items_factories/D;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73733a;

    @Inject
    public E(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73733a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.D
    @Y61.l
    public final RecallMeBlockItem a(@Y61.l AdvertDetails advertDetails) {
        RecallMeBlockDTO recallMeBlock;
        if (advertDetails == null || (recallMeBlock = advertDetails.getRecallMeBlock()) == null) {
            return null;
        }
        return new RecallMeBlockItem(0L, this.f73733a.a(), null, null, null, advertDetails.getId(), recallMeBlock, 29, null);
    }
}
