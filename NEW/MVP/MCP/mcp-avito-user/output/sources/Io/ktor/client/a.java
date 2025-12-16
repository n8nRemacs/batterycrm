package io.ktor.client;

import Y41.q;
import com.avito.android.remote.model.AdvertStatus;
import io.ktor.client.engine.InterfaceC41434a;
import io.ktor.client.plugins.C;
import io.ktor.client.plugins.C41437a;
import io.ktor.client.plugins.C41453l;
import io.ktor.client.plugins.C41457m;
import io.ktor.client.plugins.C41465v;
import io.ktor.client.plugins.D;
import io.ktor.client.plugins.J;
import io.ktor.client.plugins.O;
import io.ktor.client.plugins.e0;
import io.ktor.client.request.d0;
import io.ktor.client.request.j0;
import io.ktor.client.request.l0;
import io.ktor.client.utils.r;
import io.ktor.util.C41586b;
import io.ktor.util.C41592e;
import io.ktor.util.InterfaceC41588c;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: HttpClient.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/a;", "Lkotlinx/coroutines/T;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a implements T, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f398774m = AtomicIntegerFieldUpdater.newUpdater(a.class, AdvertStatus.CLOSED);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41434a f398775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f398776c;

    @Y61.k
    private volatile /* synthetic */ int closed;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final P0 f398777d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f398778e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j0 f398779f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.statement.i f398780g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final l0 f398781h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.statement.c f398782i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f398783j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.ktor.events.b f398784k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.d<io.ktor.client.engine.j> f398785l;

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.client.a$a, reason: collision with other inner class name */
    public static final class C11396a extends N implements Y41.l<Throwable, G0> {
        public C11396a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            if (th2 != null) {
                U.b(a.this.f398775b, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HttpClient.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "call", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {144, 146}, m = "invokeSuspend", n = {"$this$intercept", "call"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f398787q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ io.ktor.util.pipeline.e f398788r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f398789s;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f398788r = eVar;
            bVar.f398789s = obj;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object obj2;
            io.ktor.util.pipeline.e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f398787q;
            if (i12 == 0) {
                C42729a0.b(obj);
                io.ktor.util.pipeline.e eVar2 = this.f398788r;
                obj2 = this.f398789s;
                if (!(obj2 instanceof io.ktor.client.call.b)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + m0.f406844a.b(obj2.getClass()) + ").").toString());
                }
                io.ktor.client.statement.c cVar = a.this.f398782i;
                G0 g02 = G0.f406611a;
                io.ktor.client.statement.d dVar = ((io.ktor.client.call.b) obj2).f398806d;
                if (dVar == null) {
                    dVar = null;
                }
                this.f398788r = eVar2;
                this.f398789s = obj2;
                this.f398787q = 1;
                Object objA = cVar.a(g02, dVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar = eVar2;
                obj = objA;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                obj2 = this.f398789s;
                eVar = this.f398788r;
                C42729a0.b(obj);
            }
            ((io.ktor.client.call.b) obj2).f398806d = (io.ktor.client.statement.d) obj;
            this.f398788r = null;
            this.f398789s = null;
            this.f398787q = 2;
            if (eVar.g(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/a;", "Lkotlin/G0;", "invoke", "(Lio/ktor/client/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.l<a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f398791l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(a aVar) {
            C41457m.a(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {177}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f398792q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ io.ktor.util.pipeline.e f398793r;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f398793r = eVar;
            return dVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            io.ktor.util.pipeline.e eVar;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f398792q;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = this.f398793r;
                try {
                    C42729a0.b(obj);
                    return G0.f406611a;
                } catch (Throwable th3) {
                    th2 = th3;
                    io.ktor.events.b bVar = a.this.f398784k;
                    io.ktor.events.a<r> aVar = io.ktor.client.utils.f.f399835d;
                    io.ktor.client.statement.d dVar = ((io.ktor.client.call.b) eVar.f400528b).f398806d;
                    bVar.a(aVar, new r());
                    throw th2;
                }
            }
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar2 = this.f398793r;
            try {
                this.f398793r = eVar2;
                this.f398792q = 1;
                if (eVar2.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            } catch (Throwable th4) {
                eVar = eVar2;
                th2 = th4;
                io.ktor.events.b bVar2 = a.this.f398784k;
                io.ktor.events.a<r> aVar2 = io.ktor.client.utils.f.f399835d;
                io.ktor.client.statement.d dVar2 = ((io.ktor.client.call.b) eVar.f400528b).f398806d;
                bVar2.a(aVar2, new r());
                throw th2;
            }
        }
    }

    public a() {
        throw null;
    }

    public a(@Y61.k InterfaceC41434a interfaceC41434a, @Y61.k io.ktor.client.d<? extends io.ktor.client.engine.j> dVar) {
        this.f398775b = interfaceC41434a;
        this.closed = 0;
        P0 p02 = new P0((N0) interfaceC41434a.getF401495c().get(N0.f410716u2));
        this.f398777d = p02;
        this.f398778e = interfaceC41434a.getF401495c().plus(p02);
        this.f398779f = new j0(dVar.f398844g);
        this.f398780g = new io.ktor.client.statement.i(dVar.f398844g);
        l0 l0Var = new l0(dVar.f398844g);
        this.f398781h = l0Var;
        this.f398782i = new io.ktor.client.statement.c(dVar.f398844g);
        this.f398783j = C41592e.a();
        this.f398784k = new io.ktor.events.b();
        io.ktor.client.d<io.ktor.client.engine.j> dVar2 = new io.ktor.client.d<>();
        this.f398785l = dVar2;
        if (this.f398776c) {
            p02.k(new C11396a());
        }
        interfaceC41434a.G1(this);
        l0.f399764g.getClass();
        l0Var.g(l0.f399769l, new b(null));
        dVar2.b(O.f399050a, e.f398849l);
        dVar2.b(C41437a.f399078a, e.f398849l);
        if (dVar.f398843f) {
            dVar2.f398840c.put("DefaultTransformers", c.f398791l);
        }
        dVar2.b(e0.f399413c, e.f398849l);
        dVar2.b(C41465v.f399642d, e.f398849l);
        if (dVar.f398842e) {
            dVar2.b(J.f399022c, e.f398849l);
        }
        dVar2.f398842e = dVar.f398842e;
        dVar2.f398843f = dVar.f398843f;
        dVar2.f398838a.putAll(dVar.f398838a);
        dVar2.f398839b.putAll(dVar.f398839b);
        dVar2.f398840c.putAll(dVar.f398840c);
        if (dVar.f398843f) {
            dVar2.b(D.f399005d, e.f398849l);
        }
        C41453l.a(dVar2);
        Iterator it = dVar2.f398838a.values().iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(this);
        }
        Iterator it2 = dVar2.f398840c.values().iterator();
        while (it2.hasNext()) {
            ((Y41.l) it2.next()).invoke(this);
        }
        io.ktor.client.statement.i iVar = this.f398780g;
        io.ktor.client.statement.i.f399792g.getClass();
        iVar.g(io.ktor.client.statement.i.f399793h, new d(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.client.request.d0 r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.b
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.b r0 = (io.ktor.client.b) r0
            int r1 = r0.f398797s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398797s = r1
            goto L18
        L13:
            io.ktor.client.b r0 = new io.ktor.client.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f398795q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398797s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            io.ktor.events.a<io.ktor.client.request.d0> r6 = io.ktor.client.utils.f.f399832a
            io.ktor.events.b r2 = r4.f398784k
            r2.a(r6, r5)
            java.lang.Object r6 = r5.f399710d
            r0.f398797s = r3
            io.ktor.client.request.j0 r2 = r4.f398779f
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            io.ktor.client.call.b r6 = (io.ktor.client.call.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.a.b(io.ktor.client.request.d0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f398774m.compareAndSet(this, 0, 1)) {
            InterfaceC41588c interfaceC41588c = (InterfaceC41588c) this.f398783j.g(C.f399003a);
            Iterator<T> it = interfaceC41588c.b().iterator();
            while (it.hasNext()) {
                Object objG = interfaceC41588c.g((C41586b) it.next());
                if (objG instanceof Closeable) {
                    ((Closeable) objG).close();
                }
            }
            this.f398777d.q3();
            if (this.f398776c) {
                this.f398775b.close();
            }
        }
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401495c() {
        return this.f398778e;
    }

    @Y61.k
    public final String toString() {
        return "HttpClient[" + this.f398775b + ']';
    }

    public /* synthetic */ a(InterfaceC41434a interfaceC41434a, io.ktor.client.d dVar, int i12, C42822w c42822w) {
        this(interfaceC41434a, (i12 & 2) != 0 ? new io.ktor.client.d() : dVar);
    }
}
