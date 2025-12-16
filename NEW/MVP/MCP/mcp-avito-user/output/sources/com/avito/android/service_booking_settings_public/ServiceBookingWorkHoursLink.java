package com.avito.android.service_booking_settings_public;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingWorkHoursLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", MessageBody.SystemMessageBody.Platform.FLOW, "", "isScheduleRequired", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Z", "g", "()Z", "b", "c", "_avito_service-booking-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingWorkHoursLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingWorkHoursLink> CREATOR = new a();

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.FLOW)
    @l
    private final String flow;

    @com.google.gson.annotations.c("isScheduleRequired")
    private final boolean isScheduleRequired;

    /* compiled from: ServiceBookingWorkHoursLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingWorkHoursLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursLink createFromParcel(Parcel parcel) {
            return new ServiceBookingWorkHoursLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursLink[] newArray(int i12) {
            return new ServiceBookingWorkHoursLink[i12];
        }
    }

    /* compiled from: ServiceBookingWorkHoursLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$b;", "LKu/a;", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink;", "<init>", "()V", "_avito_service-booking-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ServiceBookingWorkHoursLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            return new ServiceBookingWorkHoursLink(uri.getQueryParameter(MessageBody.SystemMessageBody.Platform.FLOW), Boolean.parseBoolean(uri.getQueryParameter("isScheduleRequired")));
        }
    }

    /* compiled from: ServiceBookingWorkHoursLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c;", "LJu/c$b;", "a", "b", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c$a;", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c$b;", "_avito_service-booking-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: ServiceBookingWorkHoursLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c$a;", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c;", "_avito_service-booking-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final BookingSettingsStatus f278152b;

            public a(@l BookingSettingsStatus bookingSettingsStatus) {
                this.f278152b = bookingSettingsStatus;
            }
        }

        /* compiled from: ServiceBookingWorkHoursLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c$b;", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink$c;", "_avito_service-booking-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f278153b;

            public b(@l String str) {
                this.f278153b = str;
            }
        }
    }

    public ServiceBookingWorkHoursLink(@l String str, boolean z12) {
        this.flow = str;
        this.isScheduleRequired = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsScheduleRequired() {
        return this.isScheduleRequired;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.flow);
        parcel.writeInt(this.isScheduleRequired ? 1 : 0);
    }
}
