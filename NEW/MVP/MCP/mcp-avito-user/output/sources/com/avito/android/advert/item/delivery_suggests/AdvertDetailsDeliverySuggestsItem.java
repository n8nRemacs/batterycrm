package com.avito.android.advert.item.delivery_suggests;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDeliverySuggestsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/AdvertDetailsDeliverySuggestsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDeliverySuggestsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsDeliverySuggestsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75092b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f75093c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeliverySuggests f75094d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75095e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75096f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75097g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public String f75098h;

    /* compiled from: AdvertDetailsDeliverySuggestsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDeliverySuggestsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDeliverySuggestsItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDeliverySuggestsItem(parcel.readLong(), parcel.readString(), (DeliverySuggests) parcel.readParcelable(AdvertDetailsDeliverySuggestsItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDeliverySuggestsItem[] newArray(int i12) {
            return new AdvertDetailsDeliverySuggestsItem[i12];
        }
    }

    public AdvertDetailsDeliverySuggestsItem(long j12, @Y61.k String str, @Y61.k DeliverySuggests deliverySuggests, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l String str2) {
        this.f75092b = j12;
        this.f75093c = str;
        this.f75094d = deliverySuggests;
        this.f75095e = i12;
        this.f75096f = serpDisplayType;
        this.f75097g = serpViewType;
        this.f75098h = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDeliverySuggestsItem(this.f75092b, this.f75093c, this.f75094d, i12, this.f75096f, this.f75097g, this.f75098h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75096f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDeliverySuggestsItem)) {
            return false;
        }
        AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem = (AdvertDetailsDeliverySuggestsItem) obj;
        return this.f75092b == advertDetailsDeliverySuggestsItem.f75092b && L.f(this.f75093c, advertDetailsDeliverySuggestsItem.f75093c) && L.f(this.f75094d, advertDetailsDeliverySuggestsItem.f75094d) && this.f75095e == advertDetailsDeliverySuggestsItem.f75095e && this.f75096f == advertDetailsDeliverySuggestsItem.f75096f && this.f75097g == advertDetailsDeliverySuggestsItem.f75097g && L.f(this.f75098h, advertDetailsDeliverySuggestsItem.f75098h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75535g() {
        return this.f75092b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75537i() {
        return this.f75095e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75536h() {
        return this.f75093c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75539k() {
        return this.f75097g;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f75097g, com.avito.android.actions_sheet.a.h(this.f75096f, r.e(this.f75095e, (this.f75094d.hashCode() + H.d(Long.hashCode(this.f75092b) * 31, 31, this.f75093c)) * 31, 31), 31), 31);
        String str = this.f75098h;
        return iJ2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDeliverySuggestsItem(id=");
        sb2.append(this.f75092b);
        sb2.append(", stringId=");
        sb2.append(this.f75093c);
        sb2.append(", deliverySuggests=");
        sb2.append(this.f75094d);
        sb2.append(", spanCount=");
        sb2.append(this.f75095e);
        sb2.append(", displayType=");
        sb2.append(this.f75096f);
        sb2.append(", viewType=");
        sb2.append(this.f75097g);
        sb2.append(", selectedItemId=");
        return C22026a.c(sb2, this.f75098h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f75092b);
        parcel.writeString(this.f75093c);
        parcel.writeParcelable(this.f75094d, i12);
        parcel.writeInt(this.f75095e);
        parcel.writeString(this.f75096f.name());
        parcel.writeString(this.f75097g.name());
        parcel.writeString(this.f75098h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDeliverySuggestsItem(long j12, String str, DeliverySuggests deliverySuggests, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 188;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, deliverySuggests, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 64) != 0 ? null : str2);
    }
}
