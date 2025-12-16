package io.ktor.client.plugins;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", i = {0, 1}, l = {130, 133}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
/* renamed from: io.ktor.client.plugins.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41462s extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399629q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399630r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399631s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41465v f399632t;

    /* compiled from: HttpCallValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C41465v f399633l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C41465v c41465v) {
            super(0);
            this.f399633l = c41465v;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f399633l.f399646c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41462s(C41465v c41465v, Continuation<? super C41462s> continuation) {
        super(3, continuation);
        this.f399632t = c41465v;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        C41462s c41462s = new C41462s(this.f399632t, continuation);
        c41462s.f399630r = eVar;
        c41462s.f399631s = obj;
        return c41462s.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.e] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f399629q;
        C41465v c41465v = this.f399632t;
        try {
            if (r12 == 0) {
                C42729a0.b(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f399630r;
                Object obj2 = this.f399631s;
                ((io.ktor.client.request.d0) eVar.f400528b).f399712f.e(C41476z.f399698b, new a(c41465v));
                this.f399630r = eVar;
                this.f399629q = 1;
                Object objG = eVar.g(obj2, this);
                r12 = eVar;
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f399630r;
                    C42729a0.b(obj);
                    throw th2;
                }
                io.ktor.util.pipeline.e eVar2 = (io.ktor.util.pipeline.e) this.f399630r;
                C42729a0.b(obj);
                r12 = eVar2;
            }
            return G0.f406611a;
        } catch (Throwable th3) {
            Throwable thA = io.ktor.client.utils.o.a(th3);
            io.ktor.client.request.d0 d0Var = (io.ktor.client.request.d0) r12.f400528b;
            org.slf4j.a aVar = C41476z.f399697a;
            C41475y c41475y = new C41475y(d0Var);
            this.f399630r = thA;
            this.f399629q = 2;
            if (C41465v.a(c41465v, thA, c41475y, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw thA;
        }
    }
}
