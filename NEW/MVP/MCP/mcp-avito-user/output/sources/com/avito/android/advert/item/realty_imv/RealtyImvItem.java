package com.avito.android.advert.item.realty_imv;

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
import com.avito.android.remote.model.advert_details.realty.RealtyImv;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealtyImvItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/RealtyImvItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RealtyImvItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<RealtyImvItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78313b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78315d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f78316e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f78317f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f78318g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RealtyImv f78319h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78320i;

    /* compiled from: RealtyImvItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyImvItem> {
        @Override // android.os.Parcelable.Creator
        public final RealtyImvItem createFromParcel(Parcel parcel) {
            return new RealtyImvItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), (RealtyImv) parcel.readParcelable(RealtyImvItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyImvItem[] newArray(int i12) {
            return new RealtyImvItem[i12];
        }
    }

    public RealtyImvItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str2, @k RealtyImv realtyImv, boolean z12) {
        this.f78313b = j12;
        this.f78314c = str;
        this.f78315d = i12;
        this.f78316e = serpDisplayType;
        this.f78317f = serpViewType;
        this.f78318g = str2;
        this.f78319h = realtyImv;
        this.f78320i = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new RealtyImvItem(this.f78313b, this.f78314c, i12, this.f78316e, this.f78317f, this.f78318g, this.f78319h, this.f78320i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78316e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyImvItem)) {
            return false;
        }
        RealtyImvItem realtyImvItem = (RealtyImvItem) obj;
        return this.f78313b == realtyImvItem.f78313b && L.f(this.f78314c, realtyImvItem.f78314c) && this.f78315d == realtyImvItem.f78315d && this.f78316e == realtyImvItem.f78316e && this.f78317f == realtyImvItem.f78317f && L.f(this.f78318g, realtyImvItem.f78318g) && L.f(this.f78319h, realtyImvItem.f78319h) && this.f78320i == realtyImvItem.f78320i;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final RealtyImv getF78319h() {
        return this.f78319h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF72531b() {
        return this.f78313b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF72533d() {
        return this.f78315d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72532c() {
        return this.f78314c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF72535f() {
        return this.f78317f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78320i) + ((this.f78319h.hashCode() + H.d(com.avito.android.actions_sheet.a.j(this.f78317f, com.avito.android.actions_sheet.a.h(this.f78316e, r.e(this.f78315d, H.d(Long.hashCode(this.f78313b) * 31, 31, this.f78314c), 31), 31), 31), 31, this.f78318g)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyImvItem(id=");
        sb2.append(this.f78313b);
        sb2.append(", stringId=");
        sb2.append(this.f78314c);
        sb2.append(", spanCount=");
        sb2.append(this.f78315d);
        sb2.append(", displayType=");
        sb2.append(this.f78316e);
        sb2.append(", viewType=");
        sb2.append(this.f78317f);
        sb2.append(", advertId=");
        sb2.append(this.f78318g);
        sb2.append(", realtyImv=");
        sb2.append(this.f78319h);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f78320i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78313b);
        parcel.writeString(this.f78314c);
        parcel.writeInt(this.f78315d);
        parcel.writeString(this.f78316e.name());
        parcel.writeString(this.f78317f.name());
        parcel.writeString(this.f78318g);
        parcel.writeParcelable(this.f78319h, i12);
        parcel.writeInt(this.f78320i ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RealtyImvItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, RealtyImv realtyImv, boolean z12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 103;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, realtyImv, z12);
    }
}
