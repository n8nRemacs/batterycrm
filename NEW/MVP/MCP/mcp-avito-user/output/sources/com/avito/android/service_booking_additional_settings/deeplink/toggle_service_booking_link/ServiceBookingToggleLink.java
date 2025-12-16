package com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingToggleLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingToggleLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingToggleLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f275158b;

    /* compiled from: ServiceBookingToggleLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingToggleLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingToggleLink createFromParcel(Parcel parcel) {
            return new ServiceBookingToggleLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingToggleLink[] newArray(int i12) {
            return new ServiceBookingToggleLink[i12];
        }
    }

    /* compiled from: ServiceBookingToggleLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b$a;", "Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b$b;", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingToggleLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b;", "<init>", "()V", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f275159b = new a();
        }

        /* compiled from: ServiceBookingToggleLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink$b;", "<init>", "()V", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink$b$b, reason: collision with other inner class name */
        public static final class C8159b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8159b f275160b = new C8159b();
        }
    }

    public ServiceBookingToggleLink(boolean z12) {
        this.f275158b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingToggleLink) && this.f275158b == ((ServiceBookingToggleLink) obj).f275158b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275158b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ServiceBookingToggleLink(enable="), this.f275158b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f275158b ? 1 : 0);
    }
}
