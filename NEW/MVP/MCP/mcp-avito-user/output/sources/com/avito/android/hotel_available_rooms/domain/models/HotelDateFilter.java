package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelFilters.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelDateFilter;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelDateFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelDateFilter> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f162791b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f162792c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f162793d;

    /* compiled from: HotelFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelDateFilter> {
        @Override // android.os.Parcelable.Creator
        public final HotelDateFilter createFromParcel(Parcel parcel) {
            return new HotelDateFilter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelDateFilter[] newArray(int i12) {
            return new HotelDateFilter[i12];
        }
    }

    public HotelDateFilter() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelDateFilter)) {
            return false;
        }
        HotelDateFilter hotelDateFilter = (HotelDateFilter) obj;
        return L.f(this.f162791b, hotelDateFilter.f162791b) && L.f(this.f162792c, hotelDateFilter.f162792c) && L.f(this.f162793d, hotelDateFilter.f162793d);
    }

    public final int hashCode() {
        String str = this.f162791b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f162792c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f162793d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelDateFilter(checkIn=");
        sb2.append(this.f162791b);
        sb2.append(", checkOut=");
        sb2.append(this.f162792c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f162793d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162791b);
        parcel.writeString(this.f162792c);
        parcel.writeString(this.f162793d);
    }

    public HotelDateFilter(@l String str, @l String str2, @l String str3) {
        this.f162791b = str;
        this.f162792c = str2;
        this.f162793d = str3;
    }

    public /* synthetic */ HotelDateFilter(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
