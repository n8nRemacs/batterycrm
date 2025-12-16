package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f387406a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ArrayList f387407b = new ArrayList();

    public final void a(@Y61.k j20 j20Var) {
        synchronized (this.f387406a) {
            this.f387407b.add(j20Var);
        }
    }

    public final void a() {
        synchronized (this.f387406a) {
            this.f387407b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void a(@Y61.k ka kaVar) {
        ArrayList arrayList;
        synchronized (this.f387406a) {
            arrayList = new ArrayList(this.f387407b);
            this.f387407b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j20) it.next()).a(kaVar);
        }
    }
}
