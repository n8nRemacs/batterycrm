package com.avito.android.hotel_booking.konveyor.select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormSelectItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState;", "Landroid/os/Parcelable;", "Error", "Normal", "Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState$Error;", "Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState$Normal;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BookingFormSelectState extends Parcelable {

    /* compiled from: BookingFormSelectItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState$Error;", "Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BookingFormSelectState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163752b;

        /* compiled from: BookingFormSelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((PrintableText) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k PrintableText printableText) {
            this.f163752b = printableText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f163752b, ((Error) obj).f163752b);
        }

        public final int hashCode() {
            return this.f163752b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(errorMessage="), this.f163752b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f163752b, i12);
        }
    }

    /* compiled from: BookingFormSelectItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState$Normal;", "Lcom/avito/android/hotel_booking/konveyor/select/BookingFormSelectState;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Normal implements BookingFormSelectState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Normal f163753b = new Normal();

        @k
        public static final Parcelable.Creator<Normal> CREATOR = new a();

        /* compiled from: BookingFormSelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Normal> {
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Normal.f163753b;
            }

            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i12) {
                return new Normal[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Normal);
        }

        public final int hashCode() {
            return 1444402443;
        }

        @k
        public final String toString() {
            return "Normal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
