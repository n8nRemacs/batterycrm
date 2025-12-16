package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$selectTab$1", f = "CalculatorActor.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class D extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204420q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204421r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204422s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.q f204423t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204424u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(b.q qVar, C32739a c32739a, Continuation<? super D> continuation) {
        super(3, continuation);
        this.f204423t = qVar;
        this.f204424u = c32739a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        D d12 = new D(this.f204423t, this.f204424u, continuation);
        d12.f204421r = interfaceC43172j;
        d12.f204422s = lVar;
        return d12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        D10.a aVarA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204420q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f204421r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204422s;
            D10.a aVar = (D10.a) lVar.getValue();
            InterfaceC27333b interfaceC27333b = this.f204423t.f204587b;
            if (!(interfaceC27333b instanceof E10.f)) {
                return G0.f406611a;
            }
            CalculatorTabType calculatorTabType = ((E10.f) interfaceC27333b).f3707c;
            a.C0271a c0271a = aVar.f2845b;
            CalculatorTabType calculatorTabType2 = c0271a.f4478e;
            a.C0271a c0271a2 = c0271a;
            if (calculatorTabType != calculatorTabType2) {
                a.b bVar = aVar.f2844a;
                CalculatorTabType calculatorTabType3 = bVar.f4484f;
                c0271a2 = bVar;
                if (calculatorTabType != calculatorTabType3) {
                    return G0.f406611a;
                }
            }
            if (c0271a2 instanceof a.b) {
                aVarA = D10.a.a(aVar, a.b.c((a.b) c0271a2, null, null, null, true, 15), a.C0271a.c(aVar.f2845b, null, null, false, 7), null, null, 0L, null, null, null, null, null, null, null, null, null, 16380);
                interfaceC43172j = null;
            } else {
                if (!(c0271a2 instanceof a.C0271a)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC43172j = null;
                aVarA = D10.a.a(aVar, a.b.c(aVar.f2844a, null, null, null, false, 15), a.C0271a.c(c0271a2, null, null, true, 7), null, null, 0L, null, null, null, null, null, null, null, null, null, 16380);
            }
            lVar.setValue(aVarA);
            this.f204424u.f204470c.b((D10.a) lVar.getValue());
            CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers((D10.a) lVar.getValue());
            this.f204421r = interfaceC43172j;
            this.f204420q = 1;
            if (interfaceC43172j2.emit(loadOffers, this) == coroutine_suspended) {
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
