package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class el0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ik0 f384974a = new ik0();

    @j.N
    public static ArrayList b(@j.N AdResponse adResponse) {
        bl0 bl0Var = (bl0) adResponse.B();
        List<nj0> listE = bl0Var != null ? bl0Var.e() : null;
        if (listE == null) {
            listE = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<nj0> it = listE.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (strA != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @j.N
    public static ArrayList c(@j.N AdResponse adResponse) {
        bl0 bl0Var = (bl0) adResponse.B();
        List<nj0> listE = bl0Var != null ? bl0Var.e() : null;
        if (listE == null) {
            listE = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<nj0> it = listE.iterator();
        while (it.hasNext()) {
            int iG2 = it.next().g();
            if (iG2 != 0) {
                arrayList.add(tz0.a(iG2));
            }
        }
        return arrayList;
    }

    @j.N
    public final ArrayList a(@j.N AdResponse adResponse) {
        bl0 bl0Var = (bl0) adResponse.B();
        List<nj0> listE = bl0Var != null ? bl0Var.e() : null;
        if (listE == null) {
            listE = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<nj0> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f384974a.a(it.next()));
        }
        return arrayList;
    }
}
