package com.avito.android.vas_planning_calendar.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarBookingRestriction.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/model/CalendarBookingRestriction;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CalendarBookingRestriction implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarBookingRestriction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f322669b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f322670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f322671d;

    /* compiled from: CalendarBookingRestriction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalendarBookingRestriction> {
        @Override // android.os.Parcelable.Creator
        public final CalendarBookingRestriction createFromParcel(Parcel parcel) {
            return new CalendarBookingRestriction((Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarBookingRestriction[] newArray(int i12) {
            return new CalendarBookingRestriction[i12];
        }
    }

    public CalendarBookingRestriction(@k Date date, boolean z12, int i12) {
        this.f322669b = date;
        this.f322670c = z12;
        this.f322671d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarBookingRestriction)) {
            return false;
        }
        CalendarBookingRestriction calendarBookingRestriction = (CalendarBookingRestriction) obj;
        return L.f(this.f322669b, calendarBookingRestriction.f322669b) && this.f322670c == calendarBookingRestriction.f322670c && this.f322671d == calendarBookingRestriction.f322671d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f322671d) + r.i(this.f322669b.hashCode() * 31, 31, this.f322670c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarBookingRestriction(date=");
        sb2.append(this.f322669b);
        sb2.append(", available=");
        sb2.append(this.f322670c);
        sb2.append(", minimalDuration=");
        return r.t(sb2, this.f322671d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f322669b);
        parcel.writeInt(this.f322670c ? 1 : 0);
        parcel.writeInt(this.f322671d);
    }
}
