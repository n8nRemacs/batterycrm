package com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "ShowErrorToast", "ShowSuccessToast", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction$ShowErrorToast;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction$ShowSuccessToast;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingAdditionalSettingsToastInternalAction extends ServiceBookingAdditionalSettingsInternalAction {

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction$ShowErrorToast;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ServiceBookingAdditionalSettingsToastInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f275007b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f275008c;

        public ShowErrorToast(@k PrintableText printableText, @l a aVar) {
            this.f275007b = printableText;
            this.f275008c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f275007b, showErrorToast.f275007b) && L.f(this.f275008c, showErrorToast.f275008c);
        }

        public final int hashCode() {
            int iHashCode = this.f275007b.hashCode() * 31;
            a aVar = this.f275008c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ShowErrorToast(message=" + this.f275007b + ", event=" + this.f275008c + ')';
        }

        public /* synthetic */ ShowErrorToast(PrintableText printableText, a aVar, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? null : aVar);
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction$ShowSuccessToast;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuccessToast implements ServiceBookingAdditionalSettingsToastInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BookingToggleToast f275009b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f275010c;

        public ShowSuccessToast(@k BookingToggleToast bookingToggleToast, @l a aVar) {
            this.f275009b = bookingToggleToast;
            this.f275010c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSuccessToast)) {
                return false;
            }
            ShowSuccessToast showSuccessToast = (ShowSuccessToast) obj;
            return L.f(this.f275009b, showSuccessToast.f275009b) && L.f(this.f275010c, showSuccessToast.f275010c);
        }

        public final int hashCode() {
            int iHashCode = this.f275009b.hashCode() * 31;
            a aVar = this.f275010c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ShowSuccessToast(toast=" + this.f275009b + ", event=" + this.f275010c + ')';
        }

        public /* synthetic */ ShowSuccessToast(BookingToggleToast bookingToggleToast, a aVar, int i12, C42822w c42822w) {
            this(bookingToggleToast, (i12 & 2) != 0 ? null : aVar);
        }
    }
}
