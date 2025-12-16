package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
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
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$1", f = "MortgageRootActor.kt", i = {0}, l = {87, 88}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203270q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f203272s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40513c f203273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, C40513c c40513c, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f203272s = sVar;
        this.f203273t = c40513c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f203272s, this.f203273t, continuation);
        iVar.f203271r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203270q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f203271r;
            MortgageRootInternalAction.StatusReloadClicked statusReloadClicked = MortgageRootInternalAction.StatusReloadClicked.f203241b;
            this.f203271r = interfaceC43172j;
            this.f203270q = 1;
            if (interfaceC43172j.emit(statusReloadClicked, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f203271r;
            C42729a0.b(obj);
        }
        s sVar = this.f203272s;
        sVar.getClass();
        InterfaceC43160i interfaceC43160iI = C43175k.I(sVar.f203341m.a(), C43175k.G(new r(sVar, this.f203273t, null)));
        this.f203271r = null;
        this.f203270q = 2;
        if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
