package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* compiled from: AnnotationMap.java */
/* loaded from: classes4.dex */
public final class r implements InterfaceC36495a {

    /* renamed from: b, reason: collision with root package name */
    public HashMap<Class<?>, Annotation> f342081b;

    public r() {
    }

    public static r b(r rVar, r rVar2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (rVar == null || (map = rVar.f342081b) == null || map.isEmpty()) {
            return rVar2;
        }
        if (rVar2 == null || (map2 = rVar2.f342081b) == null || map2.isEmpty()) {
            return rVar;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : rVar2.f342081b.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : rVar.f342081b.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new r(map3);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
    public final <A extends Annotation> A a(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.f342081b;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC36495a
    public final int size() {
        HashMap<Class<?>, Annotation> map = this.f342081b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public final String toString() {
        HashMap<Class<?>, Annotation> map = this.f342081b;
        return map == null ? "[null]" : map.toString();
    }

    public r(HashMap<Class<?>, Annotation> map) {
        this.f342081b = map;
    }
}
