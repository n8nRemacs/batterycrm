package io.ktor.client.plugins;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.t1;

/* compiled from: HttpRequestLifecycle.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class N extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399047q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399048r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399049s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(io.ktor.client.a aVar, Continuation<? super N> continuation) {
        super(3, continuation);
        this.f399049s = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        N n12 = new N(this.f399049s, continuation);
        n12.f399048r = eVar;
        return n12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.C c12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399047q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12 = (kotlinx.coroutines.C) this.f399048r;
            try {
                C42729a0.b(obj);
                c12.q3();
                return G0.f406611a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    c12.b(th);
                    throw th;
                } catch (Throwable th3) {
                    c12.q3();
                    throw th3;
                }
            }
        }
        C42729a0.b(obj);
        io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f399048r;
        kotlinx.coroutines.C cA2 = t1.a(((io.ktor.client.request.d0) eVar.f400528b).f399711e);
        N0 n02 = (N0) this.f399049s.f398778e.get(N0.f410716u2);
        org.slf4j.a aVar = S.f399055a;
        ((V0) cA2).k(new P(n02.k(new Q(cA2))));
        try {
            ((io.ktor.client.request.d0) eVar.f400528b).f399711e = cA2;
            this.f399048r = cA2;
            this.f399047q = 1;
            if (eVar.f(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c12 = cA2;
            c12.q3();
            return G0.f406611a;
        } catch (Throwable th4) {
            th = th4;
            c12 = cA2;
            c12.b(th);
            throw th;
        }
    }
}
