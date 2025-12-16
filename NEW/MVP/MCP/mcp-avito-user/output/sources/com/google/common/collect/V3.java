package com.google.common.collect;

import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.W3;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: Sets.java */
/* loaded from: classes6.dex */
class V3 extends W3.i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H1 f359582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H1 f359583c;

    /* compiled from: Sets.java */
    public class a extends AbstractC37316d<Object> {

        /* renamed from: d, reason: collision with root package name */
        public final Iterator<Object> f359584d;

        public a() {
            this.f359584d = V3.this.f359582b.iterator();
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            Object next;
            do {
                Iterator<Object> it = this.f359584d;
                if (!it.hasNext()) {
                    this.f359661b = AbstractC37316d.b.f359666d;
                    return null;
                }
                next = it.next();
            } while (!V3.this.f359583c.contains(next));
            return next;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(H1 h12, H1 h13) {
        super(null);
        this.f359582b = h12;
        this.f359583c = h13;
    }

    @Override // com.google.common.collect.W3.i
    /* renamed from: b */
    public final N4<Object> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        return this.f359582b.contains(obj) && this.f359583c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f359582b.containsAll(collection) && this.f359583c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f359583c, this.f359582b);
    }

    @Override // com.google.common.collect.W3.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<E> it = this.f359582b.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (this.f359583c.contains(it.next())) {
                i12++;
            }
        }
        return i12;
    }
}
