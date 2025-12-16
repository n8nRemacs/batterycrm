package com.avito.android.advert_details_items.geo_market_report;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.GeoMarketReport;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGeoMarketReportItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/geo_market_report/AdvertDetailsGeoMarketReportItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGeoMarketReportItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsGeoMarketReportItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84766b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84768d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f84769e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f84770f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final GeoMarketReport f84771g;

    /* compiled from: AdvertDetailsGeoMarketReportItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGeoMarketReportItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoMarketReportItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsGeoMarketReportItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (GeoMarketReport) parcel.readParcelable(AdvertDetailsGeoMarketReportItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGeoMarketReportItem[] newArray(int i12) {
            return new AdvertDetailsGeoMarketReportItem[i12];
        }
    }

    public AdvertDetailsGeoMarketReportItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k GeoMarketReport geoMarketReport) {
        this.f84766b = j12;
        this.f84767c = str;
        this.f84768d = i12;
        this.f84769e = serpDisplayType;
        this.f84770f = serpViewType;
        this.f84771g = geoMarketReport;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsGeoMarketReportItem(this.f84766b, this.f84767c, i12, this.f84769e, this.f84770f, this.f84771g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84769e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGeoMarketReportItem)) {
            return false;
        }
        AdvertDetailsGeoMarketReportItem advertDetailsGeoMarketReportItem = (AdvertDetailsGeoMarketReportItem) obj;
        return this.f84766b == advertDetailsGeoMarketReportItem.f84766b && L.f(this.f84767c, advertDetailsGeoMarketReportItem.f84767c) && this.f84768d == advertDetailsGeoMarketReportItem.f84768d && this.f84769e == advertDetailsGeoMarketReportItem.f84769e && this.f84770f == advertDetailsGeoMarketReportItem.f84770f && L.f(this.f84771g, advertDetailsGeoMarketReportItem.f84771g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f84766b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75243e() {
        return this.f84768d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f84767c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75242d() {
        return this.f84770f;
    }

    public final int hashCode() {
        return this.f84771g.hashCode() + com.avito.android.actions_sheet.a.j(this.f84770f, com.avito.android.actions_sheet.a.h(this.f84769e, r.e(this.f84768d, H.d(Long.hashCode(this.f84766b) * 31, 31, this.f84767c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsGeoMarketReportItem(id=" + this.f84766b + ", stringId=" + this.f84767c + ", spanCount=" + this.f84768d + ", displayType=" + this.f84769e + ", viewType=" + this.f84770f + ", report=" + this.f84771g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84766b);
        parcel.writeString(this.f84767c);
        parcel.writeInt(this.f84768d);
        parcel.writeString(this.f84769e.name());
        parcel.writeString(this.f84770f.name());
        parcel.writeParcelable(this.f84771g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGeoMarketReportItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, GeoMarketReport geoMarketReport, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 54;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, geoMarketReport);
    }
}
