package com.avito.android.advert_core.price_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceListBaseItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/PriceListGroupTitleItem;", "Lcom/avito/android/advert_core/price_list/PriceListBaseItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceListGroupTitleItem extends PriceListBaseItem {

    @k
    public static final Parcelable.Creator<PriceListGroupTitleItem> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final long f84017c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f84018d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f84019e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84020f;

    /* compiled from: PriceListBaseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceListGroupTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceListGroupTitleItem createFromParcel(Parcel parcel) {
            return new PriceListGroupTitleItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceListGroupTitleItem[] newArray(int i12) {
            return new PriceListGroupTitleItem[i12];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceListGroupTitleItem(long j12, String str, String str2, int i12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 109;
        }
        long j13 = j12;
        this((i13 & 2) != 0 ? String.valueOf(j13) : str, str2, i12, j13);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceListGroupTitleItem(this.f84018d, this.f84019e, i12, this.f84017c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceListGroupTitleItem)) {
            return false;
        }
        PriceListGroupTitleItem priceListGroupTitleItem = (PriceListGroupTitleItem) obj;
        return this.f84017c == priceListGroupTitleItem.f84017c && L.f(this.f84018d, priceListGroupTitleItem.f84018d) && L.f(this.f84019e, priceListGroupTitleItem.f84019e) && this.f84020f == priceListGroupTitleItem.f84020f;
    }

    @Override // com.avito.android.advert_core.price_list.PriceListBaseItem, TV0.a
    public final long getId() {
        return this.f84017c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270105i() {
        return this.f84020f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72937b() {
        return this.f84018d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84020f) + H.d(H.d(Long.hashCode(this.f84017c) * 31, 31, this.f84018d), 31, this.f84019e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceListGroupTitleItem(id=");
        sb2.append(this.f84017c);
        sb2.append(", stringId=");
        sb2.append(this.f84018d);
        sb2.append(", title=");
        sb2.append(this.f84019e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f84020f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84017c);
        parcel.writeString(this.f84018d);
        parcel.writeString(this.f84019e);
        parcel.writeInt(this.f84020f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PriceListGroupTitleItem(@k String str, @k String str2, int i12, long j12) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f84017c = j12;
        this.f84018d = str;
        this.f84019e = str2;
        this.f84020f = i12;
    }
}
