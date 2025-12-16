package com.avito.android.advert.item.marketplace_rewards;

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
import com.avito.android.remote.model.rewards.RewardsBanner;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketplaceRewardsBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/marketplace_rewards/MarketplaceRewardsBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MarketplaceRewardsBannerItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MarketplaceRewardsBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77465b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77466c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RewardsBanner f77467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77469f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f77470g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f77471h;

    /* renamed from: i, reason: collision with root package name */
    public final long f77472i;

    /* compiled from: MarketplaceRewardsBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceRewardsBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceRewardsBannerItem createFromParcel(Parcel parcel) {
            return new MarketplaceRewardsBannerItem(parcel.readLong(), parcel.readString(), (RewardsBanner) parcel.readParcelable(MarketplaceRewardsBannerItem.class.getClassLoader()), parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceRewardsBannerItem[] newArray(int i12) {
            return new MarketplaceRewardsBannerItem[i12];
        }
    }

    public MarketplaceRewardsBannerItem(long j12, @k String str, @k RewardsBanner rewardsBanner, int i12, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77465b = j12;
        this.f77466c = str;
        this.f77467d = rewardsBanner;
        this.f77468e = i12;
        this.f77469f = i13;
        this.f77470g = serpDisplayType;
        this.f77471h = serpViewType;
        this.f77472i = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MarketplaceRewardsBannerItem(this.f77465b, this.f77466c, this.f77467d, this.f77468e, i12, this.f77470g, this.f77471h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77470g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceRewardsBannerItem)) {
            return false;
        }
        MarketplaceRewardsBannerItem marketplaceRewardsBannerItem = (MarketplaceRewardsBannerItem) obj;
        return this.f77465b == marketplaceRewardsBannerItem.f77465b && L.f(this.f77466c, marketplaceRewardsBannerItem.f77466c) && L.f(this.f77467d, marketplaceRewardsBannerItem.f77467d) && this.f77468e == marketplaceRewardsBannerItem.f77468e && this.f77469f == marketplaceRewardsBannerItem.f77469f && this.f77470g == marketplaceRewardsBannerItem.f77470g && this.f77471h == marketplaceRewardsBannerItem.f77471h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f77465b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f77469f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f77466c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f77472i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f77471h;
    }

    public final int hashCode() {
        return this.f77471h.hashCode() + com.avito.android.actions_sheet.a.h(this.f77470g, r.e(this.f77469f, r.e(this.f77468e, (this.f77467d.hashCode() + H.d(Long.hashCode(this.f77465b) * 31, 31, this.f77466c)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketplaceRewardsBannerItem(id=");
        sb2.append(this.f77465b);
        sb2.append(", stringId=");
        sb2.append(this.f77466c);
        sb2.append(", rewardsBanner=");
        sb2.append(this.f77467d);
        sb2.append(", styleRes=");
        sb2.append(this.f77468e);
        sb2.append(", spanCount=");
        sb2.append(this.f77469f);
        sb2.append(", displayType=");
        sb2.append(this.f77470g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77471h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77465b);
        parcel.writeString(this.f77466c);
        parcel.writeParcelable(this.f77467d, i12);
        parcel.writeInt(this.f77468e);
        parcel.writeInt(this.f77469f);
        parcel.writeString(this.f77470g.name());
        parcel.writeString(this.f77471h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketplaceRewardsBannerItem(long j12, String str, RewardsBanner rewardsBanner, int i12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 85;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, rewardsBanner, i12, i13, (i14 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
