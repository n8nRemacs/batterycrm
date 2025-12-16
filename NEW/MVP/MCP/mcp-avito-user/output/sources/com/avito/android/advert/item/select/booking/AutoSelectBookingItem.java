package com.avito.android.advert.item.select.booking;

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
import com.avito.android.remote.model.auto_select.AutoSelectBooking;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBookingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/booking/AutoSelectBookingItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectBookingItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AutoSelectBookingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79365c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f79366d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f79367e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79368f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AutoSelectBooking f79369g;

    /* compiled from: AutoSelectBookingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectBookingItem createFromParcel(Parcel parcel) {
            return new AutoSelectBookingItem(parcel.readLong(), parcel.readInt(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), (AutoSelectBooking) parcel.readParcelable(AutoSelectBookingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectBookingItem[] newArray(int i12) {
            return new AutoSelectBookingItem[i12];
        }
    }

    public AutoSelectBookingItem(long j12, int i12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, @k AutoSelectBooking autoSelectBooking) {
        this.f79364b = j12;
        this.f79365c = i12;
        this.f79366d = str;
        this.f79367e = serpViewType;
        this.f79368f = serpDisplayType;
        this.f79369g = autoSelectBooking;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AutoSelectBookingItem(this.f79364b, i12, this.f79366d, this.f79367e, this.f79368f, this.f79369g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79368f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectBookingItem)) {
            return false;
        }
        AutoSelectBookingItem autoSelectBookingItem = (AutoSelectBookingItem) obj;
        return this.f79364b == autoSelectBookingItem.f79364b && this.f79365c == autoSelectBookingItem.f79365c && L.f(this.f79366d, autoSelectBookingItem.f79366d) && this.f79367e == autoSelectBookingItem.f79367e && this.f79368f == autoSelectBookingItem.f79368f && L.f(this.f79369g, autoSelectBookingItem.f79369g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF269849b() {
        return this.f79364b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270704j() {
        return this.f79365c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF393799b() {
        return this.f79366d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270703i() {
        return this.f79367e;
    }

    public final int hashCode() {
        return this.f79369g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79368f, com.avito.android.actions_sheet.a.j(this.f79367e, H.d(r.e(this.f79365c, Long.hashCode(this.f79364b) * 31, 31), 31, this.f79366d), 31), 31);
    }

    @k
    public final String toString() {
        return "AutoSelectBookingItem(id=" + this.f79364b + ", spanCount=" + this.f79365c + ", stringId=" + this.f79366d + ", viewType=" + this.f79367e + ", displayType=" + this.f79368f + ", autoSelectBooking=" + this.f79369g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79364b);
        parcel.writeInt(this.f79365c);
        parcel.writeString(this.f79366d);
        parcel.writeString(this.f79367e.name());
        parcel.writeString(this.f79368f.name());
        parcel.writeParcelable(this.f79369g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoSelectBookingItem(long j12, int i12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, AutoSelectBooking autoSelectBooking, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 146;
        } else {
            j13 = j12;
        }
        this(j13, i12, (i13 & 4) != 0 ? String.valueOf(j13) : str, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, autoSelectBooking);
    }
}
