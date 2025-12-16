package com.avito.android.advert_details_items.geo_zones;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGeoZonesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/geo_zones/AdvertDetailsGeoZonesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGeoZonesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsGeoZonesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84790c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84791d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f84792e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f84793f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f84794g;

    /* compiled from: AdvertDetailsGeoZonesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGeoZonesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoZonesItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsGeoZonesItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoZonesItem[] newArray(int i12) {
            return new AdvertDetailsGeoZonesItem[i12];
        }
    }

    public AdvertDetailsGeoZonesItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k String str2) {
        this.f84789b = j12;
        this.f84790c = str;
        this.f84791d = i12;
        this.f84792e = serpDisplayType;
        this.f84793f = serpViewType;
        this.f84794g = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new AdvertDetailsGeoZonesItem(i12, this.f84789b, this.f84792e, this.f84793f, this.f84790c, this.f84794g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84792e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGeoZonesItem)) {
            return false;
        }
        AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem = (AdvertDetailsGeoZonesItem) obj;
        return this.f84789b == advertDetailsGeoZonesItem.f84789b && L.f(this.f84790c, advertDetailsGeoZonesItem.f84790c) && this.f84791d == advertDetailsGeoZonesItem.f84791d && this.f84792e == advertDetailsGeoZonesItem.f84792e && this.f84793f == advertDetailsGeoZonesItem.f84793f && L.f(this.f84794g, advertDetailsGeoZonesItem.f84794g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85702c() {
        return this.f84789b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85704e() {
        return this.f84791d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85703d() {
        return this.f84790c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85706g() {
        return this.f84793f;
    }

    public final int hashCode() {
        return this.f84794g.hashCode() + com.avito.android.actions_sheet.a.j(this.f84793f, com.avito.android.actions_sheet.a.h(this.f84792e, r.e(this.f84791d, H.d(Long.hashCode(this.f84789b) * 31, 31, this.f84790c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGeoZonesItem(id=");
        sb2.append(this.f84789b);
        sb2.append(", stringId=");
        sb2.append(this.f84790c);
        sb2.append(", spanCount=");
        sb2.append(this.f84791d);
        sb2.append(", displayType=");
        sb2.append(this.f84792e);
        sb2.append(", viewType=");
        sb2.append(this.f84793f);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f84794g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84789b);
        parcel.writeString(this.f84790c);
        parcel.writeInt(this.f84791d);
        parcel.writeString(this.f84792e.name());
        parcel.writeString(this.f84793f.name());
        parcel.writeString(this.f84794g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGeoZonesItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 179;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2);
    }
}
