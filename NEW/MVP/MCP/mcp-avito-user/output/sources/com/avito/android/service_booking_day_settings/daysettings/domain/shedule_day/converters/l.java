package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DayScheduleOccupationInfoConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/l;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/k;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {
    @Inject
    public l() {
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.k
    @Y61.k
    public final DaySettingsState.OccupiedInfo a(@Y61.k DayScheduleResult dayScheduleResult) {
        String text;
        String button;
        DayScheduleResult.f toast = dayScheduleResult.getToast();
        PrintableText printableTextC = (toast == null || (button = toast.getButton()) == null) ? com.avito.android.printable_text.b.c(R.string.occupied_button_string, new Serializable[0]) : com.avito.android.printable_text.b.f(button);
        DayScheduleResult.f toast2 = dayScheduleResult.getToast();
        DaySettingsState.ToastMessage toastMessage = new DaySettingsState.ToastMessage(printableTextC, (toast2 == null || (text = toast2.getText()) == null) ? com.avito.android.printable_text.b.c(R.string.occupied_toast_string, new Serializable[0]) : com.avito.android.printable_text.b.f(text));
        String errOccupied = dayScheduleResult.getErrOccupied();
        List<DayScheduleResult.e> listK = dayScheduleResult.k();
        ArrayList arrayList = new ArrayList(C42745f0.q(listK, 10));
        for (DayScheduleResult.e eVar : listK) {
            arrayList.add(new DaySettingsState.TimePeriod(org.threeten.bp.g.z(eVar.getFrom()), org.threeten.bp.g.z(eVar.getTo())));
        }
        return new DaySettingsState.OccupiedInfo(toastMessage, errOccupied, arrayList);
    }
}
