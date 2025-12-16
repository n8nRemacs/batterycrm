package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yt0.InterfaceC50300a;

/* compiled from: DaySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lyt0/a;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC50300a, DaySettingsInternalAction, DaySettingsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a f276918a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a f276919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d f276920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e f276921d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f276922e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.h f276923f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f276924g = C42727D.c(new a());

    /* compiled from: DaySettingsActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DeepLink> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DeepLink invoke() {
            return d.this.f276923f.a();
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a aVar, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a aVar2, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d dVar, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e eVar, @com.avito.android.service_booking_day_settings.di.d @Y61.k String str, @Y61.k com.avito.android.service_booking_utils.ux_feedback.h hVar) {
        this.f276918a = aVar;
        this.f276919b = aVar2;
        this.f276920c = dVar;
        this.f276921d = eVar;
        this.f276922e = str;
        this.f276923f = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DaySettingsInternalAction> b(InterfaceC50300a interfaceC50300a, DaySettingsState daySettingsState) {
        C43210w c43210w;
        DaySettingsState.WorkHoursInfo workHoursInfo;
        DaySettingsState.TimePeriod timePeriod;
        DaySettingsState.WorkHoursInfo workHoursInfo2;
        DaySettingsState.TimePeriod timePeriod2;
        InterfaceC50300a interfaceC50300a2 = interfaceC50300a;
        DaySettingsState daySettingsState2 = daySettingsState;
        if (interfaceC50300a2.equals(InterfaceC50300a.c.f443571a)) {
            return new C43210w(new DaySettingsInternalAction.Finish(daySettingsState2.f276969f, daySettingsState2.f276972i));
        }
        if (interfaceC50300a2 instanceof InterfaceC50300a.e) {
            return this.f276919b.a(Long.parseLong(this.f276922e));
        }
        boolean z12 = interfaceC50300a2 instanceof InterfaceC50300a.n;
        DaySettingsState.DayScheduleInfo dayScheduleInfo = daySettingsState2.f276966c;
        com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e eVar = this.f276921d;
        if (z12) {
            if (dayScheduleInfo == null) {
                return C43175k.w();
            }
            com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d dVarA = eVar.a(daySettingsState2, false);
            if (!(dVarA instanceof d.b)) {
                if (!(dVarA instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d.a aVar = (d.a) dVarA;
                return new C43210w(new DaySettingsInternalAction.UpdateBreaksDescriptions(aVar.f276763a, aVar.f276764b));
            }
            if (!((InterfaceC50300a.n) interfaceC50300a2).f443581a && dayScheduleInfo.f277004i != null) {
                return new C43210w(new DaySettingsInternalAction.OnChangeSaveDialogVisibility(true));
            }
            DaySettingsState.DayInfo dayInfo = dayScheduleInfo.f276999d;
            List<Long> listSingletonList = Collections.singletonList(Long.valueOf(dayInfo.f276996d));
            DaySettingsState.WorkHoursInfo workHoursInfo3 = dayScheduleInfo.f277001f;
            return new C43137a0(new com.avito.android.service_booking_day_settings.daysettings.mvi.a(interfaceC50300a2, daySettingsState2, null), this.f276920c.a(listSingletonList, dayInfo.f276994b, workHoursInfo3.f277031c.f277026b.J(), workHoursInfo3.f277031c.f277027c.J(), ((d.b) dVarA).f276765a, this.f276922e));
        }
        if (interfaceC50300a2 instanceof InterfaceC50300a.q) {
            c43210w = new C43210w(new DaySettingsInternalAction.OpenDeepLink(null));
        } else if (interfaceC50300a2 instanceof InterfaceC50300a.g) {
            if (dayScheduleInfo == null || (workHoursInfo2 = dayScheduleInfo.f277001f) == null || (timePeriod2 = workHoursInfo2.f277031c) == null) {
                return C43175k.w();
            }
            org.threeten.bp.e eVarL = org.threeten.bp.e.L();
            org.threeten.bp.g gVar = timePeriod2.f277026b;
            gVar.getClass();
            org.threeten.bp.f fVarG = org.threeten.bp.f.G(eVarL, gVar);
            org.threeten.bp.e eVarL2 = org.threeten.bp.e.L();
            org.threeten.bp.g gVar2 = timePeriod2.f277027c;
            gVar2.getClass();
            c43210w = new C43210w(new DaySettingsInternalAction.OnClickTimeFrom(fVarG, org.threeten.bp.f.G(eVarL2, gVar2)));
        } else if (interfaceC50300a2 instanceof InterfaceC50300a.h) {
            if (dayScheduleInfo == null || (workHoursInfo = dayScheduleInfo.f277001f) == null || (timePeriod = workHoursInfo.f277031c) == null) {
                return C43175k.w();
            }
            org.threeten.bp.e eVarL3 = org.threeten.bp.e.L();
            org.threeten.bp.g gVar3 = timePeriod.f277027c;
            gVar3.getClass();
            org.threeten.bp.f fVarG2 = org.threeten.bp.f.G(eVarL3, gVar3);
            org.threeten.bp.e eVarL4 = org.threeten.bp.e.L();
            org.threeten.bp.g gVar4 = timePeriod.f277026b;
            gVar4.getClass();
            c43210w = new C43210w(new DaySettingsInternalAction.OnClickTimeTo(fVarG2, org.threeten.bp.f.G(eVarL4, gVar4)));
        } else if (interfaceC50300a2 instanceof InterfaceC50300a.i) {
            c43210w = new C43210w(new DaySettingsInternalAction.OnDayToggleClicked(((InterfaceC50300a.i) interfaceC50300a2).f443577a));
        } else {
            if (interfaceC50300a2 instanceof InterfaceC50300a.o) {
                return new C43210w(DaySettingsInternalAction.OnTooltipButtonClicked.f276946b);
            }
            if (interfaceC50300a2 instanceof InterfaceC50300a.p) {
                return new C43210w(DaySettingsInternalAction.OnTooltipDismiss.f276947b);
            }
            if (interfaceC50300a2 instanceof InterfaceC50300a.b ? true : interfaceC50300a2 instanceof InterfaceC50300a.r) {
                return this.f276918a.a(interfaceC50300a2);
            }
            if (interfaceC50300a2 instanceof InterfaceC50300a.f) {
                return dayScheduleInfo != null ? C43175k.G(new b(this, daySettingsState2, dayScheduleInfo, null)) : C43175k.w();
            }
            if (interfaceC50300a2 instanceof InterfaceC50300a.l) {
                return C43175k.G(new c(interfaceC50300a2, this, null));
            }
            if (interfaceC50300a2 instanceof InterfaceC50300a.j) {
                c43210w = new C43210w(new DaySettingsInternalAction.OnOpenAvitoUrl());
            } else {
                if (interfaceC50300a2 instanceof InterfaceC50300a.InterfaceC12928a) {
                    return eVar.c((InterfaceC50300a.InterfaceC12928a) interfaceC50300a2, daySettingsState2);
                }
                if (interfaceC50300a2.equals(InterfaceC50300a.d.f443572a)) {
                    return (dayScheduleInfo != null ? dayScheduleInfo.f277004i : null) != null ? new C43207v(new DaySettingsInternalAction[]{new DaySettingsInternalAction.OnChangeSaveDialogVisibility(false), new DaySettingsInternalAction.OnActionButtonSaveDialogClicked(dayScheduleInfo.f277004i.f277014f, WorkHoursSaveClickEvent.SaveDialogActionType.f278372d)}) : C43175k.w();
                }
                if (interfaceC50300a2 instanceof InterfaceC50300a.k) {
                    c43210w = new C43210w(new DaySettingsInternalAction.OnRepetitionCanceled(((InterfaceC50300a.k) interfaceC50300a2).f443578a));
                } else {
                    if (!(interfaceC50300a2 instanceof InterfaceC50300a.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c43210w = new C43210w(new DaySettingsInternalAction.OnSaveDialogShown(((InterfaceC50300a.m) interfaceC50300a2).f443580a));
                }
            }
        }
        return c43210w;
    }
}
