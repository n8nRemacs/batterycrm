package ca1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;

/* renamed from: ca1.r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27152r extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f57960q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C27154t f57961r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f57962s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27152r(C27154t c27154t, String str, Continuation continuation) {
        super(2, continuation);
        this.f57961r = c27154t;
        this.f57962s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C27152r(this.f57961r, this.f57962s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C27152r) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f57960q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f57960q = 1;
            Object objG = C43259k.g(C43262l0.f411947c, new C27150p(this.f57961r, this.f57962s, null), this);
            if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objG = G0.f406611a;
            }
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
