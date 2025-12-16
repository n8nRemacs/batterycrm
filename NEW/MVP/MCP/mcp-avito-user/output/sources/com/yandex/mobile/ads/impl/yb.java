package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class yb {
    @j.N
    public static HashSet a(@j.N List list) {
        List<b30> listA;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objD = ((eb) it.next()).d();
            if (objD instanceof b30) {
                hashSet.add((b30) objD);
            }
            if ((objD instanceof rd0) && (listA = ((rd0) objD).a()) != null) {
                hashSet.addAll(listA);
            }
        }
        return hashSet;
    }
}
