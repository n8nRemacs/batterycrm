package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.m0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
final class l0 extends m0.d<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f382780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f382781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r rVar, r rVar2) {
        super(0);
        this.f382780a = rVar;
        this.f382781b = rVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        return this.f382780a.contains(obj) && this.f382781b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f382780a.containsAll(collection) && this.f382781b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f382781b, this.f382780a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f382780a.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (this.f382781b.contains(it.next())) {
                i12++;
            }
        }
        return i12;
    }
}
