package cb1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$arbiterRepository$2$1", f = "RepositoryModule.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: cb1.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27170i extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58024q;

    public C27170i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new C27170i(1, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return new C27170i(1, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58024q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T11.f fVar = q.f58032a;
            C27169h.f57985a.getClass();
            jb1.c cVar = new jb1.c(C27169h.c(), (qb1.g) C27169h.f57989e.getValue(), fVar);
            this.f58024q = 1;
            if (cVar.a(true, this) == coroutine_suspended) {
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
