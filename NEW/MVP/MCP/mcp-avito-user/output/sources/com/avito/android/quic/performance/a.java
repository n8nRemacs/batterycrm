package com.avito.android.quic.performance;

import Oa1.B;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.I1;
import com.avito.android.ab_tests.Q;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.publish.screen.objects.view.actions.h;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import h31.e;
import j.InterfaceC42148d;
import j.k0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import okhttp3.Call;
import okhttp3.EventListener;

/* compiled from: RequestsPerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/performance/a;", "Lokhttp3/EventListener;", "a", "b", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends EventListener {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f246287m = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f246288a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<Gson> f246290c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f246291d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final I1 f246292e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q f246293f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f246297j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public io.reactivex.rxjava3.disposables.d f246298k;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.quic.performance.b f246294g = new com.avito.android.quic.performance.b();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final WeakHashMap<Call, Long> f246295h = new WeakHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    @k
    public Object f246296i = P0.c();

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Set<Call> f246299l = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* compiled from: RequestsPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/quic/performance/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.quic.performance.a$a, reason: collision with other inner class name */
    public static final class C7382a {
        public /* synthetic */ C7382a(C42822w c42822w) {
            this();
        }

        public C7382a() {
        }
    }

    /* compiled from: RequestsPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/performance/a$b;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f246300a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Duration f246301b;

        /* renamed from: c, reason: collision with root package name */
        public final int f246302c;

        public b() {
            this(0, null, 0, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f246300a == bVar.f246300a && L.f(this.f246301b, bVar.f246301b) && this.f246302c == bVar.f246302c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f246302c) + ((this.f246301b.hashCode() + (Integer.hashCode(this.f246300a) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Config(minDurationsCountInEventBatch=");
            sb2.append(this.f246300a);
            sb2.append(", minTimeBetweenReports=");
            sb2.append(this.f246301b);
            sb2.append(", maxDurationsJsonSize=");
            return r.t(sb2, this.f246302c, ')');
        }

        public b(int i12, Duration duration, int i13, int i14, C42822w c42822w) {
            i12 = (i14 & 1) != 0 ? 10 : i12;
            duration = (i14 & 2) != 0 ? Duration.ofSeconds(20L) : duration;
            i13 = (i14 & 4) != 0 ? 1000 : i13;
            this.f246300a = i12;
            this.f246301b = duration;
            this.f246302c = i13;
        }
    }

    /* compiled from: RequestsPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Call f246304m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f246305n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Call call, long j12) {
            super(0);
            this.f246304m = call;
            this.f246305n = j12;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            Call call = this.f246304m;
            long j12 = this.f246305n;
            int i12 = a.f246287m;
            synchronized (aVar) {
                if (!aVar.f246299l.contains(call)) {
                    Long lRemove = aVar.f246295h.remove(call);
                    if (lRemove == null) {
                        V2.f318762a.j("ReqPerfTracker", "No request start time: " + call.request().url(), null);
                    } else {
                        String strHost = call.request().url().host();
                        long jLongValue = j12 - lRemove.longValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) aVar.f246296i);
                        Collection collection = (List) linkedHashMap.get(strHost);
                        if (collection == null) {
                            collection = C42784z0.f406748b;
                        }
                        linkedHashMap.put(strHost, C42745f0.i0(Integer.valueOf((int) jLongValue), collection));
                        if (aVar.f246288a.f246302c <= a.a(linkedHashMap)) {
                            aVar.f246297j = true;
                        } else {
                            aVar.f246296i = linkedHashMap;
                        }
                    }
                }
            }
            a aVar2 = a.this;
            synchronized (aVar2) {
                try {
                    if (aVar2.f246297j) {
                        io.reactivex.rxjava3.disposables.d dVar = aVar2.f246298k;
                        if (dVar != null) {
                            dVar.dispose();
                        }
                        aVar2.f246298k = null;
                        aVar2.b();
                    } else if (aVar2.f246298k == null) {
                        synchronized (aVar2) {
                            int size = C42745f0.H(aVar2.f246296i.values()).size();
                            if (size >= aVar2.f246288a.f246300a) {
                                aVar2.f246298k = aVar2.f246291d.c().e(new h(aVar2, 2), aVar2.f246288a.f246301b.toMillis(), TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                } finally {
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RequestsPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Call f246307m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f246308n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Call call, long j12) {
            super(0);
            this.f246307m = call;
            this.f246308n = j12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            Call call = this.f246307m;
            long j12 = this.f246308n;
            int i12 = a.f246287m;
            synchronized (aVar) {
                aVar.f246295h.put(call, Long.valueOf(j12));
            }
            return G0.f406611a;
        }
    }

    static {
        new C7382a(null);
    }

    public a(@k b bVar, @k InterfaceC28373a interfaceC28373a, @k e<Gson> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k I1 i12, @k Q q12) {
        this.f246288a = bVar;
        this.f246289b = interfaceC28373a;
        this.f246290c = eVar;
        this.f246291d = interfaceC35745a5;
        this.f246292e = i12;
        this.f246293f = q12;
    }

    @k0
    public static int a(@k LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.keySet().iterator();
        int i12 = 0;
        int length = 0;
        while (it.hasNext()) {
            length += ((String) it.next()).length();
        }
        int size = (linkedHashMap.keySet().size() * 6) + length;
        ArrayList arrayListH = C42745f0.H(linkedHashMap.values());
        Iterator it2 = arrayListH.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            int iLog10 = 1;
            if (iIntValue != 0) {
                iLog10 = 1 + ((int) Math.log10(Math.abs(iIntValue)));
            }
            i12 += iLog10;
        }
        return arrayListH.size() + i12 + size + 2;
    }

    public final synchronized void b() {
        c();
        d();
        this.f246296i = P0.c();
        this.f246297j = false;
    }

    public final synchronized void c() {
        I1 i12 = this.f246292e;
        i12.getClass();
        n<Object> nVar = I1.f67278k0[9];
        if (((Boolean) i12.f67322j.a().invoke()).booleanValue()) {
            this.f246289b.c(new ng0.e(this.f246290c.get().l(this.f246296i)));
        }
    }

    @Override // okhttp3.EventListener
    @InterfaceC42148d
    public final void callEnd(@k Call call) {
        this.f246294g.getClass();
        com.avito.android.time.c.f301452a.getClass();
        this.f246291d.c().d(new B(2, new c(call, com.avito.android.time.c.f301453b.a())));
    }

    @Override // okhttp3.EventListener
    @InterfaceC42148d
    public final void callStart(@k Call call) {
        this.f246294g.getClass();
        com.avito.android.time.c.f301452a.getClass();
        this.f246291d.c().d(new B(2, new d(call, com.avito.android.time.c.f301453b.a())));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    public final synchronized void d() {
        try {
            I1 i12 = this.f246292e;
            i12.getClass();
            n<Object> nVar = I1.f67278k0[10];
            if (((Boolean) i12.f67324k.a().invoke()).booleanValue()) {
                String str = this.f246293f.b() ? "api_ab." + this.f246293f.getF67912b() : "no_experiment.no_group";
                for (Map.Entry entry : this.f246296i.entrySet()) {
                    String strReplace = ((String) entry.getKey()).replace('.', '_');
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        this.f246289b.c(new y.c("performance.host-duration." + str + '.' + strReplace, Integer.valueOf(((Number) it.next()).intValue()), null));
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
