package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class sn0 implements xn0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final CopyOnWriteArrayList f390008a = new CopyOnWriteArrayList();

    public final void a(@j.N xn0 xn0Var) {
        this.f390008a.add(xn0Var);
    }

    public final void b(@j.N xn0 xn0Var) {
        this.f390008a.remove(xn0Var);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a() {
        Iterator it = this.f390008a.iterator();
        while (it.hasNext()) {
            ((xn0) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void b() {
        Iterator it = this.f390008a.iterator();
        while (it.hasNext()) {
            ((xn0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a(long j12, long j13) {
        Iterator it = this.f390008a.iterator();
        while (it.hasNext()) {
            ((xn0) it.next()).a(j12, j13);
        }
    }
}
