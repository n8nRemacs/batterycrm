package io.ktor.client.plugins.cache;

import io.ktor.client.plugins.cache.storage.a;
import io.ktor.client.plugins.cache.storage.q;
import io.ktor.client.request.d0;
import io.ktor.client.request.e0;
import io.ktor.client.request.k0;
import io.ktor.client.request.l0;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.J;
import io.ktor.http.T;
import io.ktor.util.C41586b;
import io.ktor.utils.io.Y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HttpCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/d;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f399136g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C41586b<d> f399137h = new C41586b<>("HttpCache");

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.events.a<io.ktor.client.statement.d> f399138i = new io.ktor.events.a<>();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.plugins.cache.storage.q f399139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.plugins.cache.storage.q f399140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.plugins.cache.storage.a f399141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.plugins.cache.storage.a f399142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f399143e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f399144f;

    /* compiled from: HttpCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/cache/d$a;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/cache/d$b;", "Lio/ktor/client/plugins/cache/d;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements io.ktor.client.plugins.A<b, d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.l
        public static Object c(@Y61.k io.ktor.util.pipeline.e eVar, @Y61.k io.ktor.client.a aVar, @Y61.k Continuation continuation) {
            eVar.c();
            e0 e0VarA = ((d0) eVar.f400528b).a();
            C41535n0.f400082d.getClass();
            C41535n0 c41535n0 = C41535n0.f400090l;
            Q31.b bVarB = io.ktor.util.date.a.b(null);
            T.f399899a.getClass();
            J j12 = T.a.f399901b;
            C41533m0.f400064d.getClass();
            Object objG = eVar.g(new io.ktor.client.call.b(aVar, e0VarA, new k0(c41535n0, bVarB, j12, C41533m0.f400066f, Y.a(new byte[0]), e0VarA.f399718e)), continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
        }

        @Override // io.ktor.client.plugins.A
        public final void a(d dVar, io.ktor.client.a aVar) throws io.ktor.util.pipeline.b {
            d dVar2 = dVar;
            io.ktor.util.pipeline.k kVar = new io.ktor.util.pipeline.k("Cache");
            l0.f399764g.getClass();
            io.ktor.util.pipeline.k kVar2 = l0.f399766i;
            l0 l0Var = aVar.f398781h;
            l0Var.f(kVar2, kVar);
            l0Var.g(kVar, new io.ktor.client.plugins.cache.b(dVar2, aVar, null));
            io.ktor.client.statement.c.f399780g.getClass();
            aVar.f398782i.g(io.ktor.client.statement.c.f399782i, new c(dVar2, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final d b(Y41.l<? super b, G0> lVar) {
            b bVar = new b();
            lVar.invoke(bVar);
            return new d(bVar.f399147c, bVar.f399148d, bVar.f399145a, bVar.f399146b, false, false, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<d> getKey() {
            return d.f399137h;
        }

        public a() {
        }
    }

    /* compiled from: HttpCache.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/d$b;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.ktor.client.plugins.cache.storage.a f399145a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final io.ktor.client.plugins.cache.storage.a f399146b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final io.ktor.client.plugins.cache.storage.q f399147c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final io.ktor.client.plugins.cache.storage.q f399148d;

        public b() {
            a.C11400a c11400a = io.ktor.client.plugins.cache.storage.a.f399183a;
            c11400a.getClass();
            Y41.a<io.ktor.client.plugins.cache.storage.a> aVar = a.C11400a.f399185b;
            this.f399145a = aVar.invoke();
            c11400a.getClass();
            this.f399146b = aVar.invoke();
            q.b bVar = io.ktor.client.plugins.cache.storage.q.f399275a;
            bVar.getClass();
            Y41.a<io.ktor.client.plugins.cache.storage.q> aVar2 = io.ktor.client.plugins.cache.storage.q.f399276b;
            this.f399147c = aVar2.invoke();
            bVar.getClass();
            this.f399148d = aVar2.invoke();
        }
    }

    public d(io.ktor.client.plugins.cache.storage.q qVar, io.ktor.client.plugins.cache.storage.q qVar2, io.ktor.client.plugins.cache.storage.a aVar, io.ktor.client.plugins.cache.storage.a aVar2, boolean z12, boolean z13, C42822w c42822w) {
        this.f399139a = qVar;
        this.f399140b = qVar2;
        this.f399141c = aVar;
        this.f399142d = aVar2;
        this.f399143e = z12;
        this.f399144f = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.plugins.cache.d r25, io.ktor.client.request.c0 r26, io.ktor.client.statement.d r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.d.a(io.ktor.client.plugins.cache.d, io.ktor.client.request.c0, io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v9, types: [Y41.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.client.plugins.cache.d r18, io.ktor.client.request.d0 r19, io.ktor.http.content.p r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.d.b(io.ktor.client.plugins.cache.d, io.ktor.client.request.d0, io.ktor.http.content.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(io.ktor.client.plugins.cache.storage.a r23, java.util.Map r24, io.ktor.http.T0 r25, io.ktor.client.request.c0 r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.d.c(io.ktor.client.plugins.cache.storage.a, java.util.Map, io.ktor.http.T0, io.ktor.client.request.c0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
