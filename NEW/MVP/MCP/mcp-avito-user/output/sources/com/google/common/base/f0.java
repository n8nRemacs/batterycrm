package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Suppliers.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class f0 {

    /* compiled from: Suppliers.java */
    @XY0.e
    public static class a<T> implements e0<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
        }
    }

    /* compiled from: Suppliers.java */
    @XY0.e
    public static class b<T> implements e0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final e0<T> f359038b;

        /* renamed from: c, reason: collision with root package name */
        public volatile transient boolean f359039c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient T f359040d;

        public b(e0<T> e0Var) {
            e0Var.getClass();
            this.f359038b = e0Var;
        }

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            if (!this.f359039c) {
                synchronized (this) {
                    try {
                        if (!this.f359039c) {
                            T t12 = this.f359038b.get();
                            this.f359040d = t12;
                            this.f359039c = true;
                            return t12;
                        }
                    } finally {
                    }
                }
            }
            return this.f359040d;
        }

        public final String toString() {
            Object objO;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (this.f359039c) {
                objO = androidx.appcompat.app.r.o(this.f359040d, ">", new StringBuilder("<supplier that returned "));
            } else {
                objO = this.f359038b;
            }
            return androidx.appcompat.app.r.o(objO, ")", sb2);
        }
    }

    /* compiled from: Suppliers.java */
    @XY0.e
    public static class c<T> implements e0<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final androidx.media3.datasource.k f359041d = new androidx.media3.datasource.k(3);

        /* renamed from: b, reason: collision with root package name */
        public volatile e0<T> f359042b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public T f359043c;

        public c() {
            throw null;
        }

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            e0<T> e0Var = this.f359042b;
            androidx.media3.datasource.k kVar = f359041d;
            if (e0Var != kVar) {
                synchronized (this) {
                    try {
                        if (this.f359042b != kVar) {
                            T t12 = this.f359042b.get();
                            this.f359043c = t12;
                            this.f359042b = kVar;
                            return t12;
                        }
                    } finally {
                    }
                }
            }
            return this.f359043c;
        }

        public final String toString() {
            Object objO = this.f359042b;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (objO == f359041d) {
                objO = androidx.appcompat.app.r.o(this.f359043c, ">", new StringBuilder("<supplier that returned "));
            }
            return androidx.appcompat.app.r.o(objO, ")", sb2);
        }
    }

    /* compiled from: Suppliers.java */
    public static class d<F, T> implements e0<T>, Serializable {
        private static final long serialVersionUID = 0;

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Suppliers.compose(null, null)";
        }
    }

    /* compiled from: Suppliers.java */
    public interface e<T> extends InterfaceC37276u<e0<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Suppliers.java */
    public static final class f implements e<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ f[] f359044b = {new f("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        f EF5;

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f359044b.clone();
        }

        @Override // com.google.common.base.InterfaceC37276u
        @I41.a
        public final Object apply(Object obj) {
            return ((e0) obj).get();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* compiled from: Suppliers.java */
    public static class g<T> implements e0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @J
        public final T f359045b;

        public g(@J T t12) {
            this.f359045b = t12;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof g) {
                return F.a(this.f359045b, ((g) obj).f359045b);
            }
            return false;
        }

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            return this.f359045b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f359045b});
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f359045b, ")", new StringBuilder("Suppliers.ofInstance("));
        }
    }

    /* compiled from: Suppliers.java */
    public static class h<T> implements e0<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.e0
        @J
        public final T get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.synchronizedSupplier(null)";
        }
    }

    public static <T> e0<T> a(e0<T> e0Var) {
        if ((e0Var instanceof c) || (e0Var instanceof b)) {
            return e0Var;
        }
        if (e0Var instanceof Serializable) {
            return new b(e0Var);
        }
        c cVar = new c();
        e0Var.getClass();
        cVar.f359042b = e0Var;
        return cVar;
    }

    public static <T> e0<T> b(@J T t12) {
        return new g(t12);
    }
}
