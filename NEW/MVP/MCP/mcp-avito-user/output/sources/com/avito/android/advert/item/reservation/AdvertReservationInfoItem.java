package com.avito.android.advert.item.reservation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertReservationInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/reservation/AdvertReservationInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertReservationInfoItem implements BlockItem, l1 {

    @k
    public static final Parcelable.Creator<AdvertReservationInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78582c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f78583d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78584e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f78585f;

    /* compiled from: AdvertReservationInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertReservationInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertReservationInfoItem createFromParcel(Parcel parcel) {
            return new AdvertReservationInfoItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertReservationInfoItem[] newArray(int i12) {
            return new AdvertReservationInfoItem[i12];
        }
    }

    public AdvertReservationInfoItem(long j12, @k String str, @k String str2, int i12, @k SerpViewType serpViewType) {
        this.f78581b = j12;
        this.f78582c = str;
        this.f78583d = str2;
        this.f78584e = i12;
        this.f78585f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new AdvertReservationInfoItem(this.f78581b, this.f78582c, this.f78583d, i12, this.f78585f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertReservationInfoItem)) {
            return false;
        }
        AdvertReservationInfoItem advertReservationInfoItem = (AdvertReservationInfoItem) obj;
        return this.f78581b == advertReservationInfoItem.f78581b && L.f(this.f78582c, advertReservationInfoItem.f78582c) && L.f(this.f78583d, advertReservationInfoItem.f78583d) && this.f78584e == advertReservationInfoItem.f78584e && this.f78585f == advertReservationInfoItem.f78585f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77403b() {
        return this.f78581b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77406e() {
        return this.f78584e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77859c() {
        return this.f78582c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77408g() {
        return this.f78585f;
    }

    public final int hashCode() {
        return this.f78585f.hashCode() + r.e(this.f78584e, H.d(H.d(Long.hashCode(this.f78581b) * 31, 31, this.f78582c), 31, this.f78583d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertReservationInfoItem(id=");
        sb2.append(this.f78581b);
        sb2.append(", stringId=");
        sb2.append(this.f78582c);
        sb2.append(", info=");
        sb2.append(this.f78583d);
        sb2.append(", spanCount=");
        sb2.append(this.f78584e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78585f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78581b);
        parcel.writeString(this.f78582c);
        parcel.writeString(this.f78583d);
        parcel.writeInt(this.f78584e);
        parcel.writeString(this.f78585f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertReservationInfoItem(long j12, String str, String str2, int i12, SerpViewType serpViewType, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 74;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, i12, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
