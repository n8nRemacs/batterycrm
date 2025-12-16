package com.google.common.collect;

import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.P1;
import com.google.common.collect.t4;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* compiled from: DenseImmutableTable.java */
@InterfaceC37329f0
@XY0.b
@aZ0.j
/* loaded from: classes6.dex */
final class Z<R, C, V> extends O3<R, C, V> {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC37412t1<R, Integer> f359611d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC37412t1<C, Integer> f359612e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37412t1<R, AbstractC37412t1<C, V>> f359613f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37412t1<C, AbstractC37412t1<R, V>> f359614g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f359615h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f359616i;

    /* renamed from: j, reason: collision with root package name */
    public final V[][] f359617j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f359618k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f359619l;

    /* compiled from: DenseImmutableTable.java */
    public final class b extends d<R, V> {

        /* renamed from: f, reason: collision with root package name */
        public final int f359620f;

        public b(int i12) {
            super(Z.this.f359616i[i12]);
            this.f359620f = i12;
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean k() {
            return true;
        }

        @Override // com.google.common.collect.Z.d
        @I41.a
        public final V t(int i12) {
            return Z.this.f359617j[i12][this.f359620f];
        }

        @Override // com.google.common.collect.Z.d
        public final AbstractC37412t1<R, Integer> u() {
            return Z.this.f359611d;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    public final class c extends d<C, AbstractC37412t1<R, V>> {
        public c(a aVar) {
            super(Z.this.f359616i.length);
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean k() {
            return false;
        }

        @Override // com.google.common.collect.Z.d
        public final Object t(int i12) {
            return new b(i12);
        }

        @Override // com.google.common.collect.Z.d
        public final AbstractC37412t1<C, Integer> u() {
            return Z.this.f359612e;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    public static abstract class d<K, V> extends AbstractC37412t1.c<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public final int f359623e;

        /* compiled from: DenseImmutableTable.java */
        public class a extends AbstractC37316d<Map.Entry<K, V>> {

            /* renamed from: d, reason: collision with root package name */
            public int f359624d = -1;

            /* renamed from: e, reason: collision with root package name */
            public final int f359625e;

            public a() {
                this.f359625e = d.this.u().size();
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                int i12 = this.f359624d;
                while (true) {
                    this.f359624d = i12 + 1;
                    int i13 = this.f359624d;
                    if (i13 >= this.f359625e) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    d dVar = d.this;
                    Object objT = dVar.t(i13);
                    if (objT != null) {
                        return new C37384o1(dVar.u().keySet().b().get(this.f359624d), objT);
                    }
                    i12 = this.f359624d;
                }
            }
        }

        public d(int i12) {
            this.f359623e = i12;
        }

        @Override // com.google.common.collect.AbstractC37412t1.c, com.google.common.collect.AbstractC37412t1
        public final H1<K> e() {
            return this.f359623e == u().size() ? u().keySet() : new C37427w1(this);
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            Integer num = u().get(obj);
            if (num == null) {
                return null;
            }
            return t(num.intValue());
        }

        @Override // com.google.common.collect.AbstractC37412t1.c
        public final N4<Map.Entry<K, V>> s() {
            return new a();
        }

        @Override // java.util.Map
        public final int size() {
            return this.f359623e;
        }

        @I41.a
        public abstract V t(int i12);

        public abstract AbstractC37412t1<K, Integer> u();
    }

    /* compiled from: DenseImmutableTable.java */
    public final class e extends d<C, V> {

        /* renamed from: f, reason: collision with root package name */
        public final int f359627f;

        public e(int i12) {
            super(Z.this.f359615h[i12]);
            this.f359627f = i12;
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean k() {
            return true;
        }

        @Override // com.google.common.collect.Z.d
        @I41.a
        public final V t(int i12) {
            return Z.this.f359617j[this.f359627f][i12];
        }

        @Override // com.google.common.collect.Z.d
        public final AbstractC37412t1<C, Integer> u() {
            return Z.this.f359612e;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    public final class f extends d<R, AbstractC37412t1<C, V>> {
        public f(a aVar) {
            super(Z.this.f359615h.length);
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean k() {
            return false;
        }

        @Override // com.google.common.collect.Z.d
        public final Object t(int i12) {
            return new e(i12);
        }

        @Override // com.google.common.collect.Z.d
        public final AbstractC37412t1<R, Integer> u() {
            return Z.this.f359611d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z(AbstractC37401r1<t4.a<R, C, V>> abstractC37401r1, H1<R> h12, H1<C> h13) {
        this.f359617j = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, h12.size(), h13.size()));
        AbstractC37412t1<R, Integer> abstractC37412t1F = M2.f(h12);
        this.f359611d = abstractC37412t1F;
        AbstractC37412t1<C, Integer> abstractC37412t1F2 = M2.f(h13);
        this.f359612e = abstractC37412t1F2;
        this.f359615h = new int[((J3) abstractC37412t1F).size()];
        this.f359616i = new int[((J3) abstractC37412t1F2).size()];
        int[] iArr = new int[abstractC37401r1.size()];
        int[] iArr2 = new int[abstractC37401r1.size()];
        for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
            t4.a aVar = (t4.a) ((I3) abstractC37401r1).get(i12);
            Object objB = aVar.b();
            Object objA = aVar.a();
            Integer num = this.f359611d.get(objB);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f359612e.get(objA);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            O3.u(objB, objA, this.f359617j[iIntValue][iIntValue2], aVar.getValue());
            ((V[][]) this.f359617j)[iIntValue][iIntValue2] = aVar.getValue();
            int[] iArr3 = this.f359615h;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f359616i;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i12] = iIntValue;
            iArr2[i12] = iIntValue2;
        }
        this.f359618k = iArr;
        this.f359619l = iArr2;
        this.f359613f = new f(null);
        this.f359614g = new c(null);
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.t4, com.google.common.collect.R3
    public final Map d() {
        return AbstractC37412t1.c(this.f359613f);
    }

    @Override // com.google.common.collect.P1
    public final AbstractC37412t1<C, Map<R, V>> m() {
        return AbstractC37412t1.c(this.f359614g);
    }

    @Override // com.google.common.collect.P1
    public final P1.b o() {
        return P1.b.a(this, this.f359618k, this.f359619l);
    }

    @Override // com.google.common.collect.P1
    @I41.a
    public final V q(@I41.a Object obj, @I41.a Object obj2) {
        Integer num = this.f359611d.get(obj);
        Integer num2 = this.f359612e.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f359617j[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.P1
    /* renamed from: s */
    public final AbstractC37412t1<R, Map<C, V>> d() {
        return AbstractC37412t1.c(this.f359613f);
    }

    @Override // com.google.common.collect.t4
    public final int size() {
        return this.f359618k.length;
    }

    @Override // com.google.common.collect.O3
    public final t4.a<R, C, V> v(int i12) {
        int i13 = this.f359618k[i12];
        int i14 = this.f359619l[i12];
        R r12 = r().b().get(i13);
        C c12 = l().b().get(i14);
        V v12 = this.f359617j[i13][i14];
        Objects.requireNonNull(v12);
        return P1.i(r12, c12, v12);
    }

    @Override // com.google.common.collect.O3
    public final V w(int i12) {
        V v12 = this.f359617j[this.f359618k[i12]][this.f359619l[i12]];
        Objects.requireNonNull(v12);
        return v12;
    }
}
