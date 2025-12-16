package Hb1;

import androidx.compose.runtime.InterfaceC22204y1;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* renamed from: Hb1.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13968t extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f7531q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ sberid.sdk.ui.screens.compose.elk.root.w f7532r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.l f7533s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f7534t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13968t(boolean z12, sberid.sdk.ui.screens.compose.elk.root.w wVar, InterfaceC40658b.l lVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f7531q = z12;
        this.f7532r = wVar;
        this.f7533s = lVar;
        this.f7534t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterfaceC40658b.l lVar = this.f7533s;
        InterfaceC22204y1 interfaceC22204y1 = this.f7534t;
        return new C13968t(this.f7531q, this.f7532r, lVar, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C13968t) create((kotlinx.coroutines.T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f7531q && !((sberid.sdk.ui.screens.compose.elk.root.s) this.f7534t.getF42167b()).f437832a) {
            this.f7532r.le(new sberid.sdk.ui.screens.compose.elk.root.l(this.f7533s));
        }
        return G0.f406611a;
    }
}
