package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: EnumSetSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36488n extends AbstractC36476b<EnumSet<? extends Enum<?>>> {
    public C36488n() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return ((EnumSet) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b, com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.A r7) {
        /*
            r4 = this;
            java.util.EnumSet r5 = (java.util.EnumSet) r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C36488n.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        return ((EnumSet) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    public final AbstractC36476b<EnumSet<? extends Enum<?>>> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, Boolean bool) {
        return new C36488n(this, cVar, oVar, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void s(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Iterator<? extends Enum<?>> it = enumSet.iterator();
        com.fasterxml.jackson.databind.l<Object> lVarQ = this.f342364i;
        while (it.hasNext()) {
            Enum<?> next = it.next();
            if (lVarQ == null) {
                lVarQ = a12.q(next.getDeclaringClass(), this.f342360e);
            }
            lVarQ.f(next, jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return this;
    }
}
