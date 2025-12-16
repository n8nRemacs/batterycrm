package com.avito.android.service_booking_settings.work_hours.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.Option;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ServiceBookingWorkHoursActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/a;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "LUt0/h;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<com.avito.android.service_booking_settings.work_hours.mvi.entity.a, ServiceBookingWorkHoursInternalAction, Ut0.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.domain.a f278049a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ServiceBookingWorkHoursArgument f278050b;

    @Inject
    public c(@Y61.k com.avito.android.service_booking_settings.domain.a aVar, @Y61.k ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument) {
        this.f278049a = aVar;
        this.f278050b = serviceBookingWorkHoursArgument;
    }

    public static Arguments c(Ut0.j jVar, String str, boolean z12) {
        List listV = C42745f0.V(jVar.b());
        List<ParcelableEntity<String>> listA = jVar.a();
        String f16763g = jVar.getF16763g();
        if (f16763g == null) {
            f16763g = "";
        }
        return new Arguments(false, str, null, listA, listV, f16763g, null, false, false, false, false, z12, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -2104507, 255, null);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ServiceBookingWorkHoursInternalAction> b(com.avito.android.service_booking_settings.work_hours.mvi.entity.a aVar, Ut0.h hVar) {
        C43210w c43210w;
        SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem;
        Option option;
        com.avito.android.service_booking_settings.work_hours.mvi.entity.a aVar2 = aVar;
        Ut0.h hVar2 = hVar;
        boolean zEquals = aVar2.equals(a.f.f278102a);
        com.avito.android.service_booking_settings.domain.a aVar3 = this.f278049a;
        if (zEquals) {
            return aVar3.a(this.f278050b.f277895c);
        }
        boolean z12 = aVar2 instanceof a.g;
        Ut0.g gVar = hVar2.f16750l;
        if (z12) {
            if (((a.g) aVar2).f278103a || gVar == null) {
                Ut0.k kVar = hVar2.f16747i;
                String str = (kVar == null || (option = kVar.f16766j) == null) ? null : option.f278053b;
                SchedulePeriod schedulePeriod = hVar2.f16748j;
                return new X(new C43137a0(new a(aVar2, hVar2, null), aVar3.b(hVar2.f16744f, str, (schedulePeriod == null || (scheduleOptionsItem = schedulePeriod.f278059j) == null) ? null : scheduleOptionsItem.f278062b, hVar2.f16745g)), new b(3, null));
            }
            c43210w = new C43210w(new ServiceBookingWorkHoursInternalAction.OnChangeSaveDialogVisibility(true));
        } else {
            if (aVar2.equals(a.b.f278095a)) {
                return gVar != null ? new C43207v(new ServiceBookingWorkHoursInternalAction[]{new ServiceBookingWorkHoursInternalAction.OnChangeSaveDialogVisibility(false), new ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked(gVar.f16734e, WorkHoursSaveClickEvent.SaveDialogActionType.f278372d)}) : C43175k.w();
            }
            if (aVar2 instanceof a.k) {
                return new C43210w(new ServiceBookingWorkHoursInternalAction.OnTimeRestrictionClicked(c(((a.k) aVar2).f278107a, "WORK_HOURS_TIME_GAP_SELECT_REQUEST_ID", true)));
            }
            if (aVar2 instanceof a.l) {
                return new C43210w(new ServiceBookingWorkHoursInternalAction.OnTimeRestrictionOptionSelected(((a.l) aVar2).f278108a));
            }
            if (aVar2 instanceof a.j) {
                return new C43210w(new ServiceBookingWorkHoursInternalAction.OnSchedulePeriodOptionSelected(((a.j) aVar2).f278106a));
            }
            if (!aVar2.equals(a.C8259a.f278094a)) {
                if (aVar2 instanceof a.h) {
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnSaveDialogShown(((a.h) aVar2).f278104a));
                }
                if (aVar2 instanceof a.c) {
                    a.c cVar = (a.c) aVar2;
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnDayCheckedChanged(cVar.f278096a, cVar.f278097b));
                }
                if (aVar2 instanceof a.d) {
                    a.d dVar = (a.d) aVar2;
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnDayTimeChanged(dVar.f278098a, dVar.f278099b, dVar.f278100c));
                }
                if (aVar2 instanceof a.e) {
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnFromSelectClicked(((a.e) aVar2).f278101a));
                }
                if (aVar2 instanceof a.m) {
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnToSelectClicked(((a.m) aVar2).f278109a));
                }
                if (aVar2 instanceof a.i) {
                    return new C43210w(new ServiceBookingWorkHoursInternalAction.OnSchedulePeriodInputClicked(c(((a.i) aVar2).f278105a, "WORK_HOURS_SCHEDULE_RESTRICTION_SELECT_REQUEST_ID", false)));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new ServiceBookingWorkHoursInternalAction.OnBackButtonClicked(hVar2.f16752n));
        }
        return c43210w;
    }
}
