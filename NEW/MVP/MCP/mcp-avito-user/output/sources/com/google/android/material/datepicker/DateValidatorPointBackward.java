package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import j.N;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f356425b;

    public class a implements Parcelable.Creator<DateValidatorPointBackward> {
        @Override // android.os.Parcelable.Creator
        @N
        public final DateValidatorPointBackward createFromParcel(@N Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final DateValidatorPointBackward[] newArray(int i12) {
            return new DateValidatorPointBackward[i12];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j12, a aVar) {
        this(j12);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean U3(long j12) {
        return j12 <= this.f356425b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f356425b == ((DateValidatorPointBackward) obj).f356425b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f356425b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeLong(this.f356425b);
    }

    public DateValidatorPointBackward(long j12) {
        this.f356425b = j12;
    }
}
