package com.avito.android.service_booking_calendar.mvi;

import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mt0.InterfaceC44133b;

/* compiled from: CalendarReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lmt0/b;", "Lmt0/d;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<InterfaceC44133b, mt0.d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final mt0.d a(InterfaceC44133b interfaceC44133b, mt0.d dVar) {
        InterfaceC44133b interfaceC44133b2 = interfaceC44133b;
        mt0.d dVar2 = dVar;
        if (interfaceC44133b2 instanceof InterfaceC44133b.a) {
            return ((InterfaceC44133b.a) interfaceC44133b2).f414787a;
        }
        if (interfaceC44133b2 instanceof InterfaceC44133b.C11847b) {
            return new mt0.d(dVar2.f414791a, ((InterfaceC44133b.C11847b) interfaceC44133b2).f414788a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
