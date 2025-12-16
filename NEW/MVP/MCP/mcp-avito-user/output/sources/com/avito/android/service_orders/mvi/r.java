package com.avito.android.service_orders.mvi;

import Ju.InterfaceC14249c;
import Mu0.InterfaceC14531a;
import com.avito.android.service_booking_settings_public.ServiceBookingWorkHoursLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceOrdersListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMu0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$deeplinkHandlerFlow$1$8", f = "ServiceOrdersListActor.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14531a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f279625q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f279626r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f279627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC14249c interfaceC14249c, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f279627s = interfaceC14249c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f279627s, continuation);
        rVar.f279626r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14531a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f279625q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279626r;
            InterfaceC14531a.o oVar = new InterfaceC14531a.o(((ServiceBookingWorkHoursLink.c.a) this.f279627s).f278152b);
            this.f279625q = 1;
            if (interfaceC43172j.emit(oVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
