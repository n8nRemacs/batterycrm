package com.avito.android.advert.item.icebreakers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.IceBreakers;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IceBreakersItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/IceBreakersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IceBreakersItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<IceBreakersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f76444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final IceBreakers f76445d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76446e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76447f;

    /* renamed from: g, reason: collision with root package name */
    public final int f76448g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f76449h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f76450i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f76451j;

    /* compiled from: IceBreakersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IceBreakersItem> {
        @Override // android.os.Parcelable.Creator
        public final IceBreakersItem createFromParcel(Parcel parcel) {
            return new IceBreakersItem(parcel.readLong(), parcel.readString(), (IceBreakers) parcel.readParcelable(IceBreakersItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IceBreakersItem[] newArray(int i12) {
            return new IceBreakersItem[i12];
        }
    }

    public IceBreakersItem(long j12, @Y61.k String str, @Y61.k IceBreakers iceBreakers, boolean z12, boolean z13, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, boolean z14) {
        this.f76443b = j12;
        this.f76444c = str;
        this.f76445d = iceBreakers;
        this.f76446e = z12;
        this.f76447f = z13;
        this.f76448g = i12;
        this.f76449h = serpDisplayType;
        this.f76450i = serpViewType;
        this.f76451j = z14;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new IceBreakersItem(this.f76443b, this.f76444c, this.f76445d, this.f76446e, this.f76447f, i12, this.f76449h, this.f76450i, this.f76451j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f76449h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceBreakersItem)) {
            return false;
        }
        IceBreakersItem iceBreakersItem = (IceBreakersItem) obj;
        return this.f76443b == iceBreakersItem.f76443b && L.f(this.f76444c, iceBreakersItem.f76444c) && L.f(this.f76445d, iceBreakersItem.f76445d) && this.f76446e == iceBreakersItem.f76446e && this.f76447f == iceBreakersItem.f76447f && this.f76448g == iceBreakersItem.f76448g && this.f76449h == iceBreakersItem.f76449h && this.f76450i == iceBreakersItem.f76450i && this.f76451j == iceBreakersItem.f76451j;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f76443b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF128560i() {
        return this.f76448g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f76444c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF128562k() {
        return this.f76450i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76451j) + com.avito.android.actions_sheet.a.j(this.f76450i, com.avito.android.actions_sheet.a.h(this.f76449h, r.e(this.f76448g, r.i(r.i((this.f76445d.hashCode() + H.d(Long.hashCode(this.f76443b) * 31, 31, this.f76444c)) * 31, 31, this.f76446e), 31, this.f76447f), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IceBreakersItem(id=");
        sb2.append(this.f76443b);
        sb2.append(", stringId=");
        sb2.append(this.f76444c);
        sb2.append(", icebreakers=");
        sb2.append(this.f76445d);
        sb2.append(", isRestyle=");
        sb2.append(this.f76446e);
        sb2.append(", isShowingBrandingUXFeedback=");
        sb2.append(this.f76447f);
        sb2.append(", spanCount=");
        sb2.append(this.f76448g);
        sb2.append(", displayType=");
        sb2.append(this.f76449h);
        sb2.append(", viewType=");
        sb2.append(this.f76450i);
        sb2.append(", isServicesRedesign=");
        return r.x(sb2, this.f76451j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f76443b);
        parcel.writeString(this.f76444c);
        parcel.writeParcelable(this.f76445d, i12);
        parcel.writeInt(this.f76446e ? 1 : 0);
        parcel.writeInt(this.f76447f ? 1 : 0);
        parcel.writeInt(this.f76448g);
        parcel.writeString(this.f76449h.name());
        parcel.writeString(this.f76450i.name());
        parcel.writeInt(this.f76451j ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IceBreakersItem(long j12, String str, IceBreakers iceBreakers, boolean z12, boolean z13, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, boolean z14, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 76;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, iceBreakers, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? false : z13, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 256) != 0 ? false : z14);
    }
}
