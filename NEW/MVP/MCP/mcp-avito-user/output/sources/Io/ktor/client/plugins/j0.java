package io.ktor.client.plugins;

import io.ktor.client.plugins.i0;
import io.ktor.http.I0;
import io.ktor.http.L0;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: HttpTimeout.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/m0;", "Lio/ktor/client/request/d0;", "request", "Lio/ktor/client/call/b;", "<anonymous>", "(Lio/ktor/client/plugins/m0;Lio/ktor/client/request/d0;)Lio/ktor/client/call/b;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", i = {}, l = {146, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class j0 extends SuspendLambda implements Y41.q<m0, io.ktor.client.request.d0, Continuation<? super io.ktor.client.call.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399449q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ m0 f399450r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.request.d0 f399451s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0 f399452t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399453u;

    /* compiled from: HttpTimeout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N0 f399454l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N0 n02) {
            super(1);
            this.f399454l = n02;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V0) this.f399454l).c(null);
            return G0.f406611a;
        }
    }

    /* compiled from: HttpTimeout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f399455q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Long f399456r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ io.ktor.client.request.d0 f399457s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ N0 f399458t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l12, io.ktor.client.request.d0 d0Var, N0 n02, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f399456r = l12;
            this.f399457s = d0Var;
            this.f399458t = n02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f399456r, this.f399457s, this.f399458t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f399455q;
            if (i12 == 0) {
                C42729a0.b(obj);
                long jLongValue = this.f399456r.longValue();
                this.f399455q = 1;
                if (C43131e0.b(jLongValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            io.ktor.client.request.d0 d0Var = this.f399457s;
            I0 i02 = d0Var.f399707a;
            i02.a();
            StringBuilder sb2 = new StringBuilder(256);
            L0.a(i02, sb2);
            String string = sb2.toString();
            i0.b bVar = i0.f399440d;
            Map map = (Map) d0Var.f399712f.d(io.ktor.client.engine.i.f398905a);
            i0.a aVar = (i0.a) (map != null ? map.get(bVar) : null);
            Object obj2 = aVar != null ? aVar.f399445a : null;
            StringBuilder sbA = androidx.appcompat.app.r.A("Request timeout has expired [url=", string, ", request_timeout=");
            if (obj2 == null) {
                obj2 = "unknown";
            }
            HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(androidx.appcompat.app.r.o(obj2, " ms]", sbA));
            k0.f399483a.e("Request timeout: " + d0Var.f399707a);
            ((V0) this.f399458t).c(C43311x0.a(httpRequestTimeoutException.getMessage(), httpRequestTimeoutException));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i0 i0Var, io.ktor.client.a aVar, Continuation<? super j0> continuation) {
        super(3, continuation);
        this.f399452t = i0Var;
        this.f399453u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(m0 m0Var, io.ktor.client.request.d0 d0Var, Continuation<? super io.ktor.client.call.b> continuation) {
        j0 j0Var = new j0(this.f399452t, this.f399453u, continuation);
        j0Var.f399450r = m0Var;
        j0Var.f399451s = d0Var;
        return j0Var.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399449q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
            }
            if (i12 == 2) {
                C42729a0.b(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        m0 m0Var = this.f399450r;
        io.ktor.client.request.d0 d0Var = this.f399451s;
        String str = d0Var.f399707a.f399862a.f399889a;
        if ((kotlin.jvm.internal.L.f(str, "ws") || kotlin.jvm.internal.L.f(str, "wss")) || (d0Var.f399710d instanceof io.ktor.client.request.a0)) {
            this.f399450r = null;
            this.f399449q = 1;
            obj = m0Var.a(d0Var, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
        i0.b bVar = i0.f399440d;
        Map map = (Map) d0Var.f399712f.d(io.ktor.client.engine.i.f398905a);
        i0.a aVar = (i0.a) (map != null ? map.get(bVar) : null);
        i0 i0Var = this.f399452t;
        if (aVar == null && (i0Var.f399442a != null || i0Var.f399443b != null || i0Var.f399444c != null)) {
            aVar = new i0.a(null, null, null, 7, null);
            d0Var.d(bVar, aVar);
        }
        if (aVar != null) {
            Long l12 = aVar.f399446b;
            if (l12 == null) {
                l12 = i0Var.f399443b;
            }
            i0.a.a(l12);
            aVar.f399446b = l12;
            Long l13 = aVar.f399447c;
            if (l13 == null) {
                l13 = i0Var.f399444c;
            }
            i0.a.a(l13);
            aVar.f399447c = l13;
            Long l14 = aVar.f399445a;
            if (l14 == null) {
                l14 = i0Var.f399442a;
            }
            i0.a.a(l14);
            aVar.f399445a = l14;
            if (l14 == null) {
                l14 = i0Var.f399442a;
            }
            if (l14 != null && l14.longValue() != Long.MAX_VALUE) {
                ((V0) d0Var.f399711e).k(new a(C43259k.d(this.f399453u, null, null, new b(l14, d0Var, d0Var.f399711e, null), 3)));
            }
        }
        this.f399450r = null;
        this.f399449q = 2;
        obj = m0Var.a(d0Var, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
