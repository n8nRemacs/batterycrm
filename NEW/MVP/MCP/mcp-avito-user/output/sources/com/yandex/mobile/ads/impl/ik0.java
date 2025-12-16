package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class ik0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yb f386507a = new yb();

    @j.N
    public final ArrayList a(@j.N nj0 nj0Var) {
        HashSet hashSet = new HashSet();
        List<eb<?>> listB = nj0Var.b();
        this.f386507a.getClass();
        Iterator it = yb.a(listB).iterator();
        while (it.hasNext()) {
            b30 b30Var = (b30) it.next();
            if (!TextUtils.isEmpty(b30Var.b())) {
                hashSet.add(b30Var.b());
            }
        }
        return new ArrayList(hashSet);
    }
}
