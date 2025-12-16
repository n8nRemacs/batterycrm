package io.ktor.client.engine;

import io.ktor.client.request.e0;
import io.ktor.client.request.k0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: HttpClientEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lio/ktor/client/request/k0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lio/ktor/client/request/k0;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.client.engine.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41436c extends SuspendLambda implements Y41.p<T, Continuation<? super k0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f398890q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41434a f398891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f398892s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41436c(InterfaceC41434a interfaceC41434a, e0 e0Var, Continuation<? super C41436c> continuation) {
        super(2, continuation);
        this.f398891r = interfaceC41434a;
        this.f398892s = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C41436c(this.f398891r, this.f398892s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super k0> continuation) {
        return ((C41436c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398890q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41434a interfaceC41434a = this.f398891r;
            N0 n02 = (N0) interfaceC41434a.getF398924i().get(N0.f410716u2);
            if (!(n02 != null ? n02.isActive() : false)) {
                throw new ClientEngineClosedException(null, 1, null);
            }
            this.f398890q = 1;
            obj = interfaceC41434a.b1(this.f398892s, this);
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
