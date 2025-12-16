package com.avito.android.str_seller_orders_calendar.strorderscalendar.models.api;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/models/api/DateRange;", "Landroid/os/Parcelable;", "", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DateRange implements Parcelable {

    @k
    public static final Parcelable.Creator<DateRange> CREATOR = new a();

    @c("end")
    @l
    private final String end;

    @c("start")
    @l
    private final String start;

    /* compiled from: StrOrdersCalendarResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateRange> {
        @Override // android.os.Parcelable.Creator
        public final DateRange createFromParcel(Parcel parcel) {
            return new DateRange(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DateRange[] newArray(int i12) {
            return new DateRange[i12];
        }
    }

    public DateRange(@l String str, @l String str2) {
        this.start = str;
        this.end = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        return L.f(this.start, dateRange.start) && L.f(this.end, dateRange.end);
    }

    public final int hashCode() {
        String str = this.start;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateRange(start=");
        sb2.append(this.start);
        sb2.append(", end=");
        return C22026a.c(sb2, this.end, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.start);
        parcel.writeString(this.end);
    }
}
