package Hb1;

import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* renamed from: Hb1.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13967s extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7528q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.h f7529r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13967s(sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f7528q = wVar;
        this.f7529r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C13967s(this.f7528q, this.f7529r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C13967s) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f7528q.le(new sberid.sdk.ui.screens.compose.elk.root.m(this.f7529r));
        return G0.f406611a;
    }
}
