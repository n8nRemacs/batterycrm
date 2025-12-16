package com.avito.android.service_booking.mvi.navigation.mvi;

import Fs0.b;
import Fs0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingNavigationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking/mvi/navigation/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LFs0/b;", "LFs0/c;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<Fs0.b, Fs0.c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Fs0.c b(Fs0.b bVar) {
        Fs0.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return new c.a(((b.a) bVar2).f5999a);
        }
        if (bVar2 instanceof b.C0306b) {
            return new c.b(((b.C0306b) bVar2).f6000a);
        }
        return null;
    }
}
