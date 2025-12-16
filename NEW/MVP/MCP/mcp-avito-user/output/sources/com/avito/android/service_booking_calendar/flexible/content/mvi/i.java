package com.avito.android.service_booking_calendar.flexible.content.mvi;

import com.avito.android.arch.mvi.t;
import gt0.InterfaceC40734b;
import gt0.InterfaceC40735c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalendarContentOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lgt0/b;", "Lgt0/c;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<InterfaceC40734b, InterfaceC40735c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40735c b(InterfaceC40734b interfaceC40734b) {
        InterfaceC40735c c11234c;
        InterfaceC40734b interfaceC40734b2 = interfaceC40734b;
        if (interfaceC40734b2 instanceof InterfaceC40734b.a) {
            return InterfaceC40735c.a.f396915a;
        }
        if (interfaceC40734b2 instanceof InterfaceC40734b.i) {
            c11234c = new InterfaceC40735c.d(((InterfaceC40734b.i) interfaceC40734b2).f396914a);
        } else if (interfaceC40734b2 instanceof InterfaceC40734b.C11233b) {
            InterfaceC40734b.C11233b c11233b = (InterfaceC40734b.C11233b) interfaceC40734b2;
            c11234c = new InterfaceC40735c.b(c11233b.f396906a, c11233b.f396907b);
        } else {
            if (!(interfaceC40734b2 instanceof InterfaceC40734b.c)) {
                return null;
            }
            c11234c = new InterfaceC40735c.C11234c(((InterfaceC40734b.c) interfaceC40734b2).f396908a);
        }
        return c11234c;
    }
}
