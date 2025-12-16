package com.avito.android.advert_details_items.address;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAddressView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/address/f;", "LTV0/e;", "b", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: AdvertDetailsAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AdvertDetailsAddressView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/address/f$b;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: AdvertDetailsAddressView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void a(@k String str, boolean z12);

        void j0(@k String str, @k Coordinates coordinates, @k String str2, @l RouteButtons routeButtons);
    }

    void Pj(@k String str, @l String str2, @l Coordinates coordinates, @k String str3, boolean z12, @k b bVar, boolean z13, @l RouteButtons routeButtons, int i12);

    void d40(@k String str, @l Coordinates coordinates, @k String str2, boolean z12, boolean z13, @k b bVar, boolean z14, @l RouteButtons routeButtons, @l Integer num, @l MultiAddressesInfo multiAddressesInfo);
}
