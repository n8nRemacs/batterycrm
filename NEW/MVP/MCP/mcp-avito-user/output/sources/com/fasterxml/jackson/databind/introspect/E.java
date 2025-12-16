package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.G;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* compiled from: POJOPropertiesCollector.java */
/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.m f341945a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC36462a f341946b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341947c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341948d;

    /* renamed from: e, reason: collision with root package name */
    public final C36465d f341949e;

    /* renamed from: f, reason: collision with root package name */
    public final L<?> f341950f;

    /* renamed from: g, reason: collision with root package name */
    public final AnnotationIntrospector f341951g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341952h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f341953i;

    /* renamed from: j, reason: collision with root package name */
    public LinkedHashMap<String, G> f341954j;

    /* renamed from: k, reason: collision with root package name */
    public LinkedList<G> f341955k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f341956l;

    /* renamed from: m, reason: collision with root package name */
    public LinkedList<AbstractC36471j> f341957m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedList<AbstractC36471j> f341958n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedList<C36472k> f341959o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedList<AbstractC36471j> f341960p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedList<AbstractC36471j> f341961q;

    /* renamed from: r, reason: collision with root package name */
    public LinkedList<AbstractC36471j> f341962r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet<String> f341963s;

    /* renamed from: t, reason: collision with root package name */
    public LinkedHashMap<Object, AbstractC36471j> f341964t;

    public E(com.fasterxml.jackson.databind.cfg.m mVar, boolean z12, com.fasterxml.jackson.databind.h hVar, C36465d c36465d, AbstractC36462a abstractC36462a) {
        this.f341945a = mVar;
        this.f341947c = z12;
        this.f341948d = hVar;
        this.f341949e = c36465d;
        mVar.getClass();
        if (mVar.k(MapperFeature.USE_ANNOTATIONS)) {
            this.f341952h = true;
            this.f341951g = mVar.d();
        } else {
            this.f341952h = false;
            this.f341951g = C.f341938b;
        }
        this.f341950f = mVar.n(hVar.f341930b, c36465d);
        this.f341946b = abstractC36462a;
        mVar.k(MapperFeature.USE_STD_BEAN_NAMING);
    }

    public static boolean f(G g12, LinkedList linkedList) {
        if (linkedList != null) {
            String str = g12.f341971g.f342656b;
            int size = linkedList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((G) linkedList.get(i12)).f341971g.f342656b.equals(str)) {
                    linkedList.set(i12, g12);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(LinkedHashMap linkedHashMap, n nVar) {
        G gE2;
        JsonCreator.Mode modeE;
        AnnotationIntrospector annotationIntrospector = this.f341951g;
        String strP = annotationIntrospector.p(nVar);
        if (strP == null) {
            strP = "";
        }
        com.fasterxml.jackson.databind.v vVarV = annotationIntrospector.v(nVar);
        boolean z12 = (vVarV == null || vVarV.c()) ? false : true;
        if (!z12) {
            if (strP.isEmpty() || (modeE = annotationIntrospector.e(this.f341945a, nVar.f342066d)) == null || modeE == JsonCreator.Mode.f340925e) {
                return;
            } else {
                vVarV = com.fasterxml.jackson.databind.v.a(strP);
            }
        }
        String strB = b(strP);
        if (z12 && strB.isEmpty()) {
            String str = vVarV.f342656b;
            gE2 = (G) linkedHashMap.get(str);
            if (gE2 == null) {
                gE2 = new G(this.f341945a, this.f341951g, this.f341947c, vVarV, vVarV);
                linkedHashMap.put(str, gE2);
            }
        } else {
            gE2 = e(linkedHashMap, strB);
        }
        G g12 = gE2;
        g12.f341973i = new G.f<>(nVar, g12.f341973i, vVarV, z12, true, false);
        this.f341955k.add(g12);
    }

    public final String b(String str) {
        com.fasterxml.jackson.databind.v vVar;
        HashMap map = this.f341956l;
        return (map == null || (vVar = (com.fasterxml.jackson.databind.v) map.get(com.fasterxml.jackson.databind.v.b(str, null))) == null) ? str : vVar.f342656b;
    }

    public final void c(String str) {
        if (this.f341947c || str == null) {
            return;
        }
        if (this.f341963s == null) {
            this.f341963s = new HashSet<>();
        }
        this.f341963s.add(str);
    }

    public final void d(InterfaceC36434d.a aVar, AbstractC36471j abstractC36471j) {
        if (aVar == null) {
            return;
        }
        if (this.f341964t == null) {
            this.f341964t = new LinkedHashMap<>();
        }
        LinkedHashMap<Object, AbstractC36471j> linkedHashMap = this.f341964t;
        Object obj = aVar.f340989b;
        AbstractC36471j abstractC36471jPut = linkedHashMap.put(obj, abstractC36471j);
        if (abstractC36471jPut == null || abstractC36471jPut.getClass() != abstractC36471j.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + obj + "' (of type " + obj.getClass().getName() + ")");
    }

    public final G e(LinkedHashMap linkedHashMap, String str) {
        G g12 = (G) linkedHashMap.get(str);
        if (g12 != null) {
            return g12;
        }
        com.fasterxml.jackson.databind.v vVarA = com.fasterxml.jackson.databind.v.a(str);
        G g13 = new G(this.f341945a, this.f341951g, this.f341947c, vVarA, vVarA);
        linkedHashMap.put(str, g13);
        return g13;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0937 A[LOOP:19: B:546:0x0931->B:548:0x0937, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0905 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 2665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.E.g():void");
    }

    public final void h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f341949e + ": " + str);
    }
}
