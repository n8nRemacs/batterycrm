package io.ktor.client.plugins;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "container", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", i = {0, 1}, l = {142, 145}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
/* renamed from: io.ktor.client.plugins.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41463t extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399634q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399635r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.e f399636s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41465v f399637t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41463t(C41465v c41465v, Continuation<? super C41463t> continuation) {
        super(3, continuation);
        this.f399637t = c41465v;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        C41463t c41463t = new C41463t(this.f399637t, continuation);
        c41463t.f399635r = eVar;
        c41463t.f399636s = eVar2;
        return c41463t.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.e] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f399634q;
        try {
            if (r12 == 0) {
                C42729a0.b(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f399635r;
                io.ktor.client.statement.e eVar2 = this.f399636s;
                this.f399635r = eVar;
                this.f399634q = 1;
                Object objG = eVar.g(eVar2, this);
                r12 = eVar;
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f399635r;
                    C42729a0.b(obj);
                    throw th2;
                }
                io.ktor.util.pipeline.e eVar3 = (io.ktor.util.pipeline.e) this.f399635r;
                C42729a0.b(obj);
                r12 = eVar3;
            }
            return G0.f406611a;
        } catch (Throwable th3) {
            Throwable thA = io.ktor.client.utils.o.a(th3);
            io.ktor.client.request.c0 c0Var = ((io.ktor.client.call.b) r12.f400528b).f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            this.f399635r = thA;
            this.f399634q = 2;
            if (C41465v.a(this.f399637t, thA, c0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw thA;
        }
    }
}
