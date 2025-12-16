package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.ConcurrentMapC37438y2;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Ordering.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37429w3<T> implements Comparator<T> {

    /* compiled from: Ordering.java */
    @XY0.e
    @XY0.d
    /* renamed from: com.google.common.collect.w3$a */
    public static class a extends AbstractC37429w3<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f360055b = new AtomicInteger(0);

        /* renamed from: c, reason: collision with root package name */
        public final AbstractMap f360056c;

        public a() {
            C37433x2 c37433x2 = new C37433x2();
            c37433x2.d(ConcurrentMapC37438y2.q.f360137c);
            this.f360056c = (AbstractMap) c37433x2.c();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentMap] */
        @Override // java.util.Comparator
        public final int compare(@I41.a Object obj, @I41.a Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iIdentityHashCode = System.identityHashCode(obj);
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode != iIdentityHashCode2) {
                return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
            }
            ?? r02 = this.f360056c;
            Integer numValueOf = (Integer) r02.get(obj);
            AtomicInteger atomicInteger = this.f360055b;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num = (Integer) r02.putIfAbsent(obj, numValueOf);
                if (num != null) {
                    numValueOf = num;
                }
            }
            Integer numValueOf2 = (Integer) r02.get(obj2);
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num2 = (Integer) r02.putIfAbsent(obj2, numValueOf2);
                if (num2 != null) {
                    numValueOf2 = num2;
                }
            }
            int iCompareTo = numValueOf.compareTo(numValueOf2);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* compiled from: Ordering.java */
    @XY0.d
    /* renamed from: com.google.common.collect.w3$b */
    public static class b {
        static {
            new a();
        }
    }

    /* compiled from: Ordering.java */
    @XY0.e
    /* renamed from: com.google.common.collect.w3$c */
    public static class c extends ClassCastException {
        private static final long serialVersionUID = 0;
    }

    @XY0.b
    public static <T> AbstractC37429w3<T> b(Comparator<T> comparator) {
        return comparator instanceof AbstractC37429w3 ? (AbstractC37429w3) comparator : new P(comparator);
    }

    @XY0.b
    public static <C extends Comparable> AbstractC37429w3<C> d() {
        return C37392p3.f359948d;
    }

    @XY0.b
    public final <U extends T> AbstractC37429w3<U> a(Comparator<? super U> comparator) {
        return new T(this, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC37434x3
    public <E extends T> E c(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
        return compare(e12, e13) <= 0 ? e12 : e13;
    }

    @XY0.b
    public <S extends T> AbstractC37429w3<S> e() {
        return new C37403r3(this);
    }

    @XY0.b
    public <S extends T> AbstractC37429w3<S> f() {
        return new C37409s3(this);
    }

    @XY0.b
    public final <F> AbstractC37429w3<F> g(InterfaceC37276u<F, ? extends T> interfaceC37276u) {
        return new B(interfaceC37276u, this);
    }

    @XY0.b
    public <S extends T> AbstractC37429w3<S> h() {
        return new Q3(this);
    }
}
