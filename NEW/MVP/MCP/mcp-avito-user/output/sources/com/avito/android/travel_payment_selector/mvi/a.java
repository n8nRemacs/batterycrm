package com.avito.android.travel_payment_selector.mvi;

import Y41.p;
import com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction;
import dF0.C39574a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lF0.InterfaceC43628a;

/* compiled from: PaymentSelectorActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ChangePaymentPlan;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_payment_selector.mvi.PaymentSelectorActor$process$1", f = "PaymentSelectorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PaymentSelectorInternalAction.ChangePaymentPlan>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f302643q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43628a f302644r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, InterfaceC43628a interfaceC43628a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f302643q = cVar;
        this.f302644r = interfaceC43628a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f302643q, this.f302644r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PaymentSelectorInternalAction.ChangePaymentPlan> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        c cVar = this.f302643q;
        cVar.f302649c.c(new C39574a("payment_form", null, cVar.f302650d.a(), ((InterfaceC43628a.d) this.f302644r).f413668a, cVar.f302647a, 2, null));
        return G0.f406611a;
    }
}
