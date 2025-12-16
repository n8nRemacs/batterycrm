package com.avito.android.advert.item.marketplace_stocks;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.marketplace.MarketplaceStocks;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketplaceStocksItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/marketplace_stocks/MarketplaceStocksItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MarketplaceStocksItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<MarketplaceStocksItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MarketplaceStocks f77594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f77595c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f77596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77597e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77598f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77599g;

    /* compiled from: MarketplaceStocksItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceStocksItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceStocksItem createFromParcel(Parcel parcel) {
            return new MarketplaceStocksItem((MarketplaceStocks) parcel.readParcelable(MarketplaceStocksItem.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceStocksItem[] newArray(int i12) {
            return new MarketplaceStocksItem[i12];
        }
    }

    public MarketplaceStocksItem(@k MarketplaceStocks marketplaceStocks, long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77594b = marketplaceStocks;
        this.f77595c = j12;
        this.f77596d = str;
        this.f77597e = i12;
        this.f77598f = serpDisplayType;
        this.f77599g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MarketplaceStocksItem(this.f77594b, this.f77595c, this.f77596d, i12, this.f77598f, this.f77599g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77598f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceStocksItem)) {
            return false;
        }
        MarketplaceStocksItem marketplaceStocksItem = (MarketplaceStocksItem) obj;
        return L.f(this.f77594b, marketplaceStocksItem.f77594b) && this.f77595c == marketplaceStocksItem.f77595c && L.f(this.f77596d, marketplaceStocksItem.f77596d) && this.f77597e == marketplaceStocksItem.f77597e && this.f77598f == marketplaceStocksItem.f77598f && this.f77599g == marketplaceStocksItem.f77599g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75824b() {
        return this.f77595c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79232d() {
        return this.f77597e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79230b() {
        return this.f77596d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79235g() {
        return this.f77599g;
    }

    public final int hashCode() {
        return this.f77599g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77598f, r.e(this.f77597e, H.d(r.g(this.f77594b.hashCode() * 31, 31, this.f77595c), 31, this.f77596d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketplaceStocksItem(stocks=");
        sb2.append(this.f77594b);
        sb2.append(", id=");
        sb2.append(this.f77595c);
        sb2.append(", stringId=");
        sb2.append(this.f77596d);
        sb2.append(", spanCount=");
        sb2.append(this.f77597e);
        sb2.append(", displayType=");
        sb2.append(this.f77598f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77599g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f77594b, i12);
        parcel.writeLong(this.f77595c);
        parcel.writeString(this.f77596d);
        parcel.writeInt(this.f77597e);
        parcel.writeString(this.f77598f.name());
        parcel.writeString(this.f77599g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketplaceStocksItem(MarketplaceStocks marketplaceStocks, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 81;
        } else {
            j13 = j12;
        }
        this(marketplaceStocks, j13, (i13 & 4) != 0 ? String.valueOf(j13) : str, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
