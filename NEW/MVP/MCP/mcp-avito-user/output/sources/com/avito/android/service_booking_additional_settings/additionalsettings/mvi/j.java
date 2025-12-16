package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import Os0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsToastInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingAdditionalSettingsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "LOs0/b;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<ServiceBookingAdditionalSettingsInternalAction, Os0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Os0.b b(ServiceBookingAdditionalSettingsInternalAction serviceBookingAdditionalSettingsInternalAction) {
        Os0.b c0816b;
        ServiceBookingAdditionalSettingsInternalAction serviceBookingAdditionalSettingsInternalAction2 = serviceBookingAdditionalSettingsInternalAction;
        if (serviceBookingAdditionalSettingsInternalAction2.equals(ServiceBookingAdditionalSettingsInternalAction.Finish.f274980b)) {
            return b.a.f12644a;
        }
        if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast) {
            c0816b = new b.e(((ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast) serviceBookingAdditionalSettingsInternalAction2).f275009b);
        } else if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast) {
            c0816b = new b.d(((ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast) serviceBookingAdditionalSettingsInternalAction2).f275007b);
        } else if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.OnShowSelectSheet) {
            c0816b = new b.c(((ServiceBookingAdditionalSettingsInternalAction.OnShowSelectSheet) serviceBookingAdditionalSettingsInternalAction2).f274983b);
        } else {
            if (!(serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.OnOpenDeeplink)) {
                return null;
            }
            c0816b = new b.C0816b(((ServiceBookingAdditionalSettingsInternalAction.OnOpenDeeplink) serviceBookingAdditionalSettingsInternalAction2).f274981b);
        }
        return c0816b;
    }
}
