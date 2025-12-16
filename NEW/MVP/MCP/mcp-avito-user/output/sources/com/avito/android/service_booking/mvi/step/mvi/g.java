package com.avito.android.service_booking.mvi.step.mvi;

import Hs0.InterfaceC14030a;
import androidx.compose.foundation.H;
import com.avito.android.arch.mvi.a;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.service_booking.mvi.di.v;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingMviStepActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LHs0/a;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.mvi.domain.interactors.a f274750a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Map<String, Set<Object>>> f274751b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f274752c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f274753d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f274754e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BookingFlow f274755f;

    @Inject
    public g(@Y61.k com.avito.android.service_booking.mvi.domain.interactors.a aVar, @Y61.k Map<String, Map<String, Set<Object>>> map, @v @Y61.k String str, @Y61.l @com.avito.android.service_booking.mvi.di.b String str2, @Y61.l @com.avito.android.service_booking.mvi.di.a String str3, @com.avito.android.service_booking.mvi.di.d @Y61.k BookingFlow bookingFlow) {
        this.f274750a = aVar;
        this.f274751b = map;
        this.f274752c = str;
        this.f274753d = str2;
        this.f274754e = str3;
        this.f274755f = bookingFlow;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ServiceBookingMviStepInternalAction> b(InterfaceC14030a interfaceC14030a, ServiceBookingMviStepState serviceBookingMviStepState) {
        ServiceBookingMviStepState.ServiceBookingContent.SrvBookingNextAction srvBookingNextAction;
        InterfaceC14030a interfaceC14030a2 = interfaceC14030a;
        ServiceBookingMviStepState serviceBookingMviStepState2 = serviceBookingMviStepState;
        boolean zEquals = interfaceC14030a2.equals(InterfaceC14030a.l.f7789a);
        com.avito.android.service_booking.mvi.domain.interactors.a aVar = this.f274750a;
        String str = this.f274754e;
        String str2 = null;
        if (zEquals) {
            BookingFlow bookingFlow = BookingFlow.f274121c;
            BookingFlow bookingFlow2 = this.f274755f;
            String str3 = this.f274753d;
            String str4 = this.f274752c;
            if (bookingFlow2 == bookingFlow) {
                ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepState2.f274716e;
                if (serviceBookingContent != null && (srvBookingNextAction = serviceBookingContent.f274727i) != null) {
                    str2 = srvBookingNextAction.f274733e;
                }
                if (L.f(str2, "routed_view")) {
                    return aVar.b(str, H.k("^[^_]+", str4, "confirmation"), str3, true);
                }
            }
            return aVar.b(str, str4, str3, false);
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.b) {
            return C43175k.G(new a(this, serviceBookingMviStepState2, null));
        }
        if (interfaceC14030a2.equals(InterfaceC14030a.c.f7780a)) {
            return new C43210w(new ServiceBookingMviStepInternalAction.Finish(ServiceBookingFlowIntentFactory.Result.Close.f274179b));
        }
        if (interfaceC14030a2.equals(InterfaceC14030a.j.f7787a)) {
            return C43175k.G(new b(this, serviceBookingMviStepState2, null));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.k) {
            return C43175k.G(new c(serviceBookingMviStepState2, interfaceC14030a2, null));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.m) {
            InterfaceC14030a.m mVar = (InterfaceC14030a.m) interfaceC14030a2;
            return new C43210w(new ServiceBookingMviStepInternalAction.OnServiceClicked(mVar.f7790a, mVar.f7791b));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.n) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnServiceGroupClicked(((InterfaceC14030a.n) interfaceC14030a2).f7792a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.o) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnServiceInfoClicked(((InterfaceC14030a.o) interfaceC14030a2).f7793a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.g) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OpenDeeplink(((InterfaceC14030a.g) interfaceC14030a2).f7784a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.d) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnCommentEdited(((InterfaceC14030a.d) interfaceC14030a2).f7781a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.f) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnDaySelected(((InterfaceC14030a.f) interfaceC14030a2).f7783a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.e) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnDayScrolled(((InterfaceC14030a.e) interfaceC14030a2).f7782a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.h) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnInputChanged(((InterfaceC14030a.h) interfaceC14030a2).f7785a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.i) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnInputFocused(((InterfaceC14030a.i) interfaceC14030a2).f7786a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.p) {
            return new C43210w(new ServiceBookingMviStepInternalAction.OnSlotSelected(((InterfaceC14030a.p) interfaceC14030a2).f7794a));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.q) {
            return C43175k.G(new d(serviceBookingMviStepState2, interfaceC14030a2, null));
        }
        if (interfaceC14030a2 instanceof InterfaceC14030a.C0442a) {
            return C43175k.G(new e(serviceBookingMviStepState2, interfaceC14030a2, null));
        }
        if (!(interfaceC14030a2 instanceof InterfaceC14030a.r)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14030a.r rVar = (InterfaceC14030a.r) interfaceC14030a2;
        return new C43137a0(new f(interfaceC14030a2, null), aVar.a(str, rVar.f7796a, rVar.f7797b));
    }
}
