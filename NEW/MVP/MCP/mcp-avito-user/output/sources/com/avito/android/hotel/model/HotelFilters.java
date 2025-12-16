package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRooms.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel/model/HotelFilters;", "Landroid/os/Parcelable;", "Lcom/avito/android/hotel/model/HotelGuestFilter;", "guestFilter", "Lcom/avito/android/hotel/model/HotelDateFilter;", "dateFilter", "<init>", "(Lcom/avito/android/hotel/model/HotelGuestFilter;Lcom/avito/android/hotel/model/HotelDateFilter;)V", "Lcom/avito/android/hotel/model/HotelGuestFilter;", "getGuestFilter", "()Lcom/avito/android/hotel/model/HotelGuestFilter;", "Lcom/avito/android/hotel/model/HotelDateFilter;", "getDateFilter", "()Lcom/avito/android/hotel/model/HotelDateFilter;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelFilters> CREATOR = new a();

    @c("dateFilter")
    @l
    private final HotelDateFilter dateFilter;

    @c("guestFilter")
    @l
    private final HotelGuestFilter guestFilter;

    /* compiled from: HotelAvailableRooms.kt */
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
        return L.f(this.guestFilter, hotelFilters.guestFilter) && L.f(this.dateFilter, hotelFilters.dateFilter);
    }

    public final int hashCode() {
        HotelGuestFilter hotelGuestFilter = this.guestFilter;
        int iHashCode = (hotelGuestFilter == null ? 0 : hotelGuestFilter.hashCode()) * 31;
        HotelDateFilter hotelDateFilter = this.dateFilter;
        return iHashCode + (hotelDateFilter != null ? hotelDateFilter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HotelFilters(guestFilter=" + this.guestFilter + ", dateFilter=" + this.dateFilter + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        HotelGuestFilter hotelGuestFilter = this.guestFilter;
        if (hotelGuestFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelGuestFilter.writeToParcel(parcel, i12);
        }
        HotelDateFilter hotelDateFilter = this.dateFilter;
        if (hotelDateFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelDateFilter.writeToParcel(parcel, i12);
        }
    }

    public HotelFilters(@l HotelGuestFilter hotelGuestFilter, @l HotelDateFilter hotelDateFilter) {
        this.guestFilter = hotelGuestFilter;
        this.dateFilter = hotelDateFilter;
    }

    public /* synthetic */ HotelFilters(HotelGuestFilter hotelGuestFilter, HotelDateFilter hotelDateFilter, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : hotelGuestFilter, (i12 & 2) != 0 ? null : hotelDateFilter);
    }
}
