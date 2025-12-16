package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpSend.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/e0;", "", "a", "b", "c", "d", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final d f399413c = new d(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C41586b<e0> f399414d = new C41586b<>("HttpSend");

    /* renamed from: a, reason: collision with root package name */
    public final int f399415a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f399416b;

    /* compiled from: HttpSend.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/e0$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: HttpSend.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/e0$b;", "Lio/ktor/client/plugins/m0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f399417a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final io.ktor.client.a f399418b;

        /* renamed from: c, reason: collision with root package name */
        public int f399419c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public io.ktor.client.call.b f399420d;

        public b(int i12, @Y61.k io.ktor.client.a aVar) {
            this.f399417a = i12;
            this.f399418b = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // io.ktor.client.plugins.m0
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@Y61.k io.ktor.client.request.d0 r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof io.ktor.client.plugins.f0
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.plugins.f0 r0 = (io.ktor.client.plugins.f0) r0
                int r1 = r0.f399426t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f399426t = r1
                goto L18
            L13:
                io.ktor.client.plugins.f0 r0 = new io.ktor.client.plugins.f0
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f399424r
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f399426t
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.f399423q
                io.ktor.client.plugins.e0$b r6 = (io.ktor.client.plugins.e0.b) r6
                kotlin.C42729a0.b(r7)
                goto L5b
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.C42729a0.b(r7)
                io.ktor.client.call.b r7 = r5.f399420d
                if (r7 == 0) goto L40
                kotlinx.coroutines.U.b(r7, r3)
            L40:
                int r7 = r5.f399419c
                int r2 = r5.f399417a
                if (r7 >= r2) goto L7f
                int r7 = r7 + r4
                r5.f399419c = r7
                io.ktor.client.a r7 = r5.f399418b
                io.ktor.client.request.l0 r7 = r7.f398781h
                java.lang.Object r2 = r6.f399710d
                r0.f399423q = r5
                r0.f399426t = r4
                java.lang.Object r7 = r7.a(r6, r2, r0)
                if (r7 != r1) goto L5a
                return r1
            L5a:
                r6 = r5
            L5b:
                boolean r0 = r7 instanceof io.ktor.client.call.b
                if (r0 == 0) goto L62
                r3 = r7
                io.ktor.client.call.b r3 = (io.ktor.client.call.b) r3
            L62:
                if (r3 == 0) goto L67
                r6.f399420d = r3
                return r3
            L67:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.<init>(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L7f:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.String r7 = "Max send count "
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                java.lang.String r7 = androidx.camera.camera2.internal.G.e(r2, r7, r0)
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.e0.b.a(io.ktor.client.request.d0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    /* compiled from: HttpSend.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/e0$c;", "Lio/ktor/client/plugins/m0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.q<m0, io.ktor.client.request.d0, Continuation<? super io.ktor.client.call.b>, Object> f399421a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final m0 f399422b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k Y41.q<? super m0, ? super io.ktor.client.request.d0, ? super Continuation<? super io.ktor.client.call.b>, ? extends Object> qVar, @Y61.k m0 m0Var) {
            this.f399421a = qVar;
            this.f399422b = m0Var;
        }

        @Override // io.ktor.client.plugins.m0
        @Y61.l
        public final Object a(@Y61.k io.ktor.client.request.d0 d0Var, @Y61.k ContinuationImpl continuationImpl) {
            return this.f399421a.invoke(this.f399422b, d0Var, continuationImpl);
        }
    }

    /* compiled from: HttpSend.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/e0$d;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/e0$a;", "Lio/ktor/client/plugins/e0;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements A<a, e0> {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(e0 e0Var, io.ktor.client.a aVar) {
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399755l, new g0(e0Var, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final e0 b(Y41.l<? super a, G0> lVar) {
            lVar.invoke(new a());
            return new e0(20, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<e0> getKey() {
            return e0.f399414d;
        }

        public d() {
        }
    }

    public /* synthetic */ e0(int i12, C42822w c42822w) {
        this(i12);
    }

    public e0(int i12) {
        this.f399415a = i12;
        this.f399416b = new ArrayList();
    }

    public /* synthetic */ e0(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 20 : i12);
    }
}
