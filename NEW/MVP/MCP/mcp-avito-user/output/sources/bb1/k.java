package bb1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ClientIdDataSource$getClientId$2$1", f = "ClientIdDataSource.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class k extends SuspendLambda implements Y41.p<T, Continuation<? super W11.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f57239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f57240r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f57240r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new k(this.f57240r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super W11.a> continuation) {
        return new k(this.f57240r, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f57239q;
        if (i12 == 0) {
            C42729a0.b(obj);
            l lVar = this.f57240r;
            this.f57239q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            try {
                throw null;
            } catch (Exception e12) {
                lVar.f57241a.error("Client id obtaining is failed with error: " + e12, null);
                com.vk.push.core.utils.d.a(rVar, null);
                obj = rVar.o();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
