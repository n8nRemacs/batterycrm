package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AnnotationCollector.java */
/* loaded from: classes4.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final c f342070a = new c();

    /* compiled from: AnnotationCollector.java */
    public static class a extends p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f342071b = new a();

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final p a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            e eVar = new e();
            eVar.f342075b = clsAnnotationType;
            eVar.f342076c = annotation;
            return eVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final r b() {
            return new r();
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final InterfaceC36495a c() {
            return p.f342070a;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final boolean d(Annotation annotation) {
            return false;
        }
    }

    /* compiled from: AnnotationCollector.java */
    public static class b extends p {

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<Class<?>, Annotation> f342072b;

        public b(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.f342072b = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final p a(Annotation annotation) {
            this.f342072b.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final r b() {
            r rVar = new r();
            for (Annotation annotation : this.f342072b.values()) {
                if (rVar.f342081b == null) {
                    rVar.f342081b = new HashMap<>();
                }
                Annotation annotationPut = rVar.f342081b.put(annotation.annotationType(), annotation);
                if (annotationPut != null) {
                    annotationPut.equals(annotation);
                }
            }
            return rVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final InterfaceC36495a c() {
            HashMap<Class<?>, Annotation> map = this.f342072b;
            if (map.size() != 2) {
                return new r(map);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = map.entrySet().iterator();
            Map.Entry<Class<?>, Annotation> next = it.next();
            Map.Entry<Class<?>, Annotation> next2 = it.next();
            return new f(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final boolean d(Annotation annotation) {
            return this.f342072b.containsKey(annotation.annotationType());
        }
    }

    /* compiled from: AnnotationCollector.java */
    public static class c implements InterfaceC36495a, Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final <A extends Annotation> A a(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final int size() {
            return 0;
        }
    }

    /* compiled from: AnnotationCollector.java */
    public static class d implements InterfaceC36495a, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f342073b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation f342074c;

        public d(Class<?> cls, Annotation annotation) {
            this.f342073b = cls;
            this.f342074c = annotation;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final <A extends Annotation> A a(Class<A> cls) {
            if (this.f342073b == cls) {
                return (A) this.f342074c;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final int size() {
            return 1;
        }
    }

    /* compiled from: AnnotationCollector.java */
    public static class e extends p {

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f342075b;

        /* renamed from: c, reason: collision with root package name */
        public Annotation f342076c;

        public e() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final p a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.f342075b;
            if (cls != clsAnnotationType) {
                return new b(cls, this.f342076c, clsAnnotationType, annotation);
            }
            this.f342076c = annotation;
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final r b() {
            Annotation annotation = this.f342076c;
            HashMap map = new HashMap(4);
            map.put(this.f342075b, annotation);
            return new r(map);
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final InterfaceC36495a c() {
            return new d(this.f342075b, this.f342076c);
        }

        @Override // com.fasterxml.jackson.databind.introspect.p
        public final boolean d(Annotation annotation) {
            return annotation.annotationType() == this.f342075b;
        }
    }

    /* compiled from: AnnotationCollector.java */
    public static class f implements InterfaceC36495a, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f342077b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f342078c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation f342079d;

        /* renamed from: e, reason: collision with root package name */
        public final Annotation f342080e;

        public f(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.f342077b = cls;
            this.f342079d = annotation;
            this.f342078c = cls2;
            this.f342080e = annotation2;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final <A extends Annotation> A a(Class<A> cls) {
            if (this.f342077b == cls) {
                return (A) this.f342079d;
            }
            if (this.f342078c == cls) {
                return (A) this.f342080e;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
        public final int size() {
            return 2;
        }
    }

    public abstract p a(Annotation annotation);

    public abstract r b();

    public abstract InterfaceC36495a c();

    public abstract boolean d(Annotation annotation);
}
