package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Iterator;
import rX0.InterfaceC47610a;

/* compiled from: IterableSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class r extends AbstractC36476b<Iterable<?>> {
    public r() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b, com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r4, com.fasterxml.jackson.core.JsonGenerator r5, com.fasterxml.jackson.databind.A r6) {
        /*
            r3 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Boolean r0 = r3.f342362g
            if (r0 != 0) goto L10
            com.fasterxml.jackson.databind.SerializationFeature r1 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.z r2 = r6.f341330b
            boolean r1 = r2.p(r1)
            if (r1 != 0) goto L14
        L10:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L2d
        L14:
            if (r4 == 0) goto L2d
            java.util.Iterator r0 = r4.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            r0.next()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2d
            r3.s(r4, r5, r6)
            goto L36
        L2d:
            r5.c0(r4)
            r3.s(r4, r5, r6)
            r5.A()
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.r.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new r(this, this.f342360e, oVar, this.f342364i, this.f342362g);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    public final AbstractC36476b<Iterable<?>> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, Boolean bool) {
        return new r(this, cVar, oVar, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void s(Iterable<?> iterable, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        com.fasterxml.jackson.databind.l<Object> lVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            Class<?> cls = null;
            com.fasterxml.jackson.databind.l<Object> lVarX = null;
            do {
                Object next = it.next();
                if (next == null) {
                    a12.o(jsonGenerator);
                } else {
                    com.fasterxml.jackson.databind.l<Object> lVar2 = this.f342364i;
                    if (lVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            lVarX = a12.x(cls2, this.f342360e);
                            cls = cls2;
                        }
                        lVar = lVarX;
                    } else {
                        lVar = lVarX;
                        lVarX = lVar2;
                    }
                    com.fasterxml.jackson.databind.jsontype.o oVar = this.f342363h;
                    if (oVar == null) {
                        lVarX.f(next, jsonGenerator, a12);
                    } else {
                        lVarX.g(next, jsonGenerator, a12, oVar);
                    }
                    lVarX = lVar;
                }
            } while (it.hasNext());
        }
    }
}
