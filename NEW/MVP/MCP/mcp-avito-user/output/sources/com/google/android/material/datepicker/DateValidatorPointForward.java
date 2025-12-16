package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import j.N;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f356426b;

    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        @N
        public final DateValidatorPointForward createFromParcel(@N Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final DateValidatorPointForward[] newArray(int i12) {
            return new DateValidatorPointForward[i12];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j12, a aVar) {
        this(j12);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean U3(long j12) {
        return j12 >= this.f356426b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f356426b == ((DateValidatorPointForward) obj).f356426b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f356426b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeLong(this.f356426b);
    }

    public DateValidatorPointForward(long j12) {
        this.f356426b = j12;
    }
}
