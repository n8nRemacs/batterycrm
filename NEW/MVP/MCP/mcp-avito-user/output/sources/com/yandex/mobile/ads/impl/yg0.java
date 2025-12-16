package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class yg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f392010a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ArrayList f392011b = new ArrayList();

    public final void a(@j.N b40 b40Var) {
        synchronized (this.f392010a) {
            this.f392011b.add(b40Var);
        }
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f392010a) {
            arrayList = new ArrayList(this.f392011b);
            this.f392011b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b40) it.next()).a();
        }
    }
}
