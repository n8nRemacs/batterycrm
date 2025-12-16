package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g2a implements Comparable, Parcelable {
    public static final Parcelable.Creator<g2a> CREATOR = new pq8(12);
    public final long X;
    public String Y;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    public g2a(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = vxg.a(calendar);
        this.a = calendarA;
        this.b = calendarA.get(2);
        this.c = calendarA.get(1);
        this.d = calendarA.getMaximum(7);
        this.o = calendarA.getActualMaximum(5);
        this.X = calendarA.getTimeInMillis();
    }

    public static g2a a(int i, int i2) {
        Calendar calendarC = vxg.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new g2a(calendarC);
    }

    public static g2a c(long j) {
        Calendar calendarC = vxg.c(null);
        calendarC.setTimeInMillis(j);
        return new g2a(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((g2a) obj).a);
    }

    public final String d() {
        if (this.Y == null) {
            long timeInMillis = this.a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = vxg.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.Y = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(g2a g2aVar) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (g2aVar.b - this.b) + ((g2aVar.c - this.c) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2a)) {
            return false;
        }
        g2a g2aVar = (g2a) obj;
        return this.b == g2aVar.b && this.c == g2aVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
