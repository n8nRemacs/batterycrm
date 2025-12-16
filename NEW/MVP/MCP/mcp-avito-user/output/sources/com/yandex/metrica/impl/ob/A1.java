package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class A1 implements B1 {

    /* renamed from: a, reason: collision with root package name */
    private final C39108rm<String, Integer> f377747a = new C39108rm<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<e, d> f377748b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<e, d> f377749c = new LinkedHashMap();

    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.A1.d
        public boolean a(@j.N Intent intent, @j.N A1 a12) {
            return A1.a(A1.this, intent);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.A1.d
        public boolean a(@j.N Intent intent, @j.N A1 a12) {
            return A1.this.e(intent);
        }
    }

    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.A1.d
        public boolean a(@j.N Intent intent, @j.N A1 a12) {
            return A1.this.e(intent) && A1.a(A1.this);
        }
    }

    public interface d {
        boolean a(@j.N Intent intent, @j.N A1 a12);
    }

    public interface e {
        void a(@j.N Intent intent);
    }

    private int d(@j.N Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(@j.N Intent intent) {
        if ("com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return !(d(intent) == Process.myPid());
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f377747a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f377748b);
        }
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f377747a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f377748b);
        }
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f377747a.b(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f377749c);
        }
    }

    private void a(@j.N Intent intent, @j.N Map<e, d> map) {
        for (Map.Entry<e, d> entry : map.entrySet()) {
            if (entry.getValue().a(intent, this)) {
                entry.getKey().a(intent);
            }
        }
    }

    public void c(@j.N e eVar) {
        this.f377748b.put(eVar, new b());
    }

    private int c() {
        Collection<Integer> collectionA = this.f377747a.a("com.yandex.metrica.IMetricaService");
        int i12 = 0;
        if (!A2.b(collectionA)) {
            Iterator<Integer> it = collectionA.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != Process.myPid()) {
                    i12++;
                }
            }
        }
        return i12;
    }

    public void b(@j.N e eVar) {
        this.f377748b.put(eVar, new a());
    }

    public void a(@j.N e eVar) {
        this.f377749c.put(eVar, new c());
    }

    public static boolean a(A1 a12, Intent intent) {
        return a12.e(intent) && a12.c() == 1;
    }

    public static boolean a(A1 a12) {
        return a12.c() == 0;
    }
}
