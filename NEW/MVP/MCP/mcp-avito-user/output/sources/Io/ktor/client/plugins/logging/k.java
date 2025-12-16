package io.ktor.client.plugins.logging;

import io.ktor.client.plugins.observer.e;
import io.ktor.client.request.c0;
import io.ktor.client.request.d0;
import io.ktor.client.request.l0;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.C41528k;
import io.ktor.http.S0;
import io.ktor.util.C41586b;
import io.ktor.util.k0;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.C41620a0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.V0;

/* compiled from: Logging.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/logging/k;", "", "a", "b", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41586b<k> f399524e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f399525a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LogLevel f399526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<? extends Y41.l<? super d0, Boolean>> f399527c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<B> f399528d;

    /* compiled from: Logging.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/logging/k$a;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/logging/k$b;", "Lio/ktor/client/plugins/logging/k;", "<init>", "()V", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements io.ktor.client.plugins.A<b, k> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(k kVar, io.ktor.client.a aVar) {
            k kVar2 = kVar;
            C41586b<k> c41586b = k.f399524e;
            l0.f399764g.getClass();
            aVar.f398781h.g(l0.f399767j, new n(kVar2, null));
            io.ktor.client.statement.c.f399780g.getClass();
            aVar.f398782i.g(io.ktor.client.statement.c.f399782i, new o(kVar2, null));
            io.ktor.client.statement.i.f399792g.getClass();
            aVar.f398780g.g(io.ktor.client.statement.i.f399793h, new p(kVar2, null));
            if (kVar2.f399526b.f399494d) {
                q qVar = new q(kVar2, null);
                e.b bVar = io.ktor.client.plugins.observer.e.f399612c;
                io.ktor.client.plugins.observer.e eVar = new io.ktor.client.plugins.observer.e(qVar, null, 2, null);
                bVar.getClass();
                e.b.c(eVar, aVar);
            }
        }

        @Override // io.ktor.client.plugins.A
        public final k b(Y41.l<? super b, G0> lVar) {
            b bVar = new b();
            lVar.invoke(bVar);
            int i12 = f.f399521a;
            return new k(new g(), bVar.f399531c, bVar.f399529a, bVar.f399530b, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<k> getKey() {
            return k.f399524e;
        }

        public a() {
        }
    }

    /* compiled from: Logging.kt */
    @k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/logging/k$b;", "", "<init>", "()V", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f399529a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f399530b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LogLevel f399531c = LogLevel.f399489e;
    }

    static {
        new a(null);
        f399524e = new C41586b<>("ClientLogging");
    }

    public /* synthetic */ k(f fVar, LogLevel logLevel, List list, List list2, C42822w c42822w) {
        this(fVar, logLevel, list, list2);
    }

    public static final Object a(k kVar, d0 d0Var, Continuation continuation) throws IOException {
        Charset charsetA;
        kVar.getClass();
        io.ktor.http.content.p pVar = (io.ktor.http.content.p) d0Var.f399710d;
        d dVar = new d(kVar.f399525a);
        d0Var.f399712f.a(s.f399555a, dVar);
        StringBuilder sb2 = new StringBuilder();
        LogLevel logLevel = kVar.f399526b;
        if (logLevel.f399492b) {
            sb2.append("REQUEST: " + S0.a(d0Var.f399707a));
            sb2.append('\n');
            sb2.append("METHOD: " + d0Var.f399708b);
            sb2.append('\n');
        }
        if (logLevel.f399493c) {
            sb2.append("COMMON HEADERS\n");
            Set<Map.Entry<String, List<String>>> setB = d0Var.f399709c.b();
            List<B> list = kVar.f399528d;
            w.b(sb2, setB, list);
            sb2.append("CONTENT HEADERS");
            sb2.append('\n');
            List<B> list2 = list;
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                ((B) it.next()).getClass();
                C41519f0.f400005a.getClass();
                throw null;
            }
            Iterator<T> it2 = list2.iterator();
            if (it2.hasNext()) {
                ((B) it2.next()).getClass();
                C41519f0.f400005a.getClass();
                throw null;
            }
            Long f399580a = pVar.getF399580a();
            if (f399580a != null) {
                long jLongValue = f399580a.longValue();
                C41519f0.f400005a.getClass();
                w.a(sb2, C41519f0.f400013i, String.valueOf(jLongValue));
            }
            C41524i f399581b = pVar.getF399581b();
            if (f399581b != null) {
                C41519f0.f400005a.getClass();
                w.a(sb2, C41519f0.f400014j, f399581b.toString());
            }
            w.b(sb2, pVar.c().b(), list);
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            String string2 = C43066x.A0(string).toString();
            StringBuilder sb3 = dVar.f399512b;
            sb3.append(string2);
            sb3.append('\n');
        }
        if (string.length() == 0 || !logLevel.f399494d) {
            dVar.a();
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("BODY Content-Type: " + pVar.getF399581b());
        sb4.append('\n');
        C41524i f399581b2 = pVar.getF399581b();
        if (f399581b2 == null || (charsetA = C41528k.a(f399581b2)) == null) {
            charsetA = C43047d.f410589b;
        }
        C41619a c41619aA = C41620a0.a();
        ((V0) C43259k.d(D0.f410691b, C43262l0.f411946b, null, new l(c41619aA, charsetA, sb4, null), 2)).k(new m(dVar, sb4));
        return A.a(pVar, c41619aA, (ContinuationImpl) continuation);
    }

    public static final void b(k kVar, StringBuilder sb2, c0 c0Var, Throwable th2) {
        if (kVar.f399526b.f399492b) {
            sb2.append("RESPONSE " + c0Var.getF399703d() + " failed with exception: " + th2);
        }
    }

    public k(f fVar, LogLevel logLevel, List<? extends Y41.l<? super d0, Boolean>> list, List<B> list2) {
        this.f399525a = fVar;
        this.f399526b = logLevel;
        this.f399527c = list;
        this.f399528d = list2;
    }

    public k(f fVar, LogLevel logLevel, List list, List list2, int i12, C42822w c42822w) {
        this(fVar, logLevel, (i12 & 4) != 0 ? C42784z0.f406748b : list, list2);
    }
}
