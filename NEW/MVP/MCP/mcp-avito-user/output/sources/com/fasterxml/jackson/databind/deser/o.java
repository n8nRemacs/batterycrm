package com.fasterxml.jackson.databind.deser;

import androidx.camera.core.Q;
import androidx.media3.common.C23088b;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.C36444c;
import com.fasterxml.jackson.databind.deser.std.B;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.E;
import com.fasterxml.jackson.databind.introspect.y;
import com.fasterxml.jackson.databind.util.C36497c;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rX0.e;

/* compiled from: DeserializerCache.java */
/* loaded from: classes4.dex */
public final class o implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<com.fasterxml.jackson.databind.h, com.fasterxml.jackson.databind.i<Object>> f341710c = new HashMap<>(8);

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.q<com.fasterxml.jackson.databind.h, com.fasterxml.jackson.databind.i<Object>> f341709b = new com.fasterxml.jackson.databind.util.q<>(Math.min(64, 500), 2000);

    public static com.fasterxml.jackson.databind.i a(com.fasterxml.jackson.databind.f fVar, f fVar2, com.fasterxml.jackson.databind.h hVar) throws InvalidDefinitionException, SecurityException {
        com.fasterxml.jackson.databind.i<Object> iVarM;
        com.fasterxml.jackson.databind.h hVarU0;
        Object objC;
        com.fasterxml.jackson.databind.i iVarM2;
        com.fasterxml.jackson.databind.h hVarR;
        Object objS;
        com.fasterxml.jackson.databind.m mVarP;
        boolean z12;
        com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
        com.fasterxml.jackson.databind.h hVarQ = (hVar.y() || hVar.G() || hVar.z()) ? fVar2.q(eVar, hVar) : hVar;
        com.fasterxml.jackson.databind.b bVarO = eVar.o(hVarQ);
        com.fasterxml.jackson.databind.e eVar2 = fVar.f341921d;
        AnnotationIntrospector annotationIntrospectorD = eVar2.d();
        AbstractC36463b abstractC36463b = ((com.fasterxml.jackson.databind.introspect.s) bVarO).f342086e;
        Object objK = annotationIntrospectorD.k(abstractC36463b);
        if (objK == null) {
            iVarM = null;
        } else {
            iVarM = fVar.m(abstractC36463b, objK);
            Object objI = eVar2.d().i(abstractC36463b);
            com.fasterxml.jackson.databind.util.i iVarC = objI == null ? null : fVar.c(objI);
            if (iVarC != null) {
                iVarM = new B<>(iVarC, iVarC.a(fVar.e()), iVarM);
            }
        }
        if (iVarM != null) {
            return iVarM;
        }
        AnnotationIntrospector annotationIntrospectorD2 = eVar2.d();
        if (annotationIntrospectorD2 == null) {
            hVarU0 = hVarQ;
        } else {
            com.fasterxml.jackson.databind.h hVarZ = (!hVarQ.G() || (hVarR = hVarQ.r()) == null || hVarR.f341932d != null || (objS = annotationIntrospectorD2.s(abstractC36463b)) == null || (mVarP = fVar.P(abstractC36463b, objS)) == null) ? hVarQ : ((com.fasterxml.jackson.databind.type.f) hVarQ).Z(mVarP);
            com.fasterxml.jackson.databind.h hVarN = hVarZ.n();
            if (hVarN != null && hVarN.f341932d == null && (objC = annotationIntrospectorD2.c(abstractC36463b)) != null) {
                if (objC instanceof com.fasterxml.jackson.databind.i) {
                    iVarM2 = (com.fasterxml.jackson.databind.i) objC;
                } else {
                    if (!(objC instanceof Class)) {
                        throw new IllegalStateException("AnnotationIntrospector.findContentDeserializer() returned value of type " + objC.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
                    }
                    Class cls = (Class) objC;
                    if (cls == i.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
                        cls = null;
                    }
                    iVarM2 = cls != null ? fVar.m(abstractC36463b, cls) : null;
                }
                if (iVarM2 != null) {
                    hVarZ = hVarZ.O(iVarM2);
                }
            }
            hVarU0 = annotationIntrospectorD2.u0(eVar2, abstractC36463b, hVarZ);
        }
        if (hVarU0 != hVarQ) {
            bVarO = eVar.o(hVarU0);
            hVarQ = hVarU0;
        }
        com.fasterxml.jackson.databind.introspect.s sVar = (com.fasterxml.jackson.databind.introspect.s) bVarO;
        C36465d c36465d = sVar.f342086e;
        AnnotationIntrospector annotationIntrospector = sVar.f342085d;
        Class<?> clsB = annotationIntrospector == null ? null : annotationIntrospector.B(c36465d);
        Class<?> cls2 = hVarQ.f341930b;
        if (clsB == null) {
            com.fasterxml.jackson.databind.util.i<Object, Object> iVarT = annotationIntrospector != null ? sVar.t(annotationIntrospector.i(c36465d)) : null;
            if (iVarT == null) {
                return b(fVar, fVar2, hVarQ, bVarO);
            }
            com.fasterxml.jackson.databind.h hVarA = iVarT.a(fVar.e());
            if (!hVarA.x(cls2)) {
                bVarO = eVar.o(hVarA);
            }
            return new B(iVarT, hVarA, b(fVar, fVar2, hVarA, bVarO));
        }
        fVar2.getClass();
        com.fasterxml.jackson.databind.h hVarC = eVar2.k(MapperFeature.INFER_BUILDER_TYPE_BINDINGS) ? fVar.e().c(null, clsB, hVarQ.m()) : fVar.l(clsB);
        eVar2.f341506c.f341475c.getClass();
        C36465d c36465dC = com.fasterxml.jackson.databind.introspect.t.c(eVar2, hVarC, eVar2);
        y.c cVar = eVar2.f341506c.f341477e;
        AnnotationIntrospector annotationIntrospectorD3 = eVar2.k(MapperFeature.USE_ANNOTATIONS) ? eVar2.d() : null;
        e.a aVarC = annotationIntrospectorD3 == null ? null : annotationIntrospectorD3.C(c36465dC);
        com.fasterxml.jackson.databind.introspect.s sVar2 = new com.fasterxml.jackson.databind.introspect.s(new E(eVar2, false, hVarC, c36465dC, new com.fasterxml.jackson.databind.introspect.y(eVar2, aVarC == null ? cVar.f342107c : aVarC.f429868b, cVar.f342108d, cVar.f342109e)));
        try {
            x xVarP = fVar2.p(sVar2, fVar);
            e eVar3 = new e(sVar2, fVar);
            eVar3.f341579i = xVarP;
            fVar2.t(fVar, sVar2, eVar3);
            f.v(fVar, sVar2, eVar3);
            fVar2.s(fVar, sVar2, eVar3);
            f.u(sVar2, eVar3);
            AnnotationIntrospector annotationIntrospector2 = sVar2.f342085d;
            e.a aVarC2 = annotationIntrospector2 == null ? null : annotationIntrospector2.C(sVar2.f342086e);
            String str = aVarC2 == null ? "build" : aVarC2.f429867a;
            C36472k c36472kI = sVar2.i(str, null);
            if (c36472kI != null && eVar2.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.fasterxml.jackson.databind.util.g.e(c36472kI.f342054e, eVar2.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            eVar3.f341583m = c36472kI;
            com.fasterxml.jackson.databind.cfg.h hVar2 = fVar2.f341529c;
            if (hVar2.c()) {
                C36497c c36497cA = hVar2.a();
                while (c36497cA.hasNext()) {
                    ((g) c36497cA.next()).getClass();
                }
            }
            C36472k c36472k = eVar3.f341583m;
            com.fasterxml.jackson.databind.b bVar = eVar3.f341573c;
            com.fasterxml.jackson.databind.f fVar3 = eVar3.f341572b;
            if (c36472k != null) {
                Class<?> returnType = c36472k.f342054e.getReturnType();
                if (returnType != cls2 && !returnType.isAssignableFrom(cls2) && !cls2.isAssignableFrom(returnType)) {
                    com.fasterxml.jackson.databind.h hVar3 = bVar.f341454a;
                    String strI = eVar3.f341583m.i();
                    String strO = com.fasterxml.jackson.databind.util.g.o(returnType);
                    String strT = com.fasterxml.jackson.databind.util.g.t(hVarQ);
                    StringBuilder sbB = C23088b.b("Build method `", strI, "` has wrong return type (", strO, "), not compatible with POJO type (");
                    sbB.append(strT);
                    sbB.append(")");
                    fVar3.i(sbB.toString());
                    throw null;
                }
            } else if (!str.isEmpty()) {
                fVar3.i(Q.a("Builder class ", com.fasterxml.jackson.databind.util.g.t(bVar.f341454a), " does not have build method (name: '", str, "')"));
                throw null;
            }
            Collection<v> collectionValues = eVar3.f341574d.values();
            eVar3.b(collectionValues);
            Map<String, List<com.fasterxml.jackson.databind.v>> mapA = eVar3.a(collectionValues);
            Boolean boolB = bVar.f().b(JsonFormat.Feature.f340928c);
            com.fasterxml.jackson.databind.e eVar4 = eVar3.f341571a;
            C36444c c36444c = new C36444c(boolB == null ? eVar4.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, eVar4.f341506c.f341480h);
            c36444c.d();
            boolean zK2 = eVar4.k(MapperFeature.DEFAULT_VIEW_INCLUSION);
            boolean z13 = !zK2;
            if (zK2) {
                Iterator<v> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (it.next().v()) {
                        z12 = true;
                        break;
                    }
                }
                z12 = z13;
            } else {
                z12 = z13;
            }
            h hVar4 = new h(eVar3, eVar3.f341573c, hVarQ, eVar3.f341580j != null ? c36444c.l(new com.fasterxml.jackson.databind.deser.impl.u(eVar3.f341580j, com.fasterxml.jackson.databind.u.f342512i)) : c36444c, eVar3.f341576f, eVar3.f341577g, eVar3.f341582l, eVar3.f341578h, z12);
            if (!hVar2.c()) {
                return hVar4;
            }
            C36497c c36497cA2 = hVar2.a();
            while (c36497cA2.hasNext()) {
                ((g) c36497cA2.next()).getClass();
            }
            return hVar4;
        } catch (IllegalArgumentException e12) {
            throw new InvalidDefinitionException(fVar.f341924g, com.fasterxml.jackson.databind.util.g.i(e12));
        } catch (NoClassDefFoundError e13) {
            return new com.fasterxml.jackson.databind.deser.impl.f(e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:463:0x0789, code lost:
    
        if (r6.endsWith("DataSource") != false) goto L497;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026b A[PHI: r5
  0x026b: PHI (r5v19 com.fasterxml.jackson.databind.i) = (r5v18 com.fasterxml.jackson.databind.i), (r5v26 com.fasterxml.jackson.databind.i) binds: [B:84:0x01af, B:109:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06f4 A[LOOP:16: B:425:0x06ee->B:427:0x06f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:548:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.i b(com.fasterxml.jackson.databind.f r18, com.fasterxml.jackson.databind.deser.f r19, com.fasterxml.jackson.databind.h r20, com.fasterxml.jackson.databind.b r21) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.o.b(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.deser.f, com.fasterxml.jackson.databind.h, com.fasterxml.jackson.databind.b):com.fasterxml.jackson.databind.i");
    }

    public static boolean c(com.fasterxml.jackson.databind.h hVar) {
        if (!hVar.B()) {
            return false;
        }
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        if (hVarN == null || (hVarN.f341932d == null && hVarN.f341933e == null)) {
            return hVar.G() && hVar.r().f341932d != null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.fasterxml.jackson.databind.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final com.fasterxml.jackson.databind.i d(com.fasterxml.jackson.databind.f fVar, f fVar2, com.fasterxml.jackson.databind.h hVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.i<Object> iVar;
        if (hVar == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        com.fasterxml.jackson.databind.i<Object> iVar2 = c(hVar) ? null : this.f341709b.f342624c.get(hVar);
        if (iVar2 == null) {
            synchronized (this.f341710c) {
                try {
                    iVar2 = c(hVar) ? null : this.f341709b.f342624c.get(hVar);
                    if (iVar2 == null) {
                        int size = this.f341710c.size();
                        if (size <= 0 || (iVar = this.f341710c.get(hVar)) == null) {
                            try {
                                try {
                                    ?? A12 = a(fVar, fVar2, hVar);
                                    if (A12 == 0) {
                                        A12 = 0;
                                    } else {
                                        boolean z12 = !c(hVar) && A12.p();
                                        if (A12 instanceof t) {
                                            HashMap map = this.f341710c;
                                            map.put(hVar, A12);
                                            ((t) A12).c(fVar);
                                            map.remove(hVar);
                                        }
                                        if (z12) {
                                            this.f341709b.b(hVar, A12);
                                        }
                                    }
                                    iVar2 = A12;
                                } catch (IllegalArgumentException e12) {
                                    fVar.i(com.fasterxml.jackson.databind.util.g.i(e12));
                                    throw null;
                                }
                            } finally {
                                if (size == 0 && this.f341710c.size() > 0) {
                                    this.f341710c.clear();
                                }
                            }
                        } else {
                            iVar2 = iVar;
                        }
                    }
                } finally {
                }
            }
            if (iVar2 == null) {
                Class<?> cls = hVar.f341930b;
                Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
                if ((cls.getModifiers() & 1536) == 0) {
                    fVar.i("Cannot find a Value deserializer for type " + hVar);
                    throw null;
                }
                fVar.i("Cannot find a Value deserializer for abstract type " + hVar);
                throw null;
            }
        }
        return iVar2;
    }

    public Object writeReplace() {
        this.f341710c.clear();
        return this;
    }
}
