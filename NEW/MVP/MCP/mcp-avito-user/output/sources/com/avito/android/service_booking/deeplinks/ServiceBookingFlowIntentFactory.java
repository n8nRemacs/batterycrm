package com.avito.android.service_booking.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking.BookingFlowSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingFlowIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory;", "", "a", "Result", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingFlowIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f274177a = a.f274182a;

    /* compiled from: ServiceBookingFlowIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result;", "Landroid/os/Parcelable;", "Cancel", "Close", "Error", "Redirect", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Cancel;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Close;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Error;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Redirect;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: ServiceBookingFlowIntentFactory.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Cancel;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Cancel implements Result {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Cancel f274178b = new Cancel();

            @k
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            /* compiled from: ServiceBookingFlowIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Cancel> {
                @Override // android.os.Parcelable.Creator
                public final Cancel createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Cancel.f274178b;
                }

                @Override // android.os.Parcelable.Creator
                public final Cancel[] newArray(int i12) {
                    return new Cancel[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ServiceBookingFlowIntentFactory.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Close;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Close implements Result {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Close f274179b = new Close();

            @k
            public static final Parcelable.Creator<Close> CREATOR = new a();

            /* compiled from: ServiceBookingFlowIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Close> {
                @Override // android.os.Parcelable.Creator
                public final Close createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Close.f274179b;
                }

                @Override // android.os.Parcelable.Creator
                public final Close[] newArray(int i12) {
                    return new Close[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ServiceBookingFlowIntentFactory.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Error;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements Result {

            @k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f274180b;

            /* compiled from: ServiceBookingFlowIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error(@k String str) {
                this.f274180b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && L.f(this.f274180b, ((Error) obj).f274180b);
            }

            public final int hashCode() {
                return this.f274180b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f274180b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f274180b);
            }
        }

        /* compiled from: ServiceBookingFlowIntentFactory.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result$Redirect;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$Result;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Redirect implements Result {

            @k
            public static final Parcelable.Creator<Redirect> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f274181b;

            /* compiled from: ServiceBookingFlowIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Redirect> {
                @Override // android.os.Parcelable.Creator
                public final Redirect createFromParcel(Parcel parcel) {
                    return new Redirect((DeepLink) parcel.readParcelable(Redirect.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Redirect[] newArray(int i12) {
                    return new Redirect[i12];
                }
            }

            public Redirect(@k DeepLink deepLink) {
                this.f274181b = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Redirect) && L.f(this.f274181b, ((Redirect) obj).f274181b);
            }

            public final int hashCode() {
                return this.f274181b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(uri="), this.f274181b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f274181b, i12);
            }
        }
    }

    /* compiled from: ServiceBookingFlowIntentFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory$a;", "", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f274182a = new a();

        @l
        public static Result a(@k Intent intent) {
            return (Result) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("result.service_booking", Result.class) : intent.getParcelableExtra("result.service_booking"));
        }
    }

    @k
    Intent a(@k String str, @k String str2, @l String str3, @l String str4);

    @k
    Intent b(@k String str);

    @k
    Intent c(@l String str, @k String str2, @k String str3, @l String str4, @l BookingFlowSource bookingFlowSource);
}
