package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$sliderChangeFinished$1", f = "CalculatorActor.kt", i = {}, l = {461}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class E extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.x<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204425q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204426r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.x f204427s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204428t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b.r f204429u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C32739a c32739a, b.r rVar, Continuation<? super E> continuation) {
        super(3, continuation);
        this.f204428t = c32739a;
        this.f204429u = rVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<D10.a> xVar, Continuation<? super G0> continuation) {
        E e12 = new E(this.f204428t, this.f204429u, continuation);
        e12.f204426r = interfaceC43172j;
        e12.f204427s = xVar;
        return e12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204425q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f204426r;
            com.avito.android.arch.mvi.utils.x xVar = this.f204427s;
            this.f204428t.f204470c.g(this.f204429u, (D10.a) xVar.getValue());
            CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers((D10.a) xVar.getValue());
            this.f204426r = null;
            this.f204425q = 1;
            if (interfaceC43172j.emit(loadOffers, this) == coroutine_suspended) {
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
