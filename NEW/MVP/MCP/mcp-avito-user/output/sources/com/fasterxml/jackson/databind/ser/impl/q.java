package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.std.F;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import rX0.InterfaceC47610a;

/* compiled from: StringCollectionSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class q extends F<Collection<String>> {

    /* renamed from: e, reason: collision with root package name */
    public static final q f342312e = new q();

    public q() {
        super(Collection.class);
    }

    public static void r(Collection collection, JsonGenerator jsonGenerator, A a12) throws IOException {
        int i12 = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    a12.o(jsonGenerator);
                } else {
                    jsonGenerator.i0(str);
                }
                i12++;
            }
        } catch (Exception e12) {
            M.n(a12, e12, collection, i12);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.l
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
            java.lang.Boolean r1 = r4.f342343d
            if (r1 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.z r3 = r7.f341330b
            boolean r2 = r3.p(r2)
            if (r2 != 0) goto L1b
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1f
        L1b:
            r(r5, r6, r7)
            goto L28
        L1f:
            r6.b0(r0, r5)
            r(r5, r6, r7)
            r6.A()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.q.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.F
    public final com.fasterxml.jackson.databind.l<?> p(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
        return new q(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.F, com.fasterxml.jackson.databind.l
    /* renamed from: q */
    public final void g(Collection<String> collection, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, collection));
        jsonGenerator.j(collection);
        r(collection, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
