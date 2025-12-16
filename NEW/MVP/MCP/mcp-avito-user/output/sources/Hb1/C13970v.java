package Hb1;

import androidx.compose.runtime.InterfaceC22204y1;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* renamed from: Hb1.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13970v extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f7539q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.h f7541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f7542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13970v(boolean z12, sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.h hVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f7539q = z12;
        this.f7540r = wVar;
        this.f7541s = hVar;
        this.f7542t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterfaceC40658b.h hVar = this.f7541s;
        InterfaceC22204y1 interfaceC22204y1 = this.f7542t;
        return new C13970v(this.f7539q, this.f7540r, hVar, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C13970v) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f7539q && !((sberid.sdk.ui.screens.compose.elk.root.s) this.f7542t.getF42167b()).f437832a) {
            this.f7540r.le(new sberid.sdk.ui.screens.compose.elk.root.l(this.f7541s));
        }
        return G0.f406611a;
    }
}
