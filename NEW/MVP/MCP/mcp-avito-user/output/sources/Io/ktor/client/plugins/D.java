package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: HttpPlainText.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/D;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f399005d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41586b<D> f399006e = new C41586b<>("HttpPlainText");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Charset f399007a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Charset f399008b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f399009c;

    /* compiled from: HttpPlainText.kt */
    @io.ktor.util.k0
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/D$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f399010a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f399011b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Charset f399012c = C43047d.f410589b;
    }

    /* compiled from: HttpPlainText.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/D$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/D$a;", "Lio/ktor/client/plugins/D;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, D> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(D d12, io.ktor.client.a aVar) {
            D d13 = d12;
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399754k, new E(d13, null));
            io.ktor.client.statement.i.f399792g.getClass();
            aVar.f398780g.g(io.ktor.client.statement.i.f399795j, new F(d13, null));
        }

        @Override // io.ktor.client.plugins.A
        public final D b(Y41.l<? super a, G0> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new D(aVar.f399010a, aVar.f399011b, aVar.f399012c);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<D> getKey() {
            return D.f399006e;
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(@Y61.k LinkedHashSet linkedHashSet, @Y61.k LinkedHashMap linkedHashMap, @Y61.k Charset charset) {
        this.f399007a = charset;
        List<kotlin.Q> listB0 = C42745f0.B0(P0.o(linkedHashMap), new H());
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!linkedHashMap.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listB02 = C42745f0.B0(arrayList, new G());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset2 : listB02) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            CharBuffer charBuffer = W31.a.f17734a;
            sb2.append(charset2.name());
        }
        for (kotlin.Q q12 : listB0) {
            Charset charset3 = (Charset) q12.f406619b;
            float fFloatValue = ((Number) q12.f406620c).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d12 = fFloatValue;
            if (0.0d > d12 || d12 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            double dB2 = kotlin.math.b.b(100 * fFloatValue) / 100.0d;
            StringBuilder sb3 = new StringBuilder();
            CharBuffer charBuffer2 = W31.a.f17734a;
            sb3.append(charset3.name());
            sb3.append(";q=");
            sb3.append(dB2);
            sb2.append(sb3.toString());
        }
        if (sb2.length() == 0) {
            Charset charset4 = this.f399007a;
            CharBuffer charBuffer3 = W31.a.f17734a;
            sb2.append(charset4.name());
        }
        this.f399009c = sb2.toString();
        Charset charset5 = (Charset) C42745f0.G(listB02);
        if (charset5 == null) {
            kotlin.Q q13 = (kotlin.Q) C42745f0.G(listB0);
            charset5 = q13 != null ? (Charset) q13.f406619b : null;
            if (charset5 == null) {
                charset5 = C43047d.f410589b;
            }
        }
        this.f399008b = charset5;
    }
}
