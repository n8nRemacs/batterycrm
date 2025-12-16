package com.avito.android.advert_details_items.price_hint;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertPriceHint;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceHintItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_hint/PriceHintItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceHintItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<PriceHintItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85355b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85356c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertPriceHint f85357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85358e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f85359f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f85360g;

    /* compiled from: PriceHintItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceHintItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceHintItem createFromParcel(Parcel parcel) {
            return new PriceHintItem(parcel.readLong(), parcel.readString(), (AdvertPriceHint) parcel.readParcelable(PriceHintItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceHintItem[] newArray(int i12) {
            return new PriceHintItem[i12];
        }
    }

    public PriceHintItem(long j12, @Y61.k String str, @Y61.k AdvertPriceHint advertPriceHint, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f85355b = j12;
        this.f85356c = str;
        this.f85357d = advertPriceHint;
        this.f85358e = i12;
        this.f85359f = serpDisplayType;
        this.f85360g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new PriceHintItem(this.f85355b, this.f85356c, this.f85357d, i12, this.f85359f, this.f85360g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f85359f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceHintItem)) {
            return false;
        }
        PriceHintItem priceHintItem = (PriceHintItem) obj;
        return this.f85355b == priceHintItem.f85355b && L.f(this.f85356c, priceHintItem.f85356c) && L.f(this.f85357d, priceHintItem.f85357d) && this.f85358e == priceHintItem.f85358e && this.f85359f == priceHintItem.f85359f && this.f85360g == priceHintItem.f85360g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79337b() {
        return this.f85355b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79339d() {
        return this.f85358e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84010c() {
        return this.f85356c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84016b() {
        return this.f85360g;
    }

    public final int hashCode() {
        return this.f85360g.hashCode() + com.avito.android.actions_sheet.a.h(this.f85359f, r.e(this.f85358e, (this.f85357d.hashCode() + H.d(Long.hashCode(this.f85355b) * 31, 31, this.f85356c)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceHintItem(id=");
        sb2.append(this.f85355b);
        sb2.append(", stringId=");
        sb2.append(this.f85356c);
        sb2.append(", priceHint=");
        sb2.append(this.f85357d);
        sb2.append(", spanCount=");
        sb2.append(this.f85358e);
        sb2.append(", displayType=");
        sb2.append(this.f85359f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85360g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85355b);
        parcel.writeString(this.f85356c);
        parcel.writeParcelable(this.f85357d, i12);
        parcel.writeInt(this.f85358e);
        parcel.writeString(this.f85359f.name());
        parcel.writeString(this.f85360g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceHintItem(long j12, String str, AdvertPriceHint advertPriceHint, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 110;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertPriceHint, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
