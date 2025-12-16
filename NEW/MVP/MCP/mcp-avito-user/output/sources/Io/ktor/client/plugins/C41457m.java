package io.ktor.client.plugins;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.yandex.metrica.YandexMetricaDefaultValues;
import io.ktor.client.statement.i;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.C41529k0;
import io.ktor.http.InterfaceC41525i0;
import io.ktor.http.content.p;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.Z0;
import io.ktor.utils.io.e2;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.P0;

/* compiled from: DefaultTransform.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41457m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final org.slf4j.a f399573a = org.slf4j.b.e("io.ktor.client.plugins.defaultTransformers");

    /* compiled from: DefaultTransform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "body", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.m$a */
    public static final class a extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f399574q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ io.ktor.util.pipeline.e f399575r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f399576s;

        /* compiled from: DefaultTransform.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/client/plugins/m$a$a", "Lio/ktor/http/content/p$a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.client.plugins.m$a$a, reason: collision with other inner class name */
        public static final class C11406a extends p.a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C41524i f399577a;

            /* renamed from: b, reason: collision with root package name */
            public final long f399578b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f399579c;

            public C11406a(C41524i c41524i, Object obj) {
                this.f399579c = obj;
                if (c41524i == null) {
                    C41524i.a.f400035a.getClass();
                    c41524i = C41524i.a.f400037c;
                }
                this.f399577a = c41524i;
                this.f399578b = ((byte[]) obj).length;
            }

            @Override // io.ktor.http.content.p
            @Y61.k
            /* renamed from: a */
            public final Long getF399593a() {
                return Long.valueOf(this.f399578b);
            }

            @Override // io.ktor.http.content.p
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final C41524i getF399594b() {
                return this.f399577a;
            }

            @Override // io.ktor.http.content.p.a
            @Y61.k
            /* renamed from: e */
            public final byte[] getF399959a() {
                return (byte[]) this.f399579c;
            }
        }

        /* compiled from: DefaultTransform.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/client/plugins/m$a$b", "Lio/ktor/http/content/p$d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.client.plugins.m$a$b */
        public static final class b extends p.d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Long f399580a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C41524i f399581b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f399582c;

            public b(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, C41524i c41524i, Object obj) {
                this.f399582c = obj;
                io.ktor.http.U u12 = eVar.f400528b.f399709c;
                C41519f0.f400005a.getClass();
                String strH = u12.h(C41519f0.f400013i);
                this.f399580a = strH != null ? Long.valueOf(Long.parseLong(strH)) : null;
                if (c41524i == null) {
                    C41524i.a.f400035a.getClass();
                    c41524i = C41524i.a.f400037c;
                }
                this.f399581b = c41524i;
            }

            @Override // io.ktor.http.content.p
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Long getF399593a() {
                return this.f399580a;
            }

            @Override // io.ktor.http.content.p
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final C41524i getF399594b() {
                return this.f399581b;
            }

            @Override // io.ktor.http.content.p.d
            @Y61.k
            public final W0 e() {
                return (W0) this.f399582c;
            }
        }

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f399575r = eVar;
            aVar.f399576s = obj;
            return aVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            io.ktor.http.content.p c41458n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f399574q;
            if (i12 == 0) {
                C42729a0.b(obj);
                io.ktor.util.pipeline.e eVar = this.f399575r;
                Object obj2 = this.f399576s;
                io.ktor.http.U u12 = ((io.ktor.client.request.d0) eVar.f400528b).f399709c;
                C41519f0.f400005a.getClass();
                String str = C41519f0.f400006b;
                String strH = u12.h(str);
                TContext tcontext = eVar.f400528b;
                if (strH == null) {
                    ((io.ktor.client.request.d0) tcontext).f399709c.d(str, "*/*");
                }
                C41524i c41524iC = C41529k0.c((InterfaceC41525i0) tcontext);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (c41524iC == null) {
                        C41524i.h.f400040a.getClass();
                        c41524iC = C41524i.h.f400041b;
                    }
                    c41458n = new io.ktor.http.content.w(str2, c41524iC, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    c41458n = new C11406a(c41524iC, obj2);
                } else if (obj2 instanceof W0) {
                    c41458n = new b(eVar, c41524iC, obj2);
                } else if (obj2 instanceof io.ktor.http.content.p) {
                    c41458n = (io.ktor.http.content.p) obj2;
                } else {
                    c41458n = obj2 instanceof InputStream ? new C41458n((io.ktor.client.request.d0) tcontext, c41524iC, obj2) : null;
                }
                if ((c41458n != null ? c41458n.getF399594b() : null) != null) {
                    io.ktor.client.request.d0 d0Var = (io.ktor.client.request.d0) tcontext;
                    d0Var.f399709c.i(C41519f0.f400014j);
                    C41457m.f399573a.e("Transformed with default transformers request body for " + d0Var.f399707a + " from " + kotlin.jvm.internal.m0.f406844a.b(obj2.getClass()));
                    this.f399575r = null;
                    this.f399574q = 1;
                    if (eVar.g(c41458n, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: DefaultTransform.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8}, l = {68, 72, 72, 78, 78, 82, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 116, 121}, m = "invokeSuspend", n = {"$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "response", "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE, "$this$intercept", RequestReviewResultKt.INFO_TYPE}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.m$b */
    public static final class b extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.T f399583q;

        /* renamed from: r, reason: collision with root package name */
        public U31.b f399584r;

        /* renamed from: s, reason: collision with root package name */
        public int f399585s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ io.ktor.util.pipeline.e f399586t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f399587u;

        /* compiled from: DefaultTransform.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.client.plugins.m$b$a */
        public static final class a extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f399588q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f399589r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Object f399590s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ io.ktor.client.statement.d f399591t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, io.ktor.client.statement.d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f399590s = obj;
                this.f399591t = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f399590s, this.f399591t, continuation);
                aVar.f399589r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
                return ((a) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f399588q;
                io.ktor.client.statement.d dVar = this.f399591t;
                try {
                    if (i12 != 0) {
                        try {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                        } catch (Throwable th2) {
                            io.ktor.client.statement.h.b(dVar);
                            throw th2;
                        }
                    } else {
                        C42729a0.b(obj);
                        e2 e2Var = (e2) this.f399589r;
                        W0 w02 = (W0) this.f399590s;
                        io.ktor.utils.io.X xA2 = e2Var.a();
                        this.f399588q = 1;
                        if (Z0.a(w02, xA2, Long.MAX_VALUE, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    io.ktor.client.statement.h.b(dVar);
                    return G0.f406611a;
                } catch (CancellationException e12) {
                    kotlinx.coroutines.U.b(dVar, e12);
                    throw e12;
                } catch (Throwable th3) {
                    kotlinx.coroutines.U.b(dVar, C43311x0.a("Receive failed", th3));
                    throw th3;
                }
            }
        }

        /* compiled from: DefaultTransform.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: io.ktor.client.plugins.m$b$b, reason: collision with other inner class name */
        public static final class C11407b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ P0 f399592l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11407b(P0 p02) {
                super(1);
                this.f399592l = p02;
            }

            @Override // Y41.l
            public final G0 invoke(Throwable th2) {
                this.f399592l.q3();
                return G0.f406611a;
            }
        }

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f399586t = eVar;
            bVar.f399587u = eVar2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x016e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0234 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 768
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.C41457m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(@Y61.k io.ktor.client.a aVar) {
        io.ktor.client.request.j0.f399750g.getClass();
        aVar.f398779f.g(io.ktor.client.request.j0.f399754k, new a(3, null));
        i.a aVar2 = io.ktor.client.statement.i.f399792g;
        aVar2.getClass();
        io.ktor.util.pipeline.k kVar = io.ktor.client.statement.i.f399794i;
        b bVar = new b(3, null);
        io.ktor.client.statement.i iVar = aVar.f398780g;
        iVar.g(kVar, bVar);
        aVar2.getClass();
        iVar.g(kVar, new C41459o(3, null));
    }
}
