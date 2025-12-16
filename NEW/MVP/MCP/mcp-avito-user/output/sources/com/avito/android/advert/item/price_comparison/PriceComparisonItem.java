package com.avito.android.advert.item.price_comparison;

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
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceComparisonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/price_comparison/PriceComparisonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceComparisonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<PriceComparisonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78219b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78220c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ModelCardInfo f78222e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f78223f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f78224g;

    /* compiled from: PriceComparisonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceComparisonItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceComparisonItem createFromParcel(Parcel parcel) {
            return new PriceComparisonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (ModelCardInfo) parcel.readParcelable(PriceComparisonItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceComparisonItem[] newArray(int i12) {
            return new PriceComparisonItem[i12];
        }
    }

    public PriceComparisonItem(long j12, @k String str, int i12, @k ModelCardInfo modelCardInfo, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f78219b = j12;
        this.f78220c = str;
        this.f78221d = i12;
        this.f78222e = modelCardInfo;
        this.f78223f = serpDisplayType;
        this.f78224g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceComparisonItem(this.f78219b, this.f78220c, i12, this.f78222e, this.f78223f, this.f78224g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78223f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceComparisonItem)) {
            return false;
        }
        PriceComparisonItem priceComparisonItem = (PriceComparisonItem) obj;
        return this.f78219b == priceComparisonItem.f78219b && L.f(this.f78220c, priceComparisonItem.f78220c) && this.f78221d == priceComparisonItem.f78221d && L.f(this.f78222e, priceComparisonItem.f78222e) && this.f78223f == priceComparisonItem.f78223f && this.f78224g == priceComparisonItem.f78224g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80070b() {
        return this.f78219b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270284b() {
        return this.f78221d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302737b() {
        return this.f78220c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270290h() {
        return this.f78224g;
    }

    public final int hashCode() {
        return this.f78224g.hashCode() + com.avito.android.actions_sheet.a.h(this.f78223f, (this.f78222e.hashCode() + r.e(this.f78221d, H.d(Long.hashCode(this.f78219b) * 31, 31, this.f78220c), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceComparisonItem(id=");
        sb2.append(this.f78219b);
        sb2.append(", stringId=");
        sb2.append(this.f78220c);
        sb2.append(", spanCount=");
        sb2.append(this.f78221d);
        sb2.append(", model=");
        sb2.append(this.f78222e);
        sb2.append(", displayType=");
        sb2.append(this.f78223f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78224g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78219b);
        parcel.writeString(this.f78220c);
        parcel.writeInt(this.f78221d);
        parcel.writeParcelable(this.f78222e, i12);
        parcel.writeString(this.f78223f.name());
        parcel.writeString(this.f78224g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceComparisonItem(long j12, String str, int i12, ModelCardInfo modelCardInfo, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 107;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, modelCardInfo, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
