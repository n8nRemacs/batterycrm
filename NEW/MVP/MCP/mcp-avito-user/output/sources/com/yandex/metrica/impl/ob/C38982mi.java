package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.mi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38982mi {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f381121a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, W0> f381122b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f381123c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f381124d;

    /* renamed from: e, reason: collision with root package name */
    private long f381125e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f381126f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private C38811fl f381127g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private C39096ra f381128h;

    /* renamed from: i, reason: collision with root package name */
    private long f381129i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38836gl> f381130j;

    /* renamed from: k, reason: collision with root package name */
    private final C38699b9 f381131k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final Rh f381132l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final Th f381133m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final Wh f381134n;

    public C38982mi(@j.N Context context, @j.N C38699b9 c38699b9) {
        this(c38699b9, new Nh(), new Rh(), C38784ej.a(context).a(context, new C38859hj(c38699b9)), new Th(), new Wh(), new Vh());
    }

    private void b(@j.N String str, @j.P W0 w02) {
        if (a(w02)) {
            return;
        }
        this.f381122b.put(str, w02);
    }

    private void h() {
        this.f381131k.i(this.f381122b.get("yandex_mobile_metrica_uuid")).e(this.f381122b.get("yandex_mobile_metrica_device_id")).d(this.f381122b.get("appmetrica_device_id_hash")).a(this.f381122b.get("yandex_mobile_metrica_get_ad_url")).b(this.f381122b.get("yandex_mobile_metrica_report_ad_url")).h(this.f381125e).h(this.f381122b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).r(Tl.c(this.f381124d)).a(this.f381127g).a(this.f381128h).f(this.f381122b.get("yandex_mobile_metrica_google_adv_id")).g(this.f381122b.get("yandex_mobile_metrica_huawei_oaid")).j(this.f381122b.get("yandex_mobile_metrica_yandex_adv_id")).d(this.f381126f).c(this.f381133m.a()).g(this.f381129i).a(this.f381134n.a()).d();
    }

    public void a(@j.P Map<String, String> map) {
        if (A2.b(map) || A2.a(map, this.f381124d)) {
            return;
        }
        this.f381124d = new HashMap(map);
        this.f381126f = true;
        h();
    }

    @j.P
    public String c() {
        W0 w02 = this.f381122b.get("yandex_mobile_metrica_device_id");
        if (w02 == null) {
            return null;
        }
        return w02.f379795a;
    }

    @j.N
    public C39096ra d() {
        return this.f381128h;
    }

    public long e() {
        return this.f381125e;
    }

    public C38811fl f() {
        return this.f381127g;
    }

    @j.P
    public String g() {
        W0 w02 = this.f381122b.get("yandex_mobile_metrica_uuid");
        if (w02 == null) {
            return null;
        }
        return w02.f379795a;
    }

    private boolean b(@j.P W0 w02) {
        return w02 == null || TextUtils.isEmpty(w02.f379795a);
    }

    @j.k0
    public C38982mi(@j.N C38699b9 c38699b9, @j.N Nh nh2, @j.N Rh rh2, @j.N C38759dj c38759dj, @j.N Th th2, @j.N Wh wh2, @j.N Vh vh2) {
        HashSet hashSet = new HashSet();
        this.f381121a = hashSet;
        this.f381122b = new HashMap();
        this.f381130j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f381131k = c38699b9;
        this.f381132l = rh2;
        this.f381133m = th2;
        this.f381134n = wh2;
        a("yandex_mobile_metrica_uuid", c38759dj.a());
        a("yandex_mobile_metrica_device_id", c38699b9.l());
        a("appmetrica_device_id_hash", c38699b9.k());
        a("yandex_mobile_metrica_get_ad_url", c38699b9.f());
        a("yandex_mobile_metrica_report_ad_url", c38699b9.g());
        b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, c38699b9.r());
        a("yandex_mobile_metrica_google_adv_id", c38699b9.o());
        a("yandex_mobile_metrica_huawei_oaid", c38699b9.p());
        a("yandex_mobile_metrica_yandex_adv_id", c38699b9.v());
        th2.a(c38699b9.j());
        wh2.a(c38699b9.n());
        this.f381123c = c38699b9.i();
        String strK = c38699b9.k(null);
        this.f381124d = strK != null ? Tl.a(strK) : null;
        this.f381126f = c38699b9.b(true);
        this.f381125e = c38699b9.d(0L);
        this.f381127g = c38699b9.t();
        this.f381128h = c38699b9.m();
        this.f381129i = c38699b9.q();
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(@j.N java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Collection r0 = com.yandex.metrica.impl.ob.C39007ni.a(r7)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L25
        Ld:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L25
            java.util.Set<java.lang.String> r4 = r6.f381121a     // Catch: java.lang.Throwable -> L25
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto Ld
            r7 = r3
            goto L28
        L25:
            r7 = move-exception
            goto L4a
        L27:
            r7 = r2
        L28:
            long r4 = r6.f381129i     // Catch: java.lang.Throwable -> L25
            boolean r1 = com.yandex.metrica.impl.ob.C39007ni.a(r4)     // Catch: java.lang.Throwable -> L25
            com.yandex.metrica.impl.ob.fl r4 = r6.f381127g     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L3a
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L3a
            r4 = r3
            goto L3b
        L3a:
            r4 = r2
        L3b:
            if (r0 == 0) goto L47
            if (r7 != 0) goto L47
            if (r1 != 0) goto L47
            boolean r7 = r6.f381126f     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto L47
            if (r4 != 0) goto L48
        L47:
            r2 = r3
        L48:
            monitor-exit(r6)
            return r2
        L4a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38982mi.b(java.util.List):boolean");
    }

    public boolean a() {
        W0 w02 = this.f381122b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!a(w02) && w02.f379795a.isEmpty()) {
            return A2.b(this.f381124d);
        }
        return true;
    }

    private void a(@j.N String str, @j.P W0 w02) {
        if (b(w02)) {
            return;
        }
        this.f381122b.put(str, w02);
    }

    private boolean a(@j.P W0 w02) {
        return w02 == null || w02.f379795a == null;
    }

    public List<String> b() {
        return this.f381123c;
    }

    public synchronized void a(@j.N List<String> list, Map<String, W0> map) {
        try {
            for (String str : list) {
                W0 w02 = this.f381122b.get(str);
                if (w02 != null) {
                    map.put(str, w02);
                }
            }
            this.f381133m.a(list, map);
            this.f381134n.a(list, map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean a(@j.N Collection<String> collection) {
        try {
            for (String str : collection) {
                W0 w0A = this.f381122b.get(str);
                if (w0A == null) {
                    w0A = this.f381133m.b().get(str);
                }
                if (w0A == null) {
                    w0A = this.f381134n.a(str);
                }
                if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str)) {
                    if (this.f381126f || a(w0A) || (w0A.f379795a.isEmpty() && !A2.b(this.f381124d))) {
                        return false;
                    }
                } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str)) {
                    if (w0A == null) {
                        return false;
                    }
                } else if (b(w0A)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public void a(@j.N Bundle bundle) {
        HashMap<String, String> mapD;
        boolean zEquals;
        L l12 = new L(bundle);
        W0 w0O = l12.o();
        if (b(this.f381122b.get("yandex_mobile_metrica_uuid")) && !b(w0O) && !b(w0O)) {
            this.f381122b.put("yandex_mobile_metrica_uuid", w0O);
        }
        W0 w0C = l12.c();
        if (!b(w0C)) {
            this.f381122b.put("yandex_mobile_metrica_device_id", w0C);
        }
        W0 w0D = l12.d();
        if (!b(w0D)) {
            this.f381122b.put("appmetrica_device_id_hash", w0D);
        }
        this.f381122b.put("yandex_mobile_metrica_google_adv_id", l12.g());
        this.f381122b.put("yandex_mobile_metrica_huawei_oaid", l12.i());
        this.f381122b.put("yandex_mobile_metrica_yandex_adv_id", l12.p());
        this.f381133m.a(l12.b());
        this.f381134n.a(l12.f());
        W0 w0H = l12.h();
        if (!a(w0H)) {
            this.f381122b.put("yandex_mobile_metrica_get_ad_url", w0H);
        }
        W0 w0K = l12.k();
        if (!a(w0K)) {
            this.f381122b.put("yandex_mobile_metrica_report_ad_url", w0K);
        }
        this.f381125e = l12.m();
        Rh rh2 = this.f381132l;
        Map<String, String> map = this.f381124d;
        String str = l12.a().f379795a;
        if (str == null) {
            mapD = null;
        } else if (str.isEmpty()) {
            mapD = new HashMap<>();
        } else {
            mapD = Tl.d(str);
        }
        rh2.getClass();
        if (A2.b(map)) {
            zEquals = A2.b(mapD);
        } else {
            zEquals = map.equals(mapD);
        }
        if (zEquals) {
            this.f381122b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, l12.l());
            this.f381126f = false;
        }
        C38811fl c38811flN = l12.n();
        if (c38811flN != null && c38811flN.a()) {
            this.f381127g = c38811flN;
            Iterator<InterfaceC38836gl> it = this.f381130j.iterator();
            while (it.hasNext()) {
                it.next().a(this.f381127g);
            }
        }
        this.f381128h = l12.e();
        this.f381129i = l12.j();
        h();
    }

    public synchronized void a(@j.N InterfaceC38836gl interfaceC38836gl) {
        this.f381130j.add(interfaceC38836gl);
    }

    public void a(List<String> list) {
        this.f381123c = list;
        this.f381131k.b(list);
    }
}
