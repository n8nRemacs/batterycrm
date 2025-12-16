package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import Ts0.C15403a;
import Us0.C15564a;
import Vs0.C15714a;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.post_toggle.ToggleResult;
import com.avito.android.service_booking_additional_settings.generated.api.api_2_flexible_schedule_set_tech_break.FlexibleScheduleSetTechBreakResponseV3SuccessToast;
import com.avito.android.service_booking_additional_settings.generated.api.api_2_flexible_schedule_set_timegap.FlexibleScheduleSetTimeGapResponseV3SuccessToast;
import com.avito.android.service_booking_additional_settings.generated.api.api_2_flexible_schedule_set_toggle.FlexibleScheduleSetToggleResponseV3SuccessToast;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSettingsToastConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/y;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/x;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y implements x {
    @Inject
    public y() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x
    @Y61.k
    public final BookingToggleToast a(@Y61.k C15714a c15714a) {
        FlexibleScheduleSetToggleResponseV3SuccessToast toast = c15714a.getToast();
        String buttonText = toast.getButtonText();
        String text = toast.getText();
        FlexibleScheduleSetToggleResponseV3SuccessToast.Type type = toast.getType();
        FlexibleScheduleSetToggleResponseV3SuccessToast.Type type2 = FlexibleScheduleSetToggleResponseV3SuccessToast.Type.HideOnButtonClick;
        return new BookingToggleToast(type == type2 ? -1 : 1500, buttonText, text, toast.getType() == type2);
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x
    @Y61.k
    public final BookingToggleToast b(@Y61.k ToggleResult toggleResult) {
        ToggleResult.Toast toast = toggleResult.getToast();
        String button = toast.getButton();
        String text = toast.getText();
        ToggleResult.Toast.ToastType type = toast.getType();
        ToggleResult.Toast.ToastType toastType = ToggleResult.Toast.ToastType.HIDE_ON_CLICK;
        return new BookingToggleToast(type == toastType ? -1 : 1500, button, text, toast.getType() == toastType);
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x
    @Y61.k
    public final BookingToggleToast c(@Y61.k C15403a c15403a) {
        FlexibleScheduleSetTechBreakResponseV3SuccessToast toast = c15403a.getToast();
        String text = toast.getText();
        FlexibleScheduleSetTechBreakResponseV3SuccessToast.Type type = toast.getType();
        FlexibleScheduleSetTechBreakResponseV3SuccessToast.Type type2 = FlexibleScheduleSetTechBreakResponseV3SuccessToast.Type.PlainToast;
        return new BookingToggleToast(type == type2 ? 1500 : 2750, null, text, toast.getType() != type2);
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x
    @Y61.k
    public final BookingToggleToast d(@Y61.k C15564a c15564a) {
        FlexibleScheduleSetTimeGapResponseV3SuccessToast toast = c15564a.getToast();
        String text = toast.getText();
        FlexibleScheduleSetTimeGapResponseV3SuccessToast.Type type = toast.getType();
        FlexibleScheduleSetTimeGapResponseV3SuccessToast.Type type2 = FlexibleScheduleSetTimeGapResponseV3SuccessToast.Type.PlainToast;
        return new BookingToggleToast(type == type2 ? 1500 : 2750, null, text, toast.getType() != type2);
    }
}
