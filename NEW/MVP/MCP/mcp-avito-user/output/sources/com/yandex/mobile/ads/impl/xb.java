package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class xb {

    /* renamed from: a, reason: collision with root package name */
    private final d30 f391599a = new d30();

    @j.N
    public final ArrayList a(@j.N List list, @j.N Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eb ebVar = (eb) it.next();
            Object objD = ebVar.d();
            String strC = ebVar.c();
            if ("image".equals(strC) && (objD instanceof b30)) {
                this.f391599a.getClass();
                if (d30.a((b30) objD, map)) {
                    arrayList.add(ebVar);
                }
            } else if ("media".equals(strC) && (objD instanceof rd0) && ((rd0) objD).a() != null) {
                rd0 rd0Var = (rd0) objD;
                List<b30> listA = rd0Var.a();
                b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
                me1 me1VarC = rd0Var.c();
                rb0 rb0VarB = rd0Var.b();
                if (me1VarC == null && rb0VarB == null) {
                    if (b30Var != null) {
                        this.f391599a.getClass();
                        if (d30.a(b30Var, map)) {
                        }
                    }
                }
                arrayList.add(ebVar);
            } else {
                arrayList.add(ebVar);
            }
        }
        return arrayList;
    }
}
