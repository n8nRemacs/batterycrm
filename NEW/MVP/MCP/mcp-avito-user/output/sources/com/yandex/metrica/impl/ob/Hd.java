package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Hd {

    /* renamed from: a, reason: collision with root package name */
    private Context f378260a;

    public Hd(Context context) {
        this.f378260a = context;
    }

    public void a() {
        SharedPreferences sharedPreferencesA = C38689b.a(this.f378260a, "_bidoptpreferences");
        if (sharedPreferencesA.getAll().size() > 0) {
            Rd rd2 = Pd.f379180p;
            String string = sharedPreferencesA.getString(rd2.b(), null);
            Pd pd2 = new Pd(this.f378260a, null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(pd2.b((String) null))) {
                pd2.i(string).b();
                sharedPreferencesA.edit().remove(rd2.b()).apply();
            }
            Map<String, ?> all = sharedPreferencesA.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) a(all, Pd.f379181q.b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = sharedPreferencesA.getString(new Rd(Pd.f379181q.b(), str).a(), null);
                    Pd pd3 = new Pd(this.f378260a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(pd3.h(null))) {
                        pd3.j(string2).b();
                    }
                }
            }
            sharedPreferencesA.edit().clear().apply();
        }
    }

    public void b() {
        S7 s7P = C38899ja.a(this.f378260a).p();
        SharedPreferences sharedPreferencesA = C38689b.a(this.f378260a, "_startupserviceinfopreferences");
        C38799f9 c38799f9 = new C38799f9(s7P, null);
        Rd rd2 = Pd.f379180p;
        String string = sharedPreferencesA.getString(rd2.b(), null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c38799f9.g().f381610b)) {
            c38799f9.i(string).d();
            sharedPreferencesA.edit().remove(rd2.b()).apply();
        }
        C38799f9 c38799f92 = new C38799f9(s7P, this.f378260a.getPackageName());
        boolean z12 = sharedPreferencesA.getBoolean(Pd.f379189y.b(), false);
        if (z12) {
            c38799f92.a(z12).d();
        }
        a(s7P, this.f378260a.getPackageName());
        Iterator it = ((ArrayList) a(sharedPreferencesA.getAll(), Pd.f379181q.b())).iterator();
        while (it.hasNext()) {
            a(s7P, (String) it.next());
        }
    }

    private List<String> a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.replace(str, ""));
            }
        }
        return arrayList;
    }

    private void a(S7 s72, String str) {
        C38799f9 c38799f9 = new C38799f9(s72, str);
        Pd pd2 = new Pd(this.f378260a, str);
        String strH = pd2.h(null);
        if (!TextUtils.isEmpty(strH)) {
            c38799f9.o(strH);
        }
        String strC = pd2.c(null);
        if (!TextUtils.isEmpty(strC)) {
            c38799f9.j(strC);
        }
        String strD = pd2.d(null);
        if (!TextUtils.isEmpty(strD)) {
            c38799f9.k(strD);
        }
        String strF = pd2.f(null);
        if (!TextUtils.isEmpty(strF)) {
            c38799f9.m(strF);
        }
        String strE = pd2.e(null);
        if (!TextUtils.isEmpty(strE)) {
            c38799f9.l(strE);
        }
        long jA2 = pd2.a(-1L);
        if (jA2 != -1) {
            c38799f9.b(jA2);
        }
        String strG = pd2.g(null);
        if (!TextUtils.isEmpty(strG)) {
            c38799f9.n(strG);
        }
        c38799f9.d();
        pd2.f();
    }
}
