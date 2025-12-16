package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LKI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$updateSoaStats$2$1", f = "PanelSoaActor.kt", i = {0}, l = {190, 191}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<KI0.b>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313636q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313637r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35597a f313638s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C35597a c35597a, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f313638s = c35597a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f313638s, continuation);
        xVar.f313637r = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<KI0.b>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313636q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f313637r;
            this.f313637r = interfaceC43172j;
            this.f313636q = 1;
            if (C43131e0.b(1000L, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f313637r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<TypedResult<KI0.b>> interfaceC43160iA = this.f313638s.f313517c.a();
        this.f313637r = null;
        this.f313636q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
