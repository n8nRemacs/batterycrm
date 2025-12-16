package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
import java.util.HashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class u extends SuspendLambda implements Y41.s {

    /* renamed from: q, reason: collision with root package name */
    public int f437847q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ HashMap f437848r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ HashMap f437849s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ HashMap f437850t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ N41.g f437851u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f437852v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, Continuation continuation) {
        super(5, continuation);
        this.f437852v = wVar;
    }

    @Override // Y41.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u uVar = new u(this.f437852v, (Continuation) obj5);
        uVar.f437848r = (HashMap) obj;
        uVar.f437849s = (HashMap) obj2;
        uVar.f437850t = (HashMap) obj3;
        uVar.f437851u = (N41.g) obj4;
        return uVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f437847q;
        if (i12 == 0) {
            C42729a0.b(obj);
            HashMap map = this.f437848r;
            HashMap map2 = this.f437849s;
            HashMap map3 = this.f437850t;
            N41.g gVar = this.f437851u;
            w wVar = this.f437852v;
            Boolean bool = (Boolean) map2.get(((InterfaceC40658b) wVar.f437860M.getValue()).getF396624i());
            Z1 z12 = wVar.f437860M;
            Boolean bool2 = (Boolean) map.get(((InterfaceC40658b) z12.getValue()).getF396624i());
            InterfaceC40658b interfaceC40658b = (InterfaceC40658b) map3.get(((InterfaceC40658b) z12.getValue()).getF396624i());
            if (interfaceC40658b == null) {
                interfaceC40658b = (InterfaceC40658b) z12.getValue();
            }
            InterfaceC40658b interfaceC40658b2 = interfaceC40658b;
            boolean zNe = wVar.ne(interfaceC40658b2, map, map2);
            Boolean boolBoxBoolean = ((s) wVar.f437862O.getValue()).f437836e instanceof InterfaceC40658b.k ? Boxing.boxBoolean(wVar.me(interfaceC40658b2, map, map2)) : bool2;
            if (interfaceC40658b2.getF396624i() == null && !interfaceC40658b2.c()) {
                Cc1.c cVar = wVar.f437857J;
                cVar.getClass();
                ((G41.i) cVar.f2360e.f393144a).b(interfaceC40658b2.toString(), true);
            }
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(zNe);
            this.f437848r = null;
            this.f437849s = null;
            this.f437850t = null;
            this.f437847q = 1;
            if (this.f437852v.ke(bool, boolBoxBoolean, boolBoxBoolean2, gVar, interfaceC40658b2, this) == coroutine_suspended) {
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
