package com.avito.android.advert_details_items.address;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsAddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/address/AdvertDetailsAddressItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAddressItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84423b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84424c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f84425d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Coordinates f84426e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f84427f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84428g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84429h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final RouteButtons f84430i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84431j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f84432k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final MultiAddressesInfo f84433l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final SellerAddressesInfo f84434m;

    /* renamed from: n, reason: collision with root package name */
    public final int f84435n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public SerpDisplayType f84436o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SerpViewType f84437p;

    /* compiled from: AdvertDetailsAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAddressItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAddressItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAddressItem(parcel.readLong(), parcel.readString(), parcel.readString(), (Coordinates) parcel.readParcelable(AdvertDetailsAddressItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (RouteButtons) parcel.readParcelable(AdvertDetailsAddressItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MultiAddressesInfo) parcel.readParcelable(AdvertDetailsAddressItem.class.getClassLoader()), (SellerAddressesInfo) parcel.readParcelable(AdvertDetailsAddressItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAddressItem[] newArray(int i12) {
            return new AdvertDetailsAddressItem[i12];
        }
    }

    public AdvertDetailsAddressItem(long j12, @k String str, @k String str2, @l Coordinates coordinates, @k String str3, boolean z12, boolean z13, @l RouteButtons routeButtons, boolean z14, @l Integer num, @l MultiAddressesInfo multiAddressesInfo, @l SellerAddressesInfo sellerAddressesInfo, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f84423b = j12;
        this.f84424c = str;
        this.f84425d = str2;
        this.f84426e = coordinates;
        this.f84427f = str3;
        this.f84428g = z12;
        this.f84429h = z13;
        this.f84430i = routeButtons;
        this.f84431j = z14;
        this.f84432k = num;
        this.f84433l = multiAddressesInfo;
        this.f84434m = sellerAddressesInfo;
        this.f84435n = i12;
        this.f84436o = serpDisplayType;
        this.f84437p = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f84436o;
        return new AdvertDetailsAddressItem(this.f84423b, this.f84424c, this.f84425d, this.f84426e, this.f84427f, this.f84428g, this.f84429h, this.f84430i, this.f84431j, this.f84432k, this.f84433l, this.f84434m, i12, serpDisplayType, this.f84437p);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84436o = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAddressItem)) {
            return false;
        }
        AdvertDetailsAddressItem advertDetailsAddressItem = (AdvertDetailsAddressItem) obj;
        return this.f84423b == advertDetailsAddressItem.f84423b && L.f(this.f84424c, advertDetailsAddressItem.f84424c) && L.f(this.f84425d, advertDetailsAddressItem.f84425d) && L.f(this.f84426e, advertDetailsAddressItem.f84426e) && L.f(this.f84427f, advertDetailsAddressItem.f84427f) && this.f84428g == advertDetailsAddressItem.f84428g && this.f84429h == advertDetailsAddressItem.f84429h && L.f(this.f84430i, advertDetailsAddressItem.f84430i) && this.f84431j == advertDetailsAddressItem.f84431j && L.f(this.f84432k, advertDetailsAddressItem.f84432k) && L.f(this.f84433l, advertDetailsAddressItem.f84433l) && L.f(this.f84434m, advertDetailsAddressItem.f84434m) && this.f84435n == advertDetailsAddressItem.f84435n && this.f84436o == advertDetailsAddressItem.f84436o && this.f84437p == advertDetailsAddressItem.f84437p;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77948b() {
        return this.f84423b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77950d() {
        return this.f84435n;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77949c() {
        return this.f84424c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77952f() {
        return this.f84437p;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f84423b) * 31, 31, this.f84424c), 31, this.f84425d);
        Coordinates coordinates = this.f84426e;
        int i12 = r.i(r.i(H.d((iD2 + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.f84427f), 31, this.f84428g), 31, this.f84429h);
        RouteButtons routeButtons = this.f84430i;
        int i13 = r.i((i12 + (routeButtons == null ? 0 : routeButtons.hashCode())) * 31, 31, this.f84431j);
        Integer num = this.f84432k;
        int iHashCode = (i13 + (num == null ? 0 : num.hashCode())) * 31;
        MultiAddressesInfo multiAddressesInfo = this.f84433l;
        int iHashCode2 = (iHashCode + (multiAddressesInfo == null ? 0 : multiAddressesInfo.hashCode())) * 31;
        SellerAddressesInfo sellerAddressesInfo = this.f84434m;
        return this.f84437p.hashCode() + com.avito.android.actions_sheet.a.h(this.f84436o, r.e(this.f84435n, (iHashCode2 + (sellerAddressesInfo != null ? sellerAddressesInfo.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAddressItem(id=");
        sb2.append(this.f84423b);
        sb2.append(", stringId=");
        sb2.append(this.f84424c);
        sb2.append(", address=");
        sb2.append(this.f84425d);
        sb2.append(", coordinates=");
        sb2.append(this.f84426e);
        sb2.append(", advertTitle=");
        sb2.append(this.f84427f);
        sb2.append(", hasReducedPadding=");
        sb2.append(this.f84428g);
        sb2.append(", hideArrow=");
        sb2.append(this.f84429h);
        sb2.append(", routeButtons=");
        sb2.append(this.f84430i);
        sb2.append(", disableAddressClick=");
        sb2.append(this.f84431j);
        sb2.append(", maxLines=");
        sb2.append(this.f84432k);
        sb2.append(", multiAddresses=");
        sb2.append(this.f84433l);
        sb2.append(", sellerAddressesInfo=");
        sb2.append(this.f84434m);
        sb2.append(", spanCount=");
        sb2.append(this.f84435n);
        sb2.append(", displayType=");
        sb2.append(this.f84436o);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84437p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84423b);
        parcel.writeString(this.f84424c);
        parcel.writeString(this.f84425d);
        parcel.writeParcelable(this.f84426e, i12);
        parcel.writeString(this.f84427f);
        parcel.writeInt(this.f84428g ? 1 : 0);
        parcel.writeInt(this.f84429h ? 1 : 0);
        parcel.writeParcelable(this.f84430i, i12);
        parcel.writeInt(this.f84431j ? 1 : 0);
        Integer num = this.f84432k;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f84433l, i12);
        parcel.writeParcelable(this.f84434m, i12);
        parcel.writeInt(this.f84435n);
        parcel.writeString(this.f84436o.name());
        parcel.writeString(this.f84437p.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAddressItem(long j12, String str, String str2, Coordinates coordinates, String str3, boolean z12, boolean z13, RouteButtons routeButtons, boolean z14, Integer num, MultiAddressesInfo multiAddressesInfo, SellerAddressesInfo sellerAddressesInfo, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 9;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, coordinates, str3, (i13 & 32) != 0 ? false : z12, z13, (i13 & 128) != 0 ? null : routeButtons, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : num, multiAddressesInfo, sellerAddressesInfo, i12, (i13 & 8192) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
