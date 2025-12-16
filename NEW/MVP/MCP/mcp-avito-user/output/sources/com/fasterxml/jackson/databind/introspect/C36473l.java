package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: AnnotatedMethodCollector.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36473l extends w {

    /* renamed from: d, reason: collision with root package name */
    public final v.a f342060d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342061e;

    /* compiled from: AnnotatedMethodCollector.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public J f342062a;

        /* renamed from: b, reason: collision with root package name */
        public Method f342063b;

        /* renamed from: c, reason: collision with root package name */
        public p f342064c;

        public a(J j12, Method method, p pVar) {
            this.f342062a = j12;
            this.f342063b = method;
            this.f342064c = pVar;
        }
    }

    public C36473l(AnnotationIntrospector annotationIntrospector, v.a aVar, boolean z12) {
        super(annotationIntrospector);
        this.f342060d = annotationIntrospector == null ? null : aVar;
        this.f342061e = z12;
    }

    public static boolean g(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public final void e(J j12, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        p pVarB;
        if (cls2 != null) {
            f(j12, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : com.fasterxml.jackson.databind.util.g.p(cls)) {
            if (g(method)) {
                A a12 = new A(method);
                a aVar = (a) linkedHashMap.get(a12);
                if (aVar == null) {
                    if (this.f342099a == null) {
                        p.c cVar = p.f342070a;
                        pVarB = p.a.f342071b;
                    } else {
                        pVarB = b(method.getDeclaredAnnotations());
                    }
                    linkedHashMap.put(a12, new a(j12, method, pVarB));
                } else {
                    if (this.f342061e) {
                        aVar.f342064c = c(aVar.f342064c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f342063b;
                    if (method2 == null) {
                        aVar.f342063b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f342063b = method;
                        aVar.f342062a = j12;
                    }
                }
            }
        }
    }

    public final void f(J j12, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        List listEmptyList;
        if (this.f342099a == null) {
            return;
        }
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        if (cls2 == null || cls2 == cls || cls2 == Object.class) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(8);
            com.fasterxml.jackson.databind.util.g.a(cls2, cls, arrayList);
            listEmptyList = arrayList;
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (g(method)) {
                    A a12 = new A(method);
                    a aVar = (a) linkedHashMap.get(a12);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        linkedHashMap.put(a12, new a(j12, null, b(declaredAnnotations)));
                    } else {
                        aVar.f342064c = c(aVar.f342064c, declaredAnnotations);
                    }
                }
            }
        }
    }
}
