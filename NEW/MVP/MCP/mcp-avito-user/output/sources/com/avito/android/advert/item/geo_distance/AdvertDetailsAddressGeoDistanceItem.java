package com.avito.android.advert.item.geo_distance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.geo_distance.AdvertDetailsGeoDistance;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAddressGeoDistanceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/AdvertDetailsAddressGeoDistanceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAddressGeoDistanceItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAddressGeoDistanceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f75665c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsGeoDistance f75666d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Coordinates f75667e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f75668f;

    /* renamed from: g, reason: collision with root package name */
    public final int f75669g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75670h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75671i;

    /* compiled from: AdvertDetailsAddressGeoDistanceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAddressGeoDistanceItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAddressGeoDistanceItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAddressGeoDistanceItem(parcel.readLong(), parcel.readString(), (AdvertDetailsGeoDistance) parcel.readParcelable(AdvertDetailsAddressGeoDistanceItem.class.getClassLoader()), (Coordinates) parcel.readParcelable(AdvertDetailsAddressGeoDistanceItem.class.getClassLoader()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAddressGeoDistanceItem[] newArray(int i12) {
            return new AdvertDetailsAddressGeoDistanceItem[i12];
        }
    }

    public AdvertDetailsAddressGeoDistanceItem(long j12, @Y61.k String str, @Y61.k AdvertDetailsGeoDistance advertDetailsGeoDistance, @Y61.l Coordinates coordinates, @Y61.l String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f75664b = j12;
        this.f75665c = str;
        this.f75666d = advertDetailsGeoDistance;
        this.f75667e = coordinates;
        this.f75668f = str2;
        this.f75669g = i12;
        this.f75670h = serpDisplayType;
        this.f75671i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAddressGeoDistanceItem(this.f75664b, this.f75665c, this.f75666d, this.f75667e, this.f75668f, i12, this.f75670h, this.f75671i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75670h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAddressGeoDistanceItem)) {
            return false;
        }
        AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = (AdvertDetailsAddressGeoDistanceItem) obj;
        return this.f75664b == advertDetailsAddressGeoDistanceItem.f75664b && L.f(this.f75665c, advertDetailsAddressGeoDistanceItem.f75665c) && L.f(this.f75666d, advertDetailsAddressGeoDistanceItem.f75666d) && L.f(this.f75667e, advertDetailsAddressGeoDistanceItem.f75667e) && L.f(this.f75668f, advertDetailsAddressGeoDistanceItem.f75668f) && this.f75669g == advertDetailsAddressGeoDistanceItem.f75669g && this.f75670h == advertDetailsAddressGeoDistanceItem.f75670h && this.f75671i == advertDetailsAddressGeoDistanceItem.f75671i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f75664b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f75669g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302126x() {
        return this.f75665c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f75671i;
    }

    public final int hashCode() {
        int iHashCode = (this.f75666d.hashCode() + H.d(Long.hashCode(this.f75664b) * 31, 31, this.f75665c)) * 31;
        Coordinates coordinates = this.f75667e;
        int iHashCode2 = (iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        String str = this.f75668f;
        return this.f75671i.hashCode() + com.avito.android.actions_sheet.a.h(this.f75670h, r.e(this.f75669g, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAddressGeoDistanceItem(id=");
        sb2.append(this.f75664b);
        sb2.append(", stringId=");
        sb2.append(this.f75665c);
        sb2.append(", geoDistance=");
        sb2.append(this.f75666d);
        sb2.append(", itemCoords=");
        sb2.append(this.f75667e);
        sb2.append(", categoryId=");
        sb2.append(this.f75668f);
        sb2.append(", spanCount=");
        sb2.append(this.f75669g);
        sb2.append(", displayType=");
        sb2.append(this.f75670h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75671i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f75664b);
        parcel.writeString(this.f75665c);
        parcel.writeParcelable(this.f75666d, i12);
        parcel.writeParcelable(this.f75667e, i12);
        parcel.writeString(this.f75668f);
        parcel.writeInt(this.f75669g);
        parcel.writeString(this.f75670h.name());
        parcel.writeString(this.f75671i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAddressGeoDistanceItem(long j12, String str, AdvertDetailsGeoDistance advertDetailsGeoDistance, Coordinates coordinates, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 191;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertDetailsGeoDistance, coordinates, str2, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
