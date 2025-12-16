package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.service_transportation_info.advert_details.geo.AdvertDetailsServicesTransportationGeoItem;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesTransportationGeoItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/K4;", "Lcom/avito/android/advert/item/blocks/items_factories/J4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K4 implements J4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73786b;

    @Inject
    public K4(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73785a = b22;
        this.f73786b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.J4
    @Y61.l
    public final AdvertDetailsServicesTransportationGeoItem a(@Y61.k AdvertDetails advertDetails) {
        TransportationGeo transportationGeo = advertDetails.getTransportationGeo();
        if (transportationGeo == null) {
            return null;
        }
        com.avito.android.B2 b22 = this.f73785a;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.B2.f67184X[42];
        if (!((Boolean) b22.f67199O.a().invoke()).booleanValue()) {
            return null;
        }
        String id2 = advertDetails.getId();
        String xHash = advertDetails.getXHash();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsServicesTransportationGeoItem(transportationGeo, id2, xHash, "ITEM_SERVICES_TRANSPORTATION_GEO", this.f73786b.a());
    }
}
