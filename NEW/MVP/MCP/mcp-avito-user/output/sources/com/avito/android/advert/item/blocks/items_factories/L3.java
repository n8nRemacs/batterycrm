package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.rent_agreement.RentAgreementItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.RentAgreement;
import com.avito.android.remote.model.RentConditions;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRentAgreementItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/L3;", "Lcom/avito/android/advert/item/blocks/items_factories/K3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L3 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73799a;

    @Inject
    public L3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73799a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.K3
    @Y61.l
    public final RentAgreementItem a(@Y61.k AdvertDetails advertDetails) {
        RentAgreement rentAgreement;
        RentConditions rentConditions = advertDetails.getRentConditions();
        if (rentConditions == null || (rentAgreement = rentConditions.getRentAgreement()) == null) {
            return null;
        }
        return new RentAgreementItem(0L, null, this.f73799a.a(), rentAgreement, advertDetails.getId(), 3, null);
    }
}
