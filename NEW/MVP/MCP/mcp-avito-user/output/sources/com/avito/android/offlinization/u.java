package com.avito.android.offlinization;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.offlinization.analytics.events.CacheRequestReason;
import com.avito.android.offlinization.memory.OutOfDiskException;
import com.avito.android.util.R0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.D1;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import m40.InterfaceC43878b;
import og0.InterfaceC44773a;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import r40.InterfaceC47489c;
import s40.InterfaceC47995b;
import s40.InterfaceC47996c;
import w40.InterfaceC49441a;
import x40.C49762b;

/* compiled from: OfflinizationInterceptorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/u;", "Lcom/avito/android/offlinization/t;", "b", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements t {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final b f208599l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<Map<Integer, CacheRequestReason>> f208600m = C42727D.c(a.f208612l);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final kotlin.ranges.l f208601n = new kotlin.ranges.l(200, 399, 1);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r40.f f208602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49441a f208603c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47996c f208604d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<Call.Factory> f208605e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44773a f208606f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f208607g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final p f208608h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final v40.b f208609i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f208610j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f208611k = new AtomicLong(-1);

    /* compiled from: OfflinizationInterceptorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/offlinization/analytics/events/CacheRequestReason;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<Integer, ? extends CacheRequestReason>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f208612l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends CacheRequestReason> invoke() {
            kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
            dVar.put(429, CacheRequestReason.f208489c);
            kotlin.ranges.k it = new kotlin.ranges.l(500, 505, 1).iterator();
            while (it.f406910d) {
                dVar.put(Integer.valueOf(it.a()), CacheRequestReason.f208490d);
            }
            return dVar.b();
        }
    }

    /* compiled from: OfflinizationInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/offlinization/u$b;", "", "<init>", "()V", "", "OFFLINE_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: OfflinizationInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lokhttp3/Response;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lokhttp3/Response;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.offlinization.OfflinizationInterceptorImpl$intercept$1", f = "OfflinizationInterceptorImpl.kt", i = {0}, l = {67, 71}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super Response>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208613q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208614r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47995b.C12608b f208615s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43076a0<Response> f208616t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f208617u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Request f208618v;

        /* compiled from: OfflinizationInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lokhttp3/Response;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lokhttp3/Response;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.offlinization.OfflinizationInterceptorImpl$intercept$1$1", f = "OfflinizationInterceptorImpl.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super Response>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f208619q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43076a0<Response> f208620r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ u f208621s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Request f208622t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC43076a0<Response> interfaceC43076a0, u uVar, Request request, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f208620r = interfaceC43076a0;
                this.f208621s = uVar;
                this.f208622t = request;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f208620r, this.f208621s, this.f208622t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Response> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f208619q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f208619q = 1;
                    obj = this.f208620r.F(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                Response response = (Response) obj;
                b bVar = u.f208599l;
                u uVar = this.f208621s;
                boolean zIsSuccessful = response.isSuccessful();
                InterfaceC49441a interfaceC49441a = uVar.f208603c;
                AtomicLong atomicLong = uVar.f208611k;
                if (zIsSuccessful) {
                    com.avito.android.time.c.f301452a.getClass();
                    if (com.avito.android.time.c.f301453b.a() - atomicLong.get() >= 30000) {
                        interfaceC49441a.setEnabled(false);
                    }
                }
                p pVar = uVar.f208608h;
                if (!pVar.e()) {
                    return response;
                }
                u.f208599l.getClass();
                InterfaceC42726C<Map<Integer, CacheRequestReason>> interfaceC42726C = u.f208600m;
                if (!interfaceC42726C.getValue().containsKey(Integer.valueOf(response.code()))) {
                    if (!pVar.c() || !L.f(response.headers().get("static-fallback-mobile"), "1")) {
                        return response;
                    }
                    kotlin.ranges.l lVar = u.f208601n;
                    int i13 = lVar.f406905b;
                    int iCode = response.code();
                    if (i13 <= iCode && iCode <= lVar.f406906c) {
                        return response;
                    }
                }
                r40.f fVar = uVar.f208602b;
                Request request = this.f208622t;
                Response responseA = fVar.a(request);
                CacheRequestReason cacheRequestReason = interfaceC42726C.getValue().get(Integer.valueOf(response.code()));
                if (cacheRequestReason == null) {
                    cacheRequestReason = L.f(response.headers().get("static-fallback-mobile"), "1") ? CacheRequestReason.f208490d : CacheRequestReason.f208489c;
                }
                uVar.a(request, responseA != null, new InterfaceC43878b.a(cacheRequestReason, null, 2, null));
                if (responseA == null) {
                    return response;
                }
                interfaceC49441a.setEnabled(true);
                com.avito.android.time.c.f301452a.getClass();
                atomicLong.set(com.avito.android.time.c.f301453b.a());
                return responseA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC47995b.C12608b c12608b, InterfaceC43076a0 interfaceC43076a0, u uVar, Request request, Continuation continuation) {
            super(2, continuation);
            this.f208615s = c12608b;
            this.f208616t = interfaceC43076a0;
            this.f208617u = uVar;
            this.f208618v = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            u uVar = this.f208617u;
            c cVar = new c(this.f208615s, this.f208616t, uVar, this.f208618v, continuation);
            cVar.f208614r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Response> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208613q;
            u uVar = this.f208617u;
            InterfaceC43076a0<Response> interfaceC43076a0 = this.f208616t;
            Request request = this.f208618v;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f208614r;
                long j12 = this.f208615s.f437465a;
                a aVar = new a(interfaceC43076a0, uVar, request, null);
                this.f208614r = t12;
                this.f208613q = 1;
                obj = D1.c(j12, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return (Response) obj;
                }
                C42729a0.b(obj);
            }
            Response response = (Response) obj;
            if (response != null) {
                return response;
            }
            this.f208614r = null;
            this.f208613q = 2;
            obj = uVar.f208602b.a(request);
            uVar.a(request, obj != null, new InterfaceC43878b.a(CacheRequestReason.f208491e, null, 2, null));
            if (obj == null) {
                obj = interfaceC43076a0.F(this);
            } else {
                C43259k.d(uVar.f208610j, null, null, new v(interfaceC43076a0, null), 3);
                uVar.f208603c.setEnabled(true);
                AtomicLong atomicLong = uVar.f208611k;
                com.avito.android.time.c.f301452a.getClass();
                atomicLong.set(com.avito.android.time.c.f301453b.a());
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Response) obj;
        }
    }

    /* compiled from: OfflinizationInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lokhttp3/Response;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lokhttp3/Response;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.offlinization.OfflinizationInterceptorImpl$intercept$networkDeferred$1", f = "OfflinizationInterceptorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super Response>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Request f208624r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Request request, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f208624r = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return u.this.new d(this.f208624r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Response> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object bVar;
            Object bVar2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            u uVar = u.this;
            p pVar = uVar.f208608h;
            Response responseB = pVar.b();
            boolean zPromisesBody = true;
            Request request = this.f208624r;
            v40.b bVar3 = uVar.f208609i;
            h31.e<Call.Factory> eVar = uVar.f208605e;
            r40.f fVar = uVar.f208602b;
            InterfaceC47489c interfaceC47489cB = null;
            try {
                if (responseB == 0) {
                    Request requestBuild = request.newBuilder().tag(C32913a.class, C32913a.f208478a).build();
                    try {
                        int i12 = Z.f406624c;
                        bVar2 = eVar.get().newCall(requestBuild).execute();
                    } catch (Throwable th2) {
                        int i13 = Z.f406624c;
                        bVar2 = new Z.b(th2);
                    }
                    Response response = (Response) (bVar2 instanceof Z.b ? null : bVar2);
                    uVar.a(request, response != null && response.isSuccessful(), InterfaceC43878b.C11814b.f414302a);
                    C42729a0.b(bVar2);
                    Response response2 = (Response) bVar2;
                    if (!pVar.c()) {
                        zPromisesBody = HttpHeaders.promisesBody(response2);
                    } else if (!HttpHeaders.promisesBody(response2) || L.f(response2.headers().get("static-fallback-mobile"), "1")) {
                        zPromisesBody = false;
                    }
                    if (!zPromisesBody) {
                        return response2;
                    }
                    interfaceC47489cB = fVar.b(response2);
                    responseB = response2;
                } else {
                    com.avito.android.time.c.f301452a.getClass();
                    com.avito.android.time.c.f301453b.a();
                    Request requestBuild2 = request.newBuilder().tag(C32913a.class, C32913a.f208478a).build();
                    try {
                        int i14 = Z.f406624c;
                        bVar = eVar.get().newCall(requestBuild2).execute();
                    } catch (Throwable th3) {
                        int i15 = Z.f406624c;
                        bVar = new Z.b(th3);
                    }
                    Response response3 = (Response) (bVar instanceof Z.b ? null : bVar);
                    uVar.a(request, response3 != null && response3.isSuccessful(), InterfaceC43878b.C11814b.f414302a);
                    C42729a0.b(bVar);
                    Response response4 = (Response) bVar;
                    if (!pVar.c()) {
                        zPromisesBody = HttpHeaders.promisesBody(response4);
                    } else if (!HttpHeaders.promisesBody(response4) || L.f(response4.headers().get("static-fallback-mobile"), "1")) {
                        zPromisesBody = false;
                    }
                    if (!zPromisesBody) {
                        return response4;
                    }
                    interfaceC47489cB = fVar.b(response4);
                    responseB = response4;
                }
            } catch (OutOfDiskException unused) {
                bVar3.b();
                fVar.clear();
            }
            return C49762b.a(responseB, interfaceC47489cB);
        }
    }

    @Inject
    public u(@Y61.k r40.f fVar, @Y61.k InterfaceC49441a interfaceC49441a, @Y61.k InterfaceC47996c interfaceC47996c, @Y61.k R0 r02, @Y61.k h31.e<Call.Factory> eVar, @Y61.k InterfaceC44773a interfaceC44773a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k p pVar, @Y61.k v40.b bVar) {
        this.f208602b = fVar;
        this.f208603c = interfaceC49441a;
        this.f208604d = interfaceC47996c;
        this.f208605e = eVar;
        this.f208606f = interfaceC44773a;
        this.f208607g = interfaceC28373a;
        this.f208608h = pVar;
        this.f208609i = bVar;
        this.f208610j = U.a(r02.a().plus(t1.b()));
    }

    public final void a(Request request, boolean z12, InterfaceC43878b interfaceC43878b) {
        if (this.f208608h.a()) {
            String url = request.url().getUrl();
            this.f208607g.c(new m40.c(null, url, this.f208606f.a(url), interfaceC43878b, z12, 1, null));
        }
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        InterfaceC47995b interfaceC47995bD = this.f208604d.d(request);
        if (!(interfaceC47995bD instanceof InterfaceC47995b.C12608b)) {
            return chain.proceed(request);
        }
        try {
            return (Response) C43259k.e(EmptyCoroutineContext.INSTANCE, new c((InterfaceC47995b.C12608b) interfaceC47995bD, C43259k.b(this.f208610j, null, new d(request, null), 3), this, request, null));
        } finally {
        }
    }
}
