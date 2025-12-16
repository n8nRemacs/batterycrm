package com.avito.android.advert.item.anchor_trust_factors;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAnchorTrustFactorsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/AdvertDetailsAnchorTrustFactorsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAnchorTrustFactorsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAnchorTrustFactorsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72794b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72795c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AnchorTrustFactors f72796d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72797e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72798f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72799g;

    /* compiled from: AdvertDetailsAnchorTrustFactorsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAnchorTrustFactorsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAnchorTrustFactorsItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAnchorTrustFactorsItem(parcel.readLong(), parcel.readString(), (AnchorTrustFactors) parcel.readParcelable(AdvertDetailsAnchorTrustFactorsItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAnchorTrustFactorsItem[] newArray(int i12) {
            return new AdvertDetailsAnchorTrustFactorsItem[i12];
        }
    }

    public AdvertDetailsAnchorTrustFactorsItem(long j12, @Y61.k String str, @Y61.k AnchorTrustFactors anchorTrustFactors, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f72794b = j12;
        this.f72795c = str;
        this.f72796d = anchorTrustFactors;
        this.f72797e = i12;
        this.f72798f = serpDisplayType;
        this.f72799g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAnchorTrustFactorsItem(this.f72794b, this.f72795c, this.f72796d, i12, this.f72798f, this.f72799g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72798f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAnchorTrustFactorsItem)) {
            return false;
        }
        AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem = (AdvertDetailsAnchorTrustFactorsItem) obj;
        return this.f72794b == advertDetailsAnchorTrustFactorsItem.f72794b && L.f(this.f72795c, advertDetailsAnchorTrustFactorsItem.f72795c) && L.f(this.f72796d, advertDetailsAnchorTrustFactorsItem.f72796d) && this.f72797e == advertDetailsAnchorTrustFactorsItem.f72797e && this.f72798f == advertDetailsAnchorTrustFactorsItem.f72798f && this.f72799g == advertDetailsAnchorTrustFactorsItem.f72799g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF124012b() {
        return this.f72794b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF285029c() {
        return this.f72797e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF20568b() {
        return this.f72795c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF285042p() {
        return this.f72799g;
    }

    public final int hashCode() {
        return this.f72799g.hashCode() + com.avito.android.actions_sheet.a.h(this.f72798f, r.e(this.f72797e, (this.f72796d.hashCode() + H.d(Long.hashCode(this.f72794b) * 31, 31, this.f72795c)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAnchorTrustFactorsItem(id=");
        sb2.append(this.f72794b);
        sb2.append(", stringId=");
        sb2.append(this.f72795c);
        sb2.append(", anchorTrustFactors=");
        sb2.append(this.f72796d);
        sb2.append(", spanCount=");
        sb2.append(this.f72797e);
        sb2.append(", displayType=");
        sb2.append(this.f72798f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72799g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72794b);
        parcel.writeString(this.f72795c);
        parcel.writeParcelable(this.f72796d, i12);
        parcel.writeInt(this.f72797e);
        parcel.writeString(this.f72798f.name());
        parcel.writeString(this.f72799g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAnchorTrustFactorsItem(long j12, String str, AnchorTrustFactors anchorTrustFactors, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 185;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, anchorTrustFactors, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
