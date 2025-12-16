package com.google.common.collect;

/* compiled from: IndexedImmutableSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class Q1<E> extends H1<E> {

    /* compiled from: IndexedImmutableSet.java */
    public class a extends AbstractC37401r1<E> {
        public a() {
        }

        @Override // java.util.List
        public final E get(int i12) {
            return (E) Q1.this.get(i12);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return Q1.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return Q1.this.size();
        }
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.c
    public final int d(int i12, Object[] objArr) {
        return b().d(i12, objArr);
    }

    public abstract E get(int i12);

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public N4<E> iterator() {
        return b().listIterator(0);
    }

    @Override // com.google.common.collect.H1
    public final AbstractC37401r1<E> y() {
        return new a();
    }
}
