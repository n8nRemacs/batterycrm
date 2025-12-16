package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsShowOnMapItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/Q4;", "Lcom/avito/android/advert/item/blocks/items_factories/P4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q4 implements P4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73838a;

    @Inject
    public Q4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73838a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.P4
    @Y61.l
    public final AdvertDetailsShowOnMapItem a(@Y61.k AdvertDetails advertDetails) {
        String showOnMapTitle;
        String showOnMapTitle2;
        List<MultiAddressesItem> addresses;
        MultiAddressesInfo multiAddressesInfo = advertDetails.getMultiAddressesInfo();
        MultiAddressesItem multiAddressesItem = null;
        List<MultiAddressesItem> addresses2 = multiAddressesInfo != null ? multiAddressesInfo.getAddresses() : null;
        boolean z12 = addresses2 == null || addresses2.isEmpty();
        boolean z13 = advertDetails.getSellerAddressesInfo() != null;
        boolean z14 = (advertDetails.getCoordinates().isEmpty() || advertDetails.getAddress().length() == 0 || !advertDetails.getShouldShowMapPreview()) ? false : true;
        com.avito.android.advert.item.similars.j jVar = this.f73838a;
        if (!z12) {
            MultiAddressesInfo multiAddressesInfo2 = advertDetails.getMultiAddressesInfo();
            if (multiAddressesInfo2 != null && (addresses = multiAddressesInfo2.getAddresses()) != null) {
                multiAddressesItem = (MultiAddressesItem) C42745f0.E(addresses);
            }
            if (multiAddressesItem == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            String strValueOf = String.valueOf(12);
            String address = advertDetails.getAddress();
            Coordinates coords = multiAddressesItem.getCoords();
            String title = advertDetails.getTitle();
            int iA2 = jVar.a();
            RouteButtons routeButtons = advertDetails.getRouteButtons();
            MultiAddressesInfo multiAddressesInfo3 = advertDetails.getMultiAddressesInfo();
            if (multiAddressesInfo3 == null || (showOnMapTitle2 = multiAddressesInfo3.getShowMapButtonTitle()) == null) {
                showOnMapTitle2 = advertDetails.getShowOnMapTitle();
            }
            return new AdvertDetailsShowOnMapItem(strValueOf, title, coords, address, routeButtons, showOnMapTitle2, iA2, null, null, 384, null);
        }
        if (z13) {
            SellerAddressesInfo sellerAddressesInfo = advertDetails.getSellerAddressesInfo();
            if (sellerAddressesInfo == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AdvertDetailsItem advertDetailsItem2 = AdvertDetailsItem.f82525b;
            return new AdvertDetailsShowOnMapItem(String.valueOf(11), advertDetails.getTitle(), sellerAddressesInfo.getCoordsToShowOnMap(), advertDetails.getAddress(), advertDetails.getRouteButtons(), advertDetails.getShowOnMapTitle(), jVar.a(), null, null, 384, null);
        }
        if (!z14) {
            return null;
        }
        AdvertDetailsItem advertDetailsItem3 = AdvertDetailsItem.f82525b;
        String strValueOf2 = String.valueOf(11);
        String address2 = advertDetails.getAddress();
        Coordinates coordinates = advertDetails.getCoordinates();
        String title2 = advertDetails.getTitle();
        int iA3 = jVar.a();
        RouteButtons routeButtons2 = advertDetails.getRouteButtons();
        MultiAddressesInfo multiAddressesInfo4 = advertDetails.getMultiAddressesInfo();
        if (multiAddressesInfo4 == null || (showOnMapTitle = multiAddressesInfo4.getShowMapButtonTitle()) == null) {
            showOnMapTitle = advertDetails.getShowOnMapTitle();
        }
        return new AdvertDetailsShowOnMapItem(strValueOf2, title2, coordinates, address2, routeButtons2, showOnMapTitle, iA3, null, null, 384, null);
    }
}
