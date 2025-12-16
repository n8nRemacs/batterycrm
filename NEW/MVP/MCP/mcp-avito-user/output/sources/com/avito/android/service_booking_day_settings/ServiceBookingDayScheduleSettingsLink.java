package com.avito.android.service_booking_day_settings;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", SelectionType.TYPE_DAY, "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$SbSettingsOpenFlowType;", "openFlow", "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$SbSettingsOpenFlowType;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$SbSettingsOpenFlowType;", "g", "()Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$SbSettingsOpenFlowType;", "b", "SbSettingsOpenFlowType", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingDayScheduleSettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingDayScheduleSettingsLink> CREATOR = new a();

    @c(SelectionType.TYPE_DAY)
    @k
    private final String day;

    @c("openFlow")
    @l
    private final SbSettingsOpenFlowType openFlow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$SbSettingsOpenFlowType;", "", "(Ljava/lang/String;I)V", "CALENDAR", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SbSettingsOpenFlowType {

        @c(FormattedDateDisplayingType.TYPE_CALENDAR)
        public static final SbSettingsOpenFlowType CALENDAR;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SbSettingsOpenFlowType[] f276687b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276688c;

        static {
            SbSettingsOpenFlowType sbSettingsOpenFlowType = new SbSettingsOpenFlowType("CALENDAR", 0);
            CALENDAR = sbSettingsOpenFlowType;
            SbSettingsOpenFlowType[] sbSettingsOpenFlowTypeArr = {sbSettingsOpenFlowType};
            f276687b = sbSettingsOpenFlowTypeArr;
            f276688c = kotlin.enums.c.a(sbSettingsOpenFlowTypeArr);
        }

        private SbSettingsOpenFlowType(String str, int i12) {
        }

        public static SbSettingsOpenFlowType valueOf(String str) {
            return (SbSettingsOpenFlowType) Enum.valueOf(SbSettingsOpenFlowType.class, str);
        }

        public static SbSettingsOpenFlowType[] values() {
            return (SbSettingsOpenFlowType[]) f276687b.clone();
        }
    }

    /* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingDayScheduleSettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingDayScheduleSettingsLink createFromParcel(Parcel parcel) {
            return new ServiceBookingDayScheduleSettingsLink(parcel.readString(), parcel.readInt() == 0 ? null : SbSettingsOpenFlowType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingDayScheduleSettingsLink[] newArray(int i12) {
            return new ServiceBookingDayScheduleSettingsLink[i12];
        }
    }

    /* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b$a;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b$b;", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b;", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final BookingSettingsStatus f276689b;

            public a(@l BookingSettingsStatus bookingSettingsStatus) {
                this.f276689b = bookingSettingsStatus;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f276689b == ((a) obj).f276689b;
            }

            public final int hashCode() {
                BookingSettingsStatus bookingSettingsStatus = this.f276689b;
                if (bookingSettingsStatus == null) {
                    return 0;
                }
                return bookingSettingsStatus.hashCode();
            }

            @k
            public final String toString() {
                return "Cancelled(status=" + this.f276689b + ')';
            }
        }

        /* compiled from: ServiceBookingDayScheduleSettingsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink$b;", "<init>", "()V", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink$b$b, reason: collision with other inner class name */
        public static final class C8222b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8222b f276690b = new C8222b();
        }
    }

    public ServiceBookingDayScheduleSettingsLink(@k String str, @l SbSettingsOpenFlowType sbSettingsOpenFlowType) {
        this.day = str;
        this.openFlow = sbSettingsOpenFlowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final SbSettingsOpenFlowType getOpenFlow() {
        return this.openFlow;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.day);
        SbSettingsOpenFlowType sbSettingsOpenFlowType = this.openFlow;
        if (sbSettingsOpenFlowType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sbSettingsOpenFlowType.name());
        }
    }
}
