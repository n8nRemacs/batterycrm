package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.ser.std.H;
import com.fasterxml.jackson.databind.util.C36497c;
import com.fasterxml.jackson.databind.z;
import java.io.Serializable;

/* compiled from: BeanSerializerFactory.java */
/* loaded from: classes4.dex */
public class g extends b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final g f342263e = new g();
    private static final long serialVersionUID = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.ser.d g(com.fasterxml.jackson.databind.A r19, com.fasterxml.jackson.databind.introspect.u r20, com.fasterxml.jackson.databind.ser.m r21, boolean r22, com.fasterxml.jackson.databind.introspect.AbstractC36471j r23) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.g.g(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.introspect.u, com.fasterxml.jackson.databind.ser.m, boolean, com.fasterxml.jackson.databind.introspect.j):com.fasterxml.jackson.databind.ser.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> h(com.fasterxml.jackson.databind.A r39, com.fasterxml.jackson.databind.h r40, com.fasterxml.jackson.databind.b r41, boolean r42) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 2920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.g.h(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.h, com.fasterxml.jackson.databind.b, boolean):com.fasterxml.jackson.databind.l");
    }

    public final com.fasterxml.jackson.databind.l<Object> i(A a12, com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.h hVarV0;
        z zVar = a12.f341330b;
        zVar.f341506c.f341475c.getClass();
        com.fasterxml.jackson.databind.introspect.s sVarB = com.fasterxml.jackson.databind.introspect.t.b(zVar, hVar);
        if (sVarB == null && (sVarB = com.fasterxml.jackson.databind.introspect.t.a(zVar, hVar)) == null) {
            sVarB = new com.fasterxml.jackson.databind.introspect.s(com.fasterxml.jackson.databind.introspect.t.d(zVar, hVar, zVar, true));
        }
        C36465d c36465d = sVarB.f342086e;
        com.fasterxml.jackson.databind.l<?> lVarE = b.e(a12, c36465d);
        if (lVarE != null) {
            return lVarE;
        }
        AnnotationIntrospector annotationIntrospectorD = zVar.d();
        boolean z12 = false;
        if (annotationIntrospectorD == null) {
            hVarV0 = hVar;
        } else {
            try {
                hVarV0 = annotationIntrospectorD.v0(zVar, c36465d, hVar);
            } catch (JsonMappingException e12) {
                a12.G(sVarB, e12.getMessage(), new Object[0]);
                throw null;
            }
        }
        com.fasterxml.jackson.databind.cfg.a aVar = zVar.f341506c;
        if (hVarV0 != hVar) {
            if (!hVarV0.x(hVar.f341930b)) {
                aVar.f341475c.getClass();
                com.fasterxml.jackson.databind.introspect.s sVarB2 = com.fasterxml.jackson.databind.introspect.t.b(zVar, hVarV0);
                sVarB = (sVarB2 == null && (sVarB2 = com.fasterxml.jackson.databind.introspect.t.a(zVar, hVarV0)) == null) ? new com.fasterxml.jackson.databind.introspect.s(com.fasterxml.jackson.databind.introspect.t.d(zVar, hVarV0, zVar, true)) : sVarB2;
            }
            z12 = true;
        }
        AnnotationIntrospector annotationIntrospector = sVarB.f342085d;
        com.fasterxml.jackson.databind.util.i<Object, Object> iVarT = annotationIntrospector != null ? sVarB.t(annotationIntrospector.U(sVarB.f342086e)) : null;
        if (iVarT == null) {
            return h(a12, hVarV0, sVarB, z12);
        }
        com.fasterxml.jackson.databind.h hVarB = iVarT.b(a12.e());
        if (!hVarB.x(hVarV0.f341930b)) {
            aVar.f341475c.getClass();
            sVarB = com.fasterxml.jackson.databind.introspect.t.b(zVar, hVarB);
            if (sVarB == null && (sVarB = com.fasterxml.jackson.databind.introspect.t.a(zVar, hVarB)) == null) {
                sVarB = new com.fasterxml.jackson.databind.introspect.s(com.fasterxml.jackson.databind.introspect.t.d(zVar, hVarB, zVar, true));
            }
            lVarE = b.e(a12, sVarB.f342086e);
        }
        if (lVarE == null && !hVarB.F()) {
            lVarE = h(a12, hVarB, sVarB, true);
        }
        return new H(iVarT, hVarB, lVarE);
    }

    public final C36497c k() {
        return new C36497c(this.f342234b.f341517b);
    }
}
