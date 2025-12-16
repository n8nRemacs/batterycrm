package e;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394219q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f394220r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N41.f f394221s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, N41.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f394220r = hVar;
        this.f394221s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f394220r, this.f394221s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394219q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f394220r.f394229b;
            this.f394219q = 1;
            if (z12.emit(this.f394221s, this) == coroutine_suspended) {
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
