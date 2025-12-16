package Hb1;

import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class V extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7410q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.o f7411r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.o oVar, Continuation continuation) {
        super(2, continuation);
        this.f7410q = wVar;
        this.f7411r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f7410q, this.f7411r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f7410q.le(new sberid.sdk.ui.screens.compose.elk.root.m(this.f7411r));
        return G0.f406611a;
    }
}
