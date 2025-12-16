package Hb1;

import androidx.compose.runtime.InterfaceC22204y1;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class Y extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f7414q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.o f7416s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f7417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(boolean z12, sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.o oVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f7414q = z12;
        this.f7415r = wVar;
        this.f7416s = oVar;
        this.f7417t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterfaceC40658b.o oVar = this.f7416s;
        InterfaceC22204y1 interfaceC22204y1 = this.f7417t;
        return new Y(this.f7414q, this.f7415r, oVar, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f7414q) {
            int i12 = e0.f7452a;
            if (!((sberid.sdk.ui.screens.compose.elk.root.s) this.f7417t.getF42167b()).f437832a) {
                this.f7415r.le(new sberid.sdk.ui.screens.compose.elk.root.l(this.f7416s));
            }
        }
        return G0.f406611a;
    }
}
