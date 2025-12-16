package B2;

import Y41.p;
import gc1.InterfaceC40658b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f808q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f809r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f810s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f811t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z12, w wVar, InterfaceC40658b.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f809r = z12;
        this.f810s = wVar;
        this.f811t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f809r, this.f810s, this.f811t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f808q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f808q = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (this.f809r) {
            this.f810s.le(new sberid.sdk.ui.screens.compose.elk.root.p(this.f811t));
        }
        return G0.f406611a;
    }
}
