package com.fasterxml.jackson.databind.introspect;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import com.fasterxml.jackson.databind.util.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: BasicBeanDescription.java */
/* loaded from: classes4.dex */
public class s extends com.fasterxml.jackson.databind.b {

    /* renamed from: j, reason: collision with root package name */
    public static final Class<?>[] f342082j = new Class[0];

    /* renamed from: b, reason: collision with root package name */
    public final E f342083b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.l<?> f342084c;

    /* renamed from: d, reason: collision with root package name */
    public final AnnotationIntrospector f342085d;

    /* renamed from: e, reason: collision with root package name */
    public final C36465d f342086e;

    /* renamed from: f, reason: collision with root package name */
    public Class<?>[] f342087f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f342088g;

    /* renamed from: h, reason: collision with root package name */
    public List<u> f342089h;

    /* renamed from: i, reason: collision with root package name */
    public final D f342090i;

    public s(E e12) {
        super(e12.f341948d);
        this.f342083b = e12;
        com.fasterxml.jackson.databind.cfg.m mVar = e12.f341945a;
        this.f342084c = mVar;
        if (mVar == null) {
            this.f342085d = null;
        } else {
            this.f342085d = mVar.d();
        }
        C36465d c36465d = e12.f341949e;
        this.f342086e = c36465d;
        AnnotationIntrospector annotationIntrospector = e12.f341951g;
        D dZ2 = annotationIntrospector.z(c36465d);
        this.f342090i = dZ2 != null ? annotationIntrospector.A(c36465d, dZ2) : dZ2;
    }

    public static s v(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.cfg.l lVar, C36465d c36465d) {
        return new s(lVar, hVar, c36465d, Collections.emptyList());
    }

    @Override // com.fasterxml.jackson.databind.b
    public final AbstractC36471j a() {
        AbstractC36471j first;
        AbstractC36471j first2;
        E e12 = this.f342083b;
        if (e12 != null) {
            if (!e12.f341953i) {
                e12.g();
            }
            LinkedList<AbstractC36471j> linkedList = e12.f341957m;
            if (linkedList == null) {
                first = null;
            } else {
                if (linkedList.size() > 1) {
                    e12.h("Multiple 'any-getter' methods defined (%s vs %s)", e12.f341957m.get(0), e12.f341957m.get(1));
                    throw null;
                }
                first = e12.f341957m.getFirst();
            }
            if (first != null) {
                if (Map.class.isAssignableFrom(first.e())) {
                    return first;
                }
                throw new IllegalArgumentException(AK.c.k("Invalid 'any-getter' annotation on method ", first.d(), "(): return type is not instance of java.util.Map"));
            }
            if (!e12.f341953i) {
                e12.g();
            }
            LinkedList<AbstractC36471j> linkedList2 = e12.f341958n;
            if (linkedList2 == null) {
                first2 = null;
            } else {
                if (linkedList2.size() > 1) {
                    e12.h("Multiple 'any-getter' fields defined (%s vs %s)", e12.f341958n.get(0), e12.f341958n.get(1));
                    throw null;
                }
                first2 = e12.f341958n.getFirst();
            }
            if (first2 != null) {
                if (Map.class.isAssignableFrom(first2.e())) {
                    return first2;
                }
                throw new IllegalArgumentException(AK.c.k("Invalid 'any-getter' annotation on field '", first2.d(), "': type is not instance of java.util.Map"));
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final AbstractC36471j b() {
        C36472k first;
        AbstractC36471j first2;
        E e12 = this.f342083b;
        if (e12 != null) {
            if (!e12.f341953i) {
                e12.g();
            }
            LinkedList<C36472k> linkedList = e12.f341959o;
            if (linkedList == null) {
                first = null;
            } else {
                if (linkedList.size() > 1) {
                    e12.h("Multiple 'any-setter' methods defined (%s vs %s)", e12.f341959o.get(0), e12.f341959o.get(1));
                    throw null;
                }
                first = e12.f341959o.getFirst();
            }
            if (first != null) {
                Class<?> clsV = first.v(0);
                if (clsV == String.class || clsV == Object.class) {
                    return first;
                }
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Invalid 'any-setter' annotation on method '", first.f342054e.getName(), "()': first argument not of type String or Object, but ", clsV.getName()));
            }
            if (!e12.f341953i) {
                e12.g();
            }
            LinkedList<AbstractC36471j> linkedList2 = e12.f341960p;
            if (linkedList2 == null) {
                first2 = null;
            } else {
                if (linkedList2.size() > 1) {
                    e12.h("Multiple 'any-setter' fields defined (%s vs %s)", e12.f341960p.get(0), e12.f341960p.get(1));
                    throw null;
                }
                first2 = e12.f341960p.getFirst();
            }
            if (first2 != null) {
                if (Map.class.isAssignableFrom(first2.e())) {
                    return first2;
                }
                throw new IllegalArgumentException(AK.c.k("Invalid 'any-setter' annotation on field '", first2.d(), "': type is not instance of java.util.Map"));
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final ArrayList c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (u uVar : u()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyJ = uVar.j();
            if (referencePropertyJ != null) {
                if (referencePropertyJ.f341340a == AnnotationIntrospector.ReferenceProperty.Type.f341343c) {
                    String str = referencePropertyJ.f341341b;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet();
                        hashSet.add(str);
                    } else if (!hashSet.add(str)) {
                        throw new IllegalArgumentException("Multiple back-reference properties with name " + com.fasterxml.jackson.databind.util.g.z(str));
                    }
                    arrayList.add(uVar);
                } else {
                    continue;
                }
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final C36467f d() {
        return this.f342086e.g().f342021a;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final Class<?>[] e() {
        if (!this.f342088g) {
            this.f342088g = true;
            AnnotationIntrospector annotationIntrospector = this.f342085d;
            Class<?>[] clsArrF0 = annotationIntrospector == null ? null : annotationIntrospector.f0(this.f342086e);
            if (clsArrF0 == null && !this.f342084c.k(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrF0 = f342082j;
            }
            this.f342087f = clsArrF0;
        }
        return this.f342087f;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final JsonFormat.b f() {
        JsonFormat.b bVarO;
        C36465d c36465d = this.f342086e;
        AnnotationIntrospector annotationIntrospector = this.f342085d;
        if (annotationIntrospector == null || (bVarO = annotationIntrospector.o(c36465d)) == null) {
            bVarO = null;
        }
        JsonFormat.b bVarF = this.f342084c.f(c36465d.f342008c);
        return bVarF != null ? bVarO == null ? bVarF : bVarO.e(bVarF) : bVarO;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final Map<Object, AbstractC36471j> g() {
        E e12 = this.f342083b;
        if (e12 == null) {
            return Collections.emptyMap();
        }
        if (!e12.f341953i) {
            e12.g();
        }
        return e12.f341964t;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final AbstractC36471j h() {
        E e12 = this.f342083b;
        if (e12 == null) {
            return null;
        }
        if (!e12.f341953i) {
            e12.g();
        }
        LinkedList<AbstractC36471j> linkedList = e12.f341962r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return e12.f341962r.get(0);
        }
        e12.h("Multiple 'as-value' properties defined (%s vs %s)", e12.f341962r.get(0), e12.f341962r.get(1));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final C36472k i(String str, Class<?>[] clsArr) {
        LinkedHashMap linkedHashMap = this.f342086e.h().f342065b;
        if (linkedHashMap == null) {
            return null;
        }
        return (C36472k) linkedHashMap.get(new A(str, clsArr));
    }

    @Override // com.fasterxml.jackson.databind.b
    public final List<u> j() {
        return u();
    }

    @Override // com.fasterxml.jackson.databind.b
    public final JsonInclude.a k(JsonInclude.a aVar) {
        JsonInclude.a aVarL;
        AnnotationIntrospector annotationIntrospector = this.f342085d;
        return (annotationIntrospector == null || (aVarL = annotationIntrospector.L(this.f342086e)) == null) ? aVar : aVar == null ? aVarL : aVar.a(aVarL);
    }

    @Override // com.fasterxml.jackson.databind.b
    public final InterfaceC36495a l() {
        return this.f342086e.f342016k;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final C36465d m() {
        return this.f342086e;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final List<C36467f> n() {
        return this.f342086e.g().f342022b;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final List<C36472k> o() {
        Class<?> clsV;
        List<C36472k> list = this.f342086e.g().f342023c;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        for (C36472k c36472k : list) {
            if (this.f341454a.f341930b.isAssignableFrom(c36472k.f342054e.getReturnType())) {
                JsonCreator.Mode modeE = this.f342085d.e(this.f342084c, c36472k);
                if (modeE == null || modeE == JsonCreator.Mode.f340925e) {
                    String name = c36472k.f342054e.getName();
                    if ((!"valueOf".equals(name) || c36472k.w().length != 1) && (!"fromString".equals(name) || c36472k.w().length != 1 || ((clsV = c36472k.v(0)) != String.class && !CharSequence.class.isAssignableFrom(clsV)))) {
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c36472k);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final Set<String> p() {
        E e12 = this.f342083b;
        HashSet<String> hashSet = e12 == null ? null : e12.f341963s;
        return hashSet == null ? Collections.emptySet() : hashSet;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final D q() {
        return this.f342090i;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final boolean r() {
        return this.f342086e.f342016k.size() > 0;
    }

    @Override // com.fasterxml.jackson.databind.b
    public final Object s(boolean z12) throws SecurityException {
        C36465d c36465d = this.f342086e;
        C36467f c36467f = c36465d.g().f342021a;
        if (c36467f == null) {
            return null;
        }
        if (z12) {
            c36467f.g(this.f342084c.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return c36467f.p();
        } catch (Exception e12) {
            e = e12;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            com.fasterxml.jackson.databind.util.g.D(e);
            com.fasterxml.jackson.databind.util.g.F(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + c36465d.f342008c.getName() + ": (" + e.getClass().getName() + ") " + com.fasterxml.jackson.databind.util.g.i(e), e);
        }
    }

    public final com.fasterxml.jackson.databind.util.i<Object, Object> t(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.fasterxml.jackson.databind.util.i) {
            return (com.fasterxml.jackson.databind.util.i) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == i.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
            return null;
        }
        if (!com.fasterxml.jackson.databind.util.i.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(C0.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        com.fasterxml.jackson.databind.cfg.l<?> lVar = this.f342084c;
        lVar.f341506c.getClass();
        return (com.fasterxml.jackson.databind.util.i) com.fasterxml.jackson.databind.util.g.h(lVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
    }

    public final List<u> u() {
        if (this.f342089h == null) {
            E e12 = this.f342083b;
            if (!e12.f341953i) {
                e12.g();
            }
            this.f342089h = new ArrayList(e12.f341954j.values());
        }
        return this.f342089h;
    }

    public final boolean w(com.fasterxml.jackson.databind.v vVar) {
        u next;
        Iterator<u> it = u().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.w(vVar)) {
                break;
            }
        }
        return next != null;
    }

    public s(com.fasterxml.jackson.databind.cfg.l<?> lVar, com.fasterxml.jackson.databind.h hVar, C36465d c36465d, List<u> list) {
        super(hVar);
        this.f342083b = null;
        this.f342084c = lVar;
        if (lVar == null) {
            this.f342085d = null;
        } else {
            this.f342085d = lVar.d();
        }
        this.f342086e = c36465d;
        this.f342089h = list;
    }
}
