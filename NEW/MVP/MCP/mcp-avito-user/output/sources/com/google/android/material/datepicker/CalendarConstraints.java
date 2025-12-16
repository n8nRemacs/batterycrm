package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Month f356407b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final Month f356408c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final DateValidator f356409d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Month f356410e;

    /* renamed from: f, reason: collision with root package name */
    public final int f356411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f356412g;

    /* renamed from: h, reason: collision with root package name */
    public final int f356413h;

    public interface DateValidator extends Parcelable {
        boolean U3(long j12);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @N
        public final CalendarConstraints createFromParcel(@N Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final CalendarConstraints[] newArray(int i12) {
            return new CalendarConstraints[i12];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f356414f = E.a(Month.b(1900, 0).f356496g);

        /* renamed from: g, reason: collision with root package name */
        public static final long f356415g = E.a(Month.b(2100, 11).f356496g);

        /* renamed from: c, reason: collision with root package name */
        public Long f356418c;

        /* renamed from: d, reason: collision with root package name */
        public int f356419d;

        /* renamed from: a, reason: collision with root package name */
        public long f356416a = f356414f;

        /* renamed from: b, reason: collision with root package name */
        public long f356417b = f356415g;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f356420e = new DateValidatorPointForward(Long.MIN_VALUE);

        @N
        public final CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f356420e);
            Month monthC = Month.c(this.f356416a);
            Month monthC2 = Month.c(this.f356417b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l12 = this.f356418c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l12 == null ? null : Month.c(l12.longValue()), this.f356419d, null);
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i12, a aVar) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f356407b = month;
        this.f356408c = month2;
        this.f356410e = month3;
        this.f356411f = i12;
        this.f356409d = dateValidator;
        if (month3 != null && month.f356491b.compareTo(month3.f356491b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f356491b.compareTo(month2.f356491b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i12 < 0 || i12 > E.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f356413h = month.e(month2) + 1;
        this.f356412g = (month2.f356493d - month.f356493d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f356407b.equals(calendarConstraints.f356407b) && this.f356408c.equals(calendarConstraints.f356408c) && Objects.equals(this.f356410e, calendarConstraints.f356410e) && this.f356411f == calendarConstraints.f356411f && this.f356409d.equals(calendarConstraints.f356409d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f356407b, this.f356408c, this.f356410e, Integer.valueOf(this.f356411f), this.f356409d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f356407b, 0);
        parcel.writeParcelable(this.f356408c, 0);
        parcel.writeParcelable(this.f356410e, 0);
        parcel.writeParcelable(this.f356409d, 0);
        parcel.writeInt(this.f356411f);
    }
}
