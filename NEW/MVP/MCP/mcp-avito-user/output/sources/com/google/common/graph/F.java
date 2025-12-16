package com.google.common.graph;

import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.H1;
import com.google.common.collect.M2;
import com.google.common.graph.E;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: EndpointPairIterator.java */
@D
/* loaded from: classes6.dex */
abstract class F<N> extends AbstractC37316d<E<N>> {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC37475o<N> f360177d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator<N> f360178e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    public N f360179f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator<N> f360180g;

    /* compiled from: EndpointPairIterator.java */
    public static final class b<N> extends F<N> {
        public b() {
            throw null;
        }

        public b(InterfaceC37475o interfaceC37475o, a aVar) {
            super(interfaceC37475o, null);
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            while (!this.f360180g.hasNext()) {
                if (!c()) {
                    b();
                    return null;
                }
            }
            N n12 = this.f360179f;
            Objects.requireNonNull(n12);
            return E.d(n12, this.f360180g.next());
        }
    }

    /* compiled from: EndpointPairIterator.java */
    public static final class c<N> extends F<N> {

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public HashSet f360181h;

        public c() {
            throw null;
        }

        public c(InterfaceC37475o interfaceC37475o, a aVar) {
            super(interfaceC37475o, null);
            this.f360181h = new HashSet(M2.c(interfaceC37475o.d().size() + 1));
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            do {
                Objects.requireNonNull(this.f360181h);
                while (this.f360180g.hasNext()) {
                    N next = this.f360180g.next();
                    if (!this.f360181h.contains(next)) {
                        N n12 = this.f360179f;
                        Objects.requireNonNull(n12);
                        return new E.c(next, n12, null);
                    }
                }
                this.f360181h.add(this.f360179f);
            } while (c());
            this.f360181h = null;
            b();
            return null;
        }
    }

    public F() {
        throw null;
    }

    public F(InterfaceC37475o interfaceC37475o, a aVar) {
        this.f360179f = null;
        this.f360180g = H1.E().iterator();
        this.f360177d = interfaceC37475o;
        this.f360178e = interfaceC37475o.d().iterator();
    }

    public final boolean c() {
        com.google.common.base.M.q(!this.f360180g.hasNext());
        Iterator<N> it = this.f360178e;
        if (!it.hasNext()) {
            return false;
        }
        N next = it.next();
        this.f360179f = next;
        this.f360180g = this.f360177d.h(next).iterator();
        return true;
    }
}
