package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Equivalence.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37270n<T> {

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.n$b */
    public static final class b extends AbstractC37270n<Object> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f359054b = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f359054b;
        }

        @Override // com.google.common.base.AbstractC37270n
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.AbstractC37270n
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.n$c */
    public static final class c<T> implements N<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.N
        public final boolean apply(@I41.a T t12) {
            throw null;
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "null.equivalentTo(null)";
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.n$d */
    public static final class d extends AbstractC37270n<Object> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final d f359055b = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f359055b;
        }

        @Override // com.google.common.base.AbstractC37270n
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.AbstractC37270n
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.n$e */
    public static final class e<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37270n<? super T> f359056b;

        /* renamed from: c, reason: collision with root package name */
        @J
        public final T f359057c;

        public e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(AbstractC37270n abstractC37270n, Object obj, a aVar) {
            abstractC37270n.getClass();
            this.f359056b = abstractC37270n;
            this.f359057c = obj;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            AbstractC37270n<? super T> abstractC37270n = eVar.f359056b;
            AbstractC37270n<? super T> abstractC37270n2 = this.f359056b;
            if (abstractC37270n2.equals(abstractC37270n)) {
                return abstractC37270n2.d(this.f359057c, eVar.f359057c);
            }
            return false;
        }

        public final int hashCode() {
            AbstractC37270n<? super T> abstractC37270n = this.f359056b;
            T t12 = this.f359057c;
            if (t12 != null) {
                return abstractC37270n.b(t12);
            }
            abstractC37270n.getClass();
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f359056b);
            sb2.append(".wrap(");
            return androidx.appcompat.app.r.o(this.f359057c, ")", sb2);
        }
    }

    public static AbstractC37270n<Object> c() {
        return b.f359054b;
    }

    public static AbstractC37270n<Object> e() {
        return d.f359055b;
    }

    @aZ0.g
    public abstract boolean a(T t12, T t13);

    @aZ0.g
    public abstract int b(T t12);

    public final boolean d(@I41.a T t12, @I41.a T t13) {
        if (t12 == t13) {
            return true;
        }
        if (t12 == null || t13 == null) {
            return false;
        }
        return a(t12, t13);
    }
}
