package com.avito.android.item_map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: ItemMapArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/ItemMapArguments;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemMapArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemMapArguments> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f173204A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f173205B;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Coordinates f173206b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f173207c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Coordinates f173208d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f173209e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ContactBarData f173210f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertActions f173211g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f173212h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f173213i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final MultiAddressesInfo f173214j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f173215k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final List<GeoReference> f173216l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final SellerAddressesInfo f173217m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f173218n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final List<AmenityButton> f173219o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f173220p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final RouteButtons f173221q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f173222r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final String f173223s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f173224t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final Kundle f173225u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final LocationMap f173226v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final GeoZones f173227w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f173228x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final String f173229y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final Boolean f173230z;

    /* compiled from: ItemMapArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemMapArguments> {
        @Override // android.os.Parcelable.Creator
        public final ItemMapArguments createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SellerAddressesInfo sellerAddressesInfo;
            ArrayList arrayList2;
            Boolean boolValueOf;
            Coordinates coordinates = (Coordinates) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            Coordinates coordinates2 = (Coordinates) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            ContactBarData contactBarData = (ContactBarData) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            AdvertActions advertActions = (AdvertActions) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            MultiAddressesInfo multiAddressesInfo = (MultiAddressesInfo) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ItemMapArguments.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            SellerAddressesInfo sellerAddressesInfo2 = (SellerAddressesInfo) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                sellerAddressesInfo = sellerAddressesInfo2;
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                sellerAddressesInfo = sellerAddressesInfo2;
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(ItemMapArguments.class, parcel, arrayList4, iL3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList4;
            }
            boolean z14 = parcel.readInt() != 0;
            RouteButtons routeButtons = (RouteButtons) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            boolean z15 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            Kundle kundle = (Kundle) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            LocationMap locationMap = (LocationMap) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            GeoZones geoZones = (GeoZones) parcel.readParcelable(ItemMapArguments.class.getClassLoader());
            boolean z16 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ItemMapArguments(coordinates, z12, coordinates2, z13, contactBarData, advertActions, string, string2, multiAddressesInfo, string3, arrayList, sellerAddressesInfo, string4, arrayList2, z14, routeButtons, z15, string5, treeClickStreamParent, kundle, locationMap, geoZones, z16, string6, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemMapArguments[] newArray(int i12) {
            return new ItemMapArguments[i12];
        }
    }

    public ItemMapArguments(@l Coordinates coordinates, boolean z12, @l Coordinates coordinates2, boolean z13, @l ContactBarData contactBarData, @l AdvertActions advertActions, @l String str, @l String str2, @l MultiAddressesInfo multiAddressesInfo, @l String str3, @l List<GeoReference> list, @l SellerAddressesInfo sellerAddressesInfo, @l String str4, @l List<AmenityButton> list2, boolean z14, @l RouteButtons routeButtons, boolean z15, @l String str5, @l TreeClickStreamParent treeClickStreamParent, @l Kundle kundle, @l LocationMap locationMap, @l GeoZones geoZones, boolean z16, @l String str6, @l Boolean bool, boolean z17, boolean z18) {
        this.f173206b = coordinates;
        this.f173207c = z12;
        this.f173208d = coordinates2;
        this.f173209e = z13;
        this.f173210f = contactBarData;
        this.f173211g = advertActions;
        this.f173212h = str;
        this.f173213i = str2;
        this.f173214j = multiAddressesInfo;
        this.f173215k = str3;
        this.f173216l = list;
        this.f173217m = sellerAddressesInfo;
        this.f173218n = str4;
        this.f173219o = list2;
        this.f173220p = z14;
        this.f173221q = routeButtons;
        this.f173222r = z15;
        this.f173223s = str5;
        this.f173224t = treeClickStreamParent;
        this.f173225u = kundle;
        this.f173226v = locationMap;
        this.f173227w = geoZones;
        this.f173228x = z16;
        this.f173229y = str6;
        this.f173230z = bool;
        this.f173204A = z17;
        this.f173205B = z18;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMapArguments)) {
            return false;
        }
        ItemMapArguments itemMapArguments = (ItemMapArguments) obj;
        return L.f(this.f173206b, itemMapArguments.f173206b) && this.f173207c == itemMapArguments.f173207c && L.f(this.f173208d, itemMapArguments.f173208d) && this.f173209e == itemMapArguments.f173209e && L.f(this.f173210f, itemMapArguments.f173210f) && L.f(this.f173211g, itemMapArguments.f173211g) && L.f(this.f173212h, itemMapArguments.f173212h) && L.f(this.f173213i, itemMapArguments.f173213i) && L.f(this.f173214j, itemMapArguments.f173214j) && L.f(this.f173215k, itemMapArguments.f173215k) && L.f(this.f173216l, itemMapArguments.f173216l) && L.f(this.f173217m, itemMapArguments.f173217m) && L.f(this.f173218n, itemMapArguments.f173218n) && L.f(this.f173219o, itemMapArguments.f173219o) && this.f173220p == itemMapArguments.f173220p && L.f(this.f173221q, itemMapArguments.f173221q) && this.f173222r == itemMapArguments.f173222r && L.f(this.f173223s, itemMapArguments.f173223s) && L.f(this.f173224t, itemMapArguments.f173224t) && L.f(this.f173225u, itemMapArguments.f173225u) && L.f(this.f173226v, itemMapArguments.f173226v) && L.f(this.f173227w, itemMapArguments.f173227w) && this.f173228x == itemMapArguments.f173228x && L.f(this.f173229y, itemMapArguments.f173229y) && L.f(this.f173230z, itemMapArguments.f173230z) && this.f173204A == itemMapArguments.f173204A && this.f173205B == itemMapArguments.f173205B;
    }

    public final int hashCode() {
        Coordinates coordinates = this.f173206b;
        int i12 = r.i((coordinates == null ? 0 : coordinates.hashCode()) * 31, 31, this.f173207c);
        Coordinates coordinates2 = this.f173208d;
        int i13 = r.i((i12 + (coordinates2 == null ? 0 : coordinates2.hashCode())) * 31, 31, this.f173209e);
        ContactBarData contactBarData = this.f173210f;
        int iHashCode = (i13 + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
        AdvertActions advertActions = this.f173211g;
        int iHashCode2 = (iHashCode + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
        String str = this.f173212h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f173213i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MultiAddressesInfo multiAddressesInfo = this.f173214j;
        int iHashCode5 = (iHashCode4 + (multiAddressesInfo == null ? 0 : multiAddressesInfo.hashCode())) * 31;
        String str3 = this.f173215k;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<GeoReference> list = this.f173216l;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        SellerAddressesInfo sellerAddressesInfo = this.f173217m;
        int iHashCode8 = (iHashCode7 + (sellerAddressesInfo == null ? 0 : sellerAddressesInfo.hashCode())) * 31;
        String str4 = this.f173218n;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<AmenityButton> list2 = this.f173219o;
        int i14 = r.i((iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f173220p);
        RouteButtons routeButtons = this.f173221q;
        int i15 = r.i((i14 + (routeButtons == null ? 0 : routeButtons.hashCode())) * 31, 31, this.f173222r);
        String str5 = this.f173223s;
        int iHashCode10 = (i15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f173224t;
        int iHashCode11 = (iHashCode10 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        Kundle kundle = this.f173225u;
        int iHashCode12 = (iHashCode11 + (kundle == null ? 0 : kundle.hashCode())) * 31;
        LocationMap locationMap = this.f173226v;
        int iHashCode13 = (iHashCode12 + (locationMap == null ? 0 : locationMap.hashCode())) * 31;
        GeoZones geoZones = this.f173227w;
        int i16 = r.i((iHashCode13 + (geoZones == null ? 0 : geoZones.hashCode())) * 31, 31, this.f173228x);
        String str6 = this.f173229y;
        int iHashCode14 = (i16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f173230z;
        return Boolean.hashCode(this.f173205B) + r.i((iHashCode14 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f173204A);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemMapArguments(itemCoordinates=");
        sb2.append(this.f173206b);
        sb2.append(", hasFindMeButton=");
        sb2.append(this.f173207c);
        sb2.append(", myCoordinates=");
        sb2.append(this.f173208d);
        sb2.append(", hasBottomSheet=");
        sb2.append(this.f173209e);
        sb2.append(", contactBarData=");
        sb2.append(this.f173210f);
        sb2.append(", advertActions=");
        sb2.append(this.f173211g);
        sb2.append(", searchContext=");
        sb2.append(this.f173212h);
        sb2.append(", address=");
        sb2.append(this.f173213i);
        sb2.append(", addresses=");
        sb2.append(this.f173214j);
        sb2.append(", title=");
        sb2.append(this.f173215k);
        sb2.append(", geoReference=");
        sb2.append(this.f173216l);
        sb2.append(", sellerAddressesInfo=");
        sb2.append(this.f173217m);
        sb2.append(", itemId=");
        sb2.append(this.f173218n);
        sb2.append(", amenityButtons=");
        sb2.append(this.f173219o);
        sb2.append(", showMeOnMap=");
        sb2.append(this.f173220p);
        sb2.append(", routeButtons=");
        sb2.append(this.f173221q);
        sb2.append(", shouldTrackMapMovement=");
        sb2.append(this.f173222r);
        sb2.append(", fromPage=");
        sb2.append(this.f173223s);
        sb2.append(", treeParent=");
        sb2.append(this.f173224t);
        sb2.append(", dealConfirmationState=");
        sb2.append(this.f173225u);
        sb2.append(", locationMapConfig=");
        sb2.append(this.f173226v);
        sb2.append(", geoZones=");
        sb2.append(this.f173227w);
        sb2.append(", shouldShowImportantAddresses=");
        sb2.append(this.f173228x);
        sb2.append(", microCategoryId=");
        sb2.append(this.f173229y);
        sb2.append(", showOpenInAnotherAppButton=");
        sb2.append(this.f173230z);
        sb2.append(", withDelivery=");
        sb2.append(this.f173204A);
        sb2.append(", copyAddressOnClick=");
        return r.x(sb2, this.f173205B, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f173206b, i12);
        parcel.writeInt(this.f173207c ? 1 : 0);
        parcel.writeParcelable(this.f173208d, i12);
        parcel.writeInt(this.f173209e ? 1 : 0);
        parcel.writeParcelable(this.f173210f, i12);
        parcel.writeParcelable(this.f173211g, i12);
        parcel.writeString(this.f173212h);
        parcel.writeString(this.f173213i);
        parcel.writeParcelable(this.f173214j, i12);
        parcel.writeString(this.f173215k);
        List<GeoReference> list = this.f173216l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f173217m, i12);
        parcel.writeString(this.f173218n);
        List<AmenityButton> list2 = this.f173219o;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeInt(this.f173220p ? 1 : 0);
        parcel.writeParcelable(this.f173221q, i12);
        parcel.writeInt(this.f173222r ? 1 : 0);
        parcel.writeString(this.f173223s);
        parcel.writeParcelable(this.f173224t, i12);
        parcel.writeParcelable(this.f173225u, i12);
        parcel.writeParcelable(this.f173226v, i12);
        parcel.writeParcelable(this.f173227w, i12);
        parcel.writeInt(this.f173228x ? 1 : 0);
        parcel.writeString(this.f173229y);
        Boolean bool = this.f173230z;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f173204A ? 1 : 0);
        parcel.writeInt(this.f173205B ? 1 : 0);
    }

    public /* synthetic */ ItemMapArguments(Coordinates coordinates, boolean z12, Coordinates coordinates2, boolean z13, ContactBarData contactBarData, AdvertActions advertActions, String str, String str2, MultiAddressesInfo multiAddressesInfo, String str3, List list, SellerAddressesInfo sellerAddressesInfo, String str4, List list2, boolean z14, RouteButtons routeButtons, boolean z15, String str5, TreeClickStreamParent treeClickStreamParent, Kundle kundle, LocationMap locationMap, GeoZones geoZones, boolean z16, String str6, Boolean bool, boolean z17, boolean z18, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : coordinates, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : coordinates2, (i12 & 8) != 0 ? true : z13, (i12 & 16) != 0 ? null : contactBarData, (i12 & 32) != 0 ? null : advertActions, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? null : multiAddressesInfo, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : list, (i12 & 2048) != 0 ? null : sellerAddressesInfo, (i12 & 4096) != 0 ? null : str4, (i12 & 8192) != 0 ? null : list2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z14, (32768 & i12) != 0 ? null : routeButtons, (65536 & i12) != 0 ? false : z15, (131072 & i12) != 0 ? null : str5, (262144 & i12) != 0 ? null : treeClickStreamParent, (524288 & i12) != 0 ? null : kundle, (1048576 & i12) != 0 ? null : locationMap, (2097152 & i12) != 0 ? null : geoZones, (4194304 & i12) != 0 ? false : z16, (8388608 & i12) != 0 ? null : str6, (16777216 & i12) != 0 ? Boolean.FALSE : bool, (i12 & 33554432) != 0 ? false : z17, z18);
    }
}
