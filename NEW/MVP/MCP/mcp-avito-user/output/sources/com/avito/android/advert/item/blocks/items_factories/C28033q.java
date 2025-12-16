package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.geo_distance.AdvertDetailsAddressGeoDistanceItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.geo_distance.AdvertDetailsGeoDistance;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsAddressGeoDistanceItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/q;", "Lcom/avito/android/advert/item/blocks/items_factories/p;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28033q implements InterfaceC28026p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74005a;

    @Inject
    public C28033q(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74005a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28026p
    @Y61.l
    public final AdvertDetailsAddressGeoDistanceItem a(@Y61.k AdvertDetails advertDetails) {
        Coordinates coordinatesParam;
        List<MultiAddressesItem> addresses;
        MultiAddressesItem multiAddressesItem;
        AdvertDetailsGeoDistance geoDistance = advertDetails.getGeoDistance();
        if (geoDistance == null) {
            return null;
        }
        MultiAddressesInfo multiAddressesInfo = advertDetails.getMultiAddressesInfo();
        if (multiAddressesInfo == null || (addresses = multiAddressesInfo.getAddresses()) == null || (multiAddressesItem = (MultiAddressesItem) C42745f0.G(addresses)) == null || (coordinatesParam = multiAddressesItem.getCoords()) == null) {
            coordinatesParam = advertDetails.getCoordinatesParam();
        }
        return new AdvertDetailsAddressGeoDistanceItem(0L, null, geoDistance, (coordinatesParam == null || coordinatesParam.isEmpty()) ? null : coordinatesParam, advertDetails.getCategoryId(), this.f74005a.a(), null, null, 195, null);
    }
}
