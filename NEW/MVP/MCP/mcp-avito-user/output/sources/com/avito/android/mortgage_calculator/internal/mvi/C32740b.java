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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$applyBusinessRules$1", f = "CalculatorActor.kt", i = {0}, l = {607}, m = "invokeSuspend", n = {"stateHolder"}, s = {"L$0"})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32740b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204494q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204495r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204496s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204497t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b.d f204498u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32740b(C32739a c32739a, b.d dVar, Continuation<? super C32740b> continuation) {
        super(3, continuation);
        this.f204497t = c32739a;
        this.f204498u = dVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        C32740b c32740b = new C32740b(this.f204497t, this.f204498u, continuation);
        c32740b.f204495r = interfaceC43172j;
        c32740b.f204496s = lVar;
        return c32740b.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.arch.mvi.utils.l lVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204494q;
        C32739a c32739a = this.f204497t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204495r;
            com.avito.android.arch.mvi.utils.l lVar2 = this.f204496s;
            c32739a.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new C32741c(lVar2, c32739a, null));
            this.f204495r = lVar2;
            this.f204494q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar = lVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (com.avito.android.arch.mvi.utils.l) this.f204495r;
            C42729a0.b(obj);
        }
        c32739a.f204470c.o(this.f204498u, (D10.a) lVar.getValue());
        return G0.f406611a;
    }
}
