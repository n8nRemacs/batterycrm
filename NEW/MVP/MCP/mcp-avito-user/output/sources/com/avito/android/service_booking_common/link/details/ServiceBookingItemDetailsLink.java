package com.avito.android.service_booking_common.link.details;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Ku.i;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingItemDetailsLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "bookingId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingItemDetailsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingItemDetailsLink> CREATOR = new a();

    @com.google.gson.annotations.c("bookingId")
    @k
    private final String bookingId;

    /* compiled from: ServiceBookingItemDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingItemDetailsLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItemDetailsLink createFromParcel(Parcel parcel) {
            return new ServiceBookingItemDetailsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItemDetailsLink[] newArray(int i12) {
            return new ServiceBookingItemDetailsLink[i12];
        }
    }

    /* compiled from: ServiceBookingItemDetailsLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$b;", "LKu/a;", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ServiceBookingItemDetailsLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            return new ServiceBookingItemDetailsLink(i.p(uri, "bookingId"));
        }
    }

    /* compiled from: ServiceBookingItemDetailsLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c;", "", "a", "b", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c$a;", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ServiceBookingItemDetailsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f276629b = new a();
        }

        /* compiled from: ServiceBookingItemDetailsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink$c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f276630b = new b();
        }
    }

    public ServiceBookingItemDetailsLink(@k String str) {
        this.bookingId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingItemDetailsLink) && L.f(this.bookingId, ((ServiceBookingItemDetailsLink) obj).bookingId);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    public final int hashCode() {
        return this.bookingId.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ServiceBookingItemDetailsLink(bookingId="), this.bookingId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.bookingId);
    }
}
