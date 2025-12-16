package io.ktor.client.plugins.cookies;

import io.ktor.client.plugins.A;
import io.ktor.client.request.j0;
import io.ktor.client.request.l0;
import io.ktor.util.C41586b;
import io.ktor.util.k0;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.N0;

/* compiled from: HttpCookies.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/cookies/k;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f399366e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C41586b<k> f399367f = new C41586b<>("HttpCookies");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f399368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f399369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N0 f399370d = C43259k.d(D0.f410691b, C43262l0.f411946b, null, new n(this, null), 2);

    /* compiled from: HttpCookies.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/cookies/k$a;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/cookies/k$b;", "Lio/ktor/client/plugins/cookies/k;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements A<b, k> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(k kVar, io.ktor.client.a aVar) {
            k kVar2 = kVar;
            j0.f399750g.getClass();
            aVar.f398779f.g(j0.f399752i, new h(kVar2, null));
            l0.f399764g.getClass();
            aVar.f398781h.g(l0.f399766i, new i(kVar2, null));
            io.ktor.client.statement.c.f399780g.getClass();
            aVar.f398782i.g(io.ktor.client.statement.c.f399782i, new j(kVar2, null));
        }

        @Override // io.ktor.client.plugins.A
        public final k b(Y41.l<? super b, G0> lVar) {
            b bVar = new b();
            lVar.invoke(bVar);
            return new k(bVar.f399372b, bVar.f399371a);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<k> getKey() {
            return k.f399367f;
        }

        public a() {
        }
    }

    /* compiled from: HttpCookies.kt */
    @k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cookies/k$b;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f399371a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final d f399372b = new d();
    }

    public k(@Y61.k d dVar, @Y61.k ArrayList arrayList) {
        this.f399368b = dVar;
        this.f399369c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.client.request.d0 r23, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.k.a(io.ktor.client.request.d0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.T0 r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.plugins.cookies.m
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.cookies.m r0 = (io.ktor.client.plugins.cookies.m) r0
            int r1 = r0.f399383u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399383u = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.m r0 = new io.ktor.client.plugins.cookies.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f399381s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399383u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            io.ktor.http.T0 r6 = r0.f399380r
            io.ktor.client.plugins.cookies.k r2 = r0.f399379q
            kotlin.C42729a0.b(r7)
            goto L51
        L3c:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.N0 r7 = r5.f399370d
            r0.f399379q = r5
            r0.f399380r = r6
            r0.f399383u = r4
            kotlinx.coroutines.V0 r7 = (kotlinx.coroutines.V0) r7
            java.lang.Object r7 = r7.A(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            io.ktor.client.plugins.cookies.d r7 = r2.f399368b
            r2 = 0
            r0.f399379q = r2
            r0.f399380r = r2
            r0.f399383u = r3
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.k.b(io.ktor.http.T0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k io.ktor.client.statement.d r25, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.k.c(io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f399368b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k io.ktor.client.request.d0 r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof io.ktor.client.plugins.cookies.p
            if (r3 == 0) goto L19
            r3 = r2
            io.ktor.client.plugins.cookies.p r3 = (io.ktor.client.plugins.cookies.p) r3
            int r4 = r3.f399397t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f399397t = r4
            goto L1e
        L19:
            io.ktor.client.plugins.cookies.p r3 = new io.ktor.client.plugins.cookies.p
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f399395r
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f399397t
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            io.ktor.client.request.d0 r1 = r3.f399394q
            kotlin.C42729a0.b(r2)
            goto L64
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.C42729a0.b(r2)
            io.ktor.http.I0 r2 = r1.f399707a
            io.ktor.http.I0 r5 = new io.ktor.http.I0
            r17 = 511(0x1ff, float:7.16E-43)
            r18 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            io.ktor.http.S0.c(r5, r2)
            io.ktor.http.T0 r2 = r5.b()
            r3.f399394q = r1
            r3.f399397t = r6
            java.lang.Object r2 = r0.b(r2, r3)
            if (r2 != r4) goto L64
            return r4
        L64:
            java.util.List r2 = (java.util.List) r2
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lad
            org.slf4j.a r3 = io.ktor.client.plugins.cookies.t.f399403a
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            io.ktor.client.plugins.cookies.s r8 = io.ktor.client.plugins.cookies.s.f399402b
            r6 = 0
            r7 = 0
            java.lang.String r5 = "; "
            r9 = 30
            java.lang.String r2 = kotlin.collections.C42745f0.O(r4, r5, r6, r7, r8, r9)
            io.ktor.http.U r3 = r1.f399709c
            io.ktor.http.f0 r4 = io.ktor.http.C41519f0.f400005a
            r4.getClass()
            java.lang.String r4 = io.ktor.http.C41519f0.f400015k
            r3.k(r2)
            java.util.List r3 = r3.g(r4)
            r3.clear()
            r3.add(r2)
            org.slf4j.a r3 = io.ktor.client.plugins.cookies.t.f399403a
            java.lang.String r4 = "Sending cookie "
            java.lang.String r5 = " for "
            java.lang.StringBuilder r2 = androidx.appcompat.app.r.A(r4, r2, r5)
            io.ktor.http.I0 r1 = r1.f399707a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r3.e(r1)
            goto Lb9
        Lad:
            io.ktor.http.U r1 = r1.f399709c
            io.ktor.http.f0 r2 = io.ktor.http.C41519f0.f400005a
            r2.getClass()
            java.lang.String r2 = io.ktor.http.C41519f0.f400015k
            r1.i(r2)
        Lb9:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.k.d(io.ktor.client.request.d0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
