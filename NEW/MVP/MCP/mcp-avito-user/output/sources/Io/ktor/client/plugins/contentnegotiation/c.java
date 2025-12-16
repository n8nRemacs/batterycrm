package io.ktor.client.plugins.contentnegotiation;

import Y41.q;
import Y61.k;
import Y61.l;
import io.ktor.client.request.d0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContentNegotiation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", f = "ContentNegotiation.kt", i = {0}, l = {251, 252}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class c extends SuspendLambda implements q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399314q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399315r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f399316s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Continuation<? super c> continuation) {
        super(3, continuation);
        this.f399316s = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        c cVar = new c(this.f399316s, continuation);
        cVar.f399315r = eVar;
        return cVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws ContentConverterException {
        io.ktor.util.pipeline.e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399314q;
        if (i12 == 0) {
            C42729a0.b(obj);
            eVar = this.f399315r;
            d0 d0Var = (d0) eVar.f400528b;
            Object objE = eVar.e();
            this.f399315r = eVar;
            this.f399314q = 1;
            obj = this.f399316s.a(d0Var, objE, this);
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
            eVar = this.f399315r;
            C42729a0.b(obj);
        }
        if (obj == null) {
            return G0.f406611a;
        }
        this.f399315r = null;
        this.f399314q = 2;
        if (eVar.g(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
