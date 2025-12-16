package com.avito.android.service_booking_calendar.days_producer;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;
import org.threeten.bp.e;

/* compiled from: DateRange.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/days_producer/DateRange;", "Lkotlin/ranges/g;", "Lorg/threeten/bp/e;", "Landroid/os/Parcelable;", "", "b", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DateRange implements g<e>, Parcelable, Iterable<e>, Z41.a {

    @k
    public static final Parcelable.Creator<DateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f275477b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f275478c;

    /* compiled from: DateRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateRange> {
        @Override // android.os.Parcelable.Creator
        public final DateRange createFromParcel(Parcel parcel) {
            return new DateRange((e) parcel.readSerializable(), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DateRange[] newArray(int i12) {
            return new DateRange[i12];
        }
    }

    /* compiled from: DateRange.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/days_producer/DateRange$b;", "", "Lorg/threeten/bp/e;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Iterator<e>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f275479b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final e f275480c;

        /* renamed from: d, reason: collision with root package name */
        public int f275481d;

        public b(@k e eVar, @k e eVar2) {
            this.f275479b = eVar2;
            this.f275480c = eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f275480c.compareTo(this.f275479b) <= 0;
        }

        @Override // java.util.Iterator
        public final e next() {
            boolean zHasNext = hasNext();
            e eVar = this.f275480c;
            if (zHasNext) {
                this.f275481d++;
                return eVar.S(1L);
            }
            throw new NoSuchElementException("current value = " + eVar + " but index = " + this.f275481d);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DateRange(@k e eVar, @k e eVar2) {
        this.f275477b = eVar;
        this.f275478c = eVar2;
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return this.f275477b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        return g.a.a(this, (e) comparable);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        return L.f(this.f275477b, dateRange.f275477b) && L.f(this.f275478c, dateRange.f275478c);
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return this.f275478c;
    }

    public final int hashCode() {
        return this.f275478c.hashCode() + (this.f275477b.hashCode() * 31);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return g.a.b(this);
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<e> iterator() {
        return new b(this.f275477b, this.f275478c);
    }

    @k
    public final String toString() {
        return "DateRange(start=" + this.f275477b + ", endInclusive=" + this.f275478c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f275477b);
        parcel.writeSerializable(this.f275478c);
    }
}
