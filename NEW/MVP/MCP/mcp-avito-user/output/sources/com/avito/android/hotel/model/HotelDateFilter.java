package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRooms.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/hotel/model/HotelDateFilter;", "Landroid/os/Parcelable;", "", "checkIn", "checkOut", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCheckIn", "()Ljava/lang/String;", "getCheckOut", "getTitle", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelDateFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelDateFilter> CREATOR = new a();

    @c("checkIn")
    @l
    private final String checkIn;

    @c("checkOut")
    @l
    private final String checkOut;

    @c("title")
    @l
    private final String title;

    /* compiled from: HotelAvailableRooms.kt */
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
        return L.f(this.checkIn, hotelDateFilter.checkIn) && L.f(this.checkOut, hotelDateFilter.checkOut) && L.f(this.title, hotelDateFilter.title);
    }

    public final int hashCode() {
        String str = this.checkIn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkOut;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelDateFilter(checkIn=");
        sb2.append(this.checkIn);
        sb2.append(", checkOut=");
        sb2.append(this.checkOut);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.checkIn);
        parcel.writeString(this.checkOut);
        parcel.writeString(this.title);
    }

    public HotelDateFilter(@l String str, @l String str2, @l String str3) {
        this.checkIn = str;
        this.checkOut = str2;
        this.title = str3;
    }

    public /* synthetic */ HotelDateFilter(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
