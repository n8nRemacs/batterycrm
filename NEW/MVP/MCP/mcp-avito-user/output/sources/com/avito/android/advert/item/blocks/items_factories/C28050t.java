package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.address.AdvertDetailsAddressItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.RouteButtons;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAddressItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/t;", "Lcom/avito/android/advert/item/blocks/items_factories/s;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28050t implements InterfaceC28044s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74026a;

    @Inject
    public C28050t(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74026a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28044s
    @Y61.l
    public final AdvertDetailsAddressItem a(@Y61.k AdvertDetails advertDetails) {
        Integer num = null;
        if (advertDetails.getCoordinates().isEmpty() || advertDetails.getAddress().length() == 0) {
            return null;
        }
        String address = advertDetails.getAddress();
        Coordinates coordinates = advertDetails.getCoordinates();
        String title = advertDetails.getTitle();
        List<GeoReference> geoReferences = advertDetails.getGeoReferences();
        boolean z12 = !(geoReferences == null || geoReferences.isEmpty());
        boolean shouldShowMapPreview = advertDetails.getShouldShowMapPreview();
        int iA2 = this.f74026a.a();
        boolean zIsRestyle = advertDetails.isRestyle();
        RouteButtons routeButtons = advertDetails.getRouteButtons();
        if (advertDetails.isRedesign() && !advertDetails.isRealtyRedesign()) {
            num = 2;
        }
        return new AdvertDetailsAddressItem(0L, null, address, coordinates, title, z12, shouldShowMapPreview, routeButtons, zIsRestyle, num, advertDetails.getMultiAddressesInfo(), advertDetails.getSellerAddressesInfo(), iA2, null, null, 24579, null);
    }
}
