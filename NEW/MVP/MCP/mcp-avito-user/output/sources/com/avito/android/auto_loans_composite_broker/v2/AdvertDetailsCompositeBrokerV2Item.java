package com.avito.android.auto_loans_composite_broker.v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsCompositeBrokerV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/AdvertDetailsCompositeBrokerV2Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvertDetailsCompositeBrokerV2Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsCompositeBrokerV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f95609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95610c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CompositeBrokerCalculatorV2 f95611d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f95612e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95613f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f95614g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f95615h;

    /* compiled from: AdvertDetailsCompositeBrokerV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsCompositeBrokerV2Item> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCompositeBrokerV2Item createFromParcel(Parcel parcel) {
            return new AdvertDetailsCompositeBrokerV2Item(parcel.readLong(), parcel.readString(), (CompositeBrokerCalculatorV2) parcel.readParcelable(AdvertDetailsCompositeBrokerV2Item.class.getClassLoader()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCompositeBrokerV2Item[] newArray(int i12) {
            return new AdvertDetailsCompositeBrokerV2Item[i12];
        }
    }

    public AdvertDetailsCompositeBrokerV2Item(long j12, @Y61.k String str, @Y61.k CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2, @Y61.l String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f95609b = j12;
        this.f95610c = str;
        this.f95611d = compositeBrokerCalculatorV2;
        this.f95612e = str2;
        this.f95613f = i12;
        this.f95614g = serpDisplayType;
        this.f95615h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsCompositeBrokerV2Item(this.f95609b, this.f95610c, this.f95611d, this.f95612e, i12, this.f95614g, this.f95615h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f95614g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsCompositeBrokerV2Item)) {
            return false;
        }
        AdvertDetailsCompositeBrokerV2Item advertDetailsCompositeBrokerV2Item = (AdvertDetailsCompositeBrokerV2Item) obj;
        return this.f95609b == advertDetailsCompositeBrokerV2Item.f95609b && L.f(this.f95610c, advertDetailsCompositeBrokerV2Item.f95610c) && L.f(this.f95611d, advertDetailsCompositeBrokerV2Item.f95611d) && L.f(this.f95612e, advertDetailsCompositeBrokerV2Item.f95612e) && this.f95613f == advertDetailsCompositeBrokerV2Item.f95613f && this.f95614g == advertDetailsCompositeBrokerV2Item.f95614g && this.f95615h == advertDetailsCompositeBrokerV2Item.f95615h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85532b() {
        return this.f95609b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85534d() {
        return this.f95613f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154734b() {
        return this.f95610c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85540j() {
        return this.f95615h;
    }

    public final int hashCode() {
        int iHashCode = (this.f95611d.hashCode() + H.d(Long.hashCode(this.f95609b) * 31, 31, this.f95610c)) * 31;
        String str = this.f95612e;
        return this.f95615h.hashCode() + com.avito.android.actions_sheet.a.h(this.f95614g, androidx.appcompat.app.r.e(this.f95613f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsCompositeBrokerV2Item(id=");
        sb2.append(this.f95609b);
        sb2.append(", stringId=");
        sb2.append(this.f95610c);
        sb2.append(", calculator=");
        sb2.append(this.f95611d);
        sb2.append(", advertPrice=");
        sb2.append(this.f95612e);
        sb2.append(", spanCount=");
        sb2.append(this.f95613f);
        sb2.append(", displayType=");
        sb2.append(this.f95614g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f95615h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f95609b);
        parcel.writeString(this.f95610c);
        parcel.writeParcelable(this.f95611d, i12);
        parcel.writeString(this.f95612e);
        parcel.writeInt(this.f95613f);
        parcel.writeString(this.f95614g.name());
        parcel.writeString(this.f95615h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsCompositeBrokerV2Item(long j12, String str, CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 178;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, compositeBrokerCalculatorV2, str2, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
