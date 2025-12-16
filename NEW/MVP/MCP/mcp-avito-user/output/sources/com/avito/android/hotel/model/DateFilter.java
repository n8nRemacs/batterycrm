package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/hotel/model/DateFilter;", "Landroid/os/Parcelable;", "", "checkIn", "checkOut", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "getTitle", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DateFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<DateFilter> CREATOR = new a();

    @c("checkIn")
    @l
    private final String checkIn;

    @c("checkOut")
    @l
    private final String checkOut;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateFilter> {
        @Override // android.os.Parcelable.Creator
        public final DateFilter createFromParcel(Parcel parcel) {
            return new DateFilter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DateFilter[] newArray(int i12) {
            return new DateFilter[i12];
        }
    }

    public DateFilter(@l String str, @l String str2, @l String str3) {
        this.checkIn = str;
        this.checkOut = str2;
        this.title = str3;
    }

    public static DateFilter a(DateFilter dateFilter, String str, String str2) {
        String str3 = dateFilter.title;
        dateFilter.getClass();
        return new DateFilter(str, str2, str3);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCheckIn() {
        return this.checkIn;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getCheckOut() {
        return this.checkOut;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateFilter)) {
            return false;
        }
        DateFilter dateFilter = (DateFilter) obj;
        return L.f(this.checkIn, dateFilter.checkIn) && L.f(this.checkOut, dateFilter.checkOut) && L.f(this.title, dateFilter.title);
    }

    @l
    public final String getTitle() {
        return this.title;
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
        StringBuilder sb2 = new StringBuilder("DateFilter(checkIn=");
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
}
