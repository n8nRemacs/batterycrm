package com.google.common.collect;

/* compiled from: SingletonImmutableSet.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37309b4<E> extends H1<E> {

    /* renamed from: e, reason: collision with root package name */
    public final transient E f359654e;

    public C37309b4(E e12) {
        e12.getClass();
        this.f359654e = e12;
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    public final AbstractC37401r1<E> b() {
        return AbstractC37401r1.E(this.f359654e);
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return this.f359654e.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int d(int i12, Object[] objArr) {
        objArr[i12] = this.f359654e;
        return i12 + 1;
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f359654e.hashCode();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<E> iterator() {
        return new C37361k2(this.f359654e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f359654e.toString() + ']';
    }
}
