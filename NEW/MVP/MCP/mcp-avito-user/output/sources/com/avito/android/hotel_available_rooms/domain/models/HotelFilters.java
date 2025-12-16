package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelFilters.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelFilters;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelFilters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final HotelGuestFilter f162794b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final HotelDateFilter f162795c;

    /* compiled from: HotelFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelFilters> {
        @Override // android.os.Parcelable.Creator
        public final HotelFilters createFromParcel(Parcel parcel) {
            return new HotelFilters(parcel.readInt() == 0 ? null : HotelGuestFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HotelDateFilter.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelFilters[] newArray(int i12) {
            return new HotelFilters[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelFilters() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static HotelFilters a(HotelFilters hotelFilters, HotelGuestFilter hotelGuestFilter, HotelDateFilter hotelDateFilter, int i12) {
        if ((i12 & 1) != 0) {
            hotelGuestFilter = hotelFilters.f162794b;
        }
        if ((i12 & 2) != 0) {
            hotelDateFilter = hotelFilters.f162795c;
        }
        hotelFilters.getClass();
        return new HotelFilters(hotelGuestFilter, hotelDateFilter);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelFilters)) {
            return false;
        }
        HotelFilters hotelFilters = (HotelFilters) obj;
        return L.f(this.f162794b, hotelFilters.f162794b) && L.f(this.f162795c, hotelFilters.f162795c);
    }

    public final int hashCode() {
        HotelGuestFilter hotelGuestFilter = this.f162794b;
        int iHashCode = (hotelGuestFilter == null ? 0 : hotelGuestFilter.hashCode()) * 31;
        HotelDateFilter hotelDateFilter = this.f162795c;
        return iHashCode + (hotelDateFilter != null ? hotelDateFilter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HotelFilters(guestFilter=" + this.f162794b + ", dateFilter=" + this.f162795c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        HotelGuestFilter hotelGuestFilter = this.f162794b;
        if (hotelGuestFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelGuestFilter.writeToParcel(parcel, i12);
        }
        HotelDateFilter hotelDateFilter = this.f162795c;
        if (hotelDateFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelDateFilter.writeToParcel(parcel, i12);
        }
    }

    public HotelFilters(@l HotelGuestFilter hotelGuestFilter, @l HotelDateFilter hotelDateFilter) {
        this.f162794b = hotelGuestFilter;
        this.f162795c = hotelDateFilter;
    }

    public /* synthetic */ HotelFilters(HotelGuestFilter hotelGuestFilter, HotelDateFilter hotelDateFilter, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : hotelGuestFilter, (i12 & 2) != 0 ? null : hotelDateFilter);
    }
}
