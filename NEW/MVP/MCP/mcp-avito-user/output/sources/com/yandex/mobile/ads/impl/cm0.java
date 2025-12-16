package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class cm0 implements sk0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList f384344a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f384345b;

    public final void a(@Y61.k bm0 bm0Var) {
        this.f384344a.add(bm0Var);
        if (this.f384345b) {
            bm0Var.b();
        }
    }

    public final void b(@Y61.k bm0 bm0Var) {
        this.f384344a.remove(bm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.sk0
    public final void b() {
        this.f384345b = true;
        Iterator it = this.f384344a.iterator();
        while (it.hasNext()) {
            ((sk0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sk0
    public final void a() {
        this.f384345b = false;
        Iterator it = this.f384344a.iterator();
        while (it.hasNext()) {
            ((sk0) it.next()).a();
        }
    }
}
