package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingEnterDataDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/InputConstraint;", "Landroid/os/Parcelable;", "Pattern", "Lcom/avito/android/hotel_booking/InputConstraint$Pattern;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface InputConstraint extends Parcelable {

    /* compiled from: HotelBookingEnterDataDeeplink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/hotel_booking/InputConstraint$Pattern;", "Lcom/avito/android/hotel_booking/InputConstraint;", "", "pattern", "errorText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pattern implements InputConstraint {

        @k
        public static final Parcelable.Creator<Pattern> CREATOR = new a();

        @com.google.gson.annotations.c("errorText")
        @k
        private final String errorText;

        @com.google.gson.annotations.c("pattern")
        @k
        private final String pattern;

        /* compiled from: HotelBookingEnterDataDeeplink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Pattern> {
            @Override // android.os.Parcelable.Creator
            public final Pattern createFromParcel(Parcel parcel) {
                return new Pattern(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Pattern[] newArray(int i12) {
                return new Pattern[i12];
            }
        }

        public Pattern(@k String str, @k String str2) {
            this.pattern = str;
            this.errorText = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getErrorText() {
            return this.errorText;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pattern)) {
                return false;
            }
            Pattern pattern = (Pattern) obj;
            return L.f(this.pattern, pattern.pattern) && L.f(this.errorText, pattern.errorText);
        }

        public final int hashCode() {
            return this.errorText.hashCode() + (this.pattern.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Pattern(pattern=");
            sb2.append(this.pattern);
            sb2.append(", errorText=");
            return C22026a.c(sb2, this.errorText, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.pattern);
            parcel.writeString(this.errorText);
        }
    }
}
