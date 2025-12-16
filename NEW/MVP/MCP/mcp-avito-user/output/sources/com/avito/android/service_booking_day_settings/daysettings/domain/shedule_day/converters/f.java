package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.service_booking_day_settings.daysettings.adapter.BreakDescription;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect;
import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BreaksInfoConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/f;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/e;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f276806a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.breaks.a f276807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e f276808c;

    @Inject
    public f(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.breaks.a aVar, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e eVar) {
        this.f276806a = interfaceC35863o4;
        this.f276807b = aVar;
        this.f276808c = eVar;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.e
    @Y61.l
    public final DaySettingsState.BreaksInfo a(@Y61.k DayScheduleResult dayScheduleResult) {
        List listSingletonList;
        if (dayScheduleResult.getTitleBreak() == null || dayScheduleResult.getAddBreak() == null || dayScheduleResult.getMaxBreaksCount() == null || dayScheduleResult.getBreakErrorTexts() == null || !L.f(dayScheduleResult.getShowBreaks(), Boolean.TRUE)) {
            return null;
        }
        List<DayScheduleResult.e> listK = dayScheduleResult.k();
        ArrayList arrayList = new ArrayList(C42745f0.q(listK, 10));
        for (DayScheduleResult.e eVar : listK) {
            arrayList.add(new DaySettingsState.TimePeriod(org.threeten.bp.g.z(eVar.getFrom()), org.threeten.bp.g.z(eVar.getTo())));
        }
        List<DayScheduleResult.a> listF = dayScheduleResult.f();
        if (listF == null || listF.isEmpty()) {
            listSingletonList = Collections.singletonList(this.f276807b.a());
        } else {
            List<DayScheduleResult.a> listF2 = dayScheduleResult.f();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listF2, 10));
            for (DayScheduleResult.a aVar : listF2) {
                UniversalColor warningColor = dayScheduleResult.getWarningColor();
                String errOccupied = dayScheduleResult.getErrOccupied();
                String strA = this.f276806a.a();
                TimeSelect timeSelect = new TimeSelect(org.threeten.bp.g.z(aVar.getFrom()), false);
                TimeSelect timeSelect2 = new TimeSelect(org.threeten.bp.g.z(aVar.getTo()), false);
                PrintableText printableTextB = this.f276808c.b(org.threeten.bp.g.z(aVar.getFrom()), org.threeten.bp.g.z(aVar.getTo()), arrayList, errOccupied);
                arrayList2.add(new SettingsBreakItem(strA, timeSelect, timeSelect2, true, false, printableTextB != null ? new BreakDescription(printableTextB, warningColor, true) : null, 16, null));
            }
            listSingletonList = arrayList2;
        }
        return new DaySettingsState.BreaksInfo(dayScheduleResult.getTitleBreak(), dayScheduleResult.getAddBreak(), listSingletonList, dayScheduleResult.getMaxBreaksCount().intValue(), new DaySettingsState.BreakErrorInfo(dayScheduleResult.getBreakErrorTexts().getWorkTimeError(), dayScheduleResult.getBreakErrorTexts().getIntersectionError(), dayScheduleResult.getBreakErrorTexts().getIncompleteError(), dayScheduleResult.getBreakErrorTexts().getStartEndBreakErr(), dayScheduleResult.getBreakErrorTexts().getMinBreakErr(), dayScheduleResult.getBreakErrorTexts().getBreakEqualWorkErr()), dayScheduleResult.getErrorColor(), dayScheduleResult.getWarningColor(), arrayList, listSingletonList, null, 512, null);
    }
}
