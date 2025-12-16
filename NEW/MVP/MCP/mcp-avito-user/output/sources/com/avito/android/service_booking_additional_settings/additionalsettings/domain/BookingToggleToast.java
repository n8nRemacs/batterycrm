package com.avito.android.service_booking_additional_settings.additionalsettings.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingToggleToast.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/BookingToggleToast;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BookingToggleToast implements Parcelable {

    @k
    public static final Parcelable.Creator<BookingToggleToast> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f274834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f274835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f274836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f274837e;

    /* compiled from: BookingToggleToast.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingToggleToast> {
        @Override // android.os.Parcelable.Creator
        public final BookingToggleToast createFromParcel(Parcel parcel) {
            return new BookingToggleToast(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BookingToggleToast[] newArray(int i12) {
            return new BookingToggleToast[i12];
        }
    }

    public BookingToggleToast(int i12, @l String str, @k String str2, boolean z12) {
        this.f274834b = str;
        this.f274835c = str2;
        this.f274836d = i12;
        this.f274837e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingToggleToast)) {
            return false;
        }
        BookingToggleToast bookingToggleToast = (BookingToggleToast) obj;
        return L.f(this.f274834b, bookingToggleToast.f274834b) && L.f(this.f274835c, bookingToggleToast.f274835c) && this.f274836d == bookingToggleToast.f274836d && this.f274837e == bookingToggleToast.f274837e;
    }

    public final int hashCode() {
        String str = this.f274834b;
        return Boolean.hashCode(this.f274837e) + r.e(this.f274836d, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f274835c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingToggleToast(button=");
        sb2.append(this.f274834b);
        sb2.append(", text=");
        sb2.append(this.f274835c);
        sb2.append(", typeDuration=");
        sb2.append(this.f274836d);
        sb2.append(", hideOnButtonClick=");
        return r.x(sb2, this.f274837e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f274834b);
        parcel.writeString(this.f274835c);
        parcel.writeInt(this.f274836d);
        parcel.writeInt(this.f274837e ? 1 : 0);
    }
}
