package com.avito.android.quic;

import android.content.SharedPreferences;
import com.avito.android.I1;
import com.avito.android.ab_tests.Q;
import com.avito.android.ab_tests.QuicTuningAB;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.clickstream.C28379d;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.quic.cronet.CronetException;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.cronet.t;
import com.avito.android.quic.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;

/* compiled from: QuicStrategy.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/quic/q;", "Lcom/avito/android/quic/p;", "Lcom/avito/android/analytics/clickstream/d$f;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements p, C28379d.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I1 f246309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q f246310c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final QuicTuningAB f246311d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.a f246312e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.d f246313f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final p.b f246314g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CronetTcpRstReporter.b f246315h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.o f246316i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f246317j;

    /* compiled from: QuicStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HttpUrl f246319m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HttpUrl httpUrl) {
            super(0);
            this.f246319m = httpUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r8 = this;
                com.avito.android.quic.q r0 = com.avito.android.quic.q.this
                r0.getClass()
                okhttp3.HttpUrl r1 = r8.f246319m
                java.lang.String r2 = r1.host()
                com.avito.android.quic.cronet.d r3 = r0.f246313f
                java.util.List<java.lang.String> r3 = r3.f246202a
                boolean r3 = r3.contains(r2)
                com.avito.android.quic.a r4 = r0.f246312e
                java.util.LinkedHashSet r4 = r4.a()
                boolean r2 = r4.contains(r2)
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L90
                if (r2 == 0) goto L90
                com.avito.android.ab_tests.Q r2 = r0.f246310c
                boolean r2 = r2.b()
                if (r2 == 0) goto L45
                java.lang.String r2 = r1.host()
                java.lang.String r3 = "app-quic.avito.ru"
                boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
                if (r2 != 0) goto L43
                java.lang.String r1 = r1.host()
                java.lang.String r2 = "app.avito.ru"
                boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
                if (r1 == 0) goto L90
            L43:
                r1 = r4
                goto L91
            L45:
                com.avito.android.ab_tests.QuicTuningAB r2 = r0.f246311d
                boolean r3 = r2.b()
                com.avito.android.quic.p$a r6 = com.avito.android.quic.p.f246281a
                if (r3 == 0) goto L65
                boolean r2 = r2.e()
                if (r2 == 0) goto L90
                r6.getClass()
                kotlin.text.p r2 = com.avito.android.quic.p.a.f246283b
                java.lang.String r1 = r1.host()
                boolean r1 = r2.e(r1)
                if (r1 == 0) goto L90
                goto L43
            L65:
                com.avito.android.I1 r2 = r0.f246309b
                r2.getClass()
                kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.I1.f67278k0
                r7 = 22
                r3 = r3[r7]
                com.avito.android.A0$a r2 = r2.f67336w
                DE0.a r2 = r2.a()
                java.lang.Object r2 = r2.invoke()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L90
                r6.getClass()
                kotlin.text.p r2 = com.avito.android.quic.p.a.f246283b
                java.lang.String r1 = r1.host()
                boolean r1 = r2.e(r1)
                goto L91
            L90:
                r1 = r5
            L91:
                if (r1 == 0) goto L9a
                boolean r0 = r0.f()
                if (r0 == 0) goto L9a
                goto L9b
            L9a:
                r4 = r5
            L9b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.quic.q.a.invoke():java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    @Inject
    public q(@Y61.k I1 i12, @Y61.k Q q12, @Y61.k QuicTuningAB quicTuningAB, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.quic.a aVar, @Y61.k com.avito.android.quic.cronet.d dVar, @Y61.k p.b bVar, @Y61.k CronetTcpRstReporter.b bVar2, @Y61.k com.avito.android.quic.cronet.t tVar, @Y61.k com.avito.android.quic.cronet.o oVar) {
        this.f246309b = i12;
        this.f246310c = q12;
        this.f246311d = quicTuningAB;
        this.f246312e = aVar;
        this.f246313f = dVar;
        this.f246314g = bVar;
        this.f246315h = bVar2;
        this.f246316i = oVar;
        int iB2 = q12.b();
        int i13 = quicTuningAB.b() ? iB2 + 1 : iB2;
        boolean z12 = true;
        if (1 < i13) {
            interfaceC28373a.c(new NonFatalErrorEvent("Should not simultaneously enable multiple QUIC and Cronet ABs", null, null, null, 14, null));
        }
        if (i13 <= 0) {
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[22];
            if (!((Boolean) i12.f67336w.a().invoke()).booleanValue()) {
                z12 = false;
            }
        }
        this.f246317j = z12;
        tVar.f246226b.t0(new l41.g() { // from class: com.avito.android.quic.r
            @Override // l41.g
            public final void accept(Object obj) {
                t.a aVar2 = (t.a) obj;
                q qVar = this.f246320b;
                qVar.getClass();
                HttpUrl httpUrl = HttpUrl.INSTANCE.parse(aVar2.f246228b);
                CronetException cronetExceptionA = qVar.f246316i.a(aVar2.f246227a);
                if (httpUrl == null || cronetExceptionA == null) {
                    return;
                }
                if (C42745f0.r(qVar.f246311d.d(), cronetExceptionA instanceof CronetException.TcpReset ? QuicTuningAB.ErrorType.f67734b : cronetExceptionA instanceof CronetException.QuicProtocolFailed ? QuicTuningAB.ErrorType.f67735c : null)) {
                    a aVar3 = qVar.f246312e;
                    String strHost = httpUrl.host();
                    long jE2 = kotlin.time.e.e(qVar.f246311d.h());
                    synchronized (aVar3) {
                        aVar3.f246164a.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + jE2;
                        SharedPreferences.Editor editorEdit = aVar3.f246165b.edit();
                        editorEdit.putLong(strHost, jCurrentTimeMillis);
                        editorEdit.apply();
                    }
                }
            }
        });
    }

    @Override // com.avito.android.quic.p
    public final boolean a(@Y61.k HttpUrl httpUrl) {
        a aVar = new a(httpUrl);
        Q q12 = this.f246310c;
        if (q12.b()) {
            if (q12.f() || q12.i() || q12.m()) {
                return false;
            }
            return q12.a() && ((Boolean) aVar.invoke()).booleanValue();
        }
        QuicTuningAB quicTuningAB = this.f246311d;
        if (quicTuningAB.b()) {
            return quicTuningAB.a() && ((Boolean) aVar.invoke()).booleanValue();
        }
        I1 i12 = this.f246309b;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[22];
        return ((Boolean) i12.f67336w.a().invoke()).booleanValue() && ((Boolean) aVar.invoke()).booleanValue();
    }

    @Override // com.avito.android.analytics.clickstream.C28379d.f
    public final boolean b(@Y61.k com.avito.android.analytics.provider.clickstream.a aVar) {
        if (!this.f246310c.b() && !this.f246311d.b()) {
            return true;
        }
        p.f246281a.getClass();
        return !(p.a.f246285d.contains(Integer.valueOf(aVar.getF100588b())) && !f());
    }

    @Override // com.avito.android.quic.p
    /* renamed from: c, reason: from getter */
    public final boolean getF246317j() {
        return this.f246317j;
    }

    @Override // com.avito.android.quic.p
    public final boolean d() {
        Q q12 = this.f246310c;
        if (q12.b()) {
            return q12.a();
        }
        QuicTuningAB quicTuningAB = this.f246311d;
        if (quicTuningAB.b()) {
            return quicTuningAB.a();
        }
        I1 i12 = this.f246309b;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[22];
        return ((Boolean) i12.f67336w.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.quic.p
    @Y61.k
    public final HttpUrl e(@Y61.k HttpUrl httpUrl) {
        boolean z12;
        boolean zA2 = this.f246310c.a();
        if (!L.f(httpUrl.host(), "app.avito.ru")) {
            z12 = false;
            break;
        }
        p.f246281a.getClass();
        Set<C43059p> set = p.a.f246284c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((C43059p) it.next()).a(httpUrl.encodedPath())) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        return (zA2 && z12 && f()) ? httpUrl.newBuilder().host("app-quic.avito.ru").port(443).build() : httpUrl;
    }

    public final boolean f() {
        Q q12 = this.f246310c;
        if (!q12.d() && !q12.e() && !q12.p() && !q12.f()) {
            QuicTuningAB quicTuningAB = this.f246311d;
            if (!quicTuningAB.f() || !quicTuningAB.c()) {
                boolean zC2 = q12.c();
                p.b bVar = this.f246314g;
                if (zC2 || q12.o() || quicTuningAB.f()) {
                    return !bVar.b();
                }
                if (q12.l() || q12.k() || q12.i() || quicTuningAB.c()) {
                    return bVar.b();
                }
                if (bVar.b()) {
                    String strA = this.f246315h.a();
                    if (strA == null) {
                        return true;
                    }
                    p.f246281a.getClass();
                    List<String> list = p.a.f246286e;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return true;
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (C43066x.q(strA, (String) it.next(), true)) {
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
