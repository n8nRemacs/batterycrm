package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReviewsBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/j3;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j3 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D6.a f73591a;

    @Inject
    public j3(@Y61.k D6.a aVar) {
        this.f73591a = aVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        List<ItemReviewsEntry> entries;
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        ItemReviews itemReviews = advertDetailsWithMeta.f82645b.getItemReviews();
        ItemReviewsMain main = itemReviews != null ? itemReviews.getMain() : null;
        if (main == null || (entries = main.getEntries()) == null) {
            return null;
        }
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        return this.f73591a.a(entries, advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), false, false);
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
