package io.ktor.client.request;

import io.ktor.http.C41531l0;
import io.ktor.http.I0;
import io.ktor.http.InterfaceC41525i0;
import io.ktor.http.S0;
import io.ktor.http.T0;
import io.ktor.util.C41586b;
import io.ktor.util.C41592e;
import io.ktor.util.G0;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.InterfaceC41603j0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.t1;

/* compiled from: HttpRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/request/d0;", "Lio/ktor/http/i0;", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d0 implements InterfaceC41525i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I0 f399707a = new I0(null, null, 0, null, null, null, null, null, false, 511, null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C41531l0 f399708b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.U f399709c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object f399710d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public N0 f399711e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f399712f;

    /* compiled from: HttpRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/request/d0$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HttpRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "", "Lio/ktor/client/engine/h;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Map<io.ktor.client.engine.h<?>, Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f399713l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<io.ktor.client.engine.h<?>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        new a(null);
    }

    public d0() {
        C41531l0.f400052b.getClass();
        this.f399708b = C41531l0.f400053c;
        this.f399709c = new io.ktor.http.U(0, 1, null);
        this.f399710d = io.ktor.client.utils.n.f399837a;
        this.f399711e = t1.b();
        this.f399712f = C41592e.a();
    }

    @Y61.k
    public final e0 a() {
        T0 t0B = this.f399707a.b();
        C41531l0 c41531l0 = this.f399708b;
        io.ktor.http.V vL2 = this.f399709c.l();
        Object obj = this.f399710d;
        io.ktor.http.content.p pVar = obj instanceof io.ktor.http.content.p ? (io.ktor.http.content.p) obj : null;
        if (pVar != null) {
            return new e0(t0B, c41531l0, vL2, pVar, this.f399711e, this.f399712f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f399710d).toString());
    }

    @Override // io.ktor.http.InterfaceC41525i0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final io.ktor.http.U getF399709c() {
        return this.f399709c;
    }

    @InterfaceC41603j0
    public final void c(@Y61.l U31.b bVar) {
        InterfaceC41588c interfaceC41588c = this.f399712f;
        if (bVar != null) {
            interfaceC41588c.a(m0.f399771a, bVar);
        } else {
            interfaceC41588c.f(m0.f399771a);
        }
    }

    public final <T> void d(@Y61.k io.ktor.client.engine.h<T> hVar, @Y61.k T t12) {
        ((Map) this.f399712f.e(io.ktor.client.engine.i.f398905a, b.f399713l)).put(hVar, t12);
    }

    @Y61.k
    public final void e(@Y61.k d0 d0Var) {
        this.f399708b = d0Var.f399708b;
        this.f399710d = d0Var.f399710d;
        InterfaceC41588c interfaceC41588c = d0Var.f399712f;
        c((U31.b) interfaceC41588c.d(m0.f399771a));
        I0 i02 = this.f399707a;
        S0.c(i02, d0Var.f399707a);
        i02.f399869h = i02.f399869h;
        G0.a(this.f399709c, d0Var.f399709c);
        InterfaceC41588c interfaceC41588c2 = this.f399712f;
        Iterator<T> it = interfaceC41588c.b().iterator();
        while (it.hasNext()) {
            C41586b c41586b = (C41586b) it.next();
            interfaceC41588c2.a(c41586b, interfaceC41588c.g(c41586b));
        }
    }
}
