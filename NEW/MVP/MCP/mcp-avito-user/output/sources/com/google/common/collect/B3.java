package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.Y;
import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: Range.java */
@InterfaceC37329f0
@XY0.b
@aZ0.j
/* loaded from: classes6.dex */
public final class B3<C extends Comparable> extends C3 implements com.google.common.base.N<C>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final B3<Comparable> f359264d = new B3<>(Y.d.f359606c, Y.b.f359605c);
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Y<C> f359265b;

    /* renamed from: c, reason: collision with root package name */
    public final Y<C> f359266c;

    /* compiled from: Range.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359267a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f359267a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359267a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Range.java */
    public static class b implements InterfaceC37276u<B3, Y> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f359268b = new b();

        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(Object obj) {
            return ((B3) obj).f359265b;
        }
    }

    /* compiled from: Range.java */
    public static class c extends AbstractC37429w3<B3<?>> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final AbstractC37429w3<B3<?>> f359269b = new c();
        private static final long serialVersionUID = 0;

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            B3 b32 = (B3) obj;
            B3 b33 = (B3) obj2;
            return S.f359569a.b(b32.f359265b, b33.f359265b).b(b32.f359266c, b33.f359266c).f();
        }
    }

    /* compiled from: Range.java */
    public static class d implements InterfaceC37276u<B3, Y> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f359270b = new d();

        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(Object obj) {
            return ((B3) obj).f359266c;
        }
    }

    public B3(Y<C> y12, Y<C> y13) {
        y12.getClass();
        this.f359265b = y12;
        y13.getClass();
        this.f359266c = y13;
        if (y12.compareTo(y13) > 0 || y12 == Y.b.f359605c || y13 == Y.d.f359606c) {
            StringBuilder sb2 = new StringBuilder("Invalid range: ");
            StringBuilder sb3 = new StringBuilder(16);
            y12.c(sb3);
            sb3.append("..");
            y13.d(sb3);
            sb2.append(sb3.toString());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static <C extends Comparable<?>> B3<C> b(C c12, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        if (iOrdinal == 0) {
            return new B3<>(new Y.c(c12), Y.b.f359605c);
        }
        if (iOrdinal == 1) {
            return new B3<>(Y.a(c12), Y.b.f359605c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> InterfaceC37276u<B3<C>, Y<C>> h() {
        return b.f359268b;
    }

    public static <C extends Comparable<?>> B3<C> i(C c12, BoundType boundType, C c13, BoundType boundType2) {
        BoundType boundType3 = BoundType.f359276b;
        return new B3<>(boundType == boundType3 ? new Y.c(c12) : Y.a(c12), boundType2 == boundType3 ? Y.a(c13) : new Y.c(c13));
    }

    public static <C extends Comparable<?>> B3<C> k(C c12, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        if (iOrdinal == 0) {
            return new B3<>(Y.d.f359606c, Y.a(c12));
        }
        if (iOrdinal == 1) {
            return new B3<>(Y.d.f359606c, new Y.c(c12));
        }
        throw new AssertionError();
    }

    public final boolean a(C c12) {
        c12.getClass();
        return this.f359265b.h(c12) && !this.f359266c.h(c12);
    }

    @Override // com.google.common.base.N
    @Deprecated
    public final boolean apply(Object obj) {
        return a((Comparable) obj);
    }

    public final boolean c() {
        return this.f359265b != Y.d.f359606c;
    }

    public final boolean d() {
        return this.f359266c != Y.b.f359605c;
    }

    public final B3<C> e(B3<C> b32) {
        Y<C> y12 = b32.f359265b;
        Y<C> y13 = this.f359265b;
        int iB2 = y13.compareTo(y12);
        Y<C> y14 = this.f359266c;
        Y<C> y15 = b32.f359266c;
        int iB3 = y14.compareTo(y15);
        if (iB2 >= 0 && iB3 <= 0) {
            return this;
        }
        if (iB2 <= 0 && iB3 >= 0) {
            return b32;
        }
        if (iB2 < 0) {
            y13 = b32.f359265b;
        }
        if (iB3 > 0) {
            y14 = y15;
        }
        com.google.common.base.M.h(y13.compareTo(y14) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, b32);
        return new B3<>(y13, y14);
    }

    @Override // com.google.common.base.N
    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof B3)) {
            return false;
        }
        B3 b32 = (B3) obj;
        return this.f359265b.equals(b32.f359265b) && this.f359266c.equals(b32.f359266c);
    }

    public final boolean f(B3<C> b32) {
        return this.f359265b.compareTo(b32.f359266c) <= 0 && b32.f359265b.compareTo(this.f359266c) <= 0;
    }

    public final boolean g() {
        return this.f359265b.equals(this.f359266c);
    }

    public final int hashCode() {
        return (this.f359265b.hashCode() * 31) + this.f359266c.hashCode();
    }

    public Object readResolve() {
        B3<Comparable> b32 = f359264d;
        return equals(b32) ? b32 : this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f359265b.c(sb2);
        sb2.append("..");
        this.f359266c.d(sb2);
        return sb2.toString();
    }
}
