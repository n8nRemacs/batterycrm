package com.avito.android.service_booking.mvi.navigation.mvi;

import Fs0.InterfaceC13831a;
import Fs0.b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingNavigationActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/mvi/navigation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LFs0/a;", "LFs0/b;", "LFs0/d;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13831a, Fs0.b, Fs0.d> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Fs0.b> b(InterfaceC13831a interfaceC13831a, Fs0.d dVar) {
        InterfaceC13831a interfaceC13831a2 = interfaceC13831a;
        Fs0.d dVar2 = dVar;
        if (interfaceC13831a2 instanceof InterfaceC13831a.C0305a) {
            InterfaceC13831a.C0305a c0305a = (InterfaceC13831a.C0305a) interfaceC13831a2;
            return new C43207v(new Fs0.b[]{new b.d(c0305a.f5994b, c0305a.f5995c), new b.a(c0305a.f5993a)});
        }
        if (interfaceC13831a2 instanceof InterfaceC13831a.b) {
            return C43175k.G(new a(dVar2, interfaceC13831a2, null));
        }
        if (interfaceC13831a2 instanceof InterfaceC13831a.c) {
            return new C43210w(new b.c(((InterfaceC13831a.c) interfaceC13831a2).f5998a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
