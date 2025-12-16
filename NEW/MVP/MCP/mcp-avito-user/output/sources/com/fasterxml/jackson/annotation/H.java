package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.G;
import java.util.UUID;

/* compiled from: ObjectIdGenerators.java */
/* loaded from: classes17.dex */
public class H {

    /* compiled from: ObjectIdGenerators.java */
    public static abstract class a<T> extends G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f340905b;

        public a(Class<?> cls) {
            this.f340905b = cls;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public boolean a(G<?> g12) {
            return g12.getClass() == getClass() && g12.d() == this.f340905b;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public Class<?> d() {
            return this.f340905b;
        }
    }

    /* compiled from: ObjectIdGenerators.java */
    public static final class b extends a<Integer> {
        private static final long serialVersionUID = 1;

        /* renamed from: c, reason: collision with root package name */
        public transient int f340906c;

        public b() {
            this(Object.class, -1);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G<Integer> b(Class<?> cls) {
            return this.f340905b == cls ? this : new b(cls, this.f340906c);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final Object c(Object obj) {
            if (obj == null) {
                return null;
            }
            int i12 = this.f340906c;
            this.f340906c = i12 + 1;
            return Integer.valueOf(i12);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G.a e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new G.a(b.class, this.f340905b, obj);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G f() {
            return new b(this.f340905b, 1);
        }

        public b(Class<?> cls, int i12) {
            super(cls);
            this.f340906c = i12;
        }
    }

    /* compiled from: ObjectIdGenerators.java */
    public static abstract class c extends G<Object> {
    }

    /* compiled from: ObjectIdGenerators.java */
    public static abstract class d extends a<Object> {
        private static final long serialVersionUID = 1;

        public d(Class<?> cls) {
            super(cls);
        }

        @Override // com.fasterxml.jackson.annotation.H.a, com.fasterxml.jackson.annotation.G
        public final Class d() {
            return this.f340905b;
        }
    }

    /* compiled from: ObjectIdGenerators.java */
    public static final class e extends a<String> {
        private static final long serialVersionUID = 1;

        public e() {
            super(Object.class);
        }

        @Override // com.fasterxml.jackson.annotation.H.a, com.fasterxml.jackson.annotation.G
        public final boolean a(G<?> g12) {
            return g12 instanceof e;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final Object c(Object obj) {
            return UUID.randomUUID().toString();
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G.a e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new G.a(e.class, null, obj);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G f() {
            return this;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G<String> b(Class<?> cls) {
            return this;
        }
    }

    /* compiled from: ObjectIdGenerators.java */
    public static final class f extends a<UUID> {
        private static final long serialVersionUID = 1;

        public f() {
            super(Object.class);
        }

        @Override // com.fasterxml.jackson.annotation.H.a, com.fasterxml.jackson.annotation.G
        public final boolean a(G<?> g12) {
            return g12.getClass() == f.class;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final Object c(Object obj) {
            return UUID.randomUUID();
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G.a e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new G.a(f.class, null, obj);
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G f() {
            return this;
        }

        @Override // com.fasterxml.jackson.annotation.G
        public final G<UUID> b(Class<?> cls) {
            return this;
        }
    }
}
