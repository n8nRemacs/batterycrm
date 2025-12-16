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
import y10.C50037b;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$updateLandCost$1", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class J extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204442q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b.x f204443r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(b.x xVar, Continuation<? super J> continuation) {
        super(3, continuation);
        this.f204443r = xVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        J j12 = new J(this.f204443r, continuation);
        j12.f204442q = lVar;
        return j12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.arch.mvi.utils.l lVar = this.f204442q;
        String str = this.f204443r.f204598b;
        D10.a aVar = (D10.a) lVar.getValue();
        C50037b c50037b = aVar.f2844a.f4481c;
        lVar.setValue(D10.a.a(aVar, a.b.c(aVar.f2844a, null, c50037b != null ? c50037b.c(str) : null, null, false, 27), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382));
        return G0.f406611a;
    }
}
