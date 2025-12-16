package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class go0 {
    @j.N
    public static HashSet a(@j.N bl0 bl0Var) {
        HashSet hashSet = new HashSet();
        for (nj0 nj0Var : bl0Var.e()) {
            HashSet hashSet2 = new HashSet();
            Iterator<eb<?>> it = nj0Var.b().iterator();
            while (it.hasNext()) {
                Object objD = it.next().d();
                if (objD instanceof rd0) {
                    hashSet2.add((rd0) objD);
                }
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                me1 me1VarC = ((rd0) it2.next()).c();
                yn0 yn0VarC = me1VarC != null ? me1VarC.a().c() : null;
                if (yn0VarC != null) {
                    hashSet.add(yn0VarC.getUrl());
                }
            }
        }
        return hashSet;
    }
}
