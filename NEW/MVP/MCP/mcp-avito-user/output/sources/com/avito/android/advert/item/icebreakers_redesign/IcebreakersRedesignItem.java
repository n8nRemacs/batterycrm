package com.avito.android.advert.item.icebreakers_redesign;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.IceBreakers;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pb.InterfaceC47047c;

/* compiled from: IceBreakersRedesignItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/icebreakers_redesign/IcebreakersRedesignItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lpb/c;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IcebreakersRedesignItem implements BlockItem, InterfaceC47047c, l1 {

    @Y61.k
    public static final Parcelable.Creator<IcebreakersRedesignItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f76517c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final IceBreakers f76518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76519e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f76520f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f76521g;

    /* compiled from: IceBreakersRedesignItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IcebreakersRedesignItem> {
        @Override // android.os.Parcelable.Creator
        public final IcebreakersRedesignItem createFromParcel(Parcel parcel) {
            return new IcebreakersRedesignItem(parcel.readLong(), parcel.readString(), (IceBreakers) parcel.readParcelable(IcebreakersRedesignItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final IcebreakersRedesignItem[] newArray(int i12) {
            return new IcebreakersRedesignItem[i12];
        }
    }

    public IcebreakersRedesignItem(long j12, @Y61.k String str, @Y61.k IceBreakers iceBreakers, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f76516b = j12;
        this.f76517c = str;
        this.f76518d = iceBreakers;
        this.f76519e = i12;
        this.f76520f = serpDisplayType;
        this.f76521g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new IcebreakersRedesignItem(this.f76516b, this.f76517c, this.f76518d, i12, this.f76520f, this.f76521g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IcebreakersRedesignItem)) {
            return false;
        }
        IcebreakersRedesignItem icebreakersRedesignItem = (IcebreakersRedesignItem) obj;
        return this.f76516b == icebreakersRedesignItem.f76516b && L.f(this.f76517c, icebreakersRedesignItem.f76517c) && L.f(this.f76518d, icebreakersRedesignItem.f76518d) && this.f76519e == icebreakersRedesignItem.f76519e && this.f76520f == icebreakersRedesignItem.f76520f && this.f76521g == icebreakersRedesignItem.f76521g;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final IceBreakers getF76518d() {
        return this.f76518d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF269849b() {
        return this.f76516b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270704j() {
        return this.f76519e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF393799b() {
        return this.f76517c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270703i() {
        return this.f76521g;
    }

    public final int hashCode() {
        return this.f76521g.hashCode() + com.avito.android.actions_sheet.a.h(this.f76520f, r.e(this.f76519e, (this.f76518d.hashCode() + H.d(Long.hashCode(this.f76516b) * 31, 31, this.f76517c)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcebreakersRedesignItem(id=");
        sb2.append(this.f76516b);
        sb2.append(", stringId=");
        sb2.append(this.f76517c);
        sb2.append(", icebreakers=");
        sb2.append(this.f76518d);
        sb2.append(", spanCount=");
        sb2.append(this.f76519e);
        sb2.append(", displayType=");
        sb2.append(this.f76520f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f76521g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f76516b);
        parcel.writeString(this.f76517c);
        parcel.writeParcelable(this.f76518d, i12);
        parcel.writeInt(this.f76519e);
        parcel.writeString(this.f76520f.name());
        parcel.writeString(this.f76521g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IcebreakersRedesignItem(long j12, String str, IceBreakers iceBreakers, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = JfifUtil.MARKER_RST7;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, iceBreakers, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
