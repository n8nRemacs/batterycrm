package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.additionalSeller.title_item.AdditionalSellerTitleItem;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAdditionalSellerTitleItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/n;", "Lcom/avito/android/advert/item/blocks/items_factories/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28012n implements InterfaceC28005m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73991a;

    @Inject
    public C28012n(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73991a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28005m
    @Y61.l
    public final AdditionalSellerTitleItem a(@Y61.k AdvertDetails advertDetails) {
        AttributedText title;
        AdditionalSeller additionalSeller = advertDetails.getAdditionalSeller();
        if (additionalSeller == null || (title = additionalSeller.getTitle()) == null) {
            return null;
        }
        return new AdditionalSellerTitleItem(0L, null, this.f73991a.a(), null, null, title, 27, null);
    }
}
