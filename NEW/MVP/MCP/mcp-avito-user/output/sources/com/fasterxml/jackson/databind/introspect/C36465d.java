package com.fasterxml.jackson.databind.introspect;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.C36470i;
import com.fasterxml.jackson.databind.introspect.C36473l;
import com.fasterxml.jackson.databind.introspect.J;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AnnotatedClass.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36465d extends AbstractC36463b implements J {

    /* renamed from: p, reason: collision with root package name */
    public static final a f342006p = new a(null, Collections.emptyList(), Collections.emptyList());

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342007b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f342008c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.m f342009d;

    /* renamed from: e, reason: collision with root package name */
    public final List<com.fasterxml.jackson.databind.h> f342010e;

    /* renamed from: f, reason: collision with root package name */
    public final AnnotationIntrospector f342011f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.n f342012g;

    /* renamed from: h, reason: collision with root package name */
    public final v.a f342013h;

    /* renamed from: i, reason: collision with root package name */
    public final Class<?> f342014i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f342015j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC36495a f342016k;

    /* renamed from: l, reason: collision with root package name */
    public a f342017l;

    /* renamed from: m, reason: collision with root package name */
    public C36474m f342018m;

    /* renamed from: n, reason: collision with root package name */
    public List<C36469h> f342019n;

    /* renamed from: o, reason: collision with root package name */
    public transient Boolean f342020o;

    /* compiled from: AnnotatedClass.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C36467f f342021a;

        /* renamed from: b, reason: collision with root package name */
        public final List<C36467f> f342022b;

        /* renamed from: c, reason: collision with root package name */
        public final List<C36472k> f342023c;

        public a(C36467f c36467f, List<C36467f> list, List<C36472k> list2) {
            this.f342021a = c36467f;
            this.f342022b = list;
            this.f342023c = list2;
        }
    }

    public C36465d(com.fasterxml.jackson.databind.h hVar, Class<?> cls, List<com.fasterxml.jackson.databind.h> list, Class<?> cls2, InterfaceC36495a interfaceC36495a, com.fasterxml.jackson.databind.type.m mVar, AnnotationIntrospector annotationIntrospector, v.a aVar, com.fasterxml.jackson.databind.type.n nVar, boolean z12) {
        this.f342007b = hVar;
        this.f342008c = cls;
        this.f342010e = list;
        this.f342014i = cls2;
        this.f342016k = interfaceC36495a;
        this.f342009d = mVar;
        this.f342011f = annotationIntrospector;
        this.f342013h = aVar;
        this.f342012g = nVar;
        this.f342015j = z12;
    }

    @Override // com.fasterxml.jackson.databind.introspect.J
    public final com.fasterxml.jackson.databind.h a(Type type) {
        return this.f342012g.b(null, type, this.f342009d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final <A extends Annotation> A c(Class<A> cls) {
        return (A) this.f342016k.a(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return this.f342008c.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f342008c;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.fasterxml.jackson.databind.util.g.u(C36465d.class, obj) && ((C36465d) obj).f342008c == this.f342008c;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f342007b;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0220 A[PHI: r1 r2 r3 r8
  0x0220: PHI (r1v25 com.fasterxml.jackson.databind.h) = 
  (r1v3 com.fasterxml.jackson.databind.h)
  (r1v3 com.fasterxml.jackson.databind.h)
  (r1v11 com.fasterxml.jackson.databind.h)
 binds: [B:125:0x021e, B:131:0x0235, B:252:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r2v15 int) = (r2v2 int), (r2v2 int), (r2v8 int) binds: [B:125:0x021e, B:131:0x0235, B:252:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r3v28 java.util.ArrayList) = (r3v3 java.util.ArrayList), (r3v3 java.util.ArrayList), (r3v9 java.util.ArrayList) binds: [B:125:0x021e, B:131:0x0235, B:252:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r8v16 java.lang.Class<?>) = (r8v1 java.lang.Class<?>), (r8v1 java.lang.Class<?>), (r8v5 java.lang.Class<?>) binds: [B:125:0x021e, B:131:0x0235, B:252:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.introspect.C36465d.a g() throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.C36465d.g():com.fasterxml.jackson.databind.introspect.d$a");
    }

    public final C36474m h() throws NoSuchMethodException, SecurityException {
        v.a aVar;
        Class<?> clsA;
        C36474m c36474m = this.f342018m;
        if (c36474m == null) {
            com.fasterxml.jackson.databind.h hVar = this.f342007b;
            if (hVar == null) {
                c36474m = new C36474m();
            } else {
                C36473l c36473l = new C36473l(this.f342011f, this.f342013h, this.f342015j);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Class<?> cls = this.f342014i;
                Class<?> cls2 = hVar.f341930b;
                c36473l.e(this, cls2, linkedHashMap, cls);
                Iterator<com.fasterxml.jackson.databind.h> it = this.f342010e.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Class<?> clsA2 = null;
                    aVar = c36473l.f342060d;
                    if (!zHasNext) {
                        break;
                    }
                    com.fasterxml.jackson.databind.h next = it.next();
                    if (aVar != null) {
                        clsA2 = aVar.a(next.f341930b);
                    }
                    c36473l.e(new J.a(this.f342012g, next.m()), next.f341930b, linkedHashMap, clsA2);
                }
                if (aVar != null && (clsA = aVar.a(Object.class)) != null) {
                    c36473l.f(this, cls2, linkedHashMap, clsA);
                    if (c36473l.f342099a != null && !linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            A a12 = (A) entry.getKey();
                            if ("hashCode".equals(a12.f341936a) && a12.f341937b.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(a12.f341936a, new Class[0]);
                                    if (declaredMethod != null) {
                                        C36473l.a aVar2 = (C36473l.a) entry.getValue();
                                        aVar2.f342064c = c36473l.c(aVar2.f342064c, declaredMethod.getDeclaredAnnotations());
                                        aVar2.f342063b = declaredMethod;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    c36474m = new C36474m();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        C36473l.a aVar3 = (C36473l.a) entry2.getValue();
                        Method method = aVar3.f342063b;
                        C36472k c36472k = method == null ? null : new C36472k(aVar3.f342062a, method, aVar3.f342064c.b(), null);
                        if (c36472k != null) {
                            linkedHashMap2.put(entry2.getKey(), c36472k);
                        }
                    }
                    C36474m c36474m2 = new C36474m();
                    c36474m2.f342065b = linkedHashMap2;
                    c36474m = c36474m2;
                }
            }
            this.f342018m = c36474m;
        }
        return c36474m;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f342008c.getName().hashCode();
    }

    public final List i() {
        Map mapE;
        List<C36469h> listEmptyList = this.f342019n;
        if (listEmptyList == null) {
            com.fasterxml.jackson.databind.h hVar = this.f342007b;
            if (hVar == null || (mapE = new C36470i(this.f342011f, this.f342012g, this.f342013h, this.f342015j).e(this, hVar)) == null) {
                listEmptyList = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(mapE.size());
                for (C36470i.a aVar : mapE.values()) {
                    arrayList.add(new C36469h(aVar.f342049a, aVar.f342050b, aVar.f342051c.b()));
                }
                listEmptyList = arrayList;
            }
            this.f342019n = listEmptyList;
        }
        return listEmptyList;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        return C0.f(this.f342008c, new StringBuilder("[AnnotedClass "), "]");
    }

    public C36465d(Class<?> cls) {
        this.f342007b = null;
        this.f342008c = cls;
        this.f342010e = Collections.emptyList();
        this.f342014i = null;
        this.f342016k = p.f342070a;
        this.f342009d = com.fasterxml.jackson.databind.type.m.f342469h;
        this.f342011f = null;
        this.f342013h = null;
        this.f342012g = null;
        this.f342015j = false;
    }
}
