package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.additionalSeller.AdditionalSellerFeaturesItem;
import com.avito.android.remote.model.DevelopmentFeature;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAdditionalSellerFeaturesItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/k;", "Lcom/avito/android/advert/item/blocks/items_factories/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27991k implements InterfaceC27984j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73976a;

    @Inject
    public C27991k(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73976a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27984j
    @Y61.l
    public final AdditionalSellerFeaturesItem a(@Y61.l String str, @Y61.l List<DevelopmentFeature> list) {
        List<DevelopmentFeature> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return new AdditionalSellerFeaturesItem(0L, null, this.f73976a.a(), null, null, str, list, 27, null);
    }
}
