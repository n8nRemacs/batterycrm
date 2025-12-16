package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import x10.C49742a;
import y10.C50036a;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$processInitialLoadingCompleted$1", f = "CalculatorActor.kt", i = {0, 0, 0, 0}, l = {JfifUtil.MARKER_SOI, 221}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "stateHolder", "primaryDeeplink", "secondaryDeeplink"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes15.dex */
final class x extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public DeepLink f204718q;

    /* renamed from: r, reason: collision with root package name */
    public DeepLink f204719r;

    /* renamed from: s, reason: collision with root package name */
    public int f204720s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204721t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204722u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CalculatorInternalAction.InitialLoadingCompleted f204723v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C32739a f204724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(CalculatorInternalAction.InitialLoadingCompleted initialLoadingCompleted, C32739a c32739a, Continuation<? super x> continuation) {
        super(3, continuation);
        this.f204723v = initialLoadingCompleted;
        this.f204724w = c32739a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        C32739a c32739a = this.f204724w;
        x xVar = new x(this.f204723v, c32739a, continuation);
        xVar.f204721t = interfaceC43172j;
        xVar.f204722u = lVar;
        return xVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        com.avito.android.arch.mvi.utils.l lVar;
        DeepLink deepLink;
        DeepLink deepLink2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204720s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f204721t;
            lVar = this.f204722u;
            CalculatorInternalAction.InitialLoadingCompleted initialLoadingCompleted = this.f204723v;
            C10.a aVar = initialLoadingCompleted.f204552b;
            C49742a c49742a = aVar.f1865g;
            C49742a c49742a2 = aVar.f1866h;
            DeepLink deepLink3 = c49742a2 != null ? c49742a2.f442081b : null;
            D10.a aVar2 = (D10.a) lVar.getValue();
            C10.a aVar3 = initialLoadingCompleted.f204552b;
            a.b bVar = aVar3.f1862d;
            a.C0271a c0271a = aVar3.f1863e;
            C50036a c50036a = aVar3.f1864f;
            String str = aVar3.f1860b;
            long j12 = aVar3.f1859a;
            deepLink = c49742a.f442081b;
            lVar.setValue(D10.a.a(aVar2, bVar, c0271a, c50036a, str, j12, deepLink, deepLink3, null, null, null, null, null, null, null, 16256));
            this.f204721t = interfaceC43172j;
            this.f204722u = lVar;
            this.f204718q = deepLink;
            this.f204719r = deepLink3;
            this.f204720s = 1;
            if (interfaceC43172j.emit(initialLoadingCompleted, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            deepLink2 = deepLink3;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            deepLink2 = this.f204719r;
            deepLink = this.f204718q;
            lVar = this.f204722u;
            interfaceC43172j = this.f204721t;
            C42729a0.b(obj);
        }
        C32739a c32739a = this.f204724w;
        String str2 = ((D10.a) lVar.getValue()).f2853j;
        com.avito.android.mortgage_calculator.data.a aVar4 = c32739a.f204474g;
        aVar4.b(deepLink, str2);
        aVar4.a(deepLink2, ((D10.a) lVar.getValue()).f2853j);
        CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers((D10.a) lVar.getValue());
        this.f204721t = null;
        this.f204722u = null;
        this.f204718q = null;
        this.f204719r = null;
        this.f204720s = 2;
        if (interfaceC43172j.emit(loadOffers, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
