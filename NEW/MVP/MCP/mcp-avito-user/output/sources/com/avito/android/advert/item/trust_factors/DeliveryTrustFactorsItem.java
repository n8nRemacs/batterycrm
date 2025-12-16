package com.avito.android.advert.item.trust_factors;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.DeliveryTrustFactors;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryTrustFactorsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/trust_factors/DeliveryTrustFactorsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DeliveryTrustFactorsItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<DeliveryTrustFactorsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80616b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80617c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80618d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f80619e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f80620f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeliveryTrustFactors f80621g;

    /* compiled from: DeliveryTrustFactorsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryTrustFactorsItem> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryTrustFactorsItem createFromParcel(Parcel parcel) {
            return new DeliveryTrustFactorsItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (DeliveryTrustFactors) parcel.readParcelable(DeliveryTrustFactorsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryTrustFactorsItem[] newArray(int i12) {
            return new DeliveryTrustFactorsItem[i12];
        }
    }

    public DeliveryTrustFactorsItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k DeliveryTrustFactors deliveryTrustFactors) {
        this.f80616b = j12;
        this.f80617c = str;
        this.f80618d = i12;
        this.f80619e = serpDisplayType;
        this.f80620f = serpViewType;
        this.f80621g = deliveryTrustFactors;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new DeliveryTrustFactorsItem(this.f80616b, this.f80617c, i12, this.f80619e, this.f80620f, this.f80621g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80619e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTrustFactorsItem)) {
            return false;
        }
        DeliveryTrustFactorsItem deliveryTrustFactorsItem = (DeliveryTrustFactorsItem) obj;
        return this.f80616b == deliveryTrustFactorsItem.f80616b && L.f(this.f80617c, deliveryTrustFactorsItem.f80617c) && this.f80618d == deliveryTrustFactorsItem.f80618d && this.f80619e == deliveryTrustFactorsItem.f80619e && this.f80620f == deliveryTrustFactorsItem.f80620f && L.f(this.f80621g, deliveryTrustFactorsItem.f80621g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF271695b() {
        return this.f80616b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271702i() {
        return this.f80618d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF76018b() {
        return this.f80617c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271703j() {
        return this.f80620f;
    }

    public final int hashCode() {
        return this.f80621g.hashCode() + com.avito.android.actions_sheet.a.j(this.f80620f, com.avito.android.actions_sheet.a.h(this.f80619e, r.e(this.f80618d, H.d(Long.hashCode(this.f80616b) * 31, 31, this.f80617c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "DeliveryTrustFactorsItem(id=" + this.f80616b + ", stringId=" + this.f80617c + ", spanCount=" + this.f80618d + ", displayType=" + this.f80619e + ", viewType=" + this.f80620f + ", deliveryTrustFactors=" + this.f80621g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80616b);
        parcel.writeString(this.f80617c);
        parcel.writeInt(this.f80618d);
        parcel.writeString(this.f80619e.name());
        parcel.writeString(this.f80620f.name());
        parcel.writeParcelable(this.f80621g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeliveryTrustFactorsItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, DeliveryTrustFactors deliveryTrustFactors, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = JfifUtil.MARKER_RST0;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, deliveryTrustFactors);
    }
}
