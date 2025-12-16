package com.avito.android.advert_core.map;

import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertMapPreviewRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/map/j;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface j {

    /* compiled from: AdvertMapPreviewRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void p(@Y61.l String str, @Y61.k String str2, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str3, @Y61.l List list, @Y61.l SellerAddressesInfo sellerAddressesInfo, @Y61.l RouteButtons routeButtons, @Y61.l List list2, boolean z12, @Y61.l ContactBarData contactBarData, @Y61.l AdvertActions advertActions, @Y61.l String str4, @Y61.l LocationMap locationMap, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l GeoZones geoZones, boolean z13, boolean z14);
}
