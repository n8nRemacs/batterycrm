package com.google.common.base;

import java.io.Serializable;

/* compiled from: Converter.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37266j<A, B> implements InterfaceC37276u<A, B> {

    /* compiled from: Converter.java */
    /* renamed from: com.google.common.base.j$a */
    public static final class a<A, B, C> extends AbstractC37266j<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.AbstractC37266j
        @I41.a
        public final C a(@I41.a A a12) {
            throw null;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final C b(A a12) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.andThen(null)";
        }
    }

    /* compiled from: Converter.java */
    /* renamed from: com.google.common.base.j$b */
    public static final class b<A, B> extends AbstractC37266j<A, B> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC37276u<? super A, ? extends B> f359051b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37276u<? super B, ? extends A> f359052c;

        public b() {
            throw null;
        }

        public b(InterfaceC37276u interfaceC37276u, InterfaceC37276u interfaceC37276u2, C37265i c37265i) {
            interfaceC37276u.getClass();
            this.f359051b = interfaceC37276u;
            interfaceC37276u2.getClass();
            this.f359052c = interfaceC37276u2;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final B b(A a12) {
            return this.f359051b.apply(a12);
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f359051b.equals(bVar.f359051b) && this.f359052c.equals(bVar.f359052c);
        }

        public final int hashCode() {
            return this.f359052c.hashCode() + (this.f359051b.hashCode() * 31);
        }

        public final String toString() {
            return "Converter.from(" + this.f359051b + ", " + this.f359052c + ")";
        }
    }

    /* compiled from: Converter.java */
    /* renamed from: com.google.common.base.j$d */
    public static final class d<A, B> extends AbstractC37266j<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.AbstractC37266j
        @I41.a
        public final A a(@I41.a B b12) {
            throw null;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final A b(B b12) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.reverse()";
        }
    }

    @I41.a
    public B a(@I41.a A a12) {
        if (a12 == null) {
            return null;
        }
        B b12 = b(a12);
        b12.getClass();
        return b12;
    }

    @Override // com.google.common.base.InterfaceC37276u
    @aZ0.l
    @Deprecated
    public final B apply(A a12) {
        return a(a12);
    }

    @aZ0.g
    public abstract B b(A a12);

    /* compiled from: Converter.java */
    /* renamed from: com.google.common.base.j$c */
    public static final class c<T> extends AbstractC37266j<T, T> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final c<?> f359053b = new c<>();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f359053b;
        }

        public final String toString() {
            return "Converter.identity()";
        }

        @Override // com.google.common.base.AbstractC37266j
        public final T b(T t12) {
            return t12;
        }
    }
}
