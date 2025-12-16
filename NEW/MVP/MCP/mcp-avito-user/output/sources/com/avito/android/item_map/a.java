package com.avito.android.item_map;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.C34160q2;
import com.avito.android.L;
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
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import oO.f;

/* compiled from: ItemMapIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/a;", "LoO/f;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f173269a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C34160q2 f173270b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final L f173271c;

    @Inject
    public a(@k Context context, @k C34160q2 c34160q2, @k L l12) {
        this.f173269a = context;
        this.f173270b = c34160q2;
        this.f173271c = l12;
    }

    @Override // oO.f
    @k
    public final Intent a(@l Coordinates coordinates, boolean z12, boolean z13, @l ContactBarData contactBarData, @l AdvertActions advertActions, @l String str, @l String str2, @l MultiAddressesInfo multiAddressesInfo, @l String str3, @l List<GeoReference> list, @l SellerAddressesInfo sellerAddressesInfo, @l String str4, @l List<AmenityButton> list2, @l RouteButtons routeButtons, boolean z14, @l NavigationTabSetItem navigationTabSetItem, boolean z15, @l String str5, @l TreeClickStreamParent treeClickStreamParent, @l Kundle kundle, @l LocationMap locationMap, @l GeoZones geoZones, boolean z16, @l String str6, @l Boolean bool, boolean z17, boolean z18) {
        ItemMapArguments itemMapArguments = new ItemMapArguments(coordinates, z12, null, z13, contactBarData, advertActions, str, str2, multiAddressesInfo, str3, list, sellerAddressesInfo, str4, list2, z14, routeButtons, z15, str5, treeClickStreamParent, kundle, locationMap, geoZones, z16, str6, bool, z17, z18, 4, null);
        C34160q2 c34160q2 = this.f173270b;
        c34160q2.getClass();
        n<Object> nVar = C34160q2.f246158g[1];
        if (!((Boolean) c34160q2.f246160c.a().invoke()).booleanValue() || navigationTabSetItem == null) {
            ItemMapActivity.f173203m.getClass();
            return new Intent(this.f173269a, (Class<?>) ItemMapActivity.class).putExtra("item_map_state", itemMapArguments);
        }
        return this.f173271c.d(new ItemMapFragmentData(itemMapArguments, navigationTabSetItem));
    }
}
