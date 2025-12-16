package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: Cut.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class Y<C extends Comparable> implements Comparable<Y<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C f359603b;

    /* compiled from: Cut.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359604a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f359604a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359604a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Cut.java */
    public static final class b extends Y<Comparable<?>> {

        /* renamed from: c, reason: collision with root package name */
        public static final b f359605c = new b();
        private static final long serialVersionUID = 0;

        public b() {
            super("");
        }

        private Object readResolve() {
            return f359605c;
        }

        @Override // com.google.common.collect.Y, java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final int compareTo(Y<Comparable<?>> y12) {
            return y12 == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Y
        public final void c(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Y
        public final void d(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> f(AbstractC37323e0<Comparable<?>> abstractC37323e0) {
            return abstractC37323e0.b();
        }

        @Override // com.google.common.collect.Y
        public final boolean h(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.Y
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> i(AbstractC37323e0<Comparable<?>> abstractC37323e0) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Y
        public final BoundType k() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Y
        public final BoundType l() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Y
        public final Y m(AbstractC37323e0 abstractC37323e0) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Y
        public final Y n(AbstractC37323e0 abstractC37323e0) {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "+∞";
        }
    }

    /* compiled from: Cut.java */
    public static final class d extends Y<Comparable<?>> {

        /* renamed from: c, reason: collision with root package name */
        public static final d f359606c = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super("");
        }

        private Object readResolve() {
            return f359606c;
        }

        @Override // com.google.common.collect.Y, java.lang.Comparable
        /* renamed from: b */
        public final int compareTo(Y<Comparable<?>> y12) {
            return y12 == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Y
        public final void c(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.Y
        public final void d(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> f(AbstractC37323e0<Comparable<?>> abstractC37323e0) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Y
        public final boolean h(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.Y
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Y
        public final Comparable<?> i(AbstractC37323e0<Comparable<?>> abstractC37323e0) {
            return abstractC37323e0.c();
        }

        @Override // com.google.common.collect.Y
        public final BoundType k() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Y
        public final BoundType l() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Y
        public final Y m(AbstractC37323e0 abstractC37323e0) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Y
        public final Y n(AbstractC37323e0 abstractC37323e0) {
            throw new AssertionError("this statement should be unreachable");
        }

        public final String toString() {
            return "-∞";
        }
    }

    public Y(C c12) {
        this.f359603b = c12;
    }

    public static e a(Comparable comparable) {
        comparable.getClass();
        return new e(comparable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Y<C> y12) {
        if (y12 == d.f359606c) {
            return 1;
        }
        if (y12 == b.f359605c) {
            return -1;
        }
        C c12 = y12.f359603b;
        B3<Comparable> b32 = B3.f359264d;
        int iCompareTo = this.f359603b.compareTo(c12);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        boolean z12 = this instanceof c;
        if (z12 == (y12 instanceof c)) {
            return 0;
        }
        return z12 ? 1 : -1;
    }

    public abstract void c(StringBuilder sb2);

    public abstract void d(StringBuilder sb2);

    public C e() {
        return this.f359603b;
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        try {
            return compareTo((Y) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @I41.a
    public abstract C f(AbstractC37323e0<C> abstractC37323e0);

    public abstract boolean h(C c12);

    public abstract int hashCode();

    @I41.a
    public abstract C i(AbstractC37323e0<C> abstractC37323e0);

    public abstract BoundType k();

    public abstract BoundType l();

    public abstract Y m(AbstractC37323e0 abstractC37323e0);

    public abstract Y n(AbstractC37323e0 abstractC37323e0);

    /* compiled from: Cut.java */
    public static final class c<C extends Comparable> extends Y<C> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C c12) {
            super(c12);
            c12.getClass();
        }

        @Override // com.google.common.collect.Y
        public final void c(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f359603b);
        }

        @Override // com.google.common.collect.Y, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Y) obj);
        }

        @Override // com.google.common.collect.Y
        public final void d(StringBuilder sb2) {
            sb2.append(this.f359603b);
            sb2.append(']');
        }

        @Override // com.google.common.collect.Y
        public final C f(AbstractC37323e0<C> abstractC37323e0) {
            return this.f359603b;
        }

        @Override // com.google.common.collect.Y
        public final boolean h(C c12) {
            B3<Comparable> b32 = B3.f359264d;
            return this.f359603b.compareTo(c12) < 0;
        }

        @Override // com.google.common.collect.Y
        public final int hashCode() {
            return ~this.f359603b.hashCode();
        }

        @Override // com.google.common.collect.Y
        @I41.a
        public final C i(AbstractC37323e0<C> abstractC37323e0) {
            return (C) abstractC37323e0.d(this.f359603b);
        }

        @Override // com.google.common.collect.Y
        public final BoundType k() {
            return BoundType.f359276b;
        }

        @Override // com.google.common.collect.Y
        public final BoundType l() {
            return BoundType.f359277c;
        }

        @Override // com.google.common.collect.Y
        public final Y m(AbstractC37323e0 abstractC37323e0) {
            Comparable comparableD = abstractC37323e0.d(this.f359603b);
            return comparableD == null ? d.f359606c : new e(comparableD);
        }

        public final String toString() {
            return "/" + this.f359603b + "\\";
        }

        @Override // com.google.common.collect.Y
        public final Y n(AbstractC37323e0 abstractC37323e0) {
            return this;
        }
    }

    /* compiled from: Cut.java */
    public static final class e<C extends Comparable> extends Y<C> {
        private static final long serialVersionUID = 0;

        public e() {
            throw null;
        }

        @Override // com.google.common.collect.Y
        public final void c(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f359603b);
        }

        @Override // com.google.common.collect.Y, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Y) obj);
        }

        @Override // com.google.common.collect.Y
        public final void d(StringBuilder sb2) {
            sb2.append(this.f359603b);
            sb2.append(')');
        }

        @Override // com.google.common.collect.Y
        @I41.a
        public final C f(AbstractC37323e0<C> abstractC37323e0) {
            return (C) abstractC37323e0.f(this.f359603b);
        }

        @Override // com.google.common.collect.Y
        public final boolean h(C c12) {
            B3<Comparable> b32 = B3.f359264d;
            return this.f359603b.compareTo(c12) <= 0;
        }

        @Override // com.google.common.collect.Y
        public final int hashCode() {
            return this.f359603b.hashCode();
        }

        @Override // com.google.common.collect.Y
        public final C i(AbstractC37323e0<C> abstractC37323e0) {
            return this.f359603b;
        }

        @Override // com.google.common.collect.Y
        public final BoundType k() {
            return BoundType.f359277c;
        }

        @Override // com.google.common.collect.Y
        public final BoundType l() {
            return BoundType.f359276b;
        }

        @Override // com.google.common.collect.Y
        public final Y n(AbstractC37323e0 abstractC37323e0) {
            Comparable comparableF = abstractC37323e0.f(this.f359603b);
            return comparableF == null ? b.f359605c : new c(comparableF);
        }

        public final String toString() {
            return "\\" + this.f359603b + "/";
        }

        @Override // com.google.common.collect.Y
        public final Y m(AbstractC37323e0 abstractC37323e0) {
            return this;
        }
    }
}
