package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$6", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class w extends SuspendLambda implements Y41.p<CalculatorInternalAction, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f204716q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32739a f204717r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C32739a c32739a, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f204717r = c32739a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        w wVar = new w(this.f204717r, continuation);
        wVar.f204716q = obj;
        return wVar;
    }

    @Override // Y41.p
    public final Object invoke(CalculatorInternalAction calculatorInternalAction, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
        return ((w) create(calculatorInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CalculatorInternalAction calculatorInternalAction = (CalculatorInternalAction) this.f204716q;
        boolean z12 = calculatorInternalAction instanceof CalculatorInternalAction.OffersLoadingStarted;
        C32739a c32739a = this.f204717r;
        com.avito.android.arch.mvi.utils.o oVar = c32739a.f204476i;
        if (z12) {
            CalculatorInternalAction.OffersLoadingStarted offersLoadingStarted = (CalculatorInternalAction.OffersLoadingStarted) calculatorInternalAction;
            return c32739a.d(oVar, offersLoadingStarted, new B(offersLoadingStarted, null));
        }
        if (calculatorInternalAction instanceof CalculatorInternalAction.OffersLoadingFailed) {
            CalculatorInternalAction.OffersLoadingFailed offersLoadingFailed = (CalculatorInternalAction.OffersLoadingFailed) calculatorInternalAction;
            return c32739a.d(oVar, offersLoadingFailed, new A(offersLoadingFailed, null));
        }
        if (!(calculatorInternalAction instanceof CalculatorInternalAction.OffersLoadingCompleted)) {
            return new C43210w(calculatorInternalAction);
        }
        CalculatorInternalAction.OffersLoadingCompleted offersLoadingCompleted = (CalculatorInternalAction.OffersLoadingCompleted) calculatorInternalAction;
        return c32739a.d(oVar, offersLoadingCompleted, new z(c32739a, offersLoadingCompleted, null));
    }
}
