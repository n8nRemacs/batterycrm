package com.avito.android.advert.item.consultation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConsultationAfterIceBreakersItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/ConsultationAfterIceBreakersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ConsultationAfterIceBreakersItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<ConsultationAfterIceBreakersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74645d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ConsultationAfterIceBreaker f74646e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74647f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f74648g;

    /* compiled from: ConsultationAfterIceBreakersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConsultationAfterIceBreakersItem> {
        @Override // android.os.Parcelable.Creator
        public final ConsultationAfterIceBreakersItem createFromParcel(Parcel parcel) {
            return new ConsultationAfterIceBreakersItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (ConsultationAfterIceBreaker) parcel.readParcelable(ConsultationAfterIceBreakersItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ConsultationAfterIceBreakersItem[] newArray(int i12) {
            return new ConsultationAfterIceBreakersItem[i12];
        }
    }

    public ConsultationAfterIceBreakersItem(long j12, @Y61.k String str, int i12, @Y61.l ConsultationAfterIceBreaker consultationAfterIceBreaker, boolean z12, boolean z13) {
        this.f74643b = j12;
        this.f74644c = str;
        this.f74645d = i12;
        this.f74646e = consultationAfterIceBreaker;
        this.f74647f = z12;
        this.f74648g = z13;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new ConsultationAfterIceBreakersItem(this.f74643b, this.f74644c, i12, this.f74646e, this.f74647f, this.f74648g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsultationAfterIceBreakersItem)) {
            return false;
        }
        ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = (ConsultationAfterIceBreakersItem) obj;
        return this.f74643b == consultationAfterIceBreakersItem.f74643b && kotlin.jvm.internal.L.f(this.f74644c, consultationAfterIceBreakersItem.f74644c) && this.f74645d == consultationAfterIceBreakersItem.f74645d && kotlin.jvm.internal.L.f(this.f74646e, consultationAfterIceBreakersItem.f74646e) && this.f74647f == consultationAfterIceBreakersItem.f74647f && this.f74648g == consultationAfterIceBreakersItem.f74648g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF271695b() {
        return this.f74643b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271702i() {
        return this.f74645d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324097b() {
        return this.f74644c;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f74645d, androidx.compose.foundation.H.d(Long.hashCode(this.f74643b) * 31, 31, this.f74644c), 31);
        ConsultationAfterIceBreaker consultationAfterIceBreaker = this.f74646e;
        return Boolean.hashCode(this.f74648g) + androidx.appcompat.app.r.i((iE2 + (consultationAfterIceBreaker == null ? 0 : consultationAfterIceBreaker.hashCode())) * 31, 31, this.f74647f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationAfterIceBreakersItem(id=");
        sb2.append(this.f74643b);
        sb2.append(", stringId=");
        sb2.append(this.f74644c);
        sb2.append(", spanCount=");
        sb2.append(this.f74645d);
        sb2.append(", data=");
        sb2.append(this.f74646e);
        sb2.append(", superForm=");
        sb2.append(this.f74647f);
        sb2.append(", isRedesign=");
        return androidx.appcompat.app.r.x(sb2, this.f74648g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74643b);
        parcel.writeString(this.f74644c);
        parcel.writeInt(this.f74645d);
        parcel.writeParcelable(this.f74646e, i12);
        parcel.writeInt(this.f74647f ? 1 : 0);
        parcel.writeInt(this.f74648g ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsultationAfterIceBreakersItem(long j12, String str, int i12, ConsultationAfterIceBreaker consultationAfterIceBreaker, boolean z12, boolean z13, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 39;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, consultationAfterIceBreaker, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13);
    }
}
