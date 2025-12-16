package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import cu.InterfaceC39414b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DasCalendarOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcu/b;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements com.avito.android.arch.mvi.t<DasCalendarInternalAction, InterfaceC39414b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39414b b(DasCalendarInternalAction dasCalendarInternalAction) {
        DasCalendarInternalAction dasCalendarInternalAction2 = dasCalendarInternalAction;
        if (dasCalendarInternalAction2 instanceof DasCalendarInternalAction.ScrollToPosition) {
            return new InterfaceC39414b.c(((DasCalendarInternalAction.ScrollToPosition) dasCalendarInternalAction2).f132378b);
        }
        if (dasCalendarInternalAction2 instanceof DasCalendarInternalAction.PassSelectedDate) {
            return new InterfaceC39414b.C10994b(((DasCalendarInternalAction.PassSelectedDate) dasCalendarInternalAction2).f132377b);
        }
        if (dasCalendarInternalAction2 instanceof DasCalendarInternalAction.CloseScreen) {
            return InterfaceC39414b.a.f392986a;
        }
        return null;
    }
}
