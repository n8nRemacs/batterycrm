package Qa1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$pushTestComponent$2$1", f = "VkpnsClientSdk.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class o extends SuspendLambda implements Y41.l<Continuation<? super Z<? extends String>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f13850q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f13851r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, Continuation<? super o> continuation) {
        super(1, continuation);
        this.f13851r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new o(this.f13851r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super Z<? extends String>> continuation) {
        return new o(this.f13851r, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f13850q;
        j jVar = this.f13851r;
        if (i12 == 0) {
            C42729a0.b(obj);
            N0 n02 = jVar.f13827p;
            if (n02 != null) {
                this.f13850q = 1;
                if (((V0) n02).A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        try {
            int i13 = Z.f406624c;
            bVar = jVar.c().c();
        } catch (Throwable th2) {
            int i14 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return Z.a(bVar);
    }
}
