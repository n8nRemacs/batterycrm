package B2;

import Y41.p;
import androidx.compose.runtime.InterfaceC22204y1;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import sberid.sdk.ui.screens.compose.elk.root.l;
import sberid.sdk.ui.screens.compose.elk.root.s;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f804q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f805r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f806s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f807t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z12, w wVar, InterfaceC40658b.k kVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f804q = z12;
        this.f805r = wVar;
        this.f806s = kVar;
        this.f807t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterfaceC40658b.k kVar = this.f806s;
        InterfaceC22204y1 interfaceC22204y1 = this.f807t;
        return new b(this.f804q, this.f805r, kVar, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC22204y1 interfaceC22204y1 = this.f807t;
        if (((s) interfaceC22204y1.getF42167b()).f437834c && this.f804q && !((s) interfaceC22204y1.getF42167b()).f437832a) {
            this.f805r.le(new l(this.f806s));
        }
        return G0.f406611a;
    }
}
