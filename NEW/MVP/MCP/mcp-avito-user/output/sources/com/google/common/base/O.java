package com.google.common.base;

import com.akita.compose.theme.re23.style.C0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: Predicates.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class O {

    /* compiled from: Predicates.java */
    public static class b<T> implements N<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends N<? super T>> f358965b;

        public b() {
            throw null;
        }

        public b(List list, a aVar) {
            this.f358965b = list;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@J T t12) {
            int i12 = 0;
            while (true) {
                List<? extends N<? super T>> list = this.f358965b;
                if (i12 >= list.size()) {
                    return true;
                }
                if (!list.get(i12).apply(t12)) {
                    return false;
                }
                i12++;
            }
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof b) {
                return this.f358965b.equals(((b) obj).f358965b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f358965b.hashCode() + 306654252;
        }

        public final String toString() {
            return O.a(this.f358965b, "and");
        }
    }

    /* compiled from: Predicates.java */
    public static class c<A, B> implements N<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final N<B> f358966b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37276u<A, ? extends B> f358967c;

        public c() {
            throw null;
        }

        public c(N n12, InterfaceC37276u interfaceC37276u, a aVar) {
            n12.getClass();
            this.f358966b = n12;
            interfaceC37276u.getClass();
            this.f358967c = interfaceC37276u;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@J A a12) {
            return this.f358966b.apply(this.f358967c.apply(a12));
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f358967c.equals(cVar.f358967c) && this.f358966b.equals(cVar.f358966b);
        }

        public final int hashCode() {
            return this.f358967c.hashCode() ^ this.f358966b.hashCode();
        }

        public final String toString() {
            return this.f358966b + "(" + this.f358967c + ")";
        }
    }

    /* compiled from: Predicates.java */
    @XY0.c
    @XY0.d
    public static class d extends e {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.O.e
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: Predicates.java */
    @XY0.d
    @XY0.c
    public static class e implements N<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.N
        public final boolean apply(CharSequence charSequence) {
            throw null;
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof e) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public String toString() {
            D.b(null);
            throw null;
        }
    }

    /* compiled from: Predicates.java */
    public static class f<T> implements N<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Collection<?> f358968b;

        public f() {
            throw null;
        }

        public f(Collection collection, a aVar) {
            collection.getClass();
            this.f358968b = collection;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@J T t12) {
            try {
                return this.f358968b.contains(t12);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof f) {
                return this.f358968b.equals(((f) obj).f358968b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f358968b.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.f358968b + ")";
        }
    }

    /* compiled from: Predicates.java */
    @XY0.c
    public static class g<T> implements N<T>, Serializable {

        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f358969b;

        public g() {
            throw null;
        }

        public g(Class cls, a aVar) {
            cls.getClass();
            this.f358969b = cls;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@J T t12) {
            return this.f358969b.isInstance(t12);
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            return (obj instanceof g) && this.f358969b == ((g) obj).f358969b;
        }

        public final int hashCode() {
            return this.f358969b.hashCode();
        }

        public final String toString() {
            return C0.f(this.f358969b, new StringBuilder("Predicates.instanceOf("), ")");
        }
    }

    /* compiled from: Predicates.java */
    public static class h implements N<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object f358970b;

        public h(Object obj, a aVar) {
            this.f358970b = obj;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@I41.a Object obj) {
            return this.f358970b.equals(obj);
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof h) {
                return this.f358970b.equals(((h) obj).f358970b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f358970b.hashCode();
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f358970b, ")", new StringBuilder("Predicates.equalTo("));
        }
    }

    /* compiled from: Predicates.java */
    public static class i<T> implements N<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object f358971b;

        public i(N<T> n12) {
            this.f358971b = n12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.base.N
        public final boolean apply(@J T t12) {
            return !this.f358971b.apply(t12);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof i) {
                return this.f358971b.equals(((i) obj).f358971b);
            }
            return false;
        }

        public final int hashCode() {
            return ~this.f358971b.hashCode();
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f358971b, ")", new StringBuilder("Predicates.not("));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Predicates.java */
    public static abstract class j implements N<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f358972b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ j[] f358973c;

        /* compiled from: Predicates.java */
        public enum a extends j {
            @Override // com.google.common.base.N
            public final boolean apply(@I41.a Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* compiled from: Predicates.java */
        public enum b extends j {
            @Override // com.google.common.base.N
            public final boolean apply(@I41.a Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* compiled from: Predicates.java */
        public enum c extends j {
            @Override // com.google.common.base.N
            public final boolean apply(@I41.a Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }

        /* compiled from: Predicates.java */
        public enum d extends j {
            @Override // com.google.common.base.N
            public final boolean apply(@I41.a Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }

        static {
            a aVar = new a("ALWAYS_TRUE", 0, null);
            f358972b = aVar;
            f358973c = new j[]{aVar, new b("ALWAYS_FALSE", 1, null), new c("IS_NULL", 2, null), new d("NOT_NULL", 3, null)};
        }

        public j() {
            throw null;
        }

        public j(String str, int i12, a aVar) {
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f358973c.clone();
        }
    }

    /* compiled from: Predicates.java */
    public static class k<T> implements N<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends N<? super T>> f358974b;

        public k() {
            throw null;
        }

        public k(List list, a aVar) {
            this.f358974b = list;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@J T t12) {
            int i12 = 0;
            while (true) {
                List<? extends N<? super T>> list = this.f358974b;
                if (i12 >= list.size()) {
                    return false;
                }
                if (list.get(i12).apply(t12)) {
                    return true;
                }
                i12++;
            }
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof k) {
                return this.f358974b.equals(((k) obj).f358974b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f358974b.hashCode() + 87855567;
        }

        public final String toString() {
            return O.a(this.f358974b, "or");
        }
    }

    /* compiled from: Predicates.java */
    @XY0.d
    @XY0.c
    public static class l implements N<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f358975b;

        public l() {
            throw null;
        }

        public l(Class cls, a aVar) {
            cls.getClass();
            this.f358975b = cls;
        }

        @Override // com.google.common.base.N
        public final boolean apply(Class<?> cls) {
            return this.f358975b.isAssignableFrom(cls);
        }

        @Override // com.google.common.base.N
        public final boolean equals(@I41.a Object obj) {
            return (obj instanceof l) && this.f358975b == ((l) obj).f358975b;
        }

        public final int hashCode() {
            return this.f358975b.hashCode();
        }

        public final String toString() {
            return C0.f(this.f358975b, new StringBuilder("Predicates.subtypeOf("), ")");
        }
    }

    public static String a(Iterable iterable, String str) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z12 = true;
        for (Object obj : iterable) {
            if (!z12) {
                sb2.append(',');
            }
            sb2.append(obj);
            z12 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @XY0.b
    public static <T> N<T> b() {
        j.a aVar = j.f358972b;
        aVar.getClass();
        return aVar;
    }

    public static <T> N<T> c(N<? super T> n12, N<? super T> n13) {
        n12.getClass();
        n13.getClass();
        return new b(Arrays.asList(n12, n13), null);
    }

    public static <A, B> N<A> d(N<B> n12, InterfaceC37276u<A, ? extends B> interfaceC37276u) {
        return new c(n12, interfaceC37276u, null);
    }

    public static <T> N<T> e(@J T t12) {
        return new h(t12, null);
    }

    public static <T> N<T> f(Collection<? extends T> collection) {
        return new f(collection, null);
    }

    @XY0.c
    public static <T> N<T> g(Class<?> cls) {
        return new g(cls, null);
    }

    public static <T> N<T> h(N<T> n12) {
        return new i(n12);
    }
}
