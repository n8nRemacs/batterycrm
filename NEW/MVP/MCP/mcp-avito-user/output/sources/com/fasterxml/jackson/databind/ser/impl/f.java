package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.std.F;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import rX0.InterfaceC47610a;

/* compiled from: IndexedStringListSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public final class f extends F<List<String>> {

    /* renamed from: e, reason: collision with root package name */
    public static final f f342271e = new f();
    private static final long serialVersionUID = 1;

    public f() {
        super(List.class);
    }

    public static void r(List list, JsonGenerator jsonGenerator, A a12, int i12) throws IOException {
        for (int i13 = 0; i13 < i12; i13++) {
            try {
                String str = (String) list.get(i13);
                if (str == null) {
                    a12.o(jsonGenerator);
                } else {
                    jsonGenerator.i0(str);
                }
            } catch (Exception e12) {
                M.n(a12, e12, list, i13);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r6, com.fasterxml.jackson.core.JsonGenerator r7, com.fasterxml.jackson.databind.A r8) throws java.io.IOException {
        /*
            r5 = this;
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L1f
            java.lang.Boolean r2 = r5.f342343d
            if (r2 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r3 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.z r4 = r8.f341330b
            boolean r3 = r4.p(r3)
            if (r3 != 0) goto L1b
        L17:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r2 != r3) goto L1f
        L1b:
            r(r6, r7, r8, r1)
            goto L28
        L1f:
            r7.b0(r0, r6)
            r(r6, r7, r8, r0)
            r7.A()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.f.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.F, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        List list = (List) obj;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, list));
        jsonGenerator.j(list);
        r(list, jsonGenerator, a12, list.size());
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.F
    public final com.fasterxml.jackson.databind.l<?> p(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
        return new f(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.F
    /* renamed from: q */
    public final void g(Collection collection, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        List list = (List) collection;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, list));
        jsonGenerator.j(list);
        r(list, jsonGenerator, a12, list.size());
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
