package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.vo1;
import com.yandex.mobile.ads.impl.zo1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class wa1 implements vo1.a {

    /* renamed from: h, reason: collision with root package name */
    private static wa1 f391358h = new wa1();

    /* renamed from: i, reason: collision with root package name */
    private static Handler f391359i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private static Handler f391360j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f391361k = new b();

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f391362l = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f391364b;

    /* renamed from: g, reason: collision with root package name */
    private long f391369g;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f391363a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f391365c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private zo1 f391367e = new zo1();

    /* renamed from: d, reason: collision with root package name */
    private fp1 f391366d = new fp1();

    /* renamed from: f, reason: collision with root package name */
    private ip1 f391368f = new ip1(new op1());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wa1.this.f391368f.a();
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            wa1.b(wa1.g());
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (wa1.f391360j != null) {
                wa1.f391360j.post(wa1.f391361k);
                wa1.f391360j.postDelayed(wa1.f391362l, 200L);
            }
        }
    }

    public interface d extends e {
        void a();
    }

    public interface e {
        void b();
    }

    public static void c() {
        Handler handler = f391360j;
        if (handler != null) {
            handler.removeCallbacks(f391362l);
            f391360j = null;
        }
    }

    public static wa1 g() {
        return f391358h;
    }

    public final void b() {
        c();
        this.f391363a.clear();
        f391359i.post(new a());
    }

    public static void b(wa1 wa1Var) throws JSONException {
        wa1Var.f391364b = 0;
        wa1Var.f391365c.clear();
        Iterator<to1> it = uo1.a().c().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        wa1Var.f391369g = System.nanoTime();
        wa1Var.f391367e.c();
        long jNanoTime = System.nanoTime();
        mp1 mp1VarA = wa1Var.f391366d.a();
        if (wa1Var.f391367e.b().size() > 0) {
            Iterator<String> it2 = wa1Var.f391367e.b().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                JSONObject jSONObjectA = mp1VarA.a(null);
                View viewB = wa1Var.f391367e.b(next);
                rp1 rp1VarB = wa1Var.f391366d.b();
                String strA = wa1Var.f391367e.a(next);
                if (strA != null) {
                    JSONObject jSONObjectA2 = rp1VarB.a(viewB);
                    try {
                        jSONObjectA2.put("adSessionId", next);
                    } catch (JSONException e12) {
                        np1.a("Error with setting ad session id", e12);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", strA);
                    } catch (JSONException e13) {
                        np1.a("Error with setting not visible reason", e13);
                    }
                    try {
                        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null) {
                            jSONArrayOptJSONArray = new JSONArray();
                            jSONObjectA.put("childViews", jSONArrayOptJSONArray);
                        }
                        jSONArrayOptJSONArray.put(jSONObjectA2);
                    } catch (JSONException unused) {
                    }
                }
                gp1.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                wa1Var.f391368f.b(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (wa1Var.f391367e.a().size() > 0) {
            JSONObject jSONObjectA3 = mp1VarA.a(null);
            mp1VarA.a(null, jSONObjectA3, wa1Var, true, false);
            gp1.a(jSONObjectA3);
            wa1Var.f391368f.a(jSONObjectA3, wa1Var.f391367e.a(), jNanoTime);
        } else {
            wa1Var.f391368f.a();
        }
        wa1Var.f391367e.d();
        long jNanoTime2 = System.nanoTime() - wa1Var.f391369g;
        if (wa1Var.f391363a.size() > 0) {
            Iterator it3 = wa1Var.f391363a.iterator();
            while (it3.hasNext()) {
                e eVar = (e) it3.next();
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                eVar.b();
                if (eVar instanceof d) {
                    ((d) eVar).a();
                }
            }
        }
    }

    public final void a(View view, vo1 vo1Var, JSONObject jSONObject, boolean z12) throws JSONException {
        int iC2;
        boolean z13;
        if (aq1.c(view) != null || (iC2 = this.f391367e.c(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = vo1Var.a(view);
        int i12 = gp1.f385807d;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObjectA);
        } catch (JSONException unused) {
        }
        Object objA = this.f391367e.a(view);
        if (objA != null) {
            try {
                jSONObjectA.put("adSessionId", objA);
            } catch (JSONException e12) {
                np1.a("Error with setting ad session id", e12);
            }
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f391367e.d(view)));
            } catch (JSONException e13) {
                np1.a("Error with setting not visible reason", e13);
            }
            this.f391367e.e();
        } else {
            zo1.a aVarB = this.f391367e.b(view);
            if (aVarB != null) {
                int i13 = gp1.f385807d;
                lp1 lp1VarA = aVarB.a();
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = aVarB.b().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", lp1VarA.b());
                    jSONObjectA.put("friendlyObstructionPurpose", lp1VarA.c());
                    jSONObjectA.put("friendlyObstructionReason", lp1VarA.d());
                } catch (JSONException e14) {
                    np1.a("Error with setting friendly obstruction", e14);
                }
                z13 = true;
            } else {
                z13 = false;
            }
            vo1Var.a(view, jSONObjectA, this, iC2 == 1, z12 || z13);
        }
        this.f391364b++;
    }

    public static void a() {
        if (f391360j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f391360j = handler;
            handler.post(f391361k);
            f391360j.postDelayed(f391362l, 200L);
        }
    }
}
