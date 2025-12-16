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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/PriceListHeaderItem;", "Lcom/avito/android/advert_core/price_list/PriceListBaseItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceListHeaderItem extends PriceListBaseItem {

    @k
    public static final Parcelable.Creator<PriceListHeaderItem> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final long f84021c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f84022d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f84023e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84024f;

    /* compiled from: PriceListBaseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceListHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceListHeaderItem createFromParcel(Parcel parcel) {
            return new PriceListHeaderItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceListHeaderItem[] newArray(int i12) {
            return new PriceListHeaderItem[i12];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceListHeaderItem(long j12, String str, String str2, int i12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 108;
        }
        long j13 = j12;
        this((i13 & 2) != 0 ? String.valueOf(j13) : str, str2, i12, j13);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceListHeaderItem(this.f84022d, this.f84023e, i12, this.f84021c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceListHeaderItem)) {
            return false;
        }
        PriceListHeaderItem priceListHeaderItem = (PriceListHeaderItem) obj;
        return this.f84021c == priceListHeaderItem.f84021c && L.f(this.f84022d, priceListHeaderItem.f84022d) && L.f(this.f84023e, priceListHeaderItem.f84023e) && this.f84024f == priceListHeaderItem.f84024f;
    }

    @Override // com.avito.android.advert_core.price_list.PriceListBaseItem, TV0.a
    public final long getId() {
        return this.f84021c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270105i() {
        return this.f84024f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72937b() {
        return this.f84022d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84024f) + H.d(H.d(Long.hashCode(this.f84021c) * 31, 31, this.f84022d), 31, this.f84023e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceListHeaderItem(id=");
        sb2.append(this.f84021c);
        sb2.append(", stringId=");
        sb2.append(this.f84022d);
        sb2.append(", header=");
        sb2.append(this.f84023e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f84024f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84021c);
        parcel.writeString(this.f84022d);
        parcel.writeString(this.f84023e);
        parcel.writeInt(this.f84024f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PriceListHeaderItem(@k String str, @k String str2, int i12, long j12) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f84021c = j12;
        this.f84022d = str;
        this.f84023e = str2;
        this.f84024f = i12;
    }
}
