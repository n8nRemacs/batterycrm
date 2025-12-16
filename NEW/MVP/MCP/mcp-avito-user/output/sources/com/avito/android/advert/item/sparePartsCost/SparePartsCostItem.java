package com.avito.android.advert.item.sparePartsCost;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SparePartsCost;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsCostItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sparePartsCost/SparePartsCostItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparePartsCostItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<SparePartsCostItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80369c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80370d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f80371e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f80372f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SparePartsCost f80373g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f80374h;

    /* compiled from: SparePartsCostItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsCostItem> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsCostItem createFromParcel(Parcel parcel) {
            return new SparePartsCostItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (SparePartsCost) parcel.readParcelable(SparePartsCostItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsCostItem[] newArray(int i12) {
            return new SparePartsCostItem[i12];
        }
    }

    public SparePartsCostItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k SparePartsCost sparePartsCost, @k String str2) {
        this.f80368b = j12;
        this.f80369c = str;
        this.f80370d = i12;
        this.f80371e = serpDisplayType;
        this.f80372f = serpViewType;
        this.f80373g = sparePartsCost;
        this.f80374h = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new SparePartsCostItem(this.f80368b, this.f80369c, i12, this.f80371e, this.f80372f, this.f80373g, this.f80374h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80371e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsCostItem)) {
            return false;
        }
        SparePartsCostItem sparePartsCostItem = (SparePartsCostItem) obj;
        return this.f80368b == sparePartsCostItem.f80368b && L.f(this.f80369c, sparePartsCostItem.f80369c) && this.f80370d == sparePartsCostItem.f80370d && this.f80371e == sparePartsCostItem.f80371e && this.f80372f == sparePartsCostItem.f80372f && L.f(this.f80373g, sparePartsCostItem.f80373g) && L.f(this.f80374h, sparePartsCostItem.f80374h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85216b() {
        return this.f80368b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272456g() {
        return this.f80370d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272451b() {
        return this.f80369c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272455f() {
        return this.f80372f;
    }

    public final int hashCode() {
        return this.f80374h.hashCode() + ((this.f80373g.hashCode() + com.avito.android.actions_sheet.a.j(this.f80372f, com.avito.android.actions_sheet.a.h(this.f80371e, r.e(this.f80370d, H.d(Long.hashCode(this.f80368b) * 31, 31, this.f80369c), 31), 31), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsCostItem(id=");
        sb2.append(this.f80368b);
        sb2.append(", stringId=");
        sb2.append(this.f80369c);
        sb2.append(", spanCount=");
        sb2.append(this.f80370d);
        sb2.append(", displayType=");
        sb2.append(this.f80371e);
        sb2.append(", viewType=");
        sb2.append(this.f80372f);
        sb2.append(", sparePartsCost=");
        sb2.append(this.f80373g);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f80374h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80368b);
        parcel.writeString(this.f80369c);
        parcel.writeInt(this.f80370d);
        parcel.writeString(this.f80371e.name());
        parcel.writeString(this.f80372f.name());
        parcel.writeParcelable(this.f80373g, i12);
        parcel.writeString(this.f80374h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SparePartsCostItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, SparePartsCost sparePartsCost, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 130;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, sparePartsCost, str2);
    }
}
