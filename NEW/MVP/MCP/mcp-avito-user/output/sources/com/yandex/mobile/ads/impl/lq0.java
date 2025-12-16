package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class lq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f387695a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<kq0, Object> f387696b = new WeakHashMap<>();

    public final void a(@Y61.k kq0 kq0Var) {
        synchronized (this.f387695a) {
            this.f387696b.put(kq0Var, null);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void b(@Y61.k kq0 kq0Var) {
        synchronized (this.f387695a) {
            this.f387696b.remove(kq0Var);
        }
    }

    public final void b() {
        List listM0;
        synchronized (this.f387695a) {
            listM0 = C42745f0.M0(this.f387696b.keySet());
            this.f387696b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            ((kq0) it.next()).a();
        }
    }

    public final boolean a() {
        boolean z12;
        synchronized (this.f387695a) {
            z12 = !this.f387696b.isEmpty();
        }
        return z12;
    }
}
