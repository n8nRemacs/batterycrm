package com.avito.android.advert.item.ownership_cost.items;

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
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: OwnershipCostItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/OwnershipCostItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OwnershipCostItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<OwnershipCostItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77948b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f77949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77950d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f77951e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f77952f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f77953g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77954h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77955i;

    /* compiled from: OwnershipCostItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OwnershipCostItem> {
        @Override // android.os.Parcelable.Creator
        public final OwnershipCostItem createFromParcel(Parcel parcel) {
            return new OwnershipCostItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnershipCostItem[] newArray(int i12) {
            return new OwnershipCostItem[i12];
        }
    }

    public OwnershipCostItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, boolean z12, boolean z13, boolean z14) {
        this.f77948b = j12;
        this.f77949c = str;
        this.f77950d = i12;
        this.f77951e = serpDisplayType;
        this.f77952f = serpViewType;
        this.f77953g = z12;
        this.f77954h = z13;
        this.f77955i = z14;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f77951e;
        boolean z12 = this.f77955i;
        return new OwnershipCostItem(this.f77948b, this.f77949c, i12, serpDisplayType, this.f77952f, this.f77953g, this.f77954h, z12);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f77951e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnershipCostItem)) {
            return false;
        }
        OwnershipCostItem ownershipCostItem = (OwnershipCostItem) obj;
        return this.f77948b == ownershipCostItem.f77948b && L.f(this.f77949c, ownershipCostItem.f77949c) && this.f77950d == ownershipCostItem.f77950d && this.f77951e == ownershipCostItem.f77951e && this.f77952f == ownershipCostItem.f77952f && this.f77953g == ownershipCostItem.f77953g && this.f77954h == ownershipCostItem.f77954h && this.f77955i == ownershipCostItem.f77955i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f77948b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f77950d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f77949c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f77952f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77955i) + r.i(r.i(com.avito.android.actions_sheet.a.j(this.f77952f, com.avito.android.actions_sheet.a.h(this.f77951e, r.e(this.f77950d, H.d(Long.hashCode(this.f77948b) * 31, 31, this.f77949c), 31), 31), 31), 31, this.f77953g), 31, this.f77954h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OwnershipCostItem(id=");
        sb2.append(this.f77948b);
        sb2.append(", stringId=");
        sb2.append(this.f77949c);
        sb2.append(", spanCount=");
        sb2.append(this.f77950d);
        sb2.append(", displayType=");
        sb2.append(this.f77951e);
        sb2.append(", viewType=");
        sb2.append(this.f77952f);
        sb2.append(", withTopDivider=");
        sb2.append(this.f77953g);
        sb2.append(", withBottomDivider=");
        sb2.append(this.f77954h);
        sb2.append(", wasUpdated=");
        return r.x(sb2, this.f77955i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f77948b);
        parcel.writeString(this.f77949c);
        parcel.writeInt(this.f77950d);
        parcel.writeString(this.f77951e.name());
        parcel.writeString(this.f77952f.name());
        parcel.writeInt(this.f77953g ? 1 : 0);
        parcel.writeInt(this.f77954h ? 1 : 0);
        parcel.writeInt(this.f77955i ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OwnershipCostItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, boolean z12, boolean z13, boolean z14, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = WebSocketProtocol.PAYLOAD_SHORT;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 32) != 0 ? true : z12, (i13 & 64) != 0 ? true : z13, (i13 & 128) != 0 ? false : z14);
    }
}
