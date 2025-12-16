package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43131e0;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/U;", "", "a", "b", "c", "d", "e", "f", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final d f399057g = new d(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C41586b<U> f399058h = new C41586b<>("RetryFeature");

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.events.a<e> f399059i = new io.ktor.events.a<>();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.q<f, io.ktor.client.request.c0, io.ktor.client.statement.d, Boolean> f399060a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<f, io.ktor.client.request.d0, Throwable, Boolean> f399061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<b, Integer, Long> f399062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Long, Continuation<? super G0>, Object> f399063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<c, io.ktor.client.request.d0, G0> f399065f;

    /* compiled from: HttpRequestRetry.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/U$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Y41.q<? super f, ? super io.ktor.client.request.c0, ? super io.ktor.client.statement.d, Boolean> f399066a;

        /* renamed from: b, reason: collision with root package name */
        public final Y41.q<? super f, ? super io.ktor.client.request.d0, ? super Throwable, Boolean> f399067b;

        /* renamed from: c, reason: collision with root package name */
        public final Y41.p<? super b, ? super Integer, Long> f399068c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.p<? super c, ? super io.ktor.client.request.d0, G0> f399069d = b.f399074l;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.p<? super Long, ? super Continuation<? super G0>, ? extends Object> f399070e = new C11398a(2, null);

        /* renamed from: f, reason: collision with root package name */
        public final int f399071f;

        /* compiled from: HttpRequestRetry.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(J)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetry$Configuration$delay$1", f = "HttpRequestRetry.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.client.plugins.U$a$a, reason: collision with other inner class name */
        public static final class C11398a extends SuspendLambda implements Y41.p<Long, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f399072q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ long f399073r;

            public C11398a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C11398a c11398a = new C11398a(2, continuation);
                c11398a.f399073r = ((Number) obj).longValue();
                return c11398a;
            }

            @Override // Y41.p
            public final Object invoke(Long l12, Continuation<? super G0> continuation) {
                return ((C11398a) create(Long.valueOf(l12.longValue()), continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f399072q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    long j12 = this.f399073r;
                    this.f399072q = 1;
                    if (C43131e0.b(j12, this) == coroutine_suspended) {
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

        /* compiled from: HttpRequestRetry.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/U$c;", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "invoke", "(Lio/ktor/client/plugins/U$c;Lio/ktor/client/request/d0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.p<c, io.ktor.client.request.d0, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f399074l = new b();

            public b() {
                super(2);
            }

            @Override // Y41.p
            public final /* bridge */ /* synthetic */ G0 invoke(c cVar, io.ktor.client.request.d0 d0Var) {
                return G0.f406611a;
            }
        }

        public a() {
            a0 a0Var = a0.f399080l;
            this.f399071f = 3;
            this.f399066a = a0Var;
            Z z12 = new Z(3);
            this.f399071f = 3;
            this.f399067b = z12;
            this.f399068c = new V(new W(2));
        }
    }

    /* compiled from: HttpRequestRetry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/U$b;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final io.ktor.client.statement.d f399075a;

        public b(@Y61.l io.ktor.client.statement.d dVar) {
            this.f399075a = dVar;
        }
    }

    /* compiled from: HttpRequestRetry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/U$c;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: HttpRequestRetry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/U$d;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/U$a;", "Lio/ktor/client/plugins/U;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements A<a, U> {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(U u12, io.ktor.client.a aVar) {
            e0 e0Var = (e0) C.a(aVar, e0.f399413c);
            e0Var.f399416b.add(new b0(u12, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final U b(Y41.l<? super a, G0> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new U(aVar);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<U> getKey() {
            return U.f399058h;
        }

        public d() {
        }
    }

    /* compiled from: HttpRequestRetry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/U$e;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final io.ktor.client.statement.d f399076a;

        public e(@Y61.k io.ktor.client.request.d0 d0Var, int i12, @Y61.l io.ktor.client.statement.d dVar, @Y61.l Throwable th2) {
            this.f399076a = dVar;
        }
    }

    /* compiled from: HttpRequestRetry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/U$f;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(@Y61.k a aVar) {
        Y41.q qVar = aVar.f399066a;
        this.f399060a = qVar == null ? null : qVar;
        Y41.q qVar2 = aVar.f399067b;
        this.f399061b = qVar2 == null ? null : qVar2;
        Y41.p pVar = aVar.f399068c;
        this.f399062c = pVar != null ? pVar : null;
        this.f399063d = aVar.f399070e;
        this.f399064e = aVar.f399071f;
        this.f399065f = aVar.f399069d;
    }
}
