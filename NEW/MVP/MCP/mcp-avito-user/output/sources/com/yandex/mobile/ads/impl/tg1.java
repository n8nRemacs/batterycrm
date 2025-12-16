package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class tg1 {

    public static class a implements Comparator<ne1> {
        private a() {
        }

        @Override // java.util.Comparator
        public final int compare(@j.N ne1 ne1Var, @j.N ne1 ne1Var2) {
            return ne1Var.i().compareTo(ne1Var2.i());
        }

        public /* synthetic */ a(int i12) {
            this();
        }
    }

    @j.N
    public static ArrayList a(@j.N List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ne1) it.next()).i() != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ne1 ne1Var = (ne1) it2.next();
                    if (ne1Var.i() != null) {
                        arrayList.add(ne1Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ne1 ne1Var2 = (ne1) it3.next();
                    if (ne1Var2.i() != null) {
                        arrayList2.add(ne1Var2);
                    }
                }
                Collections.sort(arrayList2, new a(0));
                return arrayList2;
            }
        }
        return new ArrayList(list);
    }
}
