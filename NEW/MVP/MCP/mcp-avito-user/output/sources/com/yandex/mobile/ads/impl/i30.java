package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class i30 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ov f386288a = new ov();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final yb f386289b = new yb();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final q51 f386290c = new q51();

    @Y61.k
    public final HashSet a(@Y61.k List list, @Y61.l h90 h90Var) {
        Object next;
        this.f386289b.getClass();
        HashSet hashSetA = yb.a(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((eb) next).b(), "feedback")) {
                break;
            }
        }
        this.f386288a.getClass();
        hashSetA.addAll(ov.a((eb) next));
        this.f386290c.getClass();
        hashSetA.addAll(q51.a(list, h90Var));
        return hashSetA;
    }

    @Y61.k
    public final LinkedHashSet a(@Y61.k List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nj0 nj0Var = (nj0) it.next();
            linkedHashSet.addAll(a(nj0Var.b(), nj0Var.e()));
        }
        return linkedHashSet;
    }
}
