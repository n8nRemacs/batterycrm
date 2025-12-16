package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Map;
import uX0.InterfaceC48995d;
import vX0.InterfaceC49281c;

/* compiled from: StdSerializer.java */
/* loaded from: classes4.dex */
public abstract class M<T> extends com.fasterxml.jackson.databind.l<T> implements InterfaceC48995d, InterfaceC49281c, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f342352c = new Object();
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f342353b;

    public M(Class<T> cls) {
        this.f342353b = cls;
    }

    public static com.fasterxml.jackson.databind.l k(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.l lVar) {
        Map map;
        com.fasterxml.jackson.databind.l h12;
        AbstractC36471j abstractC36471jB;
        Object objT;
        com.fasterxml.jackson.databind.l lVarB;
        Map map2 = (Map) a12.f341333e.a(f342352c);
        if (map2 != null) {
            Object obj = map2.get(cVar);
            map = map2;
            if (obj != null) {
                return lVar;
            }
        } else {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            a12.f341333e = a12.f341333e.b(identityHashMap);
            map = identityHashMap;
        }
        map.put(cVar, Boolean.TRUE);
        try {
            AnnotationIntrospector annotationIntrospectorD = a12.f341330b.d();
            if (!((annotationIntrospectorD == null || cVar == null) ? false : true) || (abstractC36471jB = cVar.b()) == null || (objT = annotationIntrospectorD.T(abstractC36471jB)) == null) {
                h12 = lVar;
            } else {
                cVar.b();
                com.fasterxml.jackson.databind.util.i iVarC = a12.c(objT);
                com.fasterxml.jackson.databind.h hVarB = iVarC.b(a12.e());
                if (lVar != null || hVarB.F()) {
                    lVarB = lVar;
                } else {
                    lVarB = a12.f341337i.b(hVarB);
                    if (lVarB == null && (lVarB = a12.f341332d.a(hVarB)) == null && (lVarB = a12.k(hVarB)) == null) {
                        lVarB = a12.z(hVarB.f341930b);
                    }
                }
                h12 = new H(iVarC, hVarB, lVarB);
            }
            return h12 != null ? a12.B(h12, cVar) : lVar;
        } finally {
            map.remove(cVar);
        }
    }

    public static JsonFormat.b l(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar, Class cls) {
        return cVar != null ? cVar.d(a12.f341330b, cls) : a12.f341330b.f(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(com.fasterxml.jackson.databind.A r1, java.lang.Exception r2, java.lang.Object r3, int r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            com.fasterxml.jackson.databind.util.g.D(r2)
            if (r1 == 0) goto L21
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS
            com.fasterxml.jackson.databind.z r1 = r1.f341330b
            boolean r1 = r1.p(r0)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2c
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L34
        L2c:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L2f:
            if (r1 != 0) goto L34
            com.fasterxml.jackson.databind.util.g.F(r2)
        L34:
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.i(r2, r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.M.n(com.fasterxml.jackson.databind.A, java.lang.Exception, java.lang.Object, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(com.fasterxml.jackson.databind.A r1, java.lang.Exception r2, java.lang.Object r3, java.lang.String r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            com.fasterxml.jackson.databind.util.g.D(r2)
            if (r1 == 0) goto L21
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS
            com.fasterxml.jackson.databind.z r1 = r1.f341330b
            boolean r1 = r1.p(r0)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2c
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L34
        L2c:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L2f:
            if (r1 != 0) goto L34
            com.fasterxml.jackson.databind.util.g.F(r2)
        L34:
            int r1 = com.fasterxml.jackson.databind.JsonMappingException.f341373e
            com.fasterxml.jackson.databind.JsonMappingException$a r1 = new com.fasterxml.jackson.databind.JsonMappingException$a
            r1.<init>(r3, r4)
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.h(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.M.o(com.fasterxml.jackson.databind.A, java.lang.Exception, java.lang.Object, java.lang.String):void");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final Class<T> c() {
        return this.f342353b;
    }

    public final com.fasterxml.jackson.databind.ser.n m(com.fasterxml.jackson.databind.A a12, Object obj, Object obj2) {
        a12.f341330b.getClass();
        a12.h(this.f342353b, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        throw null;
    }

    public M(com.fasterxml.jackson.databind.h hVar) {
        this.f342353b = (Class<T>) hVar.f341930b;
    }

    public M(Class cls, int i12) {
        this.f342353b = cls;
    }

    public M(M<?> m12) {
        this.f342353b = (Class<T>) m12.f342353b;
    }
}
