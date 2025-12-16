package com.avito.android.calendar_select.utils;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: DateRange.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/calendar_select/utils/DateRange;", "Lkotlin/ranges/g;", "Ljava/time/LocalDate;", "Landroid/os/Parcelable;", "", "b", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DateRange implements g<LocalDate>, Parcelable, Iterable<LocalDate>, Z41.a {

    @k
    public static final Parcelable.Creator<DateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f113540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LocalDate f113541c;

    /* compiled from: DateRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateRange> {
        @Override // android.os.Parcelable.Creator
        public final DateRange createFromParcel(Parcel parcel) {
            return new DateRange((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DateRange[] newArray(int i12) {
            return new DateRange[i12];
        }
    }

    /* compiled from: DateRange.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/utils/DateRange$b;", "", "Ljava/time/LocalDate;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Iterator<LocalDate>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f113542b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public LocalDate f113543c;

        /* renamed from: d, reason: collision with root package name */
        public int f113544d;

        public b(@k LocalDate localDate, @k LocalDate localDate2) {
            this.f113542b = localDate2;
            this.f113543c = localDate;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f113543c.compareTo((ChronoLocalDate) this.f113542b) <= 0;
        }

        @Override // java.util.Iterator
        public final LocalDate next() {
            if (hasNext()) {
                this.f113544d++;
                LocalDate localDate = this.f113543c;
                Object obj = Xl.b.f19053a;
                this.f113543c = localDate.plusDays(1L);
                return localDate;
            }
            throw new NoSuchElementException("current value = " + this.f113543c + " but index = " + this.f113544d);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DateRange(@k LocalDate localDate, @k LocalDate localDate2) {
        this.f113540b = localDate;
        this.f113541c = localDate2;
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return this.f113540b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        return g.a.a(this, (LocalDate) comparable);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        return L.f(this.f113540b, dateRange.f113540b) && L.f(this.f113541c, dateRange.f113541c);
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return this.f113541c;
    }

    public final int hashCode() {
        return this.f113541c.hashCode() + (this.f113540b.hashCode() * 31);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return g.a.b(this);
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<LocalDate> iterator() {
        return new b(this.f113540b, this.f113541c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateRange(start=");
        sb2.append(this.f113540b);
        sb2.append(", endInclusive=");
        return c.t(sb2, this.f113541c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f113540b);
        parcel.writeSerializable(this.f113541c);
    }
}
