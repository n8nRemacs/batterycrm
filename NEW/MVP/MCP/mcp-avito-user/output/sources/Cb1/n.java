package cb1;

import bb1.s;
import eb1.C40084a;
import eb1.C40085b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$provideRegisterPushTokenDataSource$1", f = "RepositoryModule.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.l<Continuation<? super C40085b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58029q;

    public n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new n(1, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super C40085b> continuation) {
        return new n(1, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58029q;
        if (i12 == 0) {
            C42729a0.b(obj);
            jb1.e eVarA = q.a();
            this.f58029q = 1;
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
        C40084a c40084a = (C40084a) obj;
        return new C40085b(c40084a.f395247a, c40084a.f395248b);
    }
}
