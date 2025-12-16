package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class wh0 implements dh0, eh0, zq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ArrayList f391415a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ArrayList f391416b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ArrayList f391417c = new ArrayList();

    public final void a(@Y61.k dh0 dh0Var) {
        this.f391415a.add(dh0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void b() {
        Iterator it = this.f391415a.iterator();
        while (it.hasNext()) {
            ((dh0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void c() {
        Iterator it = this.f391417c.iterator();
        while (it.hasNext()) {
            ((zq0) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void d() {
        Iterator it = this.f391415a.iterator();
        while (it.hasNext()) {
            ((dh0) it.next()).d();
        }
    }

    public final void a(@Y61.k eh0 eh0Var) {
        this.f391416b.add(eh0Var);
    }

    public final void a(@Y61.k zq0 zq0Var) {
        this.f391417c.add(zq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.eh0
    public final void a() {
        Iterator it = this.f391416b.iterator();
        while (it.hasNext()) {
            ((eh0) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void a(boolean z12) {
        Iterator it = this.f391417c.iterator();
        while (it.hasNext()) {
            ((zq0) it.next()).a(z12);
        }
    }
}
