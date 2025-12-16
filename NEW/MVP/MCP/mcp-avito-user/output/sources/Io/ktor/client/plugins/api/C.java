package io.ktor.client.plugins.api;

import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: KtorCallContexts.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {108, 115}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class C extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public U31.b f399081q;

    /* renamed from: r, reason: collision with root package name */
    public int f399082r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399083s;

    public C() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399082r;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399083s;
            io.ktor.client.statement.e eVar2 = (io.ktor.client.statement.e) eVar.e();
            U31.b bVar = eVar2.f399785a;
            if (!(eVar2.f399786b instanceof W0)) {
                return G0.f406611a;
            }
            new B();
            io.ktor.client.statement.d dVar = ((io.ktor.client.call.b) eVar.f400528b).f398806d;
            this.f399083s = eVar;
            this.f399081q = bVar;
            this.f399082r = 1;
            throw null;
        }
        if (i12 == 1) {
            U31.b bVar2 = this.f399081q;
            io.ktor.util.pipeline.e eVar3 = this.f399083s;
            C42729a0.b(obj);
            if (obj == null) {
                return G0.f406611a;
            }
            if (!(obj instanceof io.ktor.http.content.o) && !bVar2.f16154a.n0(obj)) {
                throw new IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + bVar2);
            }
            io.ktor.client.statement.e eVar4 = new io.ktor.client.statement.e(bVar2, obj);
            this.f399083s = null;
            this.f399081q = null;
            this.f399082r = 2;
            if (eVar3.g(eVar4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
