package com.google.common.collect;

import com.google.common.base.AbstractC37270n;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.ConcurrentMapC37438y2;

/* compiled from: Interners.java */
@XY0.c
@InterfaceC37329f0
@XY0.d
/* loaded from: classes6.dex */
public final class S1 {

    /* compiled from: Interners.java */
    public static class b {
        public b() {
            new C37433x2();
        }
    }

    /* compiled from: Interners.java */
    public static class c<E> implements InterfaceC37276u<E, E> {
        @Override // com.google.common.base.InterfaceC37276u
        public final E apply(E e12) {
            throw null;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: Interners.java */
    @XY0.e
    public static final class d<E> implements R1<E> {
        public d(C37433x2 c37433x2, a aVar) {
            AbstractC37270n<Object> abstractC37270nC = AbstractC37270n.c();
            AbstractC37270n<Object> abstractC37270n = c37433x2.f360068f;
            com.google.common.base.M.p("key equivalence was already set to %s", abstractC37270n == null, abstractC37270n);
            abstractC37270nC.getClass();
            c37433x2.f360068f = abstractC37270nC;
            c37433x2.f360063a = true;
            ConcurrentMapC37438y2.C37439a c37439a = ConcurrentMapC37438y2.f360085k;
            ConcurrentMapC37438y2.q qVarA = c37433x2.a();
            ConcurrentMapC37438y2.q.a aVar2 = ConcurrentMapC37438y2.q.f360136b;
            if (qVarA == aVar2 && c37433x2.b() == aVar2) {
                new ConcurrentMapC37438y2(c37433x2, ConcurrentMapC37438y2.r.a.f360139a);
                return;
            }
            ConcurrentMapC37438y2.q qVarA2 = c37433x2.a();
            ConcurrentMapC37438y2.q.b bVar = ConcurrentMapC37438y2.q.f360137c;
            if (qVarA2 == bVar && c37433x2.b() == aVar2) {
                new ConcurrentMapC37438y2(c37433x2, ConcurrentMapC37438y2.A.a.f360095a);
            } else {
                if (c37433x2.b() != bVar) {
                    throw new AssertionError();
                }
                throw new IllegalArgumentException("Map cannot have both weak and dummy values");
            }
        }
    }
}
