package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.J;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.v;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AnnotatedFieldCollector.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36470i extends w {

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.n f342046d;

    /* renamed from: e, reason: collision with root package name */
    public final v.a f342047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342048f;

    /* compiled from: AnnotatedFieldCollector.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final J f342049a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f342050b;

        /* renamed from: c, reason: collision with root package name */
        public p f342051c;

        public a(J j12, Field field) {
            this.f342049a = j12;
            this.f342050b = field;
            p.c cVar = p.f342070a;
            this.f342051c = p.a.f342071b;
        }
    }

    public C36470i(AnnotationIntrospector annotationIntrospector, com.fasterxml.jackson.databind.type.n nVar, v.a aVar, boolean z12) {
        super(annotationIntrospector);
        this.f342046d = nVar;
        this.f342047e = annotationIntrospector == null ? null : aVar;
        this.f342048f = z12;
    }

    public final Map e(J j12, com.fasterxml.jackson.databind.h hVar) {
        v.a aVar;
        Class<?> clsA;
        a aVar2;
        com.fasterxml.jackson.databind.h hVarT = hVar.t();
        if (hVarT == null) {
            return null;
        }
        Map mapE = e(new J.a(this.f342046d, hVarT.m()), hVarT);
        Class<?> cls = hVar.f341930b;
        for (Field field : cls.getDeclaredFields()) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                if (mapE == null) {
                    mapE = new LinkedHashMap();
                }
                a aVar3 = new a(j12, field);
                if (this.f342048f) {
                    aVar3.f342051c = a(aVar3.f342051c, field.getDeclaredAnnotations());
                }
                mapE.put(field.getName(), aVar3);
            }
        }
        if (mapE != null && (aVar = this.f342047e) != null && (clsA = aVar.a(cls)) != null) {
            Iterator it = com.fasterxml.jackson.databind.util.g.n(clsA, cls, true).iterator();
            while (it.hasNext()) {
                for (Field field2 : ((Class) it.next()).getDeclaredFields()) {
                    if (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()) && (aVar2 = (a) mapE.get(field2.getName())) != null) {
                        aVar2.f342051c = a(aVar2.f342051c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapE;
    }
}
