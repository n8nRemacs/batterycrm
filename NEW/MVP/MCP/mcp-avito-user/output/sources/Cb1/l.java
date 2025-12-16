package cb1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$provideIPCClientsDataSource$1", f = "RepositoryModule.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements Y41.l<Continuation<? super T11.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58027q;

    public l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new l(1, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super T11.a> continuation) {
        return new l(1, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58027q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C27169h.f57985a.getClass();
            ab1.e eVar = (ab1.e) C27169h.f57991g.getValue();
            this.f58027q = 1;
            obj = eVar.c(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
