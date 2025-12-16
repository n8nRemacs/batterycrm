package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ne1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class bm1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f383993a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ne1 f383994b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final zl1 f383995c;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final am1 f383997e = new am1();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final cm1 f383998f = new cm1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final we1 f383996d = new we1();

    public bm1(@j.N Context context, @j.N ne1 ne1Var) {
        this.f383993a = context.getApplicationContext();
        this.f383994b = ne1Var;
        this.f383995c = new zl1(ne1Var);
    }

    @j.N
    public final ArrayList a(@j.N List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ne1 ne1Var = (ne1) it.next();
            ArrayList arrayListA = this.f383995c.a(ne1Var);
            am1 am1Var = this.f383997e;
            ne1 ne1Var2 = this.f383994b;
            am1Var.getClass();
            af1 af1VarA = am1.a(ne1Var, ne1Var2);
            cm1 cm1Var = this.f383998f;
            ne1 ne1Var3 = this.f383994b;
            cm1Var.getClass();
            uj1 uj1VarA = cm1.a(ne1Var, ne1Var3);
            this.f383996d.getClass();
            Map<String, List<String>> mapH = ne1Var.h();
            we1 we1Var = this.f383996d;
            ne1 ne1Var4 = this.f383994b;
            we1Var.getClass();
            Map<String, List<String>> mapH2 = ne1Var4.h();
            ArrayList arrayListD = ne1Var.d();
            ArrayList arrayListD2 = this.f383994b.d();
            ArrayList arrayList2 = new ArrayList(arrayListD);
            arrayList2.addAll(arrayListD2);
            ne1.a aVarB = new ne1.a(this.f383993a, ne1Var.o()).b(arrayListA);
            for (Map.Entry<String, List<String>> entry : mapH.entrySet()) {
                Iterator<String> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    aVarB.a(entry.getKey(), it2.next());
                }
            }
            ne1.a aVarA = aVarB.a(ne1Var.b()).b(ne1Var.c()).c(ne1Var.f()).e(ne1Var.j()).f(ne1Var.k()).a(af1VarA).a(uj1VarA).a(ne1Var.n());
            for (Map.Entry<String, List<String>> entry2 : mapH2.entrySet()) {
                Iterator<String> it3 = entry2.getValue().iterator();
                while (it3.hasNext()) {
                    aVarA.a(entry2.getKey(), it3.next());
                }
            }
            arrayList.add(aVarA.a(arrayList2).a());
        }
        return arrayList;
    }
}
