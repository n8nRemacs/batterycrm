package io.ktor.client.plugins.logging;

import io.ktor.client.request.c0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$2", f = "Logging.kt", i = {0, 1, 1, 2}, l = {201, 206, 207}, m = "invokeSuspend", n = {"$this$intercept", "cause", "logger", "cause"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes8.dex */
final class p extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public d f399547q;

    /* renamed from: r, reason: collision with root package name */
    public int f399548r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399549s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f399550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, Continuation<? super p> continuation) {
        super(3, continuation);
        this.f399550t = kVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        p pVar = new p(this.f399550t, continuation);
        pVar.f399549s = eVar;
        return pVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.e] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        d dVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f399548r;
        k kVar = this.f399550t;
        try {
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb2 = new StringBuilder();
            d dVar2 = (d) ((io.ktor.client.call.b) r12.f400528b).q().g(s.f399555a);
            c0 c0Var = ((io.ktor.client.call.b) r12.f400528b).f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            k.b(kVar, sb2, c0Var, th);
            String string = sb2.toString();
            this.f399549s = th;
            this.f399547q = dVar2;
            this.f399548r = 2;
            if (dVar2.d(string, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = dVar2;
        }
        if (r12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f399549s;
            if (kVar.f399526b == LogLevel.f399490f || ((io.ktor.client.call.b) eVar.f400528b).q().c(s.f399556b)) {
                return G0.f406611a;
            }
            this.f399549s = eVar;
            this.f399548r = 1;
            Object objF = eVar.f(this);
            r12 = eVar;
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.f399549s;
                    C42729a0.b(obj);
                    throw th3;
                }
                dVar = this.f399547q;
                Throwable th4 = (Throwable) this.f399549s;
                C42729a0.b(obj);
                th = th4;
                this.f399549s = th;
                this.f399547q = null;
                this.f399548r = 3;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
            io.ktor.util.pipeline.e eVar2 = (io.ktor.util.pipeline.e) this.f399549s;
            C42729a0.b(obj);
            r12 = eVar2;
        }
        return G0.f406611a;
    }
}
