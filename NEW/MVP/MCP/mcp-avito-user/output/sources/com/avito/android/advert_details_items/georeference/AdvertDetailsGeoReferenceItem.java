package com.avito.android.advert_details_items.georeference;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGeoReferenceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/georeference/AdvertDetailsGeoReferenceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGeoReferenceItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsGeoReferenceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84802c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f84803d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f84804e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f84805f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<String> f84806g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f84807h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final MultiAddressesInfo f84808i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Coordinates f84809j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f84810k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final RouteButtons f84811l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f84812m;

    /* renamed from: n, reason: collision with root package name */
    public final int f84813n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final SerpViewType f84814o;

    /* compiled from: AdvertDetailsGeoReferenceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGeoReferenceItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoReferenceItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsGeoReferenceItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (MultiAddressesInfo) parcel.readParcelable(AdvertDetailsGeoReferenceItem.class.getClassLoader()), (Coordinates) parcel.readParcelable(AdvertDetailsGeoReferenceItem.class.getClassLoader()), parcel.readString(), (RouteButtons) parcel.readParcelable(AdvertDetailsGeoReferenceItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoReferenceItem[] newArray(int i12) {
            return new AdvertDetailsGeoReferenceItem[i12];
        }
    }

    public AdvertDetailsGeoReferenceItem(long j12, @k String str, @l String str2, @l String str3, @l String str4, @l List<String> list, @k String str5, @l MultiAddressesInfo multiAddressesInfo, @l Coordinates coordinates, @k String str6, @l RouteButtons routeButtons, boolean z12, int i12) {
        this.f84801b = j12;
        this.f84802c = str;
        this.f84803d = str2;
        this.f84804e = str3;
        this.f84805f = str4;
        this.f84806g = list;
        this.f84807h = str5;
        this.f84808i = multiAddressesInfo;
        this.f84809j = coordinates;
        this.f84810k = str6;
        this.f84811l = routeButtons;
        this.f84812m = z12;
        this.f84813n = i12;
        SerpDisplayType.Companion companion = SerpDisplayType.INSTANCE;
        this.f84814o = SerpViewType.f268585e;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsGeoReferenceItem(this.f84801b, this.f84802c, this.f84803d, this.f84804e, this.f84805f, this.f84806g, this.f84807h, this.f84808i, this.f84809j, this.f84810k, this.f84811l, this.f84812m, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGeoReferenceItem)) {
            return false;
        }
        AdvertDetailsGeoReferenceItem advertDetailsGeoReferenceItem = (AdvertDetailsGeoReferenceItem) obj;
        return this.f84801b == advertDetailsGeoReferenceItem.f84801b && L.f(this.f84802c, advertDetailsGeoReferenceItem.f84802c) && L.f(this.f84803d, advertDetailsGeoReferenceItem.f84803d) && L.f(this.f84804e, advertDetailsGeoReferenceItem.f84804e) && L.f(this.f84805f, advertDetailsGeoReferenceItem.f84805f) && L.f(this.f84806g, advertDetailsGeoReferenceItem.f84806g) && L.f(this.f84807h, advertDetailsGeoReferenceItem.f84807h) && L.f(this.f84808i, advertDetailsGeoReferenceItem.f84808i) && L.f(this.f84809j, advertDetailsGeoReferenceItem.f84809j) && L.f(this.f84810k, advertDetailsGeoReferenceItem.f84810k) && L.f(this.f84811l, advertDetailsGeoReferenceItem.f84811l) && this.f84812m == advertDetailsGeoReferenceItem.f84812m && this.f84813n == advertDetailsGeoReferenceItem.f84813n;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF82942i() {
        return this.f84801b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF82943j() {
        return this.f84813n;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82941h() {
        return this.f84802c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF82945l() {
        return this.f84814o;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f84801b) * 31, 31, this.f84802c);
        String str = this.f84803d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84804e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84805f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f84806g;
        int iD3 = H.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f84807h);
        MultiAddressesInfo multiAddressesInfo = this.f84808i;
        int iHashCode4 = (iD3 + (multiAddressesInfo == null ? 0 : multiAddressesInfo.hashCode())) * 31;
        Coordinates coordinates = this.f84809j;
        int iD4 = H.d((iHashCode4 + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.f84810k);
        RouteButtons routeButtons = this.f84811l;
        return Integer.hashCode(this.f84813n) + r.i((iD4 + (routeButtons != null ? routeButtons.hashCode() : 0)) * 31, 31, this.f84812m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGeoReferenceItem(id=");
        sb2.append(this.f84801b);
        sb2.append(", stringId=");
        sb2.append(this.f84802c);
        sb2.append(", content=");
        sb2.append(this.f84803d);
        sb2.append(", after=");
        sb2.append(this.f84804e);
        sb2.append(", afterIconName=");
        sb2.append(this.f84805f);
        sb2.append(", colors=");
        sb2.append(this.f84806g);
        sb2.append(", address=");
        sb2.append(this.f84807h);
        sb2.append(", addresses=");
        sb2.append(this.f84808i);
        sb2.append(", coordinates=");
        sb2.append(this.f84809j);
        sb2.append(", advertTitle=");
        sb2.append(this.f84810k);
        sb2.append(", routeButtons=");
        sb2.append(this.f84811l);
        sb2.append(", isRestyle=");
        sb2.append(this.f84812m);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f84813n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84801b);
        parcel.writeString(this.f84802c);
        parcel.writeString(this.f84803d);
        parcel.writeString(this.f84804e);
        parcel.writeString(this.f84805f);
        parcel.writeStringList(this.f84806g);
        parcel.writeString(this.f84807h);
        parcel.writeParcelable(this.f84808i, i12);
        parcel.writeParcelable(this.f84809j, i12);
        parcel.writeString(this.f84810k);
        parcel.writeParcelable(this.f84811l, i12);
        parcel.writeInt(this.f84812m ? 1 : 0);
        parcel.writeInt(this.f84813n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGeoReferenceItem(long j12, String str, String str2, String str3, String str4, List list, String str5, MultiAddressesInfo multiAddressesInfo, Coordinates coordinates, String str6, RouteButtons routeButtons, boolean z12, int i12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 58;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, str4, list, str5, multiAddressesInfo, coordinates, str6, (i13 & 1024) != 0 ? null : routeButtons, (i13 & 2048) != 0 ? false : z12, i12);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
    }
}
