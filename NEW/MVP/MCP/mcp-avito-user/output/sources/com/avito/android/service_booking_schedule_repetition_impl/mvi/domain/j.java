package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Mt0.C14527a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import com.avito.android.service_booking_utils.events.ActionIntentByClickEvent;
import com.avito.android.service_booking_utils.events.ScreenFailedToOpenEvent;
import com.avito.android.service_booking_utils.events.ScreenOpenedEvent;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import org.threeten.bp.q;

/* compiled from: ScheduleRepetitionAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/i;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f277684a;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.f f277685b;

    @Inject
    public j(@Y61.k RepetitionSchedule repetitionSchedule, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f277684a = interfaceC28373a;
        this.f277685b = org.threeten.bp.f.H(repetitionSchedule.f277630b, 0, q.f422106g);
    }

    @Override // com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.i
    public final void a(@Y61.k ScheduleRepetitionInternalAction scheduleRepetitionInternalAction) {
        boolean z12 = scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.ShowLoadedContent;
        org.threeten.bp.f fVar = this.f277685b;
        InterfaceC28373a interfaceC28373a = this.f277684a;
        if (z12) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278361f, fVar));
            return;
        }
        if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.ShowLoadError) {
            interfaceC28373a.c(new ScreenFailedToOpenEvent(ScreenFailedToOpenEvent.Screen.f278347d, fVar));
            return;
        }
        if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.ToggleDay) {
            interfaceC28373a.c(new Mt0.b());
            return;
        }
        if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.Clear) {
            interfaceC28373a.c(new C14527a());
            return;
        }
        if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.ShowSaveLoading) {
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278298f, ActionIntentByClickEvent.Action.f278289f, fVar));
            return;
        }
        if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.OnSaveDialogShown) {
            interfaceC28373a.c(new com.avito.android.service_booking_utils.events.a(((ScheduleRepetitionInternalAction.OnSaveDialogShown) scheduleRepetitionInternalAction).f277694b));
        } else if (scheduleRepetitionInternalAction instanceof ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked) {
            ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked) scheduleRepetitionInternalAction;
            interfaceC28373a.c(new WorkHoursSaveClickEvent(onActionButtonSaveDialogClicked.f277691b, onActionButtonSaveDialogClicked.f277692c.f278375b));
        }
    }
}
