package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
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

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$10", f = "MortgageRootActor.kt", i = {0}, l = {266, 268}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203257q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203258r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203259s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f203260t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C40513c f203261u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, InterfaceC40199a interfaceC40199a, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203259s = interfaceC40199a;
        this.f203260t = sVar;
        this.f203261u = c40513c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f203260t, this.f203259s, this.f203261u, continuation);
        fVar.f203258r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203257q;
        InterfaceC40199a interfaceC40199a = this.f203259s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f203258r;
            MortgageRootInternalAction.RealtyObjectDetailsFirstFieldUpdated realtyObjectDetailsFirstFieldUpdated = new MortgageRootInternalAction.RealtyObjectDetailsFirstFieldUpdated(((InterfaceC40199a.E) interfaceC40199a).f395581a);
            this.f203258r = interfaceC43172j;
            this.f203257q = 1;
            if (interfaceC43172j.emit(realtyObjectDetailsFirstFieldUpdated, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f203258r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iD = this.f203260t.f203339k.d(this.f203261u.f396246b, ((InterfaceC40199a.E) interfaceC40199a).f395581a);
        this.f203258r = null;
        this.f203257q = 2;
        if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
