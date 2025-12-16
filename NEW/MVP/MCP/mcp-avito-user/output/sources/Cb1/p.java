package cb1;

import Za1.C;
import bb1.s;
import eb1.C40084a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$testPushRepository$2$1", f = "RepositoryModule.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class p extends SuspendLambda implements Y41.l<Continuation<? super C>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58031q;

    public p() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new p(1, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super C> continuation) {
        return new p(1, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58031q;
        if (i12 == 0) {
            C42729a0.b(obj);
            jb1.e eVarA = q.a();
            this.f58031q = 1;
            obj = U.c(new s(eVarA.f405683a.f21043a, false, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        C c12 = ((C40084a) obj).f395249c;
        if (c12 != null) {
            return c12;
        }
        throw new IllegalArgumentException("TestPushIPCClient must be created at TestMasterHostIPCClientsFactory");
    }
}
