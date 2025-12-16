package io.ktor.client.plugins.cache.storage;

import io.ktor.client.request.c0;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: HttpCacheStorage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r {

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/client/plugins/cache/storage/r$a", "Lio/ktor/client/statement/d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends io.ktor.client.statement.d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C41535n0 f399278b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C41533m0 f399279c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Q31.b f399280d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Q31.b f399281e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final T f399282f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final CoroutineContext f399283g;

        public a(b bVar, CoroutineContext coroutineContext) {
            this.f399278b = bVar.f399188b;
            this.f399279c = bVar.f399191e;
            this.f399280d = bVar.f399189c;
            this.f399281e = bVar.f399190d;
            this.f399282f = bVar.f399193g;
            this.f399283g = coroutineContext;
        }

        @Override // io.ktor.http.InterfaceC41523h0
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final T getF399282f() {
            return this.f399282f;
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: c */
        public final W0 getF399778h() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final Q31.b getF399280d() {
            return this.f399280d;
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: f, reason: from getter */
        public final Q31.b getF399281e() {
            return this.f399281e;
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final C41535n0 getF399278b() {
            return this.f399278b;
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: getCall */
        public final io.ktor.client.call.b getF399772b() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // kotlinx.coroutines.T
        @Y61.k
        /* renamed from: getCoroutineContext, reason: from getter */
        public final CoroutineContext getF399283g() {
            return this.f399283g;
        }

        @Override // io.ktor.client.statement.d
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final C41533m0 getF399279c() {
            return this.f399279c;
        }
    }

    @Y61.k
    public static final io.ktor.client.statement.d a(@Y61.k b bVar, @Y61.k io.ktor.client.a aVar, @Y61.k c0 c0Var, @Y61.k CoroutineContext coroutineContext) {
        io.ktor.client.statement.d dVar = new io.ktor.client.call.h(aVar, c0Var, new a(bVar, coroutineContext), bVar.f399195i).f398806d;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k io.ktor.client.plugins.cache.storage.a r19, @Y61.k io.ktor.client.statement.d r20, @Y61.k java.util.Map r21, boolean r22, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof io.ktor.client.plugins.cache.storage.t
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.client.plugins.cache.storage.t r1 = (io.ktor.client.plugins.cache.storage.t) r1
            int r2 = r1.f399294w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f399294w = r2
            goto L1a
        L15:
            io.ktor.client.plugins.cache.storage.t r1 = new io.ktor.client.plugins.cache.storage.t
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f399293v
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f399294w
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L51
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            java.lang.Object r1 = r1.f399288q
            io.ktor.client.plugins.cache.storage.b r1 = (io.ktor.client.plugins.cache.storage.b) r1
            kotlin.C42729a0.b(r0)
            goto Ld4
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            boolean r3 = r1.f399292u
            io.ktor.http.T0 r5 = r1.f399291t
            java.util.Map r7 = r1.f399290s
            java.util.Map r7 = (java.util.Map) r7
            io.ktor.client.statement.d r8 = r1.f399289r
            java.lang.Object r9 = r1.f399288q
            io.ktor.client.plugins.cache.storage.a r9 = (io.ktor.client.plugins.cache.storage.a) r9
            kotlin.C42729a0.b(r0)
            r17 = r7
            r7 = r9
            goto L8d
        L51:
            kotlin.C42729a0.b(r0)
            io.ktor.client.call.b r0 = r20.getF399772b()
            io.ktor.client.request.c0 r0 = r0.f398805c
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r0 = r6
        L5e:
            io.ktor.http.T0 r0 = r0.getF399703d()
            io.ktor.utils.io.W0 r3 = r20.getF399778h()
            r7 = r19
            r1.f399288q = r7
            r8 = r20
            r1.f399289r = r8
            r9 = r21
            java.util.Map r9 = (java.util.Map) r9
            r1.f399290s = r9
            r1.f399291t = r0
            r9 = r22
            r1.f399292u = r9
            r1.f399294w = r5
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r3 = r3.I(r10, r1)
            if (r3 != r2) goto L88
            return r2
        L88:
            r17 = r21
            r5 = r0
            r0 = r3
            r3 = r9
        L8d:
            io.ktor.utils.io.core.n r0 = (io.ktor.utils.io.core.C41641n) r0
            byte[] r18 = io.ktor.utils.io.core.S.b(r0)
            io.ktor.client.statement.h.b(r8)
            io.ktor.client.call.b r0 = r8.getF399772b()
            io.ktor.client.request.c0 r0 = r0.f398805c
            if (r0 == 0) goto L9f
            goto La0
        L9f:
            r0 = r6
        La0:
            io.ktor.http.T0 r10 = r0.getF399703d()
            io.ktor.http.n0 r11 = r8.getF399278b()
            Q31.b r12 = r8.getF399280d()
            io.ktor.http.T r16 = r8.getF399282f()
            io.ktor.http.m0 r14 = r8.getF399279c()
            Q31.b r13 = r8.getF399281e()
            Q31.b r15 = io.ktor.client.plugins.cache.p.b(r8, r3)
            io.ktor.client.plugins.cache.storage.b r0 = new io.ktor.client.plugins.cache.storage.b
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.f399288q = r0
            r1.f399289r = r6
            r1.f399290s = r6
            r1.f399291t = r6
            r1.f399294w = r4
            java.lang.Object r1 = r7.c(r5, r0, r1)
            if (r1 != r2) goto Ld3
            return r2
        Ld3:
            r1 = r0
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.r.b(io.ktor.client.plugins.cache.storage.a, io.ktor.client.statement.d, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k io.ktor.client.plugins.cache.storage.q r4, @Y61.k io.ktor.http.T0 r5, @Y61.k io.ktor.client.statement.d r6, boolean r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.s
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.s r0 = (io.ktor.client.plugins.cache.storage.s) r0
            int r1 = r0.f399287t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399287t = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.s r0 = new io.ktor.client.plugins.cache.storage.s
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f399286s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399287t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.http.T0 r5 = r0.f399285r
            io.ktor.client.plugins.cache.storage.q r4 = r0.f399284q
            kotlin.C42729a0.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r8)
            r0.f399284q = r4
            r0.f399285r = r5
            r0.f399287t = r3
            java.lang.Object r8 = io.ktor.client.plugins.cache.p.a(r7, r6, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            io.ktor.client.plugins.cache.m r8 = (io.ktor.client.plugins.cache.m) r8
            r4.c(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.r.c(io.ktor.client.plugins.cache.storage.q, io.ktor.http.T0, io.ktor.client.statement.d, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
