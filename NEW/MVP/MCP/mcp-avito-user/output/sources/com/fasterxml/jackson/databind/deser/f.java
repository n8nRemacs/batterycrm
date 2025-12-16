package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.H;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.A;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36469h;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: BeanDeserializerFactory.java */
/* loaded from: classes4.dex */
public class f extends b implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Class<?>[] f341584d = {Throwable.class};

    /* renamed from: e, reason: collision with root package name */
    public static final f f341585e = new f(new com.fasterxml.jackson.databind.cfg.h());
    private static final long serialVersionUID = 1;

    public static void u(com.fasterxml.jackson.databind.b bVar, e eVar) throws SecurityException {
        Map<Object, AbstractC36471j> mapG = bVar.g();
        if (mapG != null) {
            for (Map.Entry<Object, AbstractC36471j> entry : mapG.entrySet()) {
                AbstractC36471j value = entry.getValue();
                com.fasterxml.jackson.databind.v vVarA = com.fasterxml.jackson.databind.v.a(value.d());
                com.fasterxml.jackson.databind.h hVarF = value.f();
                bVar.l();
                Object key = entry.getKey();
                if (eVar.f341575e == null) {
                    eVar.f341575e = new ArrayList();
                }
                com.fasterxml.jackson.databind.e eVar2 = eVar.f341571a;
                eVar2.getClass();
                if (eVar2.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        value.g(eVar2.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    } catch (IllegalArgumentException e12) {
                        eVar.c(e12);
                        throw null;
                    }
                }
                eVar.f341575e.add(new E(vVarA, hVarF, value, key));
            }
        }
    }

    public static void v(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, e eVar) {
        G gF2;
        v vVar;
        com.fasterxml.jackson.databind.h hVar;
        D dQ2 = bVar.q();
        if (dQ2 == null) {
            return;
        }
        I iG2 = fVar.g(dQ2);
        Class<? extends G<?>> cls = dQ2.f341941b;
        if (cls == H.d.class) {
            LinkedHashMap linkedHashMap = eVar.f341574d;
            com.fasterxml.jackson.databind.v vVar2 = dQ2.f341940a;
            v vVar3 = (v) linkedHashMap.get(vVar2.f342656b);
            if (vVar3 == null) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Invalid Object Id definition for ", com.fasterxml.jackson.databind.util.g.t(bVar.f341454a), ": cannot find property with name ", com.fasterxml.jackson.databind.util.g.c(vVar2.f342656b)));
            }
            com.fasterxml.jackson.databind.deser.impl.w wVar = new com.fasterxml.jackson.databind.deser.impl.w(dQ2.f341943d);
            hVar = vVar3.f341897e;
            gF2 = wVar;
            vVar = vVar3;
        } else {
            com.fasterxml.jackson.databind.h hVarL = fVar.l(cls);
            fVar.e().getClass();
            com.fasterxml.jackson.databind.h hVar2 = com.fasterxml.jackson.databind.type.n.n(hVarL, G.class)[0];
            gF2 = fVar.f(dQ2);
            vVar = null;
            hVar = hVar2;
        }
        eVar.f341580j = new com.fasterxml.jackson.databind.deser.impl.s(hVar, dQ2.f341940a, gF2, fVar.u(hVar), vVar, iG2);
    }

    public final void s(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, e eVar) throws InvalidDefinitionException {
        ArrayList<com.fasterxml.jackson.databind.introspect.u> arrayListC = bVar.c();
        if (arrayListC != null) {
            for (com.fasterxml.jackson.databind.introspect.u uVar : arrayListC) {
                AnnotationIntrospector.ReferenceProperty referencePropertyJ = uVar.j();
                String str = referencePropertyJ == null ? null : referencePropertyJ.f341341b;
                v vVarW = w(fVar, bVar, uVar, uVar.q());
                if (eVar.f341576f == null) {
                    eVar.f341576f = new HashMap<>(4);
                }
                com.fasterxml.jackson.databind.e eVar2 = eVar.f341571a;
                eVar2.getClass();
                if (eVar2.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        vVarW.l(eVar2);
                    } catch (IllegalArgumentException e12) {
                        eVar.c(e12);
                        throw null;
                    }
                }
                eVar.f341576f.put(str, vVarW);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.fasterxml.jackson.databind.f] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.fasterxml.jackson.databind.deser.e] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.fasterxml.jackson.databind.f r23, com.fasterxml.jackson.databind.b r24, com.fasterxml.jackson.databind.deser.e r25) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.f.t(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.b, com.fasterxml.jackson.databind.deser.e):void");
    }

    public final v w(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.introspect.u uVar, com.fasterxml.jackson.databind.h hVar) throws InvalidDefinitionException {
        AbstractC36471j abstractC36471jS = uVar.s();
        if (abstractC36471jS == null) {
            abstractC36471jS = uVar.o();
        }
        if (abstractC36471jS == null) {
            fVar.S(bVar, uVar, "No non-constructor mutator available", new Object[0]);
            throw null;
        }
        com.fasterxml.jackson.databind.h hVarR = r(fVar, abstractC36471jS, hVar);
        com.fasterxml.jackson.databind.jsontype.l lVar = (com.fasterxml.jackson.databind.jsontype.l) hVarR.f341933e;
        v oVar = abstractC36471jS instanceof C36472k ? new com.fasterxml.jackson.databind.deser.impl.o(uVar, hVarR, lVar, bVar.l(), (C36472k) abstractC36471jS) : new com.fasterxml.jackson.databind.deser.impl.i(uVar, hVarR, lVar, bVar.l(), (C36469h) abstractC36471jS);
        com.fasterxml.jackson.databind.i<?> iVarM = b.m(fVar, abstractC36471jS);
        if (iVarM == null) {
            iVarM = (com.fasterxml.jackson.databind.i) hVarR.f341932d;
        }
        if (iVarM != null) {
            oVar = oVar.E(fVar.z(iVarM, oVar, hVarR));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyJ = uVar.j();
        if (referencePropertyJ != null) {
            if (referencePropertyJ.f341340a == AnnotationIntrospector.ReferenceProperty.Type.f341342b) {
                oVar.f341902j = referencePropertyJ.f341341b;
            }
        }
        D dI2 = uVar.i();
        if (dI2 != null) {
            oVar.f341903k = dI2;
        }
        return oVar;
    }

    public final A x(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.introspect.u uVar) {
        C36472k c36472kP = uVar.p();
        com.fasterxml.jackson.databind.h hVarR = r(fVar, c36472kP, c36472kP.f());
        v a12 = new A(uVar, hVarR, (com.fasterxml.jackson.databind.jsontype.l) hVarR.f341933e, bVar.l(), c36472kP);
        com.fasterxml.jackson.databind.i<?> iVarM = b.m(fVar, c36472kP);
        if (iVarM == null) {
            iVarM = (com.fasterxml.jackson.databind.i) hVarR.f341932d;
        }
        if (iVarM != null) {
            a12 = a12.E(fVar.z(iVarM, a12, hVarR));
        }
        return (A) a12;
    }
}
