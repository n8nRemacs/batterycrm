package com.avito.android.service_booking.mvi.step.mvi;

import Hs0.InterfaceC14030a;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingMviStepActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.step.mvi.ServiceBookingMviStepActor$process$3", f = "ServiceBookingMviStepActor.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f274662q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f274663r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingMviStepState f274664s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14030a f274665t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ServiceBookingMviStepState serviceBookingMviStepState, InterfaceC14030a interfaceC14030a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f274664s = serviceBookingMviStepState;
        this.f274665t = interfaceC14030a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f274664s, this.f274665t, continuation);
        cVar.f274663r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ServiceBookingMviStepState.ServiceBookingContent.SrvBookingNextAction srvBookingNextAction;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f274662q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f274663r;
            ServiceBookingMviStepState serviceBookingMviStepState = this.f274664s;
            ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepState.f274716e;
            if (serviceBookingContent != null && (srvBookingNextAction = serviceBookingContent.f274727i) != null) {
                LinkedHashMap linkedHashMapD = com.avito.android.service_booking.mvi.domain.d.d(serviceBookingMviStepState.f274719h);
                LinkedHashMap linkedHashMap = ((InterfaceC14030a.k) this.f274665t).f7788a;
                linkedHashMapD.clear();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD, (String) entry.getKey(), entry.getValue());
                }
                ServiceBookingMviStepInternalAction.OpenNextStep openNextStep = new ServiceBookingMviStepInternalAction.OpenNextStep(srvBookingNextAction.f274733e, linkedHashMapD, null, 4, null);
                this.f274662q = 1;
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
