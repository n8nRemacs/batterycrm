package com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingAdditionalSettingsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingAdditionalSettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingAdditionalSettingsLink> CREATOR = new a();

    /* compiled from: ServiceBookingAdditionalSettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingAdditionalSettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ServiceBookingAdditionalSettingsLink();
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsLink[] newArray(int i12) {
            return new ServiceBookingAdditionalSettingsLink[i12];
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b$a;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b$b;", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingAdditionalSettingsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b;", "<init>", "()V", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f275125b = new a();
        }

        /* compiled from: ServiceBookingAdditionalSettingsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink$b;", "<init>", "()V", "_avito_service-booking-additional-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.ServiceBookingAdditionalSettingsLink$b$b, reason: collision with other inner class name */
        public static final class C8158b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8158b f275126b = new C8158b();
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
