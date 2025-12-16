package io.ktor.client.plugins.websocket;

import io.ktor.client.request.j0;
import io.ktor.util.C41586b;
import io.ktor.util.k0;
import io.ktor.websocket.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WebSockets.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/websocket/D;", "", "<init>", "()V", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f399658e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C41586b<D> f399659f = new C41586b<>("Websocket");

    /* renamed from: a, reason: collision with root package name */
    public final long f399660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final U f399662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final io.ktor.serialization.h f399663d;

    /* compiled from: WebSockets.kt */
    @k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/websocket/D$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final U f399664a = new U();

        /* renamed from: b, reason: collision with root package name */
        public final long f399665b = -1;

        /* renamed from: c, reason: collision with root package name */
        public final long f399666c = 2147483647L;
    }

    /* compiled from: WebSockets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/websocket/D$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/websocket/D$a;", "Lio/ktor/client/plugins/websocket/D;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements io.ktor.client.plugins.A<a, D> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(D d12, io.ktor.client.a aVar) {
            D d13 = d12;
            boolean zContains = aVar.f398775b.m4().contains(C.f399657a);
            j0.f399750g.getClass();
            aVar.f398779f.g(j0.f399754k, new E(d13, null, zContains));
            io.ktor.client.statement.i.f399792g.getClass();
            aVar.f398780g.g(io.ktor.client.statement.i.f399795j, new F(d13, null, zContains));
        }

        @Override // io.ktor.client.plugins.A
        public final D b(Y41.l<? super a, G0> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new D(aVar.f399665b, aVar.f399666c, aVar.f399664a, (io.ktor.serialization.h) null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<D> getKey() {
            return D.f399659f;
        }

        public b() {
        }
    }

    public D(long j12, long j13, @Y61.k U u12, @Y61.l io.ktor.serialization.h hVar) {
        this.f399660a = j12;
        this.f399661b = j13;
        this.f399662c = u12;
        this.f399663d = hVar;
    }

    public /* synthetic */ D(long j12, long j13, U u12, io.ktor.serialization.h hVar, int i12, C42822w c42822w) {
        this(j12, j13, u12, (i12 & 8) != 0 ? null : hVar);
    }

    public D(long j12, long j13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? -1L : j12, (i12 & 2) != 0 ? 2147483647L : j13, new U(), null, 8, null);
    }

    public D() {
        this(-1L, 2147483647L, new U(), null, 8, null);
    }
}
