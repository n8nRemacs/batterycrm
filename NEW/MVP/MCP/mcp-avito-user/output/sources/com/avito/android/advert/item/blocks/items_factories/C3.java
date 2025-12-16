package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRatingItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/C3;", "Lcom/avito/android/advert/item/blocks/items_factories/B3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C3 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73717a;

    @Inject
    public C3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73717a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.B3
    @Y61.l
    public final AdvertDetailsReviewsScoreItem a(@Y61.l ItemReviewsHeader itemReviewsHeader) {
        if (itemReviewsHeader == null) {
            return null;
        }
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsReviewsScoreItem(56, null, itemReviewsHeader.getScoreValue(), itemReviewsHeader.getScoreText(), itemReviewsHeader.getCaption(), itemReviewsHeader.getDeeplink(), null, this.f73717a.a(), null, null, 834, null);
    }
}
