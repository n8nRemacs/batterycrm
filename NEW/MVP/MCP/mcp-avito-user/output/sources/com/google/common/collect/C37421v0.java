package com.google.common.collect;

import com.google.common.collect.M2;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FilteredMultimapValues.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37421v0<K, V> extends AbstractCollection<V> {

    /* renamed from: b, reason: collision with root package name */
    @Weak
    public final AbstractC37346i f360024b;

    /* JADX WARN: Multi-variable type inference failed */
    public C37421v0(InterfaceC37416u0<K, V> interfaceC37416u0) {
        this.f360024b = (AbstractC37346i) interfaceC37416u0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f360024b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return this.f360024b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new E2(this.f360024b.b().iterator());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.i, com.google.common.collect.u0] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@I41.a Object obj) {
        ?? r02 = this.f360024b;
        com.google.common.base.N nT2 = r02.T();
        Iterator<Map.Entry<K, V>> it = r02.h().b().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (nT2.apply(next) && com.google.common.base.F.a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.i, com.google.common.collect.u0] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        ?? r02 = this.f360024b;
        return W1.f(r02.h().b(), com.google.common.base.O.c(r02.T(), com.google.common.base.O.d(com.google.common.base.O.f(collection), M2.EnumC37297e.f359489c)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.i, com.google.common.collect.u0] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        ?? r02 = this.f360024b;
        return W1.f(r02.h().b(), com.google.common.base.O.c(r02.T(), com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359489c)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f360024b.size();
    }
}
