package com.avito.android.advert.item.leasing_calculator.link_item;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsLeasingLinkItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/link_item/AdvertDetailsLeasingLinkItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsLeasingLinkItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsLeasingLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77404c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77405d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77406e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77407f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77408g;

    /* compiled from: AdvertDetailsLeasingLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsLeasingLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingLinkItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsLeasingLinkItem(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingLinkItem[] newArray(int i12) {
            return new AdvertDetailsLeasingLinkItem[i12];
        }
    }

    public AdvertDetailsLeasingLinkItem(long j12, @k String str, long j13, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77403b = j12;
        this.f77404c = str;
        this.f77405d = j13;
        this.f77406e = i12;
        this.f77407f = serpDisplayType;
        this.f77408g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsLeasingLinkItem(this.f77403b, this.f77404c, this.f77405d, i12, this.f77407f, this.f77408g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77407f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsLeasingLinkItem)) {
            return false;
        }
        AdvertDetailsLeasingLinkItem advertDetailsLeasingLinkItem = (AdvertDetailsLeasingLinkItem) obj;
        return this.f77403b == advertDetailsLeasingLinkItem.f77403b && L.f(this.f77404c, advertDetailsLeasingLinkItem.f77404c) && this.f77405d == advertDetailsLeasingLinkItem.f77405d && this.f77406e == advertDetailsLeasingLinkItem.f77406e && this.f77407f == advertDetailsLeasingLinkItem.f77407f && this.f77408g == advertDetailsLeasingLinkItem.f77408g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f77403b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f77406e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f77404c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f77408g;
    }

    public final int hashCode() {
        return this.f77408g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77407f, r.e(this.f77406e, r.g(H.d(Long.hashCode(this.f77403b) * 31, 31, this.f77404c), 31, this.f77405d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsLeasingLinkItem(id=");
        sb2.append(this.f77403b);
        sb2.append(", stringId=");
        sb2.append(this.f77404c);
        sb2.append(", monthlyPayment=");
        sb2.append(this.f77405d);
        sb2.append(", spanCount=");
        sb2.append(this.f77406e);
        sb2.append(", displayType=");
        sb2.append(this.f77407f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77408g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77403b);
        parcel.writeString(this.f77404c);
        parcel.writeLong(this.f77405d);
        parcel.writeInt(this.f77406e);
        parcel.writeString(this.f77407f.name());
        parcel.writeString(this.f77408g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsLeasingLinkItem(long j12, String str, long j13, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j14;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j14 = 121;
        } else {
            j14 = j12;
        }
        this(j14, (i13 & 2) != 0 ? String.valueOf(j14) : str, j13, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
