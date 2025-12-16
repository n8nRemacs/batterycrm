package com.avito.android.service_booking_calendar.view.day;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: CalendarCellPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/g;", "Lcom/avito/android/service_booking_calendar/view/day/e;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f276194b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        d dVar = (d) aVar;
        iVar.lI(dVar);
        iVar.OT(new f(this, dVar));
    }

    @Override // com.avito.android.service_booking_calendar.view.day.e
    /* renamed from: T3, reason: from getter */
    public final e2 getF276194b() {
        return this.f276194b;
    }
}
