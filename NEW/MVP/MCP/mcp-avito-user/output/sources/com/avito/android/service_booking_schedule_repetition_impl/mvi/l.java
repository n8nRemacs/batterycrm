package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import Nt0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ScheduleRepetitionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "LNt0/b;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements t<ScheduleRepetitionInternalAction, Nt0.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Nt0.b b(ScheduleRepetitionInternalAction scheduleRepetitionInternalAction) {
        ScheduleRepetitionInternalAction scheduleRepetitionInternalAction2 = scheduleRepetitionInternalAction;
        if (scheduleRepetitionInternalAction2 instanceof ScheduleRepetitionInternalAction.ScrollToPosition) {
            return new b.C0769b(((ScheduleRepetitionInternalAction.ScrollToPosition) scheduleRepetitionInternalAction2).f277695b);
        }
        if (scheduleRepetitionInternalAction2 instanceof ScheduleRepetitionInternalAction.ShowErrorToast) {
            return new b.c(((ScheduleRepetitionInternalAction.ShowErrorToast) scheduleRepetitionInternalAction2).f277698b);
        }
        if (scheduleRepetitionInternalAction2 instanceof ScheduleRepetitionInternalAction.CloseAsSuccessSave) {
            return new b.a(((ScheduleRepetitionInternalAction.CloseAsSuccessSave) scheduleRepetitionInternalAction2).f277689b);
        }
        return null;
    }
}
