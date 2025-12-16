package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes6.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Calendar f356491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f356493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f356494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f356495f;

    /* renamed from: g, reason: collision with root package name */
    public final long f356496g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public String f356497h;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @N
        public final Month createFromParcel(@N Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final Month[] newArray(int i12) {
            return new Month[i12];
        }
    }

    public Month(@N Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = E.c(calendar);
        this.f356491b = calendarC;
        this.f356492c = calendarC.get(2);
        this.f356493d = calendarC.get(1);
        this.f356494e = calendarC.getMaximum(7);
        this.f356495f = calendarC.getActualMaximum(5);
        this.f356496g = calendarC.getTimeInMillis();
    }

    @N
    public static Month b(int i12, int i13) {
        Calendar calendarG = E.g(null);
        calendarG.set(1, i12);
        calendarG.set(2, i13);
        return new Month(calendarG);
    }

    @N
    public static Month c(long j12) {
        Calendar calendarG = E.g(null);
        calendarG.setTimeInMillis(j12);
        return new Month(calendarG);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@N Month month) {
        return this.f356491b.compareTo(month.f356491b);
    }

    @N
    public final String d() {
        if (this.f356497h == null) {
            this.f356497h = E.b("yMMMM", Locale.getDefault()).format(new Date(this.f356491b.getTimeInMillis()));
        }
        return this.f356497h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(@N Month month) {
        if (!(this.f356491b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f356492c - this.f356492c) + ((month.f356493d - this.f356493d) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f356492c == month.f356492c && this.f356493d == month.f356493d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f356492c), Integer.valueOf(this.f356493d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeInt(this.f356493d);
        parcel.writeInt(this.f356492c);
    }
}
