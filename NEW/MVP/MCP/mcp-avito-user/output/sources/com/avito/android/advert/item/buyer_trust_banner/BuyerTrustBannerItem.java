package com.avito.android.advert.item.buyer_trust_banner;

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
import com.avito.android.remote.model.buyer_trust_banner.BuyerTrustBanner;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuyerTrustBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/buyer_trust_banner/BuyerTrustBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuyerTrustBannerItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<BuyerTrustBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f74213c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74214d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BuyerTrustBanner f74215e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f74216f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f74217g;

    /* renamed from: h, reason: collision with root package name */
    public final long f74218h;

    /* compiled from: BuyerTrustBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuyerTrustBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final BuyerTrustBannerItem createFromParcel(Parcel parcel) {
            return new BuyerTrustBannerItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (BuyerTrustBanner) parcel.readParcelable(BuyerTrustBannerItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuyerTrustBannerItem[] newArray(int i12) {
            return new BuyerTrustBannerItem[i12];
        }
    }

    public BuyerTrustBannerItem(long j12, @k String str, int i12, @k BuyerTrustBanner buyerTrustBanner, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f74212b = j12;
        this.f74213c = str;
        this.f74214d = i12;
        this.f74215e = buyerTrustBanner;
        this.f74216f = serpDisplayType;
        this.f74217g = serpViewType;
        this.f74218h = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new BuyerTrustBannerItem(this.f74212b, this.f74213c, i12, this.f74215e, this.f74216f, this.f74217g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74216f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerTrustBannerItem)) {
            return false;
        }
        BuyerTrustBannerItem buyerTrustBannerItem = (BuyerTrustBannerItem) obj;
        return this.f74212b == buyerTrustBannerItem.f74212b && L.f(this.f74213c, buyerTrustBannerItem.f74213c) && this.f74214d == buyerTrustBannerItem.f74214d && L.f(this.f74215e, buyerTrustBannerItem.f74215e) && this.f74216f == buyerTrustBannerItem.f74216f && this.f74217g == buyerTrustBannerItem.f74217g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f74212b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75325l() {
        return this.f74214d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75316c() {
        return this.f74213c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77570h() {
        return this.f74218h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75327n() {
        return this.f74217g;
    }

    public final int hashCode() {
        return this.f74217g.hashCode() + com.avito.android.actions_sheet.a.h(this.f74216f, (this.f74215e.hashCode() + r.e(this.f74214d, H.d(Long.hashCode(this.f74212b) * 31, 31, this.f74213c), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerTrustBannerItem(id=");
        sb2.append(this.f74212b);
        sb2.append(", stringId=");
        sb2.append(this.f74213c);
        sb2.append(", spanCount=");
        sb2.append(this.f74214d);
        sb2.append(", banner=");
        sb2.append(this.f74215e);
        sb2.append(", displayType=");
        sb2.append(this.f74216f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74217g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f74212b);
        parcel.writeString(this.f74213c);
        parcel.writeInt(this.f74214d);
        parcel.writeParcelable(this.f74215e, i12);
        parcel.writeString(this.f74216f.name());
        parcel.writeString(this.f74217g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuyerTrustBannerItem(long j12, String str, int i12, BuyerTrustBanner buyerTrustBanner, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = JfifUtil.MARKER_SOS;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, buyerTrustBanner, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
