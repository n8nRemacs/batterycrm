package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AnnotatedClassResolver.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36466e {

    /* renamed from: g, reason: collision with root package name */
    public static final p.c f342024g = p.f342070a;

    /* renamed from: h, reason: collision with root package name */
    public static final Class<?> f342025h = Object.class;

    /* renamed from: i, reason: collision with root package name */
    public static final Class<?> f342026i = Enum.class;

    /* renamed from: j, reason: collision with root package name */
    public static final Class<?> f342027j = List.class;

    /* renamed from: k, reason: collision with root package name */
    public static final Class<?> f342028k = Map.class;

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f342029a;

    /* renamed from: b, reason: collision with root package name */
    public final v.a f342030b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.m f342031c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<?> f342032d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f342033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342034f;

    public C36466e(com.fasterxml.jackson.databind.cfg.l<?> lVar, com.fasterxml.jackson.databind.h hVar, v.a aVar) {
        Class<?> cls = hVar.f341930b;
        this.f342032d = cls;
        this.f342030b = aVar;
        this.f342031c = hVar.m();
        lVar.getClass();
        AnnotationIntrospector annotationIntrospectorD = lVar.k(MapperFeature.USE_ANNOTATIONS) ? lVar.d() : null;
        this.f342029a = annotationIntrospectorD;
        this.f342033e = aVar != null ? aVar.a(cls) : null;
        this.f342034f = (annotationIntrospectorD == null || (com.fasterxml.jackson.databind.util.g.w(cls) && hVar.B())) ? false : true;
    }

    public static void d(com.fasterxml.jackson.databind.h hVar, ArrayList arrayList, boolean z12) {
        Class<?> cls = hVar.f341930b;
        if (z12) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((com.fasterxml.jackson.databind.h) arrayList.get(i12)).f341930b == cls) {
                    return;
                }
            }
            arrayList.add(hVar);
            if (cls == f342027j || cls == f342028k) {
                return;
            }
        }
        Iterator<com.fasterxml.jackson.databind.h> it = hVar.q().iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList, true);
        }
    }

    public static void e(com.fasterxml.jackson.databind.h hVar, ArrayList arrayList, boolean z12) {
        Class<?> cls = hVar.f341930b;
        if (cls == f342025h || cls == f342026i) {
            return;
        }
        if (z12) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((com.fasterxml.jackson.databind.h) arrayList.get(i12)).f341930b == cls) {
                    return;
                }
            }
            arrayList.add(hVar);
        }
        Iterator<com.fasterxml.jackson.databind.h> it = hVar.q().iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList, true);
        }
        com.fasterxml.jackson.databind.h hVarT = hVar.t();
        if (hVarT != null) {
            e(hVarT, arrayList, true);
        }
    }

    public static C36465d g(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
        if (cls.isArray()) {
            if (lVar != null) {
                ((com.fasterxml.jackson.databind.cfg.m) lVar).f341510d.getClass();
            }
            return new C36465d(cls);
        }
        C36466e c36466e = new C36466e(lVar, cls, lVar);
        List<com.fasterxml.jackson.databind.h> listEmptyList = Collections.emptyList();
        InterfaceC36495a interfaceC36495aF = c36466e.f(listEmptyList);
        com.fasterxml.jackson.databind.type.n nVar = lVar.f341506c.f341474b;
        return new C36465d(null, cls, listEmptyList, c36466e.f342033e, interfaceC36495aF, c36466e.f342031c, c36466e.f342029a, lVar, nVar, c36466e.f342034f);
    }

    public final p a(p pVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!pVar.d(annotation)) {
                    pVar = pVar.a(annotation);
                    if (this.f342029a.r0(annotation)) {
                        pVar = c(pVar, annotation);
                    }
                }
            }
        }
        return pVar;
    }

    public final p b(p pVar, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            pVar = a(pVar, com.fasterxml.jackson.databind.util.g.j(cls2));
            Iterator it = com.fasterxml.jackson.databind.util.g.n(cls2, cls, false).iterator();
            while (it.hasNext()) {
                pVar = a(pVar, com.fasterxml.jackson.databind.util.g.j((Class) it.next()));
            }
        }
        return pVar;
    }

    public final p c(p pVar, Annotation annotation) {
        for (Annotation annotation2 : com.fasterxml.jackson.databind.util.g.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !pVar.d(annotation2)) {
                pVar = pVar.a(annotation2);
                if (this.f342029a.r0(annotation2)) {
                    pVar = c(pVar, annotation2);
                }
            }
        }
        return pVar;
    }

    public final InterfaceC36495a f(List<com.fasterxml.jackson.databind.h> list) {
        boolean z12;
        p.c cVar = f342024g;
        if (this.f342029a == null) {
            return cVar;
        }
        v.a aVar = this.f342030b;
        if (aVar == null) {
            z12 = false;
        } else if (aVar instanceof I) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z13 = this.f342034f;
        if (!z12 && !z13) {
            return cVar;
        }
        p.c cVar2 = p.f342070a;
        p pVarB = p.a.f342071b;
        Class<?> cls = this.f342032d;
        Class<?> cls2 = this.f342033e;
        if (cls2 != null) {
            pVarB = b(pVarB, cls, cls2);
        }
        if (z13) {
            pVarB = a(pVarB, com.fasterxml.jackson.databind.util.g.j(cls));
        }
        for (com.fasterxml.jackson.databind.h hVar : list) {
            if (z12) {
                Class<?> cls3 = hVar.f341930b;
                pVarB = b(pVarB, cls3, aVar.a(cls3));
            }
            if (z13) {
                pVarB = a(pVarB, com.fasterxml.jackson.databind.util.g.j(hVar.f341930b));
            }
        }
        if (z12) {
            pVarB = b(pVarB, Object.class, aVar.a(Object.class));
        }
        return pVarB.c();
    }

    public C36466e(com.fasterxml.jackson.databind.cfg.l lVar, Class cls, com.fasterxml.jackson.databind.cfg.l lVar2) {
        this.f342032d = cls;
        this.f342030b = lVar2;
        this.f342031c = com.fasterxml.jackson.databind.type.m.f342469h;
        if (lVar == null) {
            this.f342029a = null;
            this.f342033e = null;
        } else {
            this.f342029a = lVar.k(MapperFeature.USE_ANNOTATIONS) ? lVar.d() : null;
            if (lVar2 != null) {
                ((com.fasterxml.jackson.databind.cfg.m) lVar2).a(cls);
            }
            this.f342033e = null;
        }
        this.f342034f = this.f342029a != null;
    }
}
