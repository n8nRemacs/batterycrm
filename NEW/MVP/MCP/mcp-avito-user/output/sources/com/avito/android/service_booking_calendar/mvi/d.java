package com.avito.android.service_booking_calendar.mvi;

import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mt0.InterfaceC44132a;
import mt0.InterfaceC44133b;

/* compiled from: CalendarActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_calendar/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lmt0/a;", "Lmt0/b;", "Lmt0/d;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC44132a, InterfaceC44133b, mt0.d> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC44133b> b(InterfaceC44132a interfaceC44132a, mt0.d dVar) {
        InterfaceC44132a interfaceC44132a2 = interfaceC44132a;
        if (interfaceC44132a2 instanceof InterfaceC44132a.C11846a) {
            return C43175k.G(new a(interfaceC44132a2, null));
        }
        if (interfaceC44132a2 instanceof InterfaceC44132a.b) {
            return C43175k.G(new b(interfaceC44132a2, null));
        }
        if (interfaceC44132a2 instanceof InterfaceC44132a.c) {
            return C43175k.G(new c(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
