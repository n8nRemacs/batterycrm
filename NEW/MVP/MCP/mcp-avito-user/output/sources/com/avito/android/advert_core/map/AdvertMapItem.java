package com.avito.android.advert_core.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.developments_catalog.MapPreview;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertMapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/map/AdvertMapItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertMapItem implements ParcelableItem, BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertMapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f83718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f83719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f83720d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f83721e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f83722f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SellerAddressesInfo f83723g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Coordinates f83724h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f83725i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<AmenityButton> f83726j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final MapPreview f83727k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final ContactBarData f83728l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f83729m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f83730n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f83731o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f83732p;

    /* renamed from: q, reason: collision with root package name */
    public final long f83733q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final String f83734r;

    /* renamed from: s, reason: collision with root package name */
    public final int f83735s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83736t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83737u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f83738v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final Boolean f83739w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final GeoZones f83740x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f83741y;

    /* compiled from: AdvertMapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertMapItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertMapItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertMapItem.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            SellerAddressesInfo sellerAddressesInfo = (SellerAddressesInfo) parcel.readParcelable(AdvertMapItem.class.getClassLoader());
            Coordinates coordinates = (Coordinates) parcel.readParcelable(AdvertMapItem.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertMapItem.class, parcel, arrayList2, iL3, 1);
                }
            }
            MapPreview mapPreview = (MapPreview) parcel.readParcelable(AdvertMapItem.class.getClassLoader());
            ContactBarData contactBarData = (ContactBarData) parcel.readParcelable(AdvertMapItem.class.getClassLoader());
            AdvertActions advertActions = (AdvertActions) parcel.readParcelable(AdvertMapItem.class.getClassLoader());
            String string6 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            long j12 = parcel.readLong();
            String string7 = parcel.readString();
            int i14 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertMapItem(string, string2, string3, string4, arrayList, sellerAddressesInfo, coordinates, string5, arrayList2, mapPreview, contactBarData, advertActions, string6, z12, z13, j12, string7, i14, serpDisplayTypeValueOf, serpViewTypeValueOf, z14, boolValueOf, (GeoZones) parcel.readParcelable(AdvertMapItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertMapItem[] newArray(int i12) {
            return new AdvertMapItem[i12];
        }
    }

    public AdvertMapItem(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4, @Y61.l List<GeoReference> list, @Y61.l SellerAddressesInfo sellerAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str5, @Y61.l List<AmenityButton> list2, @Y61.l MapPreview mapPreview, @Y61.l ContactBarData contactBarData, @Y61.l AdvertActions advertActions, @Y61.l String str6, boolean z12, boolean z13, long j12, @Y61.k String str7, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, boolean z14, @Y61.l Boolean bool, @Y61.l GeoZones geoZones, boolean z15) {
        this.f83718b = str;
        this.f83719c = str2;
        this.f83720d = str3;
        this.f83721e = str4;
        this.f83722f = list;
        this.f83723g = sellerAddressesInfo;
        this.f83724h = coordinates;
        this.f83725i = str5;
        this.f83726j = list2;
        this.f83727k = mapPreview;
        this.f83728l = contactBarData;
        this.f83729m = advertActions;
        this.f83730n = str6;
        this.f83731o = z12;
        this.f83732p = z13;
        this.f83733q = j12;
        this.f83734r = str7;
        this.f83735s = i12;
        this.f83736t = serpDisplayType;
        this.f83737u = serpViewType;
        this.f83738v = z14;
        this.f83739w = bool;
        this.f83740x = geoZones;
        this.f83741y = z15;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertMapItem(this.f83718b, this.f83719c, this.f83720d, this.f83721e, this.f83722f, this.f83723g, this.f83724h, this.f83725i, this.f83726j, this.f83727k, this.f83728l, this.f83729m, this.f83730n, this.f83731o, this.f83732p, this.f83733q, this.f83734r, i12, this.f83736t, this.f83737u, this.f83738v, this.f83739w, this.f83740x, this.f83741y);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83736t = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83733q() {
        return this.f83733q;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83735s() {
        return this.f83735s;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83734r() {
        return this.f83734r;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83737u() {
        return this.f83737u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f83718b);
        parcel.writeString(this.f83719c);
        parcel.writeString(this.f83720d);
        parcel.writeString(this.f83721e);
        List<GeoReference> list = this.f83722f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f83723g, i12);
        parcel.writeParcelable(this.f83724h, i12);
        parcel.writeString(this.f83725i);
        List<AmenityButton> list2 = this.f83726j;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f83727k, i12);
        parcel.writeParcelable(this.f83728l, i12);
        parcel.writeParcelable(this.f83729m, i12);
        parcel.writeString(this.f83730n);
        parcel.writeInt(this.f83731o ? 1 : 0);
        parcel.writeInt(this.f83732p ? 1 : 0);
        parcel.writeLong(this.f83733q);
        parcel.writeString(this.f83734r);
        parcel.writeInt(this.f83735s);
        parcel.writeString(this.f83736t.name());
        parcel.writeString(this.f83737u.name());
        parcel.writeInt(this.f83738v ? 1 : 0);
        Boolean bool = this.f83739w;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f83740x, i12);
        parcel.writeInt(this.f83741y ? 1 : 0);
    }

    public /* synthetic */ AdvertMapItem(String str, String str2, String str3, String str4, List list, SellerAddressesInfo sellerAddressesInfo, Coordinates coordinates, String str5, List list2, MapPreview mapPreview, ContactBarData contactBarData, AdvertActions advertActions, String str6, boolean z12, boolean z13, long j12, String str7, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, boolean z14, Boolean bool, GeoZones geoZones, boolean z15, int i13, C42822w c42822w) {
        this(str, str2, str3, str4, list, sellerAddressesInfo, coordinates, str5, list2, mapPreview, contactBarData, advertActions, str6, z12, z13, j12, str7, (i13 & 131072) != 0 ? 1 : i12, (i13 & 262144) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 524288) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 1048576) != 0 ? false : z14, bool, geoZones, (i13 & 8388608) != 0 ? false : z15);
    }
}
