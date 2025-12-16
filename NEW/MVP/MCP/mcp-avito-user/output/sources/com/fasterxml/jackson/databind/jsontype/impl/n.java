package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.C36466e;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: StdSubtypeResolver.java */
/* loaded from: classes4.dex */
public class n extends com.fasterxml.jackson.databind.jsontype.k implements Serializable {
    private static final long serialVersionUID = 1;

    public static void a(C36465d c36465d, com.fasterxml.jackson.databind.jsontype.j jVar, com.fasterxml.jackson.databind.cfg.l lVar, AnnotationIntrospector annotationIntrospector, HashMap map) {
        String strB0;
        if (!jVar.a() && (strB0 = annotationIntrospector.b0(c36465d)) != null) {
            jVar = new com.fasterxml.jackson.databind.jsontype.j(jVar.f342179b, strB0);
        }
        com.fasterxml.jackson.databind.jsontype.j jVar2 = new com.fasterxml.jackson.databind.jsontype.j(jVar.f342179b, null);
        if (map.containsKey(jVar2)) {
            if (!jVar.a() || ((com.fasterxml.jackson.databind.jsontype.j) map.get(jVar2)).a()) {
                return;
            }
            map.put(jVar2, jVar);
            return;
        }
        map.put(jVar2, jVar);
        List<com.fasterxml.jackson.databind.jsontype.j> listA0 = annotationIntrospector.a0(c36465d);
        if (listA0 == null || listA0.isEmpty()) {
            return;
        }
        for (com.fasterxml.jackson.databind.jsontype.j jVar3 : listA0) {
            a(C36466e.g(lVar, jVar3.f342179b), jVar3, lVar, annotationIntrospector, map);
        }
    }

    public static void b(C36465d c36465d, com.fasterxml.jackson.databind.jsontype.j jVar, com.fasterxml.jackson.databind.cfg.l lVar, HashSet hashSet, LinkedHashMap linkedHashMap) {
        List<com.fasterxml.jackson.databind.jsontype.j> listA0;
        String strB0;
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        if (!jVar.a() && (strB0 = annotationIntrospectorD.b0(c36465d)) != null) {
            jVar = new com.fasterxml.jackson.databind.jsontype.j(jVar.f342179b, strB0);
        }
        if (jVar.a()) {
            linkedHashMap.put(jVar.f342181d, jVar);
        }
        if (!hashSet.add(jVar.f342179b) || (listA0 = annotationIntrospectorD.a0(c36465d)) == null || listA0.isEmpty()) {
            return;
        }
        for (com.fasterxml.jackson.databind.jsontype.j jVar2 : listA0) {
            b(C36466e.g(lVar, jVar2.f342179b), jVar2, lVar, hashSet, linkedHashMap);
        }
    }

    public static ArrayList c(Class cls, HashSet hashSet, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            hashSet.remove(((com.fasterxml.jackson.databind.jsontype.j) it.next()).f342179b);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new com.fasterxml.jackson.databind.jsontype.j(cls2, null));
            }
        }
        return arrayList;
    }

    public final Collection<com.fasterxml.jackson.databind.jsontype.j> d(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar) {
        Class<?> clsE;
        List<com.fasterxml.jackson.databind.jsontype.j> listA0;
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        if (hVar != null) {
            clsE = hVar.f341930b;
        } else {
            if (abstractC36471j == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            clsE = abstractC36471j.e();
        }
        HashMap map = new HashMap();
        if (abstractC36471j != null && (listA0 = annotationIntrospectorD.a0(abstractC36471j)) != null) {
            for (com.fasterxml.jackson.databind.jsontype.j jVar : listA0) {
                a(C36466e.g(lVar, jVar.f342179b), jVar, lVar, annotationIntrospectorD, map);
            }
        }
        a(C36466e.g(lVar, clsE), new com.fasterxml.jackson.databind.jsontype.j(clsE, null), lVar, annotationIntrospectorD, map);
        return new ArrayList(map.values());
    }

    public final Collection<com.fasterxml.jackson.databind.jsontype.j> e(com.fasterxml.jackson.databind.cfg.l<?> lVar, C36465d c36465d) {
        Class<?> cls = c36465d.f342008c;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(c36465d, new com.fasterxml.jackson.databind.jsontype.j(cls, null), lVar, hashSet, linkedHashMap);
        return c(cls, hashSet, linkedHashMap);
    }

    public final Collection<com.fasterxml.jackson.databind.jsontype.j> f(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar) {
        List<com.fasterxml.jackson.databind.jsontype.j> listA0;
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        Class<?> cls = hVar.f341930b;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(C36466e.g(lVar, cls), new com.fasterxml.jackson.databind.jsontype.j(cls, null), lVar, hashSet, linkedHashMap);
        if (abstractC36471j != null && (listA0 = annotationIntrospectorD.a0(abstractC36471j)) != null) {
            for (com.fasterxml.jackson.databind.jsontype.j jVar : listA0) {
                b(C36466e.g(lVar, jVar.f342179b), jVar, lVar, hashSet, linkedHashMap);
            }
        }
        return c(cls, hashSet, linkedHashMap);
    }
}
