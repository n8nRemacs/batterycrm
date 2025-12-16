package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36484j extends AbstractC36476b<Collection<?>> {
    private static final long serialVersionUID = 1;

    public C36484j() {
        throw null;
    }

    public C36484j(com.fasterxml.jackson.databind.h hVar, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<Object> lVar) {
        super((Class<?>) Collection.class, hVar, z12, oVar, lVar);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return ((Collection) obj).isEmpty();
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
            java.util.Collection r5 = (java.util.Collection) r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C36484j.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new C36484j(this, this.f342360e, oVar, this.f342364i, this.f342362g);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        return ((Collection) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    public final AbstractC36476b<Collection<?>> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, Boolean bool) {
        return new C36484j(this, cVar, oVar, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void s(Collection<?> collection, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws IOException {
        com.fasterxml.jackson.databind.h hVar = this.f342359d;
        jsonGenerator.j(collection);
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342363h;
        int i12 = 0;
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342364i;
        if (lVar != null) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            a12.o(jsonGenerator);
                        } catch (Exception e12) {
                            M.n(a12, e12, collection, i12);
                            throw null;
                        }
                    } else if (oVar == null) {
                        lVar.f(next, jsonGenerator, a12);
                    } else {
                        lVar.g(next, jsonGenerator, a12, oVar);
                    }
                    i12++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator<?> it2 = collection.iterator();
        if (it2.hasNext()) {
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342365j;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        a12.o(jsonGenerator);
                    } else {
                        Class<?> cls = next2.getClass();
                        com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
                        if (lVarD == null) {
                            if (hVar.v()) {
                                lVarD = r(kVar, a12.n(hVar, cls), a12);
                            } else {
                                lVarD = a12.q(cls, this.f342360e);
                                com.fasterxml.jackson.databind.ser.impl.k kVarC = kVar.c(cls, lVarD);
                                if (kVar != kVarC) {
                                    this.f342365j = kVarC;
                                }
                            }
                            kVar = this.f342365j;
                        }
                        if (oVar == null) {
                            lVarD.f(next2, jsonGenerator, a12);
                        } else {
                            lVarD.g(next2, jsonGenerator, a12, oVar);
                        }
                    }
                    i12++;
                } catch (Exception e13) {
                    M.n(a12, e13, collection, i12);
                    throw null;
                }
            } while (it2.hasNext());
        }
    }
}
