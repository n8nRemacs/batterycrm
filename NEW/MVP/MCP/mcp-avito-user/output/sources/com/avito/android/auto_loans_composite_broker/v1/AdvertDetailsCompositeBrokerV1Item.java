package com.avito.android.auto_loans_composite_broker.v1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculator;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsCompositeBrokerV1Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/AdvertDetailsCompositeBrokerV1Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvertDetailsCompositeBrokerV1Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsCompositeBrokerV1Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f95530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95531c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CompositeBrokerCalculator f95532d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f95533e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95534f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f95535g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f95536h;

    /* compiled from: AdvertDetailsCompositeBrokerV1Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsCompositeBrokerV1Item> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCompositeBrokerV1Item createFromParcel(Parcel parcel) {
            return new AdvertDetailsCompositeBrokerV1Item(parcel.readLong(), parcel.readString(), (CompositeBrokerCalculator) parcel.readParcelable(AdvertDetailsCompositeBrokerV1Item.class.getClassLoader()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCompositeBrokerV1Item[] newArray(int i12) {
            return new AdvertDetailsCompositeBrokerV1Item[i12];
        }
    }

    public AdvertDetailsCompositeBrokerV1Item(long j12, @Y61.k String str, @Y61.k CompositeBrokerCalculator compositeBrokerCalculator, @Y61.l String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f95530b = j12;
        this.f95531c = str;
        this.f95532d = compositeBrokerCalculator;
        this.f95533e = str2;
        this.f95534f = i12;
        this.f95535g = serpDisplayType;
        this.f95536h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsCompositeBrokerV1Item(this.f95530b, this.f95531c, this.f95532d, this.f95533e, i12, this.f95535g, this.f95536h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f95535g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsCompositeBrokerV1Item)) {
            return false;
        }
        AdvertDetailsCompositeBrokerV1Item advertDetailsCompositeBrokerV1Item = (AdvertDetailsCompositeBrokerV1Item) obj;
        return this.f95530b == advertDetailsCompositeBrokerV1Item.f95530b && L.f(this.f95531c, advertDetailsCompositeBrokerV1Item.f95531c) && L.f(this.f95532d, advertDetailsCompositeBrokerV1Item.f95532d) && L.f(this.f95533e, advertDetailsCompositeBrokerV1Item.f95533e) && this.f95534f == advertDetailsCompositeBrokerV1Item.f95534f && this.f95535g == advertDetailsCompositeBrokerV1Item.f95535g && this.f95536h == advertDetailsCompositeBrokerV1Item.f95536h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78464b() {
        return this.f95530b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78465c() {
        return this.f95534f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f95531c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78467e() {
        return this.f95536h;
    }

    public final int hashCode() {
        int iHashCode = (this.f95532d.hashCode() + H.d(Long.hashCode(this.f95530b) * 31, 31, this.f95531c)) * 31;
        String str = this.f95533e;
        return this.f95536h.hashCode() + com.avito.android.actions_sheet.a.h(this.f95535g, androidx.appcompat.app.r.e(this.f95534f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsCompositeBrokerV1Item(id=");
        sb2.append(this.f95530b);
        sb2.append(", stringId=");
        sb2.append(this.f95531c);
        sb2.append(", calculator=");
        sb2.append(this.f95532d);
        sb2.append(", advertPrice=");
        sb2.append(this.f95533e);
        sb2.append(", spanCount=");
        sb2.append(this.f95534f);
        sb2.append(", displayType=");
        sb2.append(this.f95535g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f95536h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f95530b);
        parcel.writeString(this.f95531c);
        parcel.writeParcelable(this.f95532d, i12);
        parcel.writeString(this.f95533e);
        parcel.writeInt(this.f95534f);
        parcel.writeString(this.f95535g.name());
        parcel.writeString(this.f95536h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsCompositeBrokerV1Item(long j12, String str, CompositeBrokerCalculator compositeBrokerCalculator, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 178;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, compositeBrokerCalculator, str2, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
