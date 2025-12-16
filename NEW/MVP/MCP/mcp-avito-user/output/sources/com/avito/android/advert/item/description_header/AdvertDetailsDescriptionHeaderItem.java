package com.avito.android.advert.item.description_header;

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
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDescriptionHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/description_header/AdvertDetailsDescriptionHeaderItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDescriptionHeaderItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDescriptionHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75147b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75148c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f75149d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f75150e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f75151f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f75152g;

    /* renamed from: h, reason: collision with root package name */
    public final int f75153h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public SerpDisplayType f75154i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f75155j;

    /* compiled from: AdvertDetailsDescriptionHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDescriptionHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDescriptionHeaderItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDescriptionHeaderItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDescriptionHeaderItem[] newArray(int i12) {
            return new AdvertDetailsDescriptionHeaderItem[i12];
        }
    }

    public AdvertDetailsDescriptionHeaderItem(long j12, @k String str, @k String str2, @l Integer num, @InterfaceC42150f @l Integer num2, @f0 @l Integer num3, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f75147b = j12;
        this.f75148c = str;
        this.f75149d = str2;
        this.f75150e = num;
        this.f75151f = num2;
        this.f75152g = num3;
        this.f75153h = i12;
        this.f75154i = serpDisplayType;
        this.f75155j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDescriptionHeaderItem(this.f75147b, this.f75148c, this.f75149d, this.f75150e, this.f75151f, this.f75152g, i12, this.f75154i, this.f75155j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75154i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDescriptionHeaderItem)) {
            return false;
        }
        AdvertDetailsDescriptionHeaderItem advertDetailsDescriptionHeaderItem = (AdvertDetailsDescriptionHeaderItem) obj;
        return this.f75147b == advertDetailsDescriptionHeaderItem.f75147b && L.f(this.f75148c, advertDetailsDescriptionHeaderItem.f75148c) && L.f(this.f75149d, advertDetailsDescriptionHeaderItem.f75149d) && L.f(this.f75150e, advertDetailsDescriptionHeaderItem.f75150e) && L.f(this.f75151f, advertDetailsDescriptionHeaderItem.f75151f) && L.f(this.f75152g, advertDetailsDescriptionHeaderItem.f75152g) && this.f75153h == advertDetailsDescriptionHeaderItem.f75153h && this.f75154i == advertDetailsDescriptionHeaderItem.f75154i && this.f75155j == advertDetailsDescriptionHeaderItem.f75155j;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f75147b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF128560i() {
        return this.f75153h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    public final String getStringId() {
        return this.f75148c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF128562k() {
        return this.f75155j;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f75147b) * 31, 31, this.f75148c), 31, this.f75149d);
        Integer num = this.f75150e;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f75151f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f75152g;
        return this.f75155j.hashCode() + com.avito.android.actions_sheet.a.h(this.f75154i, r.e(this.f75153h, (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDescriptionHeaderItem(id=");
        sb2.append(this.f75147b);
        sb2.append(", stringId=");
        sb2.append(this.f75148c);
        sb2.append(", title=");
        sb2.append(this.f75149d);
        sb2.append(", marginTopDp=");
        sb2.append(this.f75150e);
        sb2.append(", styleAttrId=");
        sb2.append(this.f75151f);
        sb2.append(", styleAttrIdRes=");
        sb2.append(this.f75152g);
        sb2.append(", spanCount=");
        sb2.append(this.f75153h);
        sb2.append(", displayType=");
        sb2.append(this.f75154i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75155j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75147b);
        parcel.writeString(this.f75148c);
        parcel.writeString(this.f75149d);
        Integer num = this.f75150e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f75151f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f75152g;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeInt(this.f75153h);
        parcel.writeString(this.f75154i.name());
        parcel.writeString(this.f75155j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDescriptionHeaderItem(long j12, String str, String str2, Integer num, Integer num2, Integer num3, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 102;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2, (i13 & 32) != 0 ? null : num3, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
