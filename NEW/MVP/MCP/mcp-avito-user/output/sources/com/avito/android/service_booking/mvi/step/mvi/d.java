package com.avito.android.service_booking.mvi.step.mvi;

import Hs0.InterfaceC14030a;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingMviStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.step.mvi.ServiceBookingMviStepActor$process$4", f = "ServiceBookingMviStepActor.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f274666q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f274667r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingMviStepState f274668s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14030a f274669t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ServiceBookingMviStepState serviceBookingMviStepState, InterfaceC14030a interfaceC14030a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f274668s = serviceBookingMviStepState;
        this.f274669t = interfaceC14030a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f274668s, this.f274669t, continuation);
        dVar.f274667r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ServiceBookingMviStepState.ServiceBookingContent.SrvBookingNextAction srvBookingNextAction;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f274666q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f274667r;
            ServiceBookingMviStepState serviceBookingMviStepState = this.f274668s;
            ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepState.f274716e;
            if (serviceBookingContent != null && (srvBookingNextAction = serviceBookingContent.f274727i) != null) {
                LinkedHashMap linkedHashMapD = com.avito.android.service_booking.mvi.domain.d.d(serviceBookingMviStepState.f274719h);
                qt0.j jVar = ((InterfaceC14030a.q) this.f274669t).f7795a;
                String str = jVar.f429456d;
                String str2 = jVar.f429462j;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapD.remove(str);
                com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD, str, str2);
                ServiceBookingMviStepInternalAction.OpenNextStep openNextStep = new ServiceBookingMviStepInternalAction.OpenNextStep(srvBookingNextAction.f274733e, linkedHashMapD, null, 4, null);
                this.f274666q = 1;
                if (interfaceC43172j.emit(openNextStep, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
