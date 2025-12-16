package com.avito.android.advert.item.job_search_status;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertJobSearchStatusItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/job_search_status/AdvertJobSearchStatusItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertJobSearchStatusItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertJobSearchStatusItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77217b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77218c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f77219d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77220e;

    /* compiled from: AdvertJobSearchStatusItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertJobSearchStatusItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertJobSearchStatusItem createFromParcel(Parcel parcel) {
            return new AdvertJobSearchStatusItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertJobSearchStatusItem[] newArray(int i12) {
            return new AdvertJobSearchStatusItem[i12];
        }
    }

    public AdvertJobSearchStatusItem(@k String str, @k String str2, int i12, long j12) {
        this.f77217b = j12;
        this.f77218c = str;
        this.f77219d = str2;
        this.f77220e = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new AdvertJobSearchStatusItem(this.f77218c, this.f77219d, i12, this.f77217b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertJobSearchStatusItem)) {
            return false;
        }
        AdvertJobSearchStatusItem advertJobSearchStatusItem = (AdvertJobSearchStatusItem) obj;
        return this.f77217b == advertJobSearchStatusItem.f77217b && L.f(this.f77218c, advertJobSearchStatusItem.f77218c) && L.f(this.f77219d, advertJobSearchStatusItem.f77219d) && this.f77220e == advertJobSearchStatusItem.f77220e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF72731b() {
        return this.f77217b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75737b() {
        return this.f77220e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75738c() {
        return this.f77218c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77220e) + H.d(H.d(Long.hashCode(this.f77217b) * 31, 31, this.f77218c), 31, this.f77219d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertJobSearchStatusItem(id=");
        sb2.append(this.f77217b);
        sb2.append(", stringId=");
        sb2.append(this.f77218c);
        sb2.append(", title=");
        sb2.append(this.f77219d);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f77220e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77217b);
        parcel.writeString(this.f77218c);
        parcel.writeString(this.f77219d);
        parcel.writeInt(this.f77220e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertJobSearchStatusItem(long j12, String str, String str2, int i12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 134;
        }
        long j13 = j12;
        this((i13 & 2) != 0 ? String.valueOf(j13) : str, str2, i12, j13);
    }
}
