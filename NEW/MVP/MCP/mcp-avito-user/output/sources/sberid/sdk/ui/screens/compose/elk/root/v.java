package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class v extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f437853q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f437854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b f437855s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC40658b interfaceC40658b, Continuation continuation) {
        super(2, continuation);
        this.f437854r = wVar;
        this.f437855s = interfaceC40658b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f437854r, this.f437855s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f437853q;
        w wVar = this.f437854r;
        InterfaceC40658b interfaceC40658b = this.f437855s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = wVar.f437860M;
            this.f437853q = 1;
            if (z12.emit(interfaceC40658b, this) == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        if (interfaceC40658b.getF396624i() == null && !interfaceC40658b.c()) {
            Cc1.c cVar = wVar.f437857J;
            cVar.getClass();
            ((G41.i) cVar.f2360e.f393144a).b(interfaceC40658b.toString(), true);
        }
        wVar.f437857J.a(interfaceC40658b.getF396624i(), interfaceC40658b);
        Boolean boolBoxBoolean = Boxing.boxBoolean(interfaceC40658b.getF396624i() != null);
        this.f437853q = 2;
        if (this.f437854r.ke(boolBoxBoolean, null, null, null, this.f437855s, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
