package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C38708bi;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class Jf {

    /* renamed from: i, reason: collision with root package name */
    private static final Map<C38708bi.a, H1.d> f378582i = Collections.unmodifiableMap(new a());

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378583a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f378584b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378585c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38931kh f378586d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39112s2 f378587e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Rl f378588f;

    /* renamed from: g, reason: collision with root package name */
    private e f378589g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f378590h = false;

    public class a extends HashMap<C38708bi.a, H1.d> {
        public a() {
            put(C38708bi.a.CELL, H1.d.CELL);
            put(C38708bi.a.WIFI, H1.d.WIFI);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Jf.a(Jf.this);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f378592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C39057pi f378593b;

        public c(List list, C39057pi c39057pi) {
            this.f378592a = list;
            this.f378593b = c39057pi;
        }

        @Override // java.lang.Runnable
        public void run() {
            Jf.a(Jf.this, this.f378592a, this.f378593b.C());
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f378595a;

        public d(e.a aVar) {
            this.f378595a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Jf.this.f378587e.e()) {
                return;
            }
            Jf.this.f378586d.b(this.f378595a);
            e.b bVar = new e.b(this.f378595a);
            Rl rl2 = Jf.this.f378588f;
            Context context = Jf.this.f378583a;
            ((Ml) rl2).getClass();
            H1.d dVarA = H1.a(context);
            bVar.a(dVarA);
            if (dVarA == H1.d.OFFLINE) {
                bVar.a(e.b.a.OFFLINE);
            } else if (this.f378595a.f378604f.contains(dVarA)) {
                Request.Builder builder = new Request.Builder(this.f378595a.f378600b);
                e.a aVar = this.f378595a;
                builder.f382383b = aVar.f378601c;
                for (Map.Entry<String, ? extends Collection<String>> entry : aVar.f378602d.a()) {
                    builder.a(entry.getKey(), TextUtils.join(",", entry.getValue()));
                }
                NetworkClient.Builder builder2 = new NetworkClient.Builder();
                F0.g().t().getClass();
                builder2.f382374c = null;
                builder2.f382376e = Boolean.TRUE;
                int i12 = C38977md.f381054a;
                builder2.f382372a = Integer.valueOf(i12);
                builder2.f382373b = Integer.valueOf(i12);
                builder2.f382377f = 102400;
                Response responseB = new com.yandex.metrica.network.impl.c(builder2.a(), builder.b(), new com.yandex.metrica.network.impl.d()).b();
                if (responseB.f382386a) {
                    bVar.a(e.b.a.COMPLETE);
                } else {
                    bVar.a(e.b.a.ERROR);
                    bVar.a(responseB.f382391f);
                }
                bVar.a(Integer.valueOf(responseB.f382387b));
                bVar.f378609e = responseB.f382388c;
                bVar.f378610f = responseB.f382389d;
                bVar.a(responseB.f382390e);
            } else {
                bVar.a(e.b.a.INCOMPATIBLE_NETWORK_TYPE);
            }
            Jf.a(Jf.this, bVar);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final List<a> f378597a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final LinkedHashMap<String, Object> f378598b = new LinkedHashMap<>();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @j.N
            public final String f378599a;

            /* renamed from: b, reason: collision with root package name */
            @j.N
            public final String f378600b;

            /* renamed from: c, reason: collision with root package name */
            @j.N
            public final String f378601c;

            /* renamed from: d, reason: collision with root package name */
            @j.N
            public final C39108rm<String, String> f378602d;

            /* renamed from: e, reason: collision with root package name */
            public final long f378603e;

            /* renamed from: f, reason: collision with root package name */
            @j.N
            public final List<H1.d> f378604f;

            public a(@j.N String str, @j.N String str2, @j.N String str3, @j.N C39108rm<String, String> c39108rm, long j12, @j.N List<H1.d> list) {
                this.f378599a = str;
                this.f378600b = str2;
                this.f378601c = str3;
                this.f378603e = j12;
                this.f378604f = list;
                this.f378602d = c39108rm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f378599a.equals(((a) obj).f378599a);
            }

            public int hashCode() {
                return this.f378599a.hashCode();
            }
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            @j.N
            private final a f378605a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            private a f378606b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            private H1.d f378607c;

            /* renamed from: d, reason: collision with root package name */
            @j.P
            private Integer f378608d;

            /* renamed from: e, reason: collision with root package name */
            @j.P
            byte[] f378609e;

            /* renamed from: f, reason: collision with root package name */
            @j.P
            byte[] f378610f;

            /* renamed from: g, reason: collision with root package name */
            @j.P
            private Map<String, List<String>> f378611g;

            /* renamed from: h, reason: collision with root package name */
            @j.P
            private Throwable f378612h;

            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(@j.N a aVar) {
                this.f378605a = aVar;
            }

            @j.P
            public byte[] b() {
                return this.f378610f;
            }

            @j.P
            public Throwable c() {
                return this.f378612h;
            }

            @j.N
            public a d() {
                return this.f378605a;
            }

            @j.P
            public byte[] e() {
                return this.f378609e;
            }

            @j.P
            public Integer f() {
                return this.f378608d;
            }

            @j.P
            public Map<String, List<String>> g() {
                return this.f378611g;
            }

            @j.P
            public a h() {
                return this.f378606b;
            }

            public void a(@j.N a aVar) {
                this.f378606b = aVar;
            }

            @j.P
            public H1.d a() {
                return this.f378607c;
            }

            public void a(@j.P H1.d dVar) {
                this.f378607c = dVar;
            }

            public void a(@j.P Integer num) {
                this.f378608d = num;
            }

            public void a(@j.P Map<String, List<String>> map) {
                this.f378611g = map;
            }

            public void a(@j.P Throwable th2) {
                this.f378612h = th2;
            }
        }

        public e(@j.N List<a> list, @j.N List<String> list2) {
            this.f378597a = list;
            if (A2.b(list2)) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                this.f378598b.put(it.next(), new Object());
            }
        }

        public boolean a(@j.N a aVar) {
            if (this.f378598b.get(aVar.f378599a) != null || this.f378597a.contains(aVar)) {
                return false;
            }
            this.f378597a.add(aVar);
            return true;
        }

        @j.N
        public List<a> b() {
            return this.f378597a;
        }

        public void b(@j.N a aVar) {
            this.f378598b.put(aVar.f378599a, new Object());
            this.f378597a.remove(aVar);
        }

        @j.N
        public Set<String> a() {
            HashSet hashSet = new HashSet();
            Iterator<String> it = this.f378598b.keySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                hashSet.add(it.next());
                i12++;
                if (i12 > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    @j.k0
    public Jf(@j.N Context context, @j.N ProtobufStateStorage protobufStateStorage, @j.N C39112s2 c39112s2, @j.N C38931kh c38931kh, @j.N ICommonExecutor iCommonExecutor, @j.N Rl rl2) {
        this.f378583a = context;
        this.f378584b = protobufStateStorage;
        this.f378587e = c39112s2;
        this.f378586d = c38931kh;
        this.f378589g = (e) protobufStateStorage.read();
        this.f378585c = iCommonExecutor;
        this.f378588f = rl2;
    }

    public static void a(Jf jf2, List list, long j12) {
        Long l12;
        jf2.getClass();
        if (A2.b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38708bi c38708bi = (C38708bi) it.next();
            if (c38708bi.f380219a != null && c38708bi.f380220b != null && c38708bi.f380221c != null && (l12 = c38708bi.f380223e) != null && l12.longValue() >= 0 && !A2.b(c38708bi.f380224f)) {
                String str = c38708bi.f380219a;
                String str2 = c38708bi.f380220b;
                String str3 = c38708bi.f380221c;
                List<Pair<String, String>> list2 = c38708bi.f380222d;
                C39108rm c39108rm = new C39108rm(false);
                for (Pair<String, String> pair : list2) {
                    c39108rm.a(pair.first, pair.second);
                }
                long millis = TimeUnit.SECONDS.toMillis(c38708bi.f380223e.longValue() + j12);
                List<C38708bi.a> list3 = c38708bi.f380224f;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator<C38708bi.a> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(f378582i.get(it2.next()));
                }
                jf2.a(new e.a(str, str2, str3, c39108rm, millis, arrayList));
            }
        }
    }

    private void b(@j.N e.a aVar) {
        this.f378585c.executeDelayed(new d(aVar), Math.max(com.yandex.metrica.coreutils.services.a.f377637c, Math.max(aVar.f378603e - System.currentTimeMillis(), 0L)));
    }

    public synchronized void a() {
        this.f378585c.execute(new b());
    }

    public static void a(Jf jf2) {
        if (jf2.f378590h) {
            return;
        }
        e eVar = (e) jf2.f378584b.read();
        jf2.f378589g = eVar;
        Iterator<e.a> it = eVar.b().iterator();
        while (it.hasNext()) {
            jf2.b(it.next());
        }
        jf2.f378590h = true;
    }

    public synchronized void a(@j.N C39057pi c39057pi) {
        this.f378585c.execute(new c(c39057pi.I(), c39057pi));
    }

    private boolean a(@j.N e.a aVar) {
        boolean zA2 = this.f378589g.a(aVar);
        if (zA2) {
            b(aVar);
            this.f378586d.a(aVar);
        }
        this.f378584b.save(this.f378589g);
        return zA2;
    }

    public static void a(Jf jf2, e.b bVar) {
        synchronized (jf2) {
            jf2.f378589g.b(bVar.f378605a);
            jf2.f378584b.save(jf2.f378589g);
            jf2.f378586d.a(bVar);
        }
    }
}
