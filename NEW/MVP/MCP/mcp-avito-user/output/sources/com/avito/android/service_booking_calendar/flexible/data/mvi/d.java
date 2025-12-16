package com.avito.android.service_booking_calendar.flexible.data.mvi;

import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarDataBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.b<CalendarDataInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_calendar.flexible.data.domain.d f275712a;

    @Inject
    public d(@Y61.k com.avito.android.service_booking_calendar.flexible.data.domain.d dVar) {
        this.f275712a = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CalendarDataInternalAction> a() {
        return this.f275712a.invoke();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
