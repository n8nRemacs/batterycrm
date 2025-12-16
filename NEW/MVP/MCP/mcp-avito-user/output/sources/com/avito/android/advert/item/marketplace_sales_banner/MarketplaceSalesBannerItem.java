package com.avito.android.advert.item.marketplace_sales_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.sales.SalesBanner;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketplaceSalesBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner/MarketplaceSalesBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MarketplaceSalesBannerItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MarketplaceSalesBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77536b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77537c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SalesBanner f77538d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77539e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77540f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f77541g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f77542h;

    /* renamed from: i, reason: collision with root package name */
    public final long f77543i;

    /* compiled from: MarketplaceSalesBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceSalesBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesBannerItem createFromParcel(Parcel parcel) {
            return new MarketplaceSalesBannerItem(parcel.readLong(), parcel.readString(), (SalesBanner) parcel.readParcelable(MarketplaceSalesBannerItem.class.getClassLoader()), parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesBannerItem[] newArray(int i12) {
            return new MarketplaceSalesBannerItem[i12];
        }
    }

    public MarketplaceSalesBannerItem(long j12, @k String str, @k SalesBanner salesBanner, int i12, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77536b = j12;
        this.f77537c = str;
        this.f77538d = salesBanner;
        this.f77539e = i12;
        this.f77540f = i13;
        this.f77541g = serpDisplayType;
        this.f77542h = serpViewType;
        this.f77543i = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MarketplaceSalesBannerItem(this.f77536b, this.f77537c, this.f77538d, this.f77539e, i12, this.f77541g, this.f77542h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77541g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceSalesBannerItem)) {
            return false;
        }
        MarketplaceSalesBannerItem marketplaceSalesBannerItem = (MarketplaceSalesBannerItem) obj;
        return this.f77536b == marketplaceSalesBannerItem.f77536b && L.f(this.f77537c, marketplaceSalesBannerItem.f77537c) && L.f(this.f77538d, marketplaceSalesBannerItem.f77538d) && this.f77539e == marketplaceSalesBannerItem.f77539e && this.f77540f == marketplaceSalesBannerItem.f77540f && this.f77541g == marketplaceSalesBannerItem.f77541g && this.f77542h == marketplaceSalesBannerItem.f77542h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f77536b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f77540f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f77537c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f77543i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f77542h;
    }

    public final int hashCode() {
        return this.f77542h.hashCode() + com.avito.android.actions_sheet.a.h(this.f77541g, r.e(this.f77540f, r.e(this.f77539e, (this.f77538d.hashCode() + H.d(Long.hashCode(this.f77536b) * 31, 31, this.f77537c)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketplaceSalesBannerItem(id=");
        sb2.append(this.f77536b);
        sb2.append(", stringId=");
        sb2.append(this.f77537c);
        sb2.append(", salesBanner=");
        sb2.append(this.f77538d);
        sb2.append(", styleRes=");
        sb2.append(this.f77539e);
        sb2.append(", spanCount=");
        sb2.append(this.f77540f);
        sb2.append(", displayType=");
        sb2.append(this.f77541g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77542h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77536b);
        parcel.writeString(this.f77537c);
        parcel.writeParcelable(this.f77538d, i12);
        parcel.writeInt(this.f77539e);
        parcel.writeInt(this.f77540f);
        parcel.writeString(this.f77541g.name());
        parcel.writeString(this.f77542h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketplaceSalesBannerItem(long j12, String str, SalesBanner salesBanner, int i12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 83;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, salesBanner, i12, i13, (i14 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
