package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.R;
import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionButtonsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/a;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.a
    @Y61.k
    public final DaySettingsState.ActionButtonsContainer a(@Y61.k DayScheduleResult.d dVar, @Y61.k DayScheduleResult.d dVar2) {
        boolean zF2 = L.f(dVar.getStyle(), "primary");
        int i12 = R.attr.buttonSecondaryLarge;
        DaySettingsState.ActionButtonsContainer.ActionButtonInfo actionButtonInfo = new DaySettingsState.ActionButtonsContainer.ActionButtonInfo(zF2 ? R.attr.buttonPrimaryLarge : R.attr.buttonSecondaryLarge, dVar.getUri(), dVar.getTitle());
        if (L.f(dVar2.getStyle(), "primary")) {
            i12 = R.attr.buttonPrimaryLarge;
        }
        return new DaySettingsState.ActionButtonsContainer(actionButtonInfo, new DaySettingsState.ActionButtonsContainer.ActionButtonInfo(i12, dVar2.getUri(), dVar2.getTitle()));
    }
}
