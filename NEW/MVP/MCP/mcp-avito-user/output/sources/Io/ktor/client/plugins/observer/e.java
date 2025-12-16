package io.ktor.client.plugins.observer;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import io.ktor.client.plugins.A;
import io.ktor.util.C41586b;
import io.ktor.util.C41607n;
import io.ktor.util.k0;
import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ResponseObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/observer/e;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f399612c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C41586b<e> f399613d = new C41586b<>("BodyInterceptor");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p<io.ktor.client.statement.d, Continuation<? super G0>, Object> f399614a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<io.ktor.client.call.b, Boolean> f399615b;

    /* compiled from: ResponseObserver.kt */
    @k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/observer/e$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public p<? super io.ktor.client.statement.d, ? super Continuation<? super G0>, ? extends Object> f399616a = new C11408a(2, null);

        /* compiled from: ResponseObserver.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Config$responseHandler$1", f = "ResponseObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.client.plugins.observer.e$a$a, reason: collision with other inner class name */
        public static final class C11408a extends SuspendLambda implements p<io.ktor.client.statement.d, Continuation<? super G0>, Object> {
            public C11408a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C11408a(2, continuation);
            }

            @Override // Y41.p
            public final Object invoke(io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
                return ((C11408a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return G0.f406611a;
            }
        }
    }

    /* compiled from: ResponseObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/observer/e$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/observer/e$a;", "Lio/ktor/client/plugins/observer/e;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, e> {

        /* compiled from: ResponseObserver.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/d;", "Lkotlin/G0;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {68, 77}, m = "invokeSuspend", n = {"$this$intercept", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
        public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0>, io.ktor.client.statement.d, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public io.ktor.client.statement.d f399617q;

            /* renamed from: r, reason: collision with root package name */
            public io.ktor.client.a f399618r;

            /* renamed from: s, reason: collision with root package name */
            public int f399619s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ io.ktor.util.pipeline.e f399620t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ io.ktor.client.statement.d f399621u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ e f399622v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ io.ktor.client.a f399623w;

            /* compiled from: ResponseObserver.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", f = "ResponseObserver.kt", i = {0}, l = {69, 73}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
            /* renamed from: io.ktor.client.plugins.observer.e$b$a$a, reason: collision with other inner class name */
            public static final class C11409a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f399624q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f399625r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ io.ktor.client.statement.d f399626s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ e f399627t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11409a(io.ktor.client.statement.d dVar, e eVar, Continuation<? super C11409a> continuation) {
                    super(2, continuation);
                    this.f399626s = dVar;
                    this.f399627t = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    C11409a c11409a = new C11409a(this.f399626s, this.f399627t, continuation);
                    c11409a.f399625r = obj;
                    return c11409a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C11409a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f399624q;
                    io.ktor.client.statement.d dVar = this.f399626s;
                    try {
                        try {
                        } catch (Throwable unused) {
                            int i13 = Z.f406624c;
                        }
                    } catch (Throwable unused2) {
                        int i14 = Z.f406624c;
                    }
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        T t12 = (T) this.f399625r;
                        e eVar = this.f399627t;
                        int i15 = Z.f406624c;
                        p<io.ktor.client.statement.d, Continuation<? super G0>, Object> pVar = eVar.f399614a;
                        this.f399625r = t12;
                        this.f399624q = 1;
                        if (pVar.invoke(dVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                            Boxing.boxLong(((Number) obj).longValue());
                            int i16 = Z.f406624c;
                            return G0.f406611a;
                        }
                        C42729a0.b(obj);
                    }
                    G0 g02 = G0.f406611a;
                    int i17 = Z.f406624c;
                    W0 f399778h = dVar.getF399778h();
                    if (!f399778h.x()) {
                        this.f399625r = null;
                        this.f399624q = 2;
                        obj = f399778h.C(Long.MAX_VALUE, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boxing.boxLong(((Number) obj).longValue());
                        int i162 = Z.f406624c;
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, io.ktor.client.a aVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f399622v = eVar;
                this.f399623w = aVar;
            }

            @Override // Y41.q
            public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0> eVar, io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
                a aVar = new a(this.f399622v, this.f399623w, continuation);
                aVar.f399620t = eVar;
                aVar.f399621u = dVar;
                return aVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                io.ktor.util.pipeline.e eVar;
                io.ktor.client.statement.d dVar;
                io.ktor.client.statement.d dVar2;
                io.ktor.client.a aVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f399619s;
                e eVar2 = this.f399622v;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    eVar = this.f399620t;
                    io.ktor.client.statement.d dVar3 = this.f399621u;
                    Y41.l<io.ktor.client.call.b, Boolean> lVar = eVar2.f399615b;
                    if (lVar != null && !lVar.invoke(dVar3.getF399772b()).booleanValue()) {
                        return G0.f406611a;
                    }
                    Q qB2 = C41607n.b(dVar3.getF399778h(), dVar3);
                    W0 w02 = (W0) qB2.f406619b;
                    io.ktor.client.statement.d dVar4 = io.ktor.client.plugins.observer.b.a(dVar3.getF399772b(), (W0) qB2.f406620c).f398806d;
                    if (dVar4 == null) {
                        dVar4 = null;
                    }
                    io.ktor.client.statement.d dVar5 = io.ktor.client.plugins.observer.b.a(dVar3.getF399772b(), w02).f398806d;
                    if (dVar5 == null) {
                        dVar5 = null;
                    }
                    this.f399620t = eVar;
                    this.f399621u = dVar4;
                    this.f399617q = dVar5;
                    io.ktor.client.a aVar2 = this.f399623w;
                    this.f399618r = aVar2;
                    this.f399619s = 1;
                    Object obj2 = (G51.a) getF411960f().get(G51.a.f6353c);
                    if (obj2 == null) {
                        obj2 = EmptyCoroutineContext.INSTANCE;
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = obj2;
                    dVar = dVar5;
                    obj = obj3;
                    dVar2 = dVar4;
                    aVar = aVar2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    aVar = this.f399618r;
                    dVar = this.f399617q;
                    dVar2 = this.f399621u;
                    eVar = this.f399620t;
                    C42729a0.b(obj);
                }
                C43259k.d(aVar, (CoroutineContext) obj, null, new C11409a(dVar, eVar2, null), 2);
                this.f399620t = null;
                this.f399621u = null;
                this.f399617q = null;
                this.f399618r = null;
                this.f399619s = 2;
                if (eVar.g(dVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public static void c(@k e eVar, @k io.ktor.client.a aVar) {
            io.ktor.client.statement.c.f399780g.getClass();
            aVar.f398782i.g(io.ktor.client.statement.c.f399783j, new a(eVar, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final /* bridge */ /* synthetic */ void a(e eVar, io.ktor.client.a aVar) {
            c(eVar, aVar);
        }

        @Override // io.ktor.client.plugins.A
        public final e b(Y41.l<? super a, G0> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new e(null, aVar.f399616a);
        }

        @Override // io.ktor.client.plugins.A
        @k
        public final C41586b<e> getKey() {
            return e.f399613d;
        }

        public b() {
        }
    }

    public e(@l Y41.l lVar, @k p pVar) {
        this.f399614a = pVar;
        this.f399615b = lVar;
    }

    public /* synthetic */ e(p pVar, Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : lVar, pVar);
    }
}
