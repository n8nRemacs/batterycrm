package com.fasterxml.jackson.annotation;

import java.io.Serializable;

/* compiled from: ObjectIdGenerator.java */
/* loaded from: classes17.dex */
public abstract class G<T> implements Serializable {

    /* compiled from: ObjectIdGenerator.java */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f340901b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f340902c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f340903d;

        /* renamed from: e, reason: collision with root package name */
        public final int f340904e;

        public a(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.f340901b = cls;
            this.f340902c = cls2;
            this.f340903d = obj;
            int iHashCode = cls.getName().hashCode() + obj.hashCode();
            this.f340904e = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f340903d.equals(this.f340903d) && aVar.f340901b == this.f340901b && aVar.f340902c == this.f340902c;
        }

        public final int hashCode() {
            return this.f340904e;
        }

        public final String toString() {
            Class<?> cls = this.f340901b;
            String name = cls == null ? "NONE" : cls.getName();
            Class<?> cls2 = this.f340902c;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", this.f340903d, name, cls2 != null ? cls2.getName() : "NONE");
        }
    }

    public abstract boolean a(G<?> g12);

    public abstract G<T> b(Class<?> cls);

    public abstract T c(Object obj);

    public abstract Class<?> d();

    public abstract a e(Object obj);

    public abstract G f();
}
