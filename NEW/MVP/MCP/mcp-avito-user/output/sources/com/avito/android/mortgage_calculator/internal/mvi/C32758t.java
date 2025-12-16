package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$3", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32758t extends SuspendLambda implements Y41.p<CalculatorInternalAction, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f204707q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32739a f204708r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32758t(C32739a c32739a, Continuation<? super C32758t> continuation) {
        super(2, continuation);
        this.f204708r = c32739a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32758t c32758t = new C32758t(this.f204708r, continuation);
        c32758t.f204707q = obj;
        return c32758t;
    }

    @Override // Y41.p
    public final Object invoke(CalculatorInternalAction calculatorInternalAction, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
        return ((C32758t) create(calculatorInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CalculatorInternalAction calculatorInternalAction = (CalculatorInternalAction) this.f204707q;
        boolean z12 = calculatorInternalAction instanceof CalculatorInternalAction.InitialLoadingFailed;
        C32739a c32739a = this.f204708r;
        com.avito.android.arch.mvi.utils.o oVar = c32739a.f204476i;
        if (z12) {
            CalculatorInternalAction.InitialLoadingFailed initialLoadingFailed = (CalculatorInternalAction.InitialLoadingFailed) calculatorInternalAction;
            return C43175k.G(new C32747h(new y(initialLoadingFailed, c32739a, null), oVar, initialLoadingFailed, null));
        }
        if (!(calculatorInternalAction instanceof CalculatorInternalAction.InitialLoadingCompleted)) {
            return new C43210w(calculatorInternalAction);
        }
        CalculatorInternalAction.InitialLoadingCompleted initialLoadingCompleted = (CalculatorInternalAction.InitialLoadingCompleted) calculatorInternalAction;
        return C43175k.G(new C32746g(new x(initialLoadingCompleted, c32739a, null), oVar, initialLoadingCompleted, null));
    }
}
