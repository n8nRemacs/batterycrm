package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$updateDownPayment$1", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class H extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204437q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b.v f204438r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(b.v vVar, Continuation<? super H> continuation) {
        super(3, continuation);
        this.f204438r = vVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        H h12 = new H(this.f204438r, continuation);
        h12.f204437q = lVar;
        return h12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.arch.mvi.utils.l lVar = this.f204437q;
        D10.a aVarA = (D10.a) lVar.getValue();
        String str = this.f204438r.f204596b;
        a.C0271a c0271a = aVarA.f2845b;
        if (c0271a.f4477d) {
            aVarA = D10.a.a(aVarA, null, a.C0271a.c(aVarA.f2845b, null, c0271a.f4476c.c(str), false, 11), null, null, 0L, null, null, null, null, null, null, null, null, null, 16381);
        } else {
            a.b bVar = aVarA.f2844a;
            if (bVar.f4483e) {
                aVarA = D10.a.a(aVarA, a.b.c(aVarA.f2844a, null, null, bVar.f4482d.c(str), false, 23), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382);
            }
        }
        lVar.setValue(aVarA);
        return G0.f406611a;
    }
}
