package e;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394211q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f394212r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f394212r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f394212r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f394212r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394211q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f394212r.f394238k;
            this.f394211q = 1;
            if (z12.emit("", this) == coroutine_suspended) {
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
