package com.avito.android.advert.item.short_term_rent.item_discount;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentItemDiscount;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsShortTermRentItemDiscountItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/item_discount/AdvertDetailsShortTermRentItemDiscountItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsShortTermRentItemDiscountItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsShortTermRentItemDiscountItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80034c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ShortTermRentItemDiscount f80035d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80036e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f80037f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f80038g;

    /* compiled from: AdvertDetailsShortTermRentItemDiscountItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsShortTermRentItemDiscountItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShortTermRentItemDiscountItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsShortTermRentItemDiscountItem(parcel.readLong(), parcel.readString(), ShortTermRentItemDiscount.CREATOR.createFromParcel(parcel), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShortTermRentItemDiscountItem[] newArray(int i12) {
            return new AdvertDetailsShortTermRentItemDiscountItem[i12];
        }
    }

    public AdvertDetailsShortTermRentItemDiscountItem(long j12, @k String str, @k ShortTermRentItemDiscount shortTermRentItemDiscount, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80033b = j12;
        this.f80034c = str;
        this.f80035d = shortTermRentItemDiscount;
        this.f80036e = i12;
        this.f80037f = serpDisplayType;
        this.f80038g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsShortTermRentItemDiscountItem(this.f80033b, this.f80034c, this.f80035d, i12, this.f80037f, this.f80038g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80037f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsShortTermRentItemDiscountItem)) {
            return false;
        }
        AdvertDetailsShortTermRentItemDiscountItem advertDetailsShortTermRentItemDiscountItem = (AdvertDetailsShortTermRentItemDiscountItem) obj;
        return this.f80033b == advertDetailsShortTermRentItemDiscountItem.f80033b && L.f(this.f80034c, advertDetailsShortTermRentItemDiscountItem.f80034c) && L.f(this.f80035d, advertDetailsShortTermRentItemDiscountItem.f80035d) && this.f80036e == advertDetailsShortTermRentItemDiscountItem.f80036e && this.f80037f == advertDetailsShortTermRentItemDiscountItem.f80037f && this.f80038g == advertDetailsShortTermRentItemDiscountItem.f80038g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF269950b() {
        return this.f80033b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270668c() {
        return this.f80036e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317677b() {
        return this.f80034c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270667b() {
        return this.f80038g;
    }

    public final int hashCode() {
        return this.f80038g.hashCode() + com.avito.android.actions_sheet.a.h(this.f80037f, r.e(this.f80036e, (this.f80035d.hashCode() + H.d(Long.hashCode(this.f80033b) * 31, 31, this.f80034c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsShortTermRentItemDiscountItem(id=");
        sb2.append(this.f80033b);
        sb2.append(", stringId=");
        sb2.append(this.f80034c);
        sb2.append(", itemDiscount=");
        sb2.append(this.f80035d);
        sb2.append(", spanCount=");
        sb2.append(this.f80036e);
        sb2.append(", displayType=");
        sb2.append(this.f80037f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80038g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80033b);
        parcel.writeString(this.f80034c);
        this.f80035d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f80036e);
        parcel.writeString(this.f80037f.name());
        parcel.writeString(this.f80038g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsShortTermRentItemDiscountItem(long j12, String str, ShortTermRentItemDiscount shortTermRentItemDiscount, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 46;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, shortTermRentItemDiscount, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
