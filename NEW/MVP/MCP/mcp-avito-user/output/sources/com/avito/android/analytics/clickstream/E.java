package com.avito.android.analytics.clickstream;

import android.os.Looper;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.clickstream.C28379d;
import com.avito.android.analytics.clickstream.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamEventTrackerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/clickstream/E;", "Lcom/avito/android/analytics/clickstream/B;", "a", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J41.c
/* loaded from: classes11.dex */
public final class E implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> f89727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.k f89728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<X> f89729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28399y f89730d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f89731e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f89732f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.analytics.inhouse_transport.o f89733g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f89734h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89735i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Executor f89736j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C28376a f89737k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final b0 f89738l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public String f89739m;

    public E() {
        throw null;
    }

    public E(com.avito.android.analytics.inhouse_transport.u uVar, com.avito.android.analytics.inhouse_transport.k kVar, Set set, InterfaceC28399y interfaceC28399y, com.avito.android.server_time.a aVar, a aVar2, com.avito.android.analytics.inhouse_transport.o oVar, InterfaceC35745a5 interfaceC35745a5, boolean z12, Executor executor, int i12, C42822w c42822w) {
        oVar = (i12 & 64) != 0 ? null : oVar;
        executor = (i12 & 512) != 0 ? Executors.newSingleThreadExecutor(new D(0)) : executor;
        this.f89727a = uVar;
        this.f89728b = kVar;
        this.f89729c = set;
        this.f89730d = interfaceC28399y;
        this.f89731e = aVar;
        this.f89732f = aVar2;
        this.f89733g = oVar;
        this.f89734h = interfaceC35745a5;
        this.f89735i = z12;
        this.f89736j = executor;
        C28376a c28376a = new C28376a();
        this.f89737k = c28376a;
        this.f89738l = new b0(c28376a);
    }

    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) {
        final com.avito.android.analytics.provider.clickstream.a aVar = (com.avito.android.analytics.provider.clickstream.a) interfaceC28464o;
        final LinkedHashMap linkedHashMapA = this.f89730d.a();
        this.f89736j.execute(new Runnable() { // from class: com.avito.android.analytics.clickstream.C
            @Override // java.lang.Runnable
            public final void run() {
                com.avito.android.analytics.provider.clickstream.a aVar2;
                int iA2;
                E e12 = this.f89723b;
                E.a aVar3 = e12.f89732f;
                Iterator<C28379d.f> it = aVar3.f89744e.get().iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    aVar2 = aVar;
                    if (!zHasNext) {
                        if (aVar3.f89742c && kotlin.jvm.internal.L.f(Looper.getMainLooper(), Looper.myLooper())) {
                            throw new IllegalStateException("Sending event on main thread. May cause ANR");
                        }
                        F f12 = new F(e12);
                        com.avito.android.analytics.inhouse_transport.o oVar = e12.f89733g;
                        if (oVar != null && !oVar.isRunning()) {
                            oVar.a(aVar3.f89743d, f12);
                        }
                        Iterator<T> it2 = e12.f89729c.iterator();
                        while (it2.hasNext()) {
                            ((X) it2.next()).a(aVar2);
                        }
                        int f97978b = aVar2.getF97978b();
                        int f97979c = aVar2.getF97979c();
                        LinkedHashMap linkedHashMapA2 = e12.f89738l.a(aVar2.getParams());
                        EventOuterClass.Event.a aVarNewBuilder = EventOuterClass.Event.newBuilder();
                        aVarNewBuilder.n();
                        ((EventOuterClass.Event) aVarNewBuilder.f362681c).setEventId(f97978b);
                        aVarNewBuilder.n();
                        ((EventOuterClass.Event) aVarNewBuilder.f362681c).setVersion(f97979c);
                        aVarNewBuilder.n();
                        ((EventOuterClass.Event) aVarNewBuilder.f362681c).getMutableParamsMap().putAll(linkedHashMapA2);
                        aVarNewBuilder.n();
                        ((EventOuterClass.Event) aVarNewBuilder.f362681c).getMutableEnvMap().putAll(linkedHashMapA);
                        Map<String, String> paramsMap = ((EventOuterClass.Event) aVarNewBuilder.f362681c).getParamsMap();
                        String string = paramsMap.containsKey("ref_id") ? paramsMap.get("ref_id") : null;
                        if (string == null) {
                            string = UUID.randomUUID().toString();
                        }
                        aVarNewBuilder.n();
                        ((EventOuterClass.Event) aVarNewBuilder.f362681c).getMutableParamsMap().remove("ref_id");
                        aVarNewBuilder.s("ref_id", string);
                        String str = e12.f89739m;
                        if (str != null) {
                            aVarNewBuilder.s("parent_ref_id", str);
                        }
                        e12.f89739m = string;
                        e12.f89731e.getClass();
                        aVarNewBuilder.s("cdtm", e12.f89737k.a(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
                        if (e12.f89735i) {
                            aVarNewBuilder.s("uuid", UUID.randomUUID().toString());
                        }
                        EventOuterClass.Event eventC5 = aVarNewBuilder.c5();
                        com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> uVar = e12.f89727a;
                        uVar.add(eventC5);
                        String simpleName = aVar2.getClass().getSimpleName();
                        if (aVar3.f89741b) {
                            V2.f318762a.c("ClickStream", "Event id: " + eventC5.getEventId() + "; version: " + eventC5.getVersion() + "; class name: " + simpleName + " \nParams: " + eventC5.getParamsMap() + " \nEnv: " + eventC5.getEnvMap(), null);
                        }
                        Set<C28379d.e> set = aVar3.f89745f.get();
                        if ((set instanceof Collection) && set.isEmpty()) {
                            iA2 = uVar.a();
                            if (iA2 > 0) {
                                return;
                            } else {
                                return;
                            }
                        }
                        Iterator<T> it3 = set.iterator();
                        while (it3.hasNext()) {
                            if (((C28379d.e) it3.next()).a(aVar2)) {
                                break;
                            }
                        }
                        iA2 = uVar.a();
                        if (iA2 > 0 || iA2 % aVar3.f89740a != 0) {
                            return;
                        }
                        e12.f89728b.flush();
                        if (oVar != null) {
                            oVar.reset();
                            return;
                        }
                        return;
                    }
                } while (it.next().b(aVar2));
            }
        });
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    /* renamed from: h */
    public final io.reactivex.rxjava3.core.H getF91100h() {
        return this.f89734h.b();
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final Class<com.avito.android.analytics.provider.clickstream.a> i() {
        return com.avito.android.analytics.provider.clickstream.a.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF318637a() {
        return true;
    }

    /* compiled from: ClickStreamEventTrackerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/E$a;", "", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f89740a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f89741b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f89742c;

        /* renamed from: d, reason: collision with root package name */
        public final long f89743d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final h31.e<Set<C28379d.f>> f89744e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final h31.e<Set<C28379d.e>> f89745f;

        public a(int i12, boolean z12, boolean z13, long j12, @Y61.k h31.e<Set<C28379d.f>> eVar, @Y61.k h31.e<Set<C28379d.e>> eVar2) {
            this.f89740a = i12;
            this.f89741b = z12;
            this.f89742c = z13;
            this.f89743d = j12;
            this.f89744e = eVar;
            this.f89745f = eVar2;
        }

        public /* synthetic */ a(int i12, boolean z12, boolean z13, long j12, h31.e eVar, h31.e eVar2, int i13, C42822w c42822w) {
            this(i12, z12, z13, (i13 & 8) != 0 ? TimeUnit.SECONDS.toMillis(60L) : j12, eVar, eVar2);
        }
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
    }
}
