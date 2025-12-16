package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import Rl.InterfaceC15055a;
import Rl.c;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import java.time.LocalDate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarSelectActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LRl/a;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "LRl/c;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC15055a, CalendarSelectInternalAction, Rl.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calendar_select.domain.e f113413a;

    @Inject
    public c(@Y61.k com.avito.android.calendar_select.domain.e eVar) {
        this.f113413a = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f113410l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CalendarSelectInternalAction> b(@Y61.k InterfaceC15055a interfaceC15055a, @Y61.k Rl.c cVar) {
        if (interfaceC15055a.equals(InterfaceC15055a.C0972a.f14585a)) {
            return new C43210w(CalendarSelectInternalAction.ClearSelectedDates.f113423b);
        }
        if (interfaceC15055a.equals(InterfaceC15055a.b.f14586a)) {
            return new C43210w(CalendarSelectInternalAction.CloseScreen.f113424b);
        }
        if (interfaceC15055a instanceof InterfaceC15055a.c) {
            return new C43210w(new CalendarSelectInternalAction.DatePicked(((InterfaceC15055a.c) interfaceC15055a).f14587a));
        }
        if (interfaceC15055a.equals(InterfaceC15055a.d.f14588a)) {
            return this.f113413a.a(CalendarSelectInternalAction.LoadingType.f113433c);
        }
        if (!interfaceC15055a.equals(InterfaceC15055a.e.f14589a)) {
            throw new NoWhenBranchMatchedException();
        }
        c.d dVar = cVar instanceof c.d ? (c.d) cVar : null;
        List<LocalDate> list = dVar != null ? dVar.f14602j : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        return new C43210w(new CalendarSelectInternalAction.DatesSelectionConfirmed(list));
    }
}
