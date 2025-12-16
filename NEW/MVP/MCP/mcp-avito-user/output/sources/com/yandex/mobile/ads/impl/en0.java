package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class en0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final td0 f385012a = new td0();

    public final boolean a(@Y61.k uj0 uj0Var) {
        List<nj0> listE = uj0Var.c().e();
        ArrayList arrayList = new ArrayList();
        for (nj0 nj0Var : listE) {
            this.f385012a.getClass();
            C42745f0.h(td0.a(nj0Var), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            me1 me1VarC = ((rd0) it.next()).c();
            List<ff1<yn0>> listB = me1VarC != null ? me1VarC.b() : null;
            if (listB == null) {
                listB = C42784z0.f406748b;
            }
            C42745f0.h(listB, arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((ff1) it2.next()).e().d().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
