package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.ob.ResultReceiverC38790f0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.hi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38858hi implements InterfaceC38907ji, Q0 {

    /* renamed from: j, reason: collision with root package name */
    static final Map<EnumC38833gi, IParamsCallback.Reason> f380720j = Collections.unmodifiableMap(new a());

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f380721a;

    /* renamed from: b, reason: collision with root package name */
    private final T1 f380722b;

    /* renamed from: c, reason: collision with root package name */
    private final C38982mi f380723c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Handler f380724d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private C38737cm f380725e;

    /* renamed from: f, reason: collision with root package name */
    private final ResultReceiverC38790f0.a f380726f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f380727g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Yh, List<String>> f380728h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, String> f380729i;

    /* renamed from: com.yandex.metrica.impl.ob.hi$a */
    public class a extends HashMap<EnumC38833gi, IParamsCallback.Reason> {
        public a() {
            put(EnumC38833gi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(EnumC38833gi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(EnumC38833gi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    public C38858hi(@j.N Context context, T1 t12, C38699b9 c38699b9, @j.N Handler handler) {
        this(t12, new C38982mi(context, c38699b9), handler);
    }

    private void f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry<Yh, List<String>> entry : this.f380728h.entrySet()) {
            List<String> value = entry.getValue();
            if (this.f380723c.a((Collection<String>) value)) {
                weakHashMap.put(entry.getKey(), value);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Yh yh2 = (Yh) ((Map.Entry) it.next()).getKey();
            if (yh2 != null) {
                a(yh2, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long a() {
        return this.f380723c.e();
    }

    public String b() {
        return this.f380723c.c();
    }

    @j.N
    public C39096ra c() {
        return this.f380723c.d();
    }

    @j.P
    public C38811fl d() {
        return this.f380723c.f();
    }

    public String e() {
        return this.f380723c.g();
    }

    public void g() {
        boolean zB2;
        synchronized (this.f380727g) {
            try {
                C38982mi c38982mi = this.f380723c;
                synchronized (c38982mi) {
                    zB2 = c38982mi.b(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"));
                }
                if (zB2) {
                    Map<String, String> map = this.f380729i;
                    this.f380722b.a(this.f380721a, new ResultReceiverC38790f0(this.f380724d, this.f380726f), map);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.k0
    public C38858hi(T1 t12, @j.N C38982mi c38982mi, @j.N Handler handler) {
        this.f380721a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.f380727g = new Object();
        this.f380728h = new WeakHashMap();
        this.f380722b = t12;
        this.f380723c = c38982mi;
        this.f380724d = handler;
        this.f380726f = new b(this);
    }

    public void a(IIdentifierCallback iIdentifierCallback, @j.N List<String> list, @j.P Map<String, String> map) {
        Qh qh2 = new Qh(iIdentifierCallback);
        synchronized (this.f380727g) {
            try {
                this.f380723c.a(map);
                if (this.f380728h.isEmpty()) {
                    this.f380722b.g();
                }
                this.f380728h.put(qh2, list);
                if (this.f380723c.b(list)) {
                    this.f380722b.a(list, new ResultReceiverC38790f0(this.f380724d, new C38882ii(this, qh2)), map);
                } else {
                    a(qh2, new Bundle());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(@j.P String str) {
        synchronized (this.f380727g) {
            this.f380722b.b(str);
        }
    }

    public void a(@j.N Bundle bundle, @j.P Yh yh2) {
        synchronized (this.f380727g) {
            try {
                this.f380723c.a(bundle);
                f();
                f();
                if (yh2 != null) {
                    a(yh2, bundle);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(@j.N C38737cm c38737cm) {
        this.f380725e = c38737cm;
    }

    public void a(List<String> list) {
        synchronized (this.f380727g) {
            try {
                List<String> listB = this.f380723c.b();
                if (A2.b(list)) {
                    if (!A2.b(listB)) {
                        this.f380723c.a((List<String>) null);
                        this.f380722b.a((List<String>) null);
                    }
                } else if (!A2.a(list, listB)) {
                    this.f380723c.a(list);
                    this.f380722b.a(list);
                } else {
                    this.f380722b.a(listB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(Map<String, String> map) {
        if (A2.b(map)) {
            return;
        }
        synchronized (this.f380727g) {
            Map<String, String> mapI = Tl.i(map);
            this.f380729i = mapI;
            this.f380722b.a(mapI);
            this.f380723c.a(mapI);
        }
    }

    public void a(String str) {
        synchronized (this.f380727g) {
            this.f380722b.a(str);
        }
    }

    public void a(@j.N InterfaceC38836gl interfaceC38836gl) {
        this.f380723c.a(interfaceC38836gl);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(@j.N com.yandex.metrica.impl.ob.Yh r6, @j.N android.os.Bundle r7) {
        /*
            r5 = this;
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r5.f380728h
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L98
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r5.f380728h
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.mi r1 = r5.f380723c
            boolean r1 = r1.a(r0)
            r2 = 0
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r7 = r5.f380723c
            r7.a(r0, r2)
        L26:
            r6.onReceive(r2)
            goto L86
        L2a:
            java.lang.String r1 = "startup_error_key_code"
            boolean r3 = r7.containsKey(r1)
            if (r3 == 0) goto L45
            int r7 = r7.getInt(r1)
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.EnumC38833gi.UNKNOWN
            r3 = 1
            if (r7 == r3) goto L42
            r3 = 2
            if (r7 == r3) goto L3f
            goto L46
        L3f:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.EnumC38833gi.PARSE
            goto L46
        L42:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.EnumC38833gi.NETWORK
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 != 0) goto L64
            com.yandex.metrica.impl.ob.mi r7 = r5.f380723c
            boolean r7 = r7.a()
            if (r7 != 0) goto L62
            com.yandex.metrica.impl.ob.cm r7 = r5.f380725e
            if (r7 == 0) goto L5f
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.f380729i
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r7.fw(r4, r3)
        L5f:
            com.yandex.metrica.IParamsCallback$Reason r7 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L65
        L62:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.EnumC38833gi.UNKNOWN
        L64:
            r7 = r2
        L65:
            if (r7 != 0) goto L76
            java.util.Map<com.yandex.metrica.impl.ob.gi, com.yandex.metrica.IParamsCallback$Reason> r7 = com.yandex.metrica.impl.ob.C38858hi.f380720j
            com.yandex.metrica.IParamsCallback$Reason r3 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r7 = r7.get(r1)
            if (r7 != 0) goto L72
            goto L73
        L72:
            r3 = r7
        L73:
            r7 = r3
            com.yandex.metrica.IParamsCallback$Reason r7 = (com.yandex.metrica.IParamsCallback.Reason) r7
        L76:
            if (r0 != 0) goto L79
            goto L83
        L79:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r1 = r5.f380723c
            r1.a(r0, r2)
        L83:
            r6.a(r7, r2)
        L86:
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r7 = r5.f380728h
            r7.remove(r6)
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r6 = r5.f380728h
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L98
            com.yandex.metrica.impl.ob.T1 r6 = r5.f380722b
            r6.f()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38858hi.a(com.yandex.metrica.impl.ob.Yh, android.os.Bundle):void");
    }

    /* renamed from: com.yandex.metrica.impl.ob.hi$b */
    public class b implements ResultReceiverC38790f0.a {
        public b(C38858hi c38858hi) {
        }

        @Override // com.yandex.metrica.impl.ob.ResultReceiverC38790f0.a
        public void a(int i12, @j.N Bundle bundle) {
        }
    }
}
