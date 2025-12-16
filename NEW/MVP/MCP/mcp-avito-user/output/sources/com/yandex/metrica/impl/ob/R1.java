package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class R1 implements N0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private Context f379265a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private A3 f379266b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private T1 f379267c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private Handler f379268d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private C38858hi f379269e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, M0> f379270f;

    /* renamed from: g, reason: collision with root package name */
    private final Kn<String> f379271g;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f379272h;

    public R1(@j.N Context context, @j.N A3 a32, @j.N T1 t12, @j.N Handler handler, @j.N C38858hi c38858hi) {
        HashMap map = new HashMap();
        this.f379270f = map;
        this.f379271g = new Hn(new Mn(map));
        this.f379272h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.f379265a = context;
        this.f379266b = a32;
        this.f379267c = t12;
        this.f379268d = handler;
        this.f379269e = c38858hi;
    }

    @j.N
    @j.l0
    public C38890j1 a(@j.N com.yandex.metrica.j jVar, boolean z12, @j.N C38699b9 c38699b9) {
        this.f379271g.a(jVar.apiKey);
        Context context = this.f379265a;
        A3 a32 = this.f379266b;
        C38890j1 c38890j1 = new C38890j1(context, a32, jVar, this.f379267c, new C38896j7(context, a32), this.f379269e, new C39256y2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C39256y2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), c38699b9, P.g(), new A0(context));
        a(c38890j1);
        if (z12) {
            c38890j1.f377800i.c(c38890j1.f377793b);
        }
        Map<String, String> map = jVar.f382347f;
        if (!A2.b(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    c38890j1.f377800i.a(key, value, c38890j1.f377793b);
                } else if (c38890j1.f377794c.isEnabled()) {
                    c38890j1.f377794c.fw("Invalid App Environment (key,value) pair: (%s,%s).", key, value);
                }
            }
        }
        c38890j1.a(jVar.errorEnvironment);
        c38890j1.f();
        this.f379267c.a(c38890j1);
        this.f379270f.put(jVar.apiKey, c38890j1);
        return c38890j1;
    }

    @Override // com.yandex.metrica.impl.ob.O0
    @j.N
    public N0 b() {
        return this;
    }

    public synchronized void c(@j.N com.yandex.metrica.f fVar) {
        try {
            if (this.f379270f.containsKey(fVar.apiKey)) {
                C38737cm c38737cmB = Ul.b(fVar.apiKey);
                if (c38737cmB.isEnabled()) {
                    c38737cmB.fw("Reporter with apiKey=%s already exists.", fVar.apiKey);
                }
            } else {
                b(fVar);
                A2.a(fVar.apiKey);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.metrica.impl.ob.M0] */
    @Override // com.yandex.metrica.impl.ob.N0
    @j.N
    public synchronized M0 b(@j.N com.yandex.metrica.f fVar) {
        C38940l1 c38940l1;
        try {
            M0 m02 = this.f379270f.get(fVar.apiKey);
            c38940l1 = m02;
            if (m02 == 0) {
                if (!this.f379272h.contains(fVar.apiKey)) {
                    this.f379269e.g();
                }
                C38940l1 c38940l12 = new C38940l1(this.f379265a, this.f379266b, fVar, this.f379267c);
                a(c38940l12);
                c38940l12.f();
                this.f379270f.put(fVar.apiKey, c38940l12);
                c38940l1 = c38940l12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c38940l1;
    }

    @Override // com.yandex.metrica.impl.ob.N0
    @j.N
    public synchronized R0 a(@j.N com.yandex.metrica.j jVar) {
        R0 r02;
        R0 r03 = (M0) this.f379270f.get(jVar.apiKey);
        r02 = r03;
        if (r03 == null) {
            C38740d0 c38740d0 = new C38740d0(this.f379265a, this.f379266b, jVar, this.f379267c);
            a(c38740d0);
            c38740d0.a(jVar.errorEnvironment);
            c38740d0.f();
            r02 = c38740d0;
        }
        return r02;
    }

    private void a(@j.N B b12) {
        b12.a(new C38691b1(this.f379268d, b12));
        b12.f377793b.a(this.f379269e);
    }
}
