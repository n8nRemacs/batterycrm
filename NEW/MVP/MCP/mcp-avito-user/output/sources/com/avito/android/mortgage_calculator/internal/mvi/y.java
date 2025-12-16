package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.deep_linking.links.DeepLink;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$processInitialLoadingFailed$1", f = "CalculatorActor.kt", i = {0, 0}, l = {190, 198}, m = "invokeSuspend", n = {"$this$flowWithPrivateStateAccess", "stateHolder"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class y extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.x<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204725q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204726r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.x f204727s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CalculatorInternalAction.InitialLoadingFailed f204728t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204729u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(CalculatorInternalAction.InitialLoadingFailed initialLoadingFailed, C32739a c32739a, Continuation<? super y> continuation) {
        super(3, continuation);
        this.f204728t = initialLoadingFailed;
        this.f204729u = c32739a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<D10.a> xVar, Continuation<? super G0> continuation) {
        C32739a c32739a = this.f204729u;
        y yVar = new y(this.f204728t, c32739a, continuation);
        yVar.f204726r = interfaceC43172j;
        yVar.f204727s = xVar;
        return yVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.arch.mvi.utils.x xVar;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204725q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f204726r;
            xVar = this.f204727s;
            this.f204726r = interfaceC43172j2;
            this.f204727s = xVar;
            this.f204725q = 1;
            if (interfaceC43172j2.emit(this.f204728t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            xVar = this.f204727s;
            interfaceC43172j = this.f204726r;
            C42729a0.b(obj);
        }
        DeepLink deepLink = ((D10.a) xVar.getValue()).f2849f;
        DeepLink deepLink2 = ((D10.a) xVar.getValue()).f2850g;
        C32739a c32739a = this.f204729u;
        String str = ((D10.a) xVar.getValue()).f2853j;
        com.avito.android.mortgage_calculator.data.a aVar = c32739a.f204474g;
        aVar.b(deepLink, str);
        aVar.a(deepLink2, ((D10.a) xVar.getValue()).f2853j);
        CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers((D10.a) xVar.getValue());
        this.f204726r = null;
        this.f204727s = null;
        this.f204725q = 2;
        if (interfaceC43172j.emit(loadOffers, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
