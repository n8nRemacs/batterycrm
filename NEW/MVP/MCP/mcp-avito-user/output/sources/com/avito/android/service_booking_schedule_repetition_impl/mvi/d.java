package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import Nt0.InterfaceC14610a;
import com.avito.android.arch.mvi.a;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ScheduleRepetitionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LNt0/a;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14610a, ScheduleRepetitionInternalAction, ScheduleRepetitionState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b f277627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f f277628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RepetitionSchedule f277629c;

    @Inject
    public d(@Y61.k com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b bVar, @Y61.k com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f fVar, @Y61.k RepetitionSchedule repetitionSchedule) {
        this.f277627a = bVar;
        this.f277628b = fVar;
        this.f277629c = repetitionSchedule;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ScheduleRepetitionInternalAction> b(InterfaceC14610a interfaceC14610a, ScheduleRepetitionState scheduleRepetitionState) {
        String str;
        ScheduleRepetitionState.Content.SaveScheduleInfo saveScheduleInfo;
        InterfaceC43160i<ScheduleRepetitionInternalAction> interfaceC43160iW;
        List<com.avito.android.service_booking_calendar.a> list;
        C43210w c43210w;
        InterfaceC14610a interfaceC14610a2 = interfaceC14610a;
        ScheduleRepetitionState scheduleRepetitionState2 = scheduleRepetitionState;
        if (interfaceC14610a2 instanceof InterfaceC14610a.e) {
            return this.f277627a.invoke();
        }
        if (interfaceC14610a2 instanceof InterfaceC14610a.c) {
            return C43175k.G(new a(interfaceC14610a2, this, null));
        }
        if (!(interfaceC14610a2 instanceof InterfaceC14610a.b)) {
            boolean z12 = interfaceC14610a2 instanceof InterfaceC14610a.d;
            ScheduleRepetitionState.Content content = scheduleRepetitionState2.f277711d;
            if (z12) {
                if (!((InterfaceC14610a.d) interfaceC14610a2).f11791a) {
                    if ((content != null ? content.f277717d : null) != null) {
                        c43210w = new C43210w(new ScheduleRepetitionInternalAction.OnChangeSaveDialogVisibility(true));
                    }
                }
                if (content == null || (list = content.f277714a) == null || (interfaceC43160iW = this.f277628b.a(list)) == null) {
                    interfaceC43160iW = C43175k.w();
                }
                return new X(new C43137a0(new b(scheduleRepetitionState2, null), interfaceC43160iW), new c(3, null));
            }
            if (!interfaceC14610a2.equals(InterfaceC14610a.C0768a.f11788a)) {
                if (interfaceC14610a2 instanceof InterfaceC14610a.f) {
                    return new C43210w(new ScheduleRepetitionInternalAction.OnSaveDialogShown(((InterfaceC14610a.f) interfaceC14610a2).f11793a));
                }
                throw new NoWhenBranchMatchedException();
            }
            ScheduleRepetitionInternalAction.OnChangeSaveDialogVisibility onChangeSaveDialogVisibility = new ScheduleRepetitionInternalAction.OnChangeSaveDialogVisibility(false);
            if (content == null || (saveScheduleInfo = content.f277717d) == null || (str = saveScheduleInfo.f277723f) == null) {
                str = "Изменить расписание";
            }
            return new C43207v(new ScheduleRepetitionInternalAction[]{onChangeSaveDialogVisibility, new ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked(str, WorkHoursSaveClickEvent.SaveDialogActionType.f278372d)});
        }
        c43210w = new C43210w(ScheduleRepetitionInternalAction.Clear.f277688b);
        return c43210w;
    }
}
