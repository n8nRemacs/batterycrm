package io.ktor.client.call;

import Y61.k;
import Y61.l;
import io.ktor.client.request.b0;
import io.ktor.client.request.c0;
import io.ktor.client.request.e0;
import io.ktor.client.request.k0;
import io.ktor.util.C41586b;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.InterfaceC41603j0;
import io.ktor.utils.io.W0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: HttpClientCall.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/b;", "Lkotlinx/coroutines/T;", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class b implements T {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f398802e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C41586b<Object> f398803f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.ktor.client.a f398804b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f398805c;

    /* renamed from: d, reason: collision with root package name */
    public io.ktor.client.statement.d f398806d;

    @k
    private volatile /* synthetic */ int received;

    /* compiled from: HttpClientCall.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/call/b$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f398803f = new C41586b<>("CustomResponse");
        f398802e = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");
    }

    public b(@k io.ktor.client.a aVar) {
        this.f398804b = aVar;
        this.received = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k U31.b r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.b.b(U31.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public boolean c() {
        return false;
    }

    @l
    public Object e() {
        io.ktor.client.statement.d dVar = this.f398806d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.getF399778h();
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF399773c() {
        io.ktor.client.statement.d dVar = this.f398806d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.getF399773c();
    }

    @k
    public final InterfaceC41588c q() {
        c0 c0Var = this.f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        return c0Var.getF399706g();
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpClientCall[");
        c0 c0Var = this.f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        sb2.append(c0Var.getF399703d());
        sb2.append(", ");
        io.ktor.client.statement.d dVar = this.f398806d;
        sb2.append((dVar != null ? dVar : null).getF399774d());
        sb2.append(']');
        return sb2.toString();
    }

    @InterfaceC41603j0
    public b(@k io.ktor.client.a aVar, @k e0 e0Var, @k k0 k0Var) {
        this(aVar);
        this.f398805c = new b0(this, e0Var);
        this.f398806d = new io.ktor.client.statement.b(this, k0Var);
        Object obj = k0Var.f399761e;
        if (obj instanceof W0) {
            return;
        }
        q().a(f398803f, obj);
    }
}
