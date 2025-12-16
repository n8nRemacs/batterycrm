package Hb1;

import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class Z extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7418q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.e f7419r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f7418q = wVar;
        this.f7419r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z(this.f7418q, this.f7419r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f7418q.le(new sberid.sdk.ui.screens.compose.elk.root.m(this.f7419r));
        return G0.f406611a;
    }
}
