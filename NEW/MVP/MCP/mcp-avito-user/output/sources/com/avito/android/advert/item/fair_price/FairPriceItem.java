package com.avito.android.advert.item.fair_price;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FairPriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fair_price/FairPriceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FairPriceItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<FairPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75367b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75369d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f75370e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f75371f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AdvertFairPriceModel f75372g;

    /* compiled from: FairPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FairPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final FairPriceItem createFromParcel(Parcel parcel) {
            return new FairPriceItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), AdvertFairPriceModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FairPriceItem[] newArray(int i12) {
            return new FairPriceItem[i12];
        }
    }

    public FairPriceItem(long j12, @k String str, int i12, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, @k AdvertFairPriceModel advertFairPriceModel) {
        this.f75367b = j12;
        this.f75368c = str;
        this.f75369d = i12;
        this.f75370e = serpViewType;
        this.f75371f = serpDisplayType;
        this.f75372g = advertFairPriceModel;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new FairPriceItem(this.f75367b, this.f75368c, i12, this.f75370e, this.f75371f, this.f75372g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75371f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FairPriceItem)) {
            return false;
        }
        FairPriceItem fairPriceItem = (FairPriceItem) obj;
        return this.f75367b == fairPriceItem.f75367b && L.f(this.f75368c, fairPriceItem.f75368c) && this.f75369d == fairPriceItem.f75369d && this.f75370e == fairPriceItem.f75370e && this.f75371f == fairPriceItem.f75371f && L.f(this.f75372g, fairPriceItem.f75372g);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f75367b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF128560i() {
        return this.f75369d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    public final String getStringId() {
        return this.f75368c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF128562k() {
        return this.f75370e;
    }

    public final int hashCode() {
        return this.f75372g.hashCode() + com.avito.android.actions_sheet.a.h(this.f75371f, com.avito.android.actions_sheet.a.j(this.f75370e, r.e(this.f75369d, H.d(Long.hashCode(this.f75367b) * 31, 31, this.f75368c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "FairPriceItem(id=" + this.f75367b + ", stringId=" + this.f75368c + ", spanCount=" + this.f75369d + ", viewType=" + this.f75370e + ", displayType=" + this.f75371f + ", model=" + this.f75372g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75367b);
        parcel.writeString(this.f75368c);
        parcel.writeInt(this.f75369d);
        parcel.writeString(this.f75370e.name());
        parcel.writeString(this.f75371f.name());
        this.f75372g.writeToParcel(parcel, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FairPriceItem(long j12, String str, int i12, SerpViewType serpViewType, SerpDisplayType serpDisplayType, AdvertFairPriceModel advertFairPriceModel, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 158;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, advertFairPriceModel);
    }
}
