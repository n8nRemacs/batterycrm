package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class td0 {
    @j.N
    public static HashSet a(@j.N nj0 nj0Var) {
        HashSet hashSet = new HashSet();
        Iterator<eb<?>> it = nj0Var.b().iterator();
        while (it.hasNext()) {
            Object objD = it.next().d();
            if (objD instanceof rd0) {
                hashSet.add((rd0) objD);
            }
        }
        return hashSet;
    }
}
