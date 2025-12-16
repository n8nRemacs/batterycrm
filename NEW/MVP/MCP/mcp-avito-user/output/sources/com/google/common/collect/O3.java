package com.google.common.collect;

import com.google.common.collect.t4;

/* compiled from: RegularImmutableTable.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class O3<R, C, V> extends P1<R, C, V> {

    /* compiled from: RegularImmutableTable.java */
    public final class b extends Q1<t4.a<R, C, V>> {
        public b(a aVar) {
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof t4.a)) {
                return false;
            }
            t4.a aVar = (t4.a) obj;
            Object objQ = O3.this.q(aVar.b(), aVar.a());
            return objQ != null && objQ.equals(aVar.getValue());
        }

        @Override // com.google.common.collect.Q1
        public final Object get(int i12) {
            return O3.this.v(i12);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return O3.this.size();
        }
    }

    /* compiled from: RegularImmutableTable.java */
    public final class c extends AbstractC37401r1<V> {
        public c(a aVar) {
        }

        @Override // java.util.List
        public final V get(int i12) {
            return (V) O3.this.w(i12);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return O3.this.size();
        }
    }

    public static void u(Object obj, Object obj2, @I41.a Object obj3, Object obj4) {
        if (obj3 != null) {
            throw new IllegalArgumentException(com.google.common.base.d0.b("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3));
        }
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.AbstractC37405s
    /* renamed from: n */
    public final H1<t4.a<R, C, V>> e() {
        if (size() != 0) {
            return new b(null);
        }
        int i12 = H1.f359346d;
        return L3.f359468k;
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.AbstractC37405s
    /* renamed from: p */
    public final AbstractC37378n1<V> f() {
        if (size() != 0) {
            return new c(null);
        }
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return I3.f359390f;
    }

    public abstract t4.a<R, C, V> v(int i12);

    public abstract V w(int i12);
}
