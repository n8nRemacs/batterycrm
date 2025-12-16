package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class n30 implements tw, mh1, s30, dh0, yx0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f388149a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f388150b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f388151c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f388152d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f388153e = new LinkedHashSet();

    public final void a(@Y61.k tw twVar) {
        this.f388149a.add(twVar);
    }

    public final void b(@Y61.k o30 o30Var) {
        this.f388151c.add(o30Var);
    }

    public final void c(@Y61.k o30 o30Var) {
        this.f388150b.add(o30Var);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void d() {
        Iterator it = this.f388153e.iterator();
        while (it.hasNext()) {
            ((dh0) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yx0
    public final void e() {
        Iterator it = this.f388151c.iterator();
        while (it.hasNext()) {
            ((yx0) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.s30
    public final void f() {
        Iterator it = this.f388152d.iterator();
        while (it.hasNext()) {
            ((s30) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mh1
    public final void g() {
        Iterator it = this.f388150b.iterator();
        while (it.hasNext()) {
            ((mh1) it.next()).g();
        }
    }

    public final void a(@Y61.k o30 o30Var) {
        this.f388152d.add(o30Var);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void b() {
        Iterator it = this.f388153e.iterator();
        while (it.hasNext()) {
            ((dh0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mh1
    public final void c() {
        Iterator it = this.f388150b.iterator();
        while (it.hasNext()) {
            ((mh1) it.next()).c();
        }
    }

    public final void a(@Y61.k dh0 dh0Var) {
        this.f388153e.add(dh0Var);
    }

    @Override // com.yandex.mobile.ads.impl.tw
    public final void a() {
        Iterator it = this.f388149a.iterator();
        while (it.hasNext()) {
            ((tw) it.next()).a();
        }
    }
}
