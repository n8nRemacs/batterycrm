package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f392201a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakHashMap<b9, Object> f392202b = new WeakHashMap<>();

    public final void a(@j.N b9 b9Var) {
        synchronized (this.f392201a) {
            this.f392202b.put(b9Var, null);
        }
    }

    public final void b(@j.N b9 b9Var) {
        synchronized (this.f392201a) {
            this.f392202b.remove(b9Var);
        }
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f392201a) {
            arrayList = new ArrayList(this.f392202b.keySet());
            this.f392202b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b9) it.next()).a(null);
        }
    }

    public final void a(@j.N u8 u8Var) {
        ArrayList arrayList;
        synchronized (this.f392201a) {
            arrayList = new ArrayList(this.f392202b.keySet());
            this.f392202b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b9) it.next()).a(u8Var);
        }
    }
}
