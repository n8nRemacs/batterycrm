package io.ktor.client.plugins;

import io.ktor.http.C41519f0;
import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BodyProgress.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/d;", "Lkotlin/G0;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.client.plugins.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41443c extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0>, io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399107q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399108r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.d f399109s;

    public C41443c() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0> eVar, io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        C41443c c41443c = new C41443c(3, continuation);
        c41443c.f399108r = eVar;
        c41443c.f399109s = dVar;
        return c41443c.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399107q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399108r;
            io.ktor.client.statement.d dVar = this.f399109s;
            io.ktor.client.request.c0 c0Var = dVar.getF399772b().f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            Y41.q qVar = (Y41.q) c0Var.getF399113d().d(C41445d.f399405b);
            if (qVar == null) {
                return G0.f406611a;
            }
            W0 f399609c = dVar.getF399609c();
            CoroutineContext f399611e = dVar.getF399611e();
            io.ktor.http.T f399115f = dVar.getF399115f();
            C41519f0.f400005a.getClass();
            String str = f399115f.get(C41519f0.f400013i);
            io.ktor.client.statement.d dVar2 = io.ktor.client.plugins.observer.b.a(dVar.getF399772b(), io.ktor.client.utils.b.a(f399609c, f399611e, str != null ? Long.valueOf(Long.parseLong(str)) : null, qVar)).f398806d;
            if (dVar2 == null) {
                dVar2 = null;
            }
            this.f399108r = null;
            this.f399107q = 1;
            if (eVar.g(dVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
