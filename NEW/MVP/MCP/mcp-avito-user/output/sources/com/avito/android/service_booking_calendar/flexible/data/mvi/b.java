package com.avito.android.service_booking_calendar.flexible.data.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import ht0.InterfaceC40984a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarDataActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lht0/a;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40984a, CalendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_calendar.flexible.data.domain.d f275710a;

    @Inject
    public b(@Y61.k com.avito.android.service_booking_calendar.flexible.data.domain.d dVar) {
        this.f275710a = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CalendarDataInternalAction> b(InterfaceC40984a interfaceC40984a, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar) {
        C43210w c43210w;
        InterfaceC40984a interfaceC40984a2 = interfaceC40984a;
        com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar2 = aVar;
        if (interfaceC40984a2 instanceof InterfaceC40984a.d) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC40984a2 instanceof InterfaceC40984a.b) {
            return new C43210w(new CalendarDataInternalAction.e(((InterfaceC40984a.b) interfaceC40984a2).f397443a));
        }
        if (interfaceC40984a2 instanceof InterfaceC40984a.C11282a) {
            c43210w = new C43210w(new CalendarDataInternalAction.d(aVar2.f275726d));
        } else {
            if (!(interfaceC40984a2 instanceof InterfaceC40984a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(CalendarDataInternalAction.f.f275719b);
        }
        return c43210w;
    }
}
