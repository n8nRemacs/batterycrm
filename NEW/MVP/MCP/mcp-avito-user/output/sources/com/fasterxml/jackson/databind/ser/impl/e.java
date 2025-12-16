package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.std.AbstractC36476b;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.util.List;
import rX0.InterfaceC47610a;

/* compiled from: IndexedListSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public final class e extends AbstractC36476b<List<?>> {
    private static final long serialVersionUID = 1;

    public e() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(A a12, Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b, com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.A r7) throws java.io.IOException {
        /*
            r4 = this;
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L1f
            java.lang.Boolean r1 = r4.f342362g
            if (r1 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.z r3 = r7.f341330b
            boolean r2 = r3.p(r2)
            if (r2 != 0) goto L1b
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1f
        L1b:
            r4.s(r5, r6, r7)
            goto L28
        L1f:
            r6.b0(r0, r5)
            r4.s(r5, r6, r7)
            r6.A()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.e.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new e(this, this.f342360e, oVar, this.f342364i, this.f342362g);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        return ((List) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    public final AbstractC36476b<List<?>> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, Boolean bool) {
        return new e(this, cVar, oVar, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void s(List<?> list, JsonGenerator jsonGenerator, A a12) throws IOException {
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342363h;
        int i12 = 0;
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342364i;
        if (lVar != null) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj == null) {
                    try {
                        a12.o(jsonGenerator);
                    } catch (Exception e12) {
                        M.n(a12, e12, list, i12);
                        throw null;
                    }
                } else if (oVar == null) {
                    lVar.f(obj, jsonGenerator, a12);
                } else {
                    lVar.g(obj, jsonGenerator, a12, oVar);
                }
                i12++;
            }
            return;
        }
        com.fasterxml.jackson.databind.c cVar = this.f342360e;
        com.fasterxml.jackson.databind.h hVar = this.f342359d;
        if (oVar != null) {
            int size2 = list.size();
            if (size2 == 0) {
                return;
            }
            try {
                k kVar = this.f342365j;
                while (i12 < size2) {
                    Object obj2 = list.get(i12);
                    if (obj2 == null) {
                        a12.o(jsonGenerator);
                    } else {
                        Class<?> cls = obj2.getClass();
                        com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
                        if (lVarD == null) {
                            if (hVar.v()) {
                                lVarD = r(kVar, a12.n(hVar, cls), a12);
                            } else {
                                lVarD = a12.q(cls, cVar);
                                k kVarC = kVar.c(cls, lVarD);
                                if (kVar != kVarC) {
                                    this.f342365j = kVarC;
                                }
                            }
                            kVar = this.f342365j;
                        }
                        lVarD.g(obj2, jsonGenerator, a12, oVar);
                    }
                    i12++;
                }
                return;
            } catch (Exception e13) {
                M.n(a12, e13, list, i12);
                throw null;
            }
        }
        int size3 = list.size();
        if (size3 == 0) {
            return;
        }
        try {
            k kVar2 = this.f342365j;
            while (i12 < size3) {
                Object obj3 = list.get(i12);
                if (obj3 == null) {
                    a12.o(jsonGenerator);
                } else {
                    Class<?> cls2 = obj3.getClass();
                    com.fasterxml.jackson.databind.l<Object> lVarD2 = kVar2.d(cls2);
                    if (lVarD2 == null) {
                        if (hVar.v()) {
                            lVarD2 = r(kVar2, a12.n(hVar, cls2), a12);
                        } else {
                            lVarD2 = a12.q(cls2, cVar);
                            k kVarC2 = kVar2.c(cls2, lVarD2);
                            if (kVar2 != kVarC2) {
                                this.f342365j = kVarC2;
                            }
                        }
                        kVar2 = this.f342365j;
                    }
                    lVarD2.f(obj3, jsonGenerator, a12);
                }
                i12++;
            }
        } catch (Exception e14) {
            M.n(a12, e14, list, i12);
            throw null;
        }
    }
}
