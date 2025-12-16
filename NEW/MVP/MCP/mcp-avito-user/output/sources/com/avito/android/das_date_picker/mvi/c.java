package com.avito.android.das_date_picker.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import cu.InterfaceC39413a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DasCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lcu/a;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC39413a, DasCalendarInternalAction, DasCalendarState> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DasCalendarInternalAction> b(InterfaceC39413a interfaceC39413a, DasCalendarState dasCalendarState) {
        InterfaceC39413a interfaceC39413a2 = interfaceC39413a;
        DasCalendarState dasCalendarState2 = dasCalendarState;
        if (interfaceC39413a2 instanceof InterfaceC39413a.c) {
            return new C43210w(new DasCalendarInternalAction.DayClick(((InterfaceC39413a.c) interfaceC39413a2).f392984a));
        }
        if (interfaceC39413a2 instanceof InterfaceC39413a.C10993a) {
            return C43175k.G(new a(dasCalendarState2, null));
        }
        if (interfaceC39413a2 instanceof InterfaceC39413a.b) {
            return new C43210w(DasCalendarInternalAction.CloseScreen.f132373b);
        }
        if (interfaceC39413a2 instanceof InterfaceC39413a.d) {
            return C43175k.G(new b(dasCalendarState2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
