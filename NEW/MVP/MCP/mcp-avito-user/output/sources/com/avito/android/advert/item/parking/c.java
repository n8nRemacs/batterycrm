package com.avito.android.advert.item.parking;

import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import kotlin.Metadata;

/* compiled from: AdvertDetailsParkingAddressPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/parking/c;", "LTV0/d;", "Lcom/avito/android/advert/item/parking/g;", "Lcom/avito/android/advert/item/parking/AdvertDetailsParkingAddressItem;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c extends TV0.d<g, AdvertDetailsParkingAddressItem> {

    /* compiled from: AdvertDetailsParkingAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/parking/c$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void L0(@Y61.k String str, @l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str2, @l RouteButtons routeButtons);

        void a(@Y61.k String str, boolean z12);

        void q0(@Y61.k ParkingAddressShowOnMapParams parkingAddressShowOnMapParams);
    }
}
