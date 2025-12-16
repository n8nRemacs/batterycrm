package Hb1;

import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* renamed from: Hb1.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13966q extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.l f7515r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13966q(sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f7514q = wVar;
        this.f7515r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C13966q(this.f7514q, this.f7515r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C13966q) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f7514q.le(new sberid.sdk.ui.screens.compose.elk.root.m(this.f7515r));
        return G0.f406611a;
    }
}
