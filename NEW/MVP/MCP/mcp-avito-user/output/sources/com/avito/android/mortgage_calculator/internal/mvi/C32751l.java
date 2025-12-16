package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handlePrimaryButtonClick$1", f = "CalculatorActor.kt", i = {}, l = {590}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32751l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204657q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32739a f204659s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E10.c f204660t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32751l(E10.c cVar, C32739a c32739a, Continuation continuation) {
        super(2, continuation);
        this.f204659s = c32739a;
        this.f204660t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32751l c32751l = new C32751l(this.f204660t, this.f204659s, continuation);
        c32751l.f204658r = obj;
        return c32751l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32751l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204657q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204658r;
            com.avito.android.mortgage_calculator.internal.analytics.a aVar = this.f204659s.f204470c;
            E10.c cVar = this.f204660t;
            aVar.k(cVar);
            CalculatorInternalAction.HandleDeeplink handleDeeplink = new CalculatorInternalAction.HandleDeeplink(cVar.f3690o.f442081b);
            this.f204657q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
