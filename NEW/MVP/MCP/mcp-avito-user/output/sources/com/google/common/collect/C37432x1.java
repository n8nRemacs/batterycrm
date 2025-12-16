package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImmutableMapValues.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37432x1<K, V> extends AbstractC37378n1<V> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37412t1<K, V> f360059c;

    /* compiled from: ImmutableMapValues.java */
    /* renamed from: com.google.common.collect.x1$a */
    public class a extends N4<V> {

        /* renamed from: b, reason: collision with root package name */
        public final N4<Map.Entry<K, V>> f360060b;

        public a(C37432x1 c37432x1) {
            this.f360060b = c37432x1.f360059c.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f360060b.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f360060b.next().getValue();
        }
    }

    /* compiled from: ImmutableMapValues.java */
    /* renamed from: com.google.common.collect.x1$b */
    public class b extends AbstractC37401r1<V> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC37401r1 f360061d;

        public b(AbstractC37401r1 abstractC37401r1) {
            this.f360061d = abstractC37401r1;
        }

        @Override // java.util.List
        public final V get(int i12) {
            return (V) ((Map.Entry) this.f360061d.get(i12)).getValue();
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360061d.size();
        }
    }

    /* compiled from: ImmutableMapValues.java */
    @XY0.d
    @XY0.c
    /* renamed from: com.google.common.collect.x1$c */
    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37412t1<?, V> f360062b;

        public c(AbstractC37412t1<?, V> abstractC37412t1) {
            this.f360062b = abstractC37412t1;
        }

        public Object readResolve() {
            return this.f360062b.values();
        }
    }

    public C37432x1(AbstractC37412t1<K, V> abstractC37412t1) {
        this.f360059c = abstractC37412t1;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final AbstractC37401r1<V> b() {
        return new b(this.f360059c.entrySet().b());
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return obj != null && C37325e2.d(new a(this), obj);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return true;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    /* renamed from: l */
    public final N4<V> iterator() {
        return new a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f360059c.size();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.c
    public Object writeReplace() {
        return new c(this.f360059c);
    }
}
