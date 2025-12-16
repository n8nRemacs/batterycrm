package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class q51 {
    @j.N
    public static ArrayList a(@j.P List list, @j.P h90 h90Var) {
        List<AbstractC39344m> listA;
        List<AbstractC39344m> listA2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (h90Var != null && (listA2 = h90Var.a()) != null) {
            for (AbstractC39344m abstractC39344m : listA2) {
                if (abstractC39344m instanceof o51) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<r51> it = ((o51) abstractC39344m).b().iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().c().a());
                    }
                    arrayList2.addAll(arrayList3);
                }
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h90 h90VarA = ((eb) it2.next()).a();
                ArrayList arrayList5 = new ArrayList();
                if (h90VarA != null && (listA = h90VarA.a()) != null) {
                    for (AbstractC39344m abstractC39344m2 : listA) {
                        if (abstractC39344m2 instanceof o51) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<r51> it3 = ((o51) abstractC39344m2).b().iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(it3.next().c().a());
                            }
                            arrayList5.addAll(arrayList6);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }
}
