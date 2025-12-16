package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Functions.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37278w {

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$b */
    public static class b<E> implements InterfaceC37276u<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.InterfaceC37276u
        @J
        public final E apply(@I41.a Object obj) {
            return null;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return F.a(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Functions.constant(null)";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$c */
    public static class c<K, V> implements InterfaceC37276u<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.InterfaceC37276u
        @J
        public final V apply(@J K k12) {
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
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Functions.forMap(null, defaultValue=null)";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$d */
    public static class d<A, B, C> implements InterfaceC37276u<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.InterfaceC37276u
        @J
        public final C apply(@J A a12) {
            throw null;
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
            return "null(null)";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$e */
    public static class e<K, V> implements InterfaceC37276u<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.InterfaceC37276u
        @J
        public final V apply(@J K k12) {
            throw null;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Functions.forMap(null)";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$g */
    public static class g<T> implements InterfaceC37276u<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final N<T> f359064b;

        public g() {
            throw null;
        }

        public g(N n12, a aVar) {
            n12.getClass();
            this.f359064b = n12;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(@J Object obj) {
            return Boolean.valueOf(this.f359064b.apply(obj));
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof g) {
                return this.f359064b.equals(((g) obj).f359064b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f359064b.hashCode();
        }

        public final String toString() {
            return "Functions.forPredicate(" + this.f359064b + ")";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$h */
    public static class h<F, T> implements InterfaceC37276u<F, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final e0<T> f359065b;

        public h() {
            throw null;
        }

        public h(e0 e0Var, a aVar) {
            e0Var.getClass();
            this.f359065b = e0Var;
        }

        @Override // com.google.common.base.InterfaceC37276u
        @J
        public final T apply(@J F f12) {
            return this.f359065b.get();
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof h) {
                return this.f359065b.equals(((h) obj).f359065b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f359065b.hashCode();
        }

        public final String toString() {
            return "Functions.forSupplier(" + this.f359065b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$i */
    public static final class i implements InterfaceC37276u<Object, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ i[] f359066b = {new i("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        i EF5;

        public i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f359066b.clone();
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(Object obj) {
            obj.getClass();
            return obj.toString();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Functions.toStringFunction()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Functions.java */
    /* renamed from: com.google.common.base.w$f */
    public static final class f implements InterfaceC37276u<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ f[] f359063b = {new f("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        f EF5;

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f359063b.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Functions.identity()";
        }

        @Override // com.google.common.base.InterfaceC37276u
        @I41.a
        public final Object apply(@I41.a Object obj) {
            return obj;
        }
    }
}
