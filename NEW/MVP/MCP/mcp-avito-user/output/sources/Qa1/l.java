package Qa1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$getToken$1", f = "VkpnsClientSdk.kt", i = {}, l = {190, 195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f13840q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f13841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.rustore.sdk.core.tasks.f<String>.b f13842s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, ru.rustore.sdk.core.tasks.f<String>.b bVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f13841r = jVar;
        this.f13842s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new l(this.f13841r, this.f13842s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return new l(this.f13841r, this.f13842s, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f13840q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = (a) this.f13841r.f13821j.getValue();
            this.f13840q = 1;
            obj = aVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        String str = (String) obj;
        ru.rustore.sdk.core.tasks.f<String>.b bVar = this.f13842s;
        if (str != null && !C43066x.K(str)) {
            bVar.b(str);
            return G0.f406611a;
        }
        this.f13840q = 2;
        j jVar = j.f13811r;
        if (jVar == null) {
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }
        Object objF = ((a) jVar.f13821j.getValue()).f(bVar, this);
        if (objF != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objF = G0.f406611a;
        }
        if (objF == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
