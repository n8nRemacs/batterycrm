package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.x;

/* compiled from: JsonLocationInstantiator.java */
/* loaded from: classes4.dex */
public class r extends x.a {
    private static final long serialVersionUID = 1;

    public r() {
        super((Class<?>) com.fasterxml.jackson.core.e.class);
    }

    public static com.fasterxml.jackson.databind.deser.k I(String str, com.fasterxml.jackson.databind.h hVar, int i12) {
        return new com.fasterxml.jackson.databind.deser.k(com.fasterxml.jackson.databind.v.a(str), hVar, null, null, null, null, i12, null, com.fasterxml.jackson.databind.u.f342512i);
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.deser.v[] G(com.fasterxml.jackson.databind.e eVar) {
        com.fasterxml.jackson.databind.h hVarC = eVar.c(Integer.TYPE);
        com.fasterxml.jackson.databind.h hVarC2 = eVar.c(Long.TYPE);
        return new com.fasterxml.jackson.databind.deser.v[]{I("sourceRef", eVar.c(Object.class), 0), I("byteOffset", hVarC2, 1), I("charOffset", hVarC2, 2), I("lineNr", hVarC, 3), I("columnNr", hVarC, 4)};
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object v(com.fasterxml.jackson.databind.f fVar, Object[] objArr) {
        Object obj = objArr[0];
        com.fasterxml.jackson.core.io.d dVar = obj instanceof com.fasterxml.jackson.core.io.d ? (com.fasterxml.jackson.core.io.d) obj : new com.fasterxml.jackson.core.io.d(-1, obj, false);
        Object obj2 = objArr[1];
        long jLongValue = obj2 == null ? 0L : ((Number) obj2).longValue();
        Object obj3 = objArr[2];
        long jLongValue2 = obj3 == null ? 0L : ((Number) obj3).longValue();
        Object obj4 = objArr[3];
        int iIntValue = obj4 == null ? 0 : ((Number) obj4).intValue();
        Object obj5 = objArr[4];
        return new com.fasterxml.jackson.core.e(dVar, jLongValue, jLongValue2, iIntValue, obj5 != null ? ((Number) obj5).intValue() : 0);
    }
}
