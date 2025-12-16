package com.avito.android.service_booking_calendar.day.schedule.mvi;

import bt0.C25711c;
import bt0.InterfaceC25709a;
import com.avito.android.arch.mvi.a;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DayScheduleActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lbt0/a;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lbt0/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC25709a, DayScheduleInternalAction, C25711c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f275387a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_calendar.domain.use_case.b f275388b;

    @Inject
    public a(@com.avito.android.service_booking_calendar.day.schedule.di.j @Y61.k String str, @Y61.k com.avito.android.service_booking_calendar.domain.use_case.b bVar) {
        this.f275387a = str;
        this.f275388b = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DayScheduleInternalAction> b(InterfaceC25709a interfaceC25709a, C25711c c25711c) {
        InterfaceC25709a interfaceC25709a2 = interfaceC25709a;
        boolean z12 = interfaceC25709a2 instanceof InterfaceC25709a.C2021a;
        String str = this.f275387a;
        com.avito.android.service_booking_calendar.domain.use_case.b bVar = this.f275388b;
        if (z12) {
            return bVar.a(str, true);
        }
        if (interfaceC25709a2 instanceof InterfaceC25709a.b) {
            return bVar.a(str, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
