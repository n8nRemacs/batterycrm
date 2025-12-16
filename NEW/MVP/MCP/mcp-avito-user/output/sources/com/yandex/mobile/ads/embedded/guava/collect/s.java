package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.ju0;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class s extends b<Object> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f382806c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ju0 f382807d;

    public s(Iterator it, ju0 ju0Var) {
        this.f382806c = it;
        this.f382807d = ju0Var;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.b
    @I41.a
    public final Object a() {
        while (this.f382806c.hasNext()) {
            Object next = this.f382806c.next();
            if (this.f382807d.apply(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
