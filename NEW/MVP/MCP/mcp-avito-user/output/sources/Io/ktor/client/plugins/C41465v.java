package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import io.ktor.util.pipeline.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HttpCallValidator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/v;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41465v {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f399642d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41586b<C41465v> f399643e = new C41586b<>("HttpResponseValidator");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Y41.p<io.ktor.client.statement.d, Continuation<? super G0>, Object>> f399644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<r> f399645b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f399646c;

    /* compiled from: HttpCallValidator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/v$a;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/v$b;", "Lio/ktor/client/plugins/v;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.v$a */
    public static final class a implements A<b, C41465v> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(C41465v c41465v, io.ktor.client.a aVar) throws io.ktor.util.pipeline.b {
            C41465v c41465v2 = c41465v;
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399751h, new C41462s(c41465v2, null));
            io.ktor.util.pipeline.k kVar = new io.ktor.util.pipeline.k("BeforeReceive");
            io.ktor.client.statement.i.f399792g.getClass();
            io.ktor.util.pipeline.k kVar2 = io.ktor.client.statement.i.f399793h;
            io.ktor.client.statement.i iVar = aVar.f398780g;
            if (!iVar.e(kVar)) {
                int iC2 = iVar.c(kVar2);
                if (iC2 == -1) {
                    throw new io.ktor.util.pipeline.b("Phase " + kVar2 + " was not registered for this pipeline");
                }
                iVar.f400524b.add(iC2, new io.ktor.util.pipeline.c(kVar, new l.b(null)));
            }
            iVar.g(kVar, new C41463t(c41465v2, null));
            ((e0) C.a(aVar, e0.f399413c)).f399416b.add(new C41464u(c41465v2, null));
        }

        @Override // io.ktor.client.plugins.A
        public final C41465v b(Y41.l<? super b, G0> lVar) {
            b bVar = new b();
            lVar.invoke(bVar);
            return new C41465v(C42745f0.q0(bVar.f399647a), C42745f0.q0(bVar.f399648b), bVar.f399649c);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<C41465v> getKey() {
            return C41465v.f399643e;
        }

        public a() {
        }
    }

    /* compiled from: HttpCallValidator.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/v$b;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.v$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f399647a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f399648b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f399649c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41465v(@Y61.k List<? extends Y41.p<? super io.ktor.client.statement.d, ? super Continuation<? super G0>, ? extends Object>> list, @Y61.k List<? extends r> list2, boolean z12) {
        this.f399644a = list;
        this.f399645b = list2;
        this.f399646c = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.G0 a(io.ktor.client.plugins.C41465v r6, java.lang.Throwable r7, io.ktor.client.request.c0 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof io.ktor.client.plugins.C41466w
            if (r0 == 0) goto L16
            r0 = r9
            io.ktor.client.plugins.w r0 = (io.ktor.client.plugins.C41466w) r0
            int r1 = r0.f399655v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f399655v = r1
            goto L1b
        L16:
            io.ktor.client.plugins.w r0 = new io.ktor.client.plugins.w
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f399653t
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f399655v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L37
        L2a:
            java.util.Iterator r6 = r0.f399652s
            io.ktor.client.request.c0 r7 = r0.f399651r
            java.lang.Throwable r8 = r0.f399650q
            kotlin.C42729a0.b(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L69
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.C42729a0.b(r9)
            org.slf4j.a r9 = io.ktor.client.plugins.C41476z.f399697a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Processing exception "
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r4 = " for request "
            r1.append(r4)
            io.ktor.http.T0 r4 = r8.getF399703d()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r9.e(r1)
            java.util.List<io.ktor.client.plugins.r> r6 = r6.f399645b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L9b
            java.lang.Object r9 = r6.next()
            io.ktor.client.plugins.r r9 = (io.ktor.client.plugins.r) r9
            boolean r1 = r9 instanceof io.ktor.client.plugins.C41461q
            r4 = 0
            if (r1 != 0) goto L8d
            boolean r1 = r9 instanceof io.ktor.client.plugins.l0
            if (r1 != 0) goto L7f
            goto L69
        L7f:
            io.ktor.client.plugins.l0 r9 = (io.ktor.client.plugins.l0) r9
            r9.getClass()
            r0.f399650q = r7
            r0.f399651r = r8
            r0.f399652s = r6
            r0.f399655v = r2
            throw r4
        L8d:
            io.ktor.client.plugins.q r9 = (io.ktor.client.plugins.C41461q) r9
            r9.getClass()
            r0.f399650q = r7
            r0.f399651r = r8
            r0.f399652s = r6
            r0.f399655v = r3
            throw r4
        L9b:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.C41465v.a(io.ktor.client.plugins.v, java.lang.Throwable, io.ktor.client.request.c0, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.G0");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.client.plugins.C41465v r5, io.ktor.client.statement.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof io.ktor.client.plugins.C41474x
            if (r0 == 0) goto L16
            r0 = r7
            io.ktor.client.plugins.x r0 = (io.ktor.client.plugins.C41474x) r0
            int r1 = r0.f399691u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f399691u = r1
            goto L1b
        L16:
            io.ktor.client.plugins.x r0 = new io.ktor.client.plugins.x
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f399689s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399691u
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r5 = r0.f399688r
            io.ktor.client.statement.d r6 = r0.f399687q
            kotlin.C42729a0.b(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.C42729a0.b(r7)
            org.slf4j.a r7 = io.ktor.client.plugins.C41476z.f399697a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Validating response for request "
            r2.<init>(r4)
            io.ktor.client.call.b r4 = r6.getF399772b()
            io.ktor.client.request.c0 r4 = r4.f398805c
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r4 = 0
        L4e:
            io.ktor.http.T0 r4 = r4.getF399703d()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.e(r2)
            java.util.List<Y41.p<io.ktor.client.statement.d, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object>> r5 = r5.f399644a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r5.next()
            Y41.p r7 = (Y41.p) r7
            r0.f399687q = r6
            r0.f399688r = r5
            r0.f399691u = r3
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L64
            goto L7f
        L7d:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.C41465v.b(io.ktor.client.plugins.v, io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
