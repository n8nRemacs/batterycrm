package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Iterator;

/* loaded from: classes8.dex */
final class k0 extends b<Object> {

    /* renamed from: c, reason: collision with root package name */
    final Iterator<Object> f382778c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l0 f382779d;

    public k0(l0 l0Var) {
        this.f382779d = l0Var;
        this.f382778c = l0Var.f382780a.iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.b
    @I41.a
    public final Object a() {
        while (this.f382778c.hasNext()) {
            Object next = this.f382778c.next();
            if (this.f382779d.f382781b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
