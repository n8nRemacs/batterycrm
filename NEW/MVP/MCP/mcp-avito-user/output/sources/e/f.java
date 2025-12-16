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
public final class f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394222q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f394223r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f394224s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f394223r = hVar;
        this.f394224s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f394223r, this.f394224s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394222q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f394223r.f394232e;
            this.f394222q = 1;
            if (z12.emit(this.f394224s, this) == coroutine_suspended) {
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
