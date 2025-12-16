package com.avito.android.advert.item.safedeal.info;

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
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSafeDealInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/info/AdvertDetailsSafeDealInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSafeDealInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSafeDealInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78871b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78872c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SafeDeal.Info f78873d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78874e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f78875f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f78876g;

    /* compiled from: AdvertDetailsSafeDealInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSafeDealInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealInfoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSafeDealInfoItem(parcel.readLong(), parcel.readString(), (SafeDeal.Info) parcel.readParcelable(AdvertDetailsSafeDealInfoItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealInfoItem[] newArray(int i12) {
            return new AdvertDetailsSafeDealInfoItem[i12];
        }
    }

    public AdvertDetailsSafeDealInfoItem(long j12, @k String str, @k SafeDeal.Info info, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f78871b = j12;
        this.f78872c = str;
        this.f78873d = info;
        this.f78874e = i12;
        this.f78875f = serpDisplayType;
        this.f78876g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSafeDealInfoItem(this.f78871b, this.f78872c, this.f78873d, i12, this.f78875f, this.f78876g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78875f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSafeDealInfoItem)) {
            return false;
        }
        AdvertDetailsSafeDealInfoItem advertDetailsSafeDealInfoItem = (AdvertDetailsSafeDealInfoItem) obj;
        return this.f78871b == advertDetailsSafeDealInfoItem.f78871b && L.f(this.f78872c, advertDetailsSafeDealInfoItem.f78872c) && L.f(this.f78873d, advertDetailsSafeDealInfoItem.f78873d) && this.f78874e == advertDetailsSafeDealInfoItem.f78874e && this.f78875f == advertDetailsSafeDealInfoItem.f78875f && this.f78876g == advertDetailsSafeDealInfoItem.f78876g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75092b() {
        return this.f78871b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f78874e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f78872c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f78876g;
    }

    public final int hashCode() {
        return this.f78876g.hashCode() + com.avito.android.actions_sheet.a.h(this.f78875f, r.e(this.f78874e, (this.f78873d.hashCode() + H.d(Long.hashCode(this.f78871b) * 31, 31, this.f78872c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSafeDealInfoItem(id=");
        sb2.append(this.f78871b);
        sb2.append(", stringId=");
        sb2.append(this.f78872c);
        sb2.append(", info=");
        sb2.append(this.f78873d);
        sb2.append(", spanCount=");
        sb2.append(this.f78874e);
        sb2.append(", displayType=");
        sb2.append(this.f78875f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78876g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78871b);
        parcel.writeString(this.f78872c);
        parcel.writeParcelable(this.f78873d, i12);
        parcel.writeInt(this.f78874e);
        parcel.writeString(this.f78875f.name());
        parcel.writeString(this.f78876g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSafeDealInfoItem(long j12, String str, SafeDeal.Info info, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 36;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, info, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
