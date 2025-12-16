package com.avito.android.advert.item.salary_range;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertSalaryRangeItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/salary_range/AdvertSalaryRangeItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertSalaryRangeItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertSalaryRangeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f79259b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79260c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f79261d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f79262e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79263f;

    /* renamed from: g, reason: collision with root package name */
    public final long f79264g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f79265h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Long f79266i;

    /* compiled from: AdvertSalaryRangeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertSalaryRangeItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertSalaryRangeItem createFromParcel(Parcel parcel) {
            return new AdvertSalaryRangeItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertSalaryRangeItem[] newArray(int i12) {
            return new AdvertSalaryRangeItem[i12];
        }
    }

    public AdvertSalaryRangeItem(int i12, @k String str, @k String str2, @k String str3, long j12, long j13, @l Long l12, @l Long l13) {
        this.f79259b = i12;
        this.f79260c = str;
        this.f79261d = str2;
        this.f79262e = str3;
        this.f79263f = j12;
        this.f79264g = j13;
        this.f79265h = l12;
        this.f79266i = l13;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertSalaryRangeItem(i12, this.f79260c, this.f79261d, this.f79262e, this.f79263f, this.f79264g, this.f79265h, this.f79266i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertSalaryRangeItem)) {
            return false;
        }
        AdvertSalaryRangeItem advertSalaryRangeItem = (AdvertSalaryRangeItem) obj;
        return this.f79259b == advertSalaryRangeItem.f79259b && L.f(this.f79260c, advertSalaryRangeItem.f79260c) && L.f(this.f79261d, advertSalaryRangeItem.f79261d) && L.f(this.f79262e, advertSalaryRangeItem.f79262e) && this.f79263f == advertSalaryRangeItem.f79263f && this.f79264g == advertSalaryRangeItem.f79264g && L.f(this.f79265h, advertSalaryRangeItem.f79265h) && L.f(this.f79266i, advertSalaryRangeItem.f79266i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78716h() {
        return this.f79259b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78718j() {
        return this.f79260c;
    }

    public final int hashCode() {
        int iG2 = r.g(r.g(H.d(H.d(H.d(Integer.hashCode(this.f79259b) * 31, 31, this.f79260c), 31, this.f79261d), 31, this.f79262e), 31, this.f79263f), 31, this.f79264g);
        Long l12 = this.f79265h;
        int iHashCode = (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f79266i;
        return iHashCode + (l13 != null ? l13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertSalaryRangeItem(spanCount=");
        sb2.append(this.f79259b);
        sb2.append(", stringId=");
        sb2.append(this.f79260c);
        sb2.append(", title=");
        sb2.append(this.f79261d);
        sb2.append(", description=");
        sb2.append(this.f79262e);
        sb2.append(", rangeFrom=");
        sb2.append(this.f79263f);
        sb2.append(", rangeTo=");
        sb2.append(this.f79264g);
        sb2.append(", salaryFrom=");
        sb2.append(this.f79265h);
        sb2.append(", salaryTo=");
        return m.m(sb2, this.f79266i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f79259b);
        parcel.writeString(this.f79260c);
        parcel.writeString(this.f79261d);
        parcel.writeString(this.f79262e);
        parcel.writeLong(this.f79263f);
        parcel.writeLong(this.f79264g);
        Long l12 = this.f79265h;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f79266i;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
    }

    public /* synthetic */ AdvertSalaryRangeItem(int i12, String str, String str2, String str3, long j12, long j13, Long l12, Long l13, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? "AdvertSalaryRangeItem" : str, str2, str3, j12, j13, l12, l13);
    }
}
