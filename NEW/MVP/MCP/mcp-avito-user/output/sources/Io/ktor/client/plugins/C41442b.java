package io.ktor.client.plugins;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BodyProgress.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "content", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.client.plugins.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41442b extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399092q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399093r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399094s;

    public C41442b() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        C41442b c41442b = new C41442b(3, continuation);
        c41442b.f399093r = eVar;
        c41442b.f399094s = obj;
        return c41442b.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399092q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399093r;
            Object obj2 = this.f399094s;
            Y41.q qVar = (Y41.q) ((io.ktor.client.request.d0) eVar.f400528b).f399712f.d(C41445d.f399404a);
            if (qVar == null) {
                return G0.f406611a;
            }
            io.ktor.client.content.d dVar = new io.ktor.client.content.d((io.ktor.http.content.p) obj2, ((io.ktor.client.request.d0) eVar.f400528b).f399711e, qVar);
            this.f399093r = null;
            this.f399092q = 1;
            if (eVar.g(dVar, this) == coroutine_suspended) {
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
