package io.ktor.client.engine.okhttp;

import io.ktor.client.engine.okhttp.u;
import io.ktor.client.plugins.i0;
import io.ktor.client.plugins.k0;
import io.ktor.client.plugins.websocket.z;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.util.B;
import io.ktor.util.m0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.t1;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* compiled from: OkHttpEngine.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/engine/okhttp/g;", "Lio/ktor/client/engine/e;", "c", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g extends io.ktor.client.engine.e {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final c f398919k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<OkHttpClient> f398920l = C42727D.c(b.f398928l);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.engine.okhttp.e f398921f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<io.ktor.client.engine.h<?>> f398922g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f398923h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f398924i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Map<i0.a, OkHttpClient> f398925j;

    /* compiled from: OkHttpEngine.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f398926q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return g.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Iterator<Map.Entry<i0.a, OkHttpClient>> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f398926q;
            g gVar = g.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    N0 n02 = (N0) gVar.f398923h.get(N0.f410716u2);
                    this.f398926q = 1;
                    if (n02.A(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                while (it.hasNext()) {
                    OkHttpClient value = it.next().getValue();
                    value.connectionPool().evictAll();
                    value.dispatcher().executorService().shutdown();
                }
                return G0.f406611a;
            } finally {
                it = gVar.f398925j.entrySet().iterator();
                while (it.hasNext()) {
                    OkHttpClient value2 = it.next().getValue();
                    value2.connectionPool().evictAll();
                    value2.dispatcher().executorService().shutdown();
                }
            }
        }
    }

    /* compiled from: OkHttpEngine.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements Y41.a<OkHttpClient> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f398928l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().build();
        }
    }

    /* compiled from: OkHttpEngine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/engine/okhttp/g$c;", "", "<init>", "()V", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: OkHttpEngine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<i0.a, OkHttpClient> {
        /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final OkHttpClient invoke(i0.a aVar) {
            i0.a aVar2 = aVar;
            io.ktor.client.engine.okhttp.e eVar = ((g) this.receiver).f398921f;
            eVar.getClass();
            g.f398919k.getClass();
            OkHttpClient.Builder builderNewBuilder = g.f398920l.getValue().newBuilder();
            builderNewBuilder.dispatcher(new Dispatcher());
            eVar.f398914a.invoke(builderNewBuilder);
            if (aVar2 != null) {
                Long l12 = aVar2.f399446b;
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    org.slf4j.a aVar3 = k0.f399483a;
                    if (jLongValue == Long.MAX_VALUE) {
                        jLongValue = 0;
                    }
                    builderNewBuilder.connectTimeout(jLongValue, TimeUnit.MILLISECONDS);
                }
                Long l13 = aVar2.f399447c;
                if (l13 != null) {
                    long jLongValue2 = l13.longValue();
                    org.slf4j.a aVar4 = k0.f399483a;
                    long j12 = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    builderNewBuilder.readTimeout(j12, timeUnit);
                    builderNewBuilder.writeTimeout(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
                }
            }
            return builderNewBuilder.build();
        }
    }

    /* compiled from: OkHttpEngine.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/OkHttpClient;", "it", "Lkotlin/G0;", "invoke", "(Lokhttp3/OkHttpClient;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends N implements Y41.l<OkHttpClient, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f398929l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(OkHttpClient okHttpClient) {
            return G0.f406611a;
        }
    }

    public g(@Y61.k io.ktor.client.engine.okhttp.e eVar) {
        super("ktor-okhttp");
        this.f398921f = eVar;
        this.f398922g = C42756l.l0(new io.ktor.client.engine.h[]{i0.f399440d, z.f399686a});
        this.f398925j = Collections.synchronizedMap(new m0(new d(1, this, g.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0), e.f398929l, eVar.f398915b));
        CoroutineContext coroutineContextPlus = CoroutineContext.Element.DefaultImpls.plus((V0) t1.a((N0) super.getF398977e().get(N0.f410716u2)), new B(kotlinx.coroutines.N.f410714t2));
        this.f398923h = coroutineContextPlus;
        this.f398924i = super.getF398977e().plus(coroutineContextPlus);
        C43259k.c(D0.f410691b, super.getF398977e(), CoroutineStart.f410682d, new a(null));
    }

    public static io.ktor.client.request.k0 b(Response response, Q31.b bVar, Object obj, CoroutineContext coroutineContext) {
        C41533m0 c41533m0;
        C41535n0 c41535n0 = new C41535n0(response.code(), response.message());
        switch (u.a.f398984a[response.protocol().ordinal()]) {
            case 1:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400067g;
                break;
            case 2:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400066f;
                break;
            case 3:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400068h;
                break;
            case 4:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400065e;
                break;
            case 5:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400065e;
                break;
            case 6:
                C41533m0.f400064d.getClass();
                c41533m0 = C41533m0.f400069i;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new io.ktor.client.request.k0(c41535n0, bVar, new w(response.headers()), c41533m0, obj, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // io.ktor.client.engine.InterfaceC41434a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(@Y61.k io.ktor.client.request.e0 r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.g.b1(io.ktor.client.request.e0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.OkHttpClient r8, okhttp3.Request r9, kotlin.coroutines.CoroutineContext r10, io.ktor.client.request.e0 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof io.ktor.client.engine.okhttp.i
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.client.engine.okhttp.i r0 = (io.ktor.client.engine.okhttp.i) r0
            int r1 = r0.f398941w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398941w = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.i r0 = new io.ktor.client.engine.okhttp.i
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.f398939u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398941w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            Q31.b r8 = r0.f398938t
            io.ktor.client.request.e0 r11 = r0.f398937s
            kotlin.coroutines.CoroutineContext r10 = r0.f398936r
            io.ktor.client.engine.okhttp.g r9 = r0.f398935q
            kotlin.C42729a0.b(r12)
            goto L7f
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.C42729a0.b(r12)
            Q31.b r12 = io.ktor.util.date.a.b(r3)
            r0.f398935q = r7
            r0.f398936r = r10
            r0.f398937s = r11
            r0.f398938t = r12
            r0.f398941w = r4
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4, r5)
            r2.p()
            okhttp3.Call r8 = r8.newCall(r9)
            io.ktor.client.engine.okhttp.b r9 = new io.ktor.client.engine.okhttp.b
            r9.<init>(r11, r2)
            r8.enqueue(r9)
            io.ktor.client.engine.okhttp.v r9 = new io.ktor.client.engine.okhttp.v
            r9.<init>(r8)
            r2.r(r9)
            java.lang.Object r8 = r2.o()
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L78
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L78:
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r9 = r7
            r6 = r12
            r12 = r8
            r8 = r6
        L7f:
            okhttp3.Response r12 = (okhttp3.Response) r12
            okhttp3.ResponseBody r0 = r12.body()
            kotlinx.coroutines.N0$b r1 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext$Element r1 = r10.get(r1)
            kotlinx.coroutines.N0 r1 = (kotlinx.coroutines.N0) r1
            io.ktor.client.engine.okhttp.j r2 = new io.ktor.client.engine.okhttp.j
            r2.<init>(r0)
            r1.k(r2)
            if (r0 == 0) goto Laf
            okio.n r0 = r0.getSource()
            if (r0 == 0) goto Laf
            kotlinx.coroutines.D0 r1 = kotlinx.coroutines.D0.f410691b
            io.ktor.client.engine.okhttp.p r2 = new io.ktor.client.engine.okhttp.p
            r2.<init>(r0, r10, r11, r3)
            r11 = 0
            io.ktor.utils.io.d2 r11 = io.ktor.utils.io.C41714z1.b(r1, r10, r11, r2)
            io.ktor.utils.io.X r11 = r11.x()
            if (r11 != 0) goto Lbc
        Laf:
            io.ktor.utils.io.W0$a r11 = io.ktor.utils.io.W0.f400795a
            r11.getClass()
            kotlin.C<io.ktor.utils.io.X> r11 = io.ktor.utils.io.W0.a.f400797b
            java.lang.Object r11 = r11.getValue()
            io.ktor.utils.io.W0 r11 = (io.ktor.utils.io.W0) r11
        Lbc:
            r9.getClass()
            io.ktor.client.request.k0 r8 = b(r12, r8, r11, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.g.c(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, io.ktor.client.request.e0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.client.engine.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        ((C) this.f398923h.get(N0.f410716u2)).q3();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(okhttp3.OkHttpClient r6, okhttp3.Request r7, kotlin.coroutines.CoroutineContext r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.client.engine.okhttp.k
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.engine.okhttp.k r0 = (io.ktor.client.engine.okhttp.k) r0
            int r1 = r0.f398949w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398949w = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.k r0 = new io.ktor.client.engine.okhttp.k
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f398947u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398949w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            io.ktor.client.engine.okhttp.s r6 = r0.f398946t
            Q31.b r7 = r0.f398945s
            kotlin.coroutines.CoroutineContext r8 = r0.f398944r
            io.ktor.client.engine.okhttp.g r0 = r0.f398943q
            kotlin.C42729a0.b(r9)
            goto L67
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r9)
            r9 = 0
            Q31.b r9 = io.ktor.util.date.a.b(r9)
            io.ktor.client.engine.okhttp.s r2 = new io.ktor.client.engine.okhttp.s
            io.ktor.client.engine.okhttp.e r4 = r5.f398921f
            r4.getClass()
            r2.<init>(r6, r7, r8)
            kotlinx.coroutines.z<io.ktor.client.engine.okhttp.s> r6 = r2.f398978f
            r6.n(r2)
            kotlinx.coroutines.z<okhttp3.Response> r6 = r2.f398979g
            r0.f398943q = r5
            r0.f398944r = r8
            r0.f398945s = r9
            r0.f398946t = r2
            r0.f398949w = r3
            java.lang.Object r6 = r6.F(r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            r0 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L67:
            okhttp3.Response r9 = (okhttp3.Response) r9
            r0.getClass()
            io.ktor.client.request.k0 r6 = b(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.g.f(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.client.engine.e, kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF398977e() {
        return this.f398924i;
    }

    @Override // io.ktor.client.engine.e, io.ktor.client.engine.InterfaceC41434a
    @Y61.k
    public final Set<io.ktor.client.engine.h<?>> m4() {
        return this.f398922g;
    }
}
