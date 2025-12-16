package com.avito.android.advert.item.sales_banner;

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
import com.avito.android.remote.sales_banner.StickedSalesBanner;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsStickedSalesBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sales_banner/AdvertDetailsStickedSalesBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsStickedSalesBannerItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsStickedSalesBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79292c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f79293d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f79294e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79295f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StickedSalesBanner f79296g;

    /* compiled from: AdvertDetailsStickedSalesBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsStickedSalesBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsStickedSalesBannerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsStickedSalesBannerItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), (StickedSalesBanner) parcel.readParcelable(AdvertDetailsStickedSalesBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsStickedSalesBannerItem[] newArray(int i12) {
            return new AdvertDetailsStickedSalesBannerItem[i12];
        }
    }

    public AdvertDetailsStickedSalesBannerItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @k StickedSalesBanner stickedSalesBanner) {
        this.f79291b = j12;
        this.f79292c = str;
        this.f79293d = serpViewType;
        this.f79294e = serpDisplayType;
        this.f79295f = i12;
        this.f79296g = stickedSalesBanner;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsStickedSalesBannerItem(this.f79291b, this.f79292c, this.f79293d, this.f79294e, i12, this.f79296g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79294e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsStickedSalesBannerItem)) {
            return false;
        }
        AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem = (AdvertDetailsStickedSalesBannerItem) obj;
        return this.f79291b == advertDetailsStickedSalesBannerItem.f79291b && L.f(this.f79292c, advertDetailsStickedSalesBannerItem.f79292c) && this.f79293d == advertDetailsStickedSalesBannerItem.f79293d && this.f79294e == advertDetailsStickedSalesBannerItem.f79294e && this.f79295f == advertDetailsStickedSalesBannerItem.f79295f && L.f(this.f79296g, advertDetailsStickedSalesBannerItem.f79296g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85532b() {
        return this.f79291b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85534d() {
        return this.f79295f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154734b() {
        return this.f79292c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85540j() {
        return this.f79293d;
    }

    public final int hashCode() {
        return this.f79296g.hashCode() + r.e(this.f79295f, com.avito.android.actions_sheet.a.h(this.f79294e, com.avito.android.actions_sheet.a.j(this.f79293d, H.d(Long.hashCode(this.f79291b) * 31, 31, this.f79292c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsStickedSalesBannerItem(id=" + this.f79291b + ", stringId=" + this.f79292c + ", viewType=" + this.f79293d + ", displayType=" + this.f79294e + ", spanCount=" + this.f79295f + ", stickedSalesBanner=" + this.f79296g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79291b);
        parcel.writeString(this.f79292c);
        parcel.writeString(this.f79293d.name());
        parcel.writeString(this.f79294e.name());
        parcel.writeInt(this.f79295f);
        parcel.writeParcelable(this.f79296g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsStickedSalesBannerItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, StickedSalesBanner stickedSalesBanner, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 177;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, stickedSalesBanner);
    }
}
