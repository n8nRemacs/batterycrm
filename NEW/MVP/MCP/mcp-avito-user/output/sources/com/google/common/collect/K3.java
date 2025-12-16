package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.A1;
import com.google.common.collect.C37419u3;
import com.google.common.collect.InterfaceC37338g3;
import java.io.Serializable;

/* compiled from: RegularImmutableMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
class K3<E> extends A1<E> {

    /* renamed from: i, reason: collision with root package name */
    public static final K3<Object> f359440i = new K3<>(new C37419u3());

    /* renamed from: f, reason: collision with root package name */
    public final transient C37419u3<E> f359441f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f359442g;

    /* renamed from: h, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient H1<E> f359443h;

    /* compiled from: RegularImmutableMultiset.java */
    public final class b extends Q1<E> {
        public b(a aVar) {
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return K3.this.contains(obj);
        }

        @Override // com.google.common.collect.Q1
        public final E get(int i12) {
            return K3.this.f359441f.e(i12);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return K3.this.f359441f.f360015c;
        }
    }

    /* compiled from: RegularImmutableMultiset.java */
    @XY0.c
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f359445b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f359446c;

        public c(InterfaceC37338g3<? extends Object> interfaceC37338g3) {
            A1 a12 = (A1) interfaceC37338g3;
            int size = a12.entrySet().size();
            this.f359445b = new Object[size];
            this.f359446c = new int[size];
            int i12 = 0;
            for (InterfaceC37338g3.a<E> aVar : a12.entrySet()) {
                this.f359445b[i12] = aVar.a();
                this.f359446c[i12] = aVar.getCount();
                i12++;
            }
        }

        public Object readResolve() {
            Object[] objArr = this.f359445b;
            A1.b bVar = new A1.b(objArr.length);
            for (int i12 = 0; i12 < objArr.length; i12++) {
                bVar.d(this.f359446c[i12], objArr[i12]);
            }
            return bVar.e();
        }
    }

    public K3(C37419u3<E> c37419u3) {
        this.f359441f = c37419u3;
        long jF2 = 0;
        for (int i12 = 0; i12 < c37419u3.f360015c; i12++) {
            jF2 += c37419u3.f(i12);
        }
        this.f359442g = com.google.common.primitives.l.f(jF2);
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        return this.f359441f.d(obj);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.A1, com.google.common.collect.InterfaceC37338g3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final H1<E> k() {
        H1<E> h12 = this.f359443h;
        if (h12 != null) {
            return h12;
        }
        b bVar = new b(null);
        this.f359443h = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f359442g;
    }

    @Override // com.google.common.collect.A1
    public final InterfaceC37338g3.a<E> v(int i12) {
        C37419u3<E> c37419u3 = this.f359441f;
        com.google.common.base.M.i(i12, c37419u3.f360015c);
        return new C37419u3.a(i12);
    }

    @Override // com.google.common.collect.A1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    public Object writeReplace() {
        return new c(this);
    }
}
