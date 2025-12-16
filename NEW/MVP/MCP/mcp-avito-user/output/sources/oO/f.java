package oO;

import Y61.l;
import android.content.Intent;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.util.Kundle;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: ItemMapIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoO/f;", "", "_avito_item-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface f {

    /* compiled from: ItemMapIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(f fVar, Coordinates coordinates, boolean z12, ContactBarData contactBarData, AdvertActions advertActions, String str, String str2, MultiAddressesInfo multiAddressesInfo, String str3, List list, SellerAddressesInfo sellerAddressesInfo, String str4, List list2, RouteButtons routeButtons, boolean z13, NavigationTabSetItem navigationTabSetItem, TreeClickStreamParent treeClickStreamParent, Kundle kundle, LocationMap locationMap, GeoZones geoZones, boolean z14, String str5, boolean z15, boolean z16, int i12) {
            Boolean bool = Boolean.TRUE;
            Coordinates coordinates2 = (i12 & 1) != 0 ? null : coordinates;
            boolean z17 = (i12 & 2) != 0 ? true : z12;
            ContactBarData contactBarData2 = (i12 & 8) != 0 ? null : contactBarData;
            AdvertActions advertActions2 = (i12 & 16) != 0 ? null : advertActions;
            String str6 = (i12 & 32) != 0 ? null : str;
            String str7 = (i12 & 64) != 0 ? null : str2;
            MultiAddressesInfo multiAddressesInfo2 = (i12 & 128) != 0 ? null : multiAddressesInfo;
            List list3 = (i12 & 512) != 0 ? null : list;
            SellerAddressesInfo sellerAddressesInfo2 = (i12 & 1024) != 0 ? null : sellerAddressesInfo;
            String str8 = (i12 & 2048) != 0 ? null : str4;
            List list4 = (i12 & 4096) != 0 ? null : list2;
            RouteButtons routeButtons2 = (i12 & 8192) != 0 ? null : routeButtons;
            boolean z18 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z13;
            NavigationTabSetItem navigationTabSetItem2 = (32768 & i12) != 0 ? null : navigationTabSetItem;
            boolean z19 = (65536 & i12) == 0;
            String str9 = (131072 & i12) != 0 ? null : "seller_item_map";
            TreeClickStreamParent treeClickStreamParent2 = (262144 & i12) != 0 ? null : treeClickStreamParent;
            Kundle kundle2 = (524288 & i12) != 0 ? null : kundle;
            LocationMap locationMap2 = (1048576 & i12) != 0 ? null : locationMap;
            GeoZones geoZones2 = (2097152 & i12) != 0 ? null : geoZones;
            boolean z22 = (4194304 & i12) != 0 ? false : z14;
            String str10 = (8388608 & i12) != 0 ? null : str5;
            if ((16777216 & i12) != 0) {
                bool = Boolean.FALSE;
            }
            return fVar.a(coordinates2, z17, true, contactBarData2, advertActions2, str6, str7, multiAddressesInfo2, str3, list3, sellerAddressesInfo2, str8, list4, routeButtons2, z18, navigationTabSetItem2, z19, str9, treeClickStreamParent2, kundle2, locationMap2, geoZones2, z22, str10, bool, (33554432 & i12) != 0 ? false : z15, (i12 & 67108864) != 0 ? false : z16);
        }
    }

    @Y61.k
    Intent a(@l Coordinates coordinates, boolean z12, boolean z13, @l ContactBarData contactBarData, @l AdvertActions advertActions, @l String str, @l String str2, @l MultiAddressesInfo multiAddressesInfo, @l String str3, @l List<GeoReference> list, @l SellerAddressesInfo sellerAddressesInfo, @l String str4, @l List<AmenityButton> list2, @l RouteButtons routeButtons, boolean z14, @l NavigationTabSetItem navigationTabSetItem, boolean z15, @l String str5, @l TreeClickStreamParent treeClickStreamParent, @l Kundle kundle, @l LocationMap locationMap, @l GeoZones geoZones, boolean z16, @l String str6, @l Boolean bool, boolean z17, boolean z18);
}
