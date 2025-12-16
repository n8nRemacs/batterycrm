package com.google.common.graph;

import com.google.common.collect.C37325e2;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: EndpointPair.java */
@D
@XY0.a
@aZ0.j
/* loaded from: classes6.dex */
public abstract class E<N> implements Iterable<N> {

    /* renamed from: b, reason: collision with root package name */
    public final N f360173b;

    /* renamed from: c, reason: collision with root package name */
    public final N f360174c;

    /* compiled from: EndpointPair.java */
    public static final class b<N> extends E<N> {
        public b() {
            throw null;
        }

        public b(Object obj, Object obj2, a aVar) {
            super(obj, obj2, null);
        }

        @Override // com.google.common.graph.E
        public final boolean b() {
            return true;
        }

        @Override // com.google.common.graph.E
        public final N e() {
            return this.f360173b;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof E)) {
                return false;
            }
            E e12 = (E) obj;
            if (true != e12.b()) {
                return false;
            }
            if (this.f360173b.equals(e12.e())) {
                if (this.f360174c.equals(e12.g())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.graph.E
        public final N g() {
            return this.f360174c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f360173b, this.f360174c});
        }

        @Override // com.google.common.graph.E, java.lang.Iterable
        public final Iterator iterator() {
            return C37325e2.g(this.f360173b, this.f360174c);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(this.f360173b);
            sb2.append(" -> ");
            return androidx.appcompat.app.r.o(this.f360174c, ">", sb2);
        }
    }

    /* compiled from: EndpointPair.java */
    public static final class c<N> extends E<N> {
        public c() {
            throw null;
        }

        public c(Object obj, Object obj2, a aVar) {
            super(obj, obj2, null);
        }

        @Override // com.google.common.graph.E
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.graph.E
        public final N e() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof E)) {
                return false;
            }
            E e12 = (E) obj;
            if (e12.b()) {
                return false;
            }
            N n12 = this.f360173b;
            N n13 = e12.f360173b;
            boolean zEquals = n12.equals(n13);
            N n14 = this.f360174c;
            N n15 = e12.f360174c;
            return zEquals ? n14.equals(n15) : n12.equals(n15) && n14.equals(n13);
        }

        @Override // com.google.common.graph.E
        public final N g() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final int hashCode() {
            return this.f360174c.hashCode() + this.f360173b.hashCode();
        }

        @Override // com.google.common.graph.E, java.lang.Iterable
        public final Iterator iterator() {
            return C37325e2.g(this.f360173b, this.f360174c);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f360173b);
            sb2.append(", ");
            return androidx.appcompat.app.r.o(this.f360174c, "]", sb2);
        }
    }

    public E() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(Object obj, Object obj2, a aVar) {
        obj.getClass();
        this.f360173b = obj;
        obj2.getClass();
        this.f360174c = obj2;
    }

    public static <N> E<N> d(N n12, N n13) {
        return new b(n12, n13, null);
    }

    public abstract boolean b();

    public abstract N e();

    public abstract N g();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return C37325e2.g(this.f360173b, this.f360174c);
    }
}
