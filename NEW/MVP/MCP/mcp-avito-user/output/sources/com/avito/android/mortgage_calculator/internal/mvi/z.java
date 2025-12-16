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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$processOffersLoadingCompleted$1", f = "CalculatorActor.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class z extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204730q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204731r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204732s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204733t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CalculatorInternalAction.OffersLoadingCompleted f204734u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C32739a c32739a, CalculatorInternalAction.OffersLoadingCompleted offersLoadingCompleted, Continuation<? super z> continuation) {
        super(3, continuation);
        this.f204733t = c32739a;
        this.f204734u = offersLoadingCompleted;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        z zVar = new z(this.f204733t, this.f204734u, continuation);
        zVar.f204731r = interfaceC43172j;
        zVar.f204732s = lVar;
        return zVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204730q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f204731r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204732s;
            D10.a aVar = (D10.a) lVar.getValue();
            CalculatorInternalAction.OffersLoadingCompleted offersLoadingCompleted = this.f204734u;
            C10.b bVar = offersLoadingCompleted.f204558b;
            lVar.setValue(C32739a.g(D10.a.a(aVar, null, null, null, null, 0L, bVar.f1873f, bVar.f1874g, bVar.f1875h, null, null, null, null, null, null, 16159)));
            this.f204731r = null;
            this.f204730q = 1;
            if (interfaceC43172j.emit(offersLoadingCompleted, this) == coroutine_suspended) {
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
