package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class ro0 implements zq0, eh0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final CopyOnWriteArrayList f389598a = new CopyOnWriteArrayList();

    public final void a(@j.N so0 so0Var) {
        this.f389598a.add(so0Var);
    }

    public final void b(@j.N so0 so0Var) {
        this.f389598a.remove(so0Var);
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void a(boolean z12) {
        Iterator it = this.f389598a.iterator();
        while (it.hasNext()) {
            ((so0) it.next()).a(z12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eh0
    public final void a() {
        Iterator it = this.f389598a.iterator();
        while (it.hasNext()) {
            ((so0) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void c() {
    }
}
