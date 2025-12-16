package B2;

import Y41.p;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import sberid.sdk.ui.screens.compose.elk.root.m;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f802q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f803r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, InterfaceC40658b.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f802q = wVar;
        this.f803r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f802q, this.f803r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f802q.le(new m(this.f803r));
        return G0.f406611a;
    }
}
