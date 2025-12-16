package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.introspect.y;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: BasicClassIntrospector.java */
/* loaded from: classes4.dex */
public class t extends v implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final s f342091b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f342092c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f342093d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f342094e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f342095f;
    private static final long serialVersionUID = 2;

    static {
        com.fasterxml.jackson.databind.type.k kVarW = com.fasterxml.jackson.databind.type.k.W(String.class);
        p.c cVar = C36466e.f342024g;
        f342091b = s.v(kVarW, null, new C36465d(String.class));
        Class cls = Boolean.TYPE;
        f342092c = s.v(com.fasterxml.jackson.databind.type.k.W(cls), null, new C36465d(cls));
        Class cls2 = Integer.TYPE;
        f342093d = s.v(com.fasterxml.jackson.databind.type.k.W(cls2), null, new C36465d(cls2));
        Class cls3 = Long.TYPE;
        f342094e = s.v(com.fasterxml.jackson.databind.type.k.W(cls3), null, new C36465d(cls3));
        f342095f = s.v(com.fasterxml.jackson.databind.type.k.W(Object.class), null, new C36465d(Object.class));
    }

    public static s a(com.fasterxml.jackson.databind.cfg.m mVar, com.fasterxml.jackson.databind.h hVar) {
        if (!hVar.B() || (hVar instanceof com.fasterxml.jackson.databind.type.a)) {
            return null;
        }
        Class<?> cls = hVar.f341930b;
        if (!com.fasterxml.jackson.databind.util.g.w(cls)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return s.v(hVar, mVar, c(mVar, hVar, mVar));
        }
        return null;
    }

    public static s b(com.fasterxml.jackson.databind.cfg.l lVar, com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        boolean zIsPrimitive = cls.isPrimitive();
        s sVar = f342092c;
        s sVar2 = f342094e;
        s sVar3 = f342093d;
        if (zIsPrimitive) {
            if (cls == Integer.TYPE) {
                return sVar3;
            }
            if (cls == Long.TYPE) {
                return sVar2;
            }
            if (cls == Boolean.TYPE) {
                return sVar;
            }
            return null;
        }
        if (!com.fasterxml.jackson.databind.util.g.w(cls)) {
            if (!com.fasterxml.jackson.databind.j.class.isAssignableFrom(cls)) {
                return null;
            }
            p.c cVar = C36466e.f342024g;
            return s.v(hVar, lVar, new C36465d(cls));
        }
        if (cls == Object.class) {
            return f342095f;
        }
        if (cls == String.class) {
            return f342091b;
        }
        if (cls == Integer.class) {
            return sVar3;
        }
        if (cls == Long.class) {
            return sVar2;
        }
        if (cls == Boolean.class) {
            return sVar;
        }
        return null;
    }

    public static C36465d c(com.fasterxml.jackson.databind.cfg.l lVar, com.fasterxml.jackson.databind.h hVar, v.a aVar) {
        p.c cVar = C36466e.f342024g;
        hVar.getClass();
        boolean z12 = hVar instanceof com.fasterxml.jackson.databind.type.a;
        Class<?> cls = hVar.f341930b;
        if (z12) {
            if (lVar != null) {
                ((com.fasterxml.jackson.databind.cfg.m) lVar).f341510d.getClass();
            }
            return new C36465d(cls);
        }
        C36466e c36466e = new C36466e((com.fasterxml.jackson.databind.cfg.l<?>) lVar, hVar, aVar);
        ArrayList arrayList = new ArrayList(8);
        if (!hVar.x(Object.class)) {
            if (cls.isInterface()) {
                C36466e.d(hVar, arrayList, false);
            } else {
                C36466e.e(hVar, arrayList, false);
            }
        }
        InterfaceC36495a interfaceC36495aF = c36466e.f(arrayList);
        com.fasterxml.jackson.databind.type.n nVar = lVar.f341506c.f341474b;
        return new C36465d(hVar, c36466e.f342032d, arrayList, c36466e.f342033e, interfaceC36495aF, c36466e.f342031c, c36466e.f342029a, aVar, nVar, c36466e.f342034f);
    }

    public static E d(com.fasterxml.jackson.databind.cfg.m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.cfg.m mVar2, boolean z12) {
        y yVar;
        C36465d c36465dC = c(mVar, hVar, mVar2);
        if (hVar.H()) {
            y.c cVar = mVar.f341506c.f341477e;
            yVar = new y.d(mVar, c36465dC);
        } else {
            y.c cVar2 = mVar.f341506c.f341477e;
            yVar = new y(mVar, cVar2.f342106b, cVar2.f342108d, cVar2.f342109e);
        }
        return new E(mVar, z12, hVar, c36465dC, yVar);
    }
}
