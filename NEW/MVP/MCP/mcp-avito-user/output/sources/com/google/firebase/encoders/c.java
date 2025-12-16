package com.google.firebase.encoders;

import j.N;
import j.P;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f361544a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f361545b;

    /* compiled from: FieldDescriptor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f361546a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap f361547b = null;

        public b(String str) {
            this.f361546a = str;
        }

        @N
        public final c a() {
            return new c(this.f361546a, this.f361547b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f361547b)));
        }

        @N
        public final void b(@N Annotation annotation) {
            if (this.f361547b == null) {
                this.f361547b = new HashMap();
            }
            this.f361547b.put(annotation.annotationType(), annotation);
        }
    }

    @N
    public static c b(@N String str) {
        return new c(str, Collections.emptyMap());
    }

    @P
    public final <T extends Annotation> T a(@N Class<T> cls) {
        return (T) this.f361545b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f361544a.equals(cVar.f361544a) && this.f361545b.equals(cVar.f361545b);
    }

    public final int hashCode() {
        return this.f361545b.hashCode() + (this.f361544a.hashCode() * 31);
    }

    @N
    public final String toString() {
        return "FieldDescriptor{name=" + this.f361544a + ", properties=" + this.f361545b.values() + "}";
    }

    public c(String str, Map<Class<?>, Object> map) {
        this.f361544a = str;
        this.f361545b = map;
    }
}
