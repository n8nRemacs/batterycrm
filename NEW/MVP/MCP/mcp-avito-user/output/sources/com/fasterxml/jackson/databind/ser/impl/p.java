package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.std.AbstractC36475a;
import rX0.InterfaceC47610a;

/* compiled from: StringArraySerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class p extends AbstractC36475a<String[]> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: g, reason: collision with root package name */
    public static final p f342310g;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342311f;

    static {
        com.fasterxml.jackson.databind.type.n.f342486e.getClass();
        com.fasterxml.jackson.databind.type.n.o(String.class);
        f342310g = new p();
    }

    public p() {
        super(String[].class);
        this.f342311f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r5, com.fasterxml.jackson.databind.c r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L1a
            com.fasterxml.jackson.databind.z r1 = r5.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r1.d()
            com.fasterxml.jackson.databind.introspect.j r2 = r6.b()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L1a
            com.fasterxml.jackson.databind.l r1 = r5.H(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            com.fasterxml.jackson.annotation.JsonFormat$Feature r2 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f340929d
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            com.fasterxml.jackson.annotation.JsonFormat$b r3 = com.fasterxml.jackson.databind.ser.std.M.l(r5, r6, r3)
            if (r3 == 0) goto L2a
            java.lang.Boolean r2 = r3.b(r2)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            com.fasterxml.jackson.databind.l<java.lang.Object> r3 = r4.f342311f
            if (r1 != 0) goto L30
            r1 = r3
        L30:
            com.fasterxml.jackson.databind.l r1 = com.fasterxml.jackson.databind.ser.std.M.k(r5, r6, r1)
            if (r1 != 0) goto L3c
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.fasterxml.jackson.databind.l r1 = r5.q(r1, r6)
        L3c:
            boolean r5 = com.fasterxml.jackson.databind.util.g.x(r1)
            if (r5 == 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != r3) goto L4f
            java.lang.Boolean r5 = r4.f342358e
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L4f
            return r4
        L4f:
            com.fasterxml.jackson.databind.ser.impl.p r5 = new com.fasterxml.jackson.databind.ser.impl.p
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.p.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(A a12, Object obj) {
        return ((String[]) obj).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.A r7) {
        /*
            r4 = this;
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r1 = r4.f342358e
            if (r1 != 0) goto L14
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.z r3 = r7.f341330b
            boolean r2 = r3.p(r2)
            if (r2 != 0) goto L18
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1c
        L18:
            r4.t(r5, r6, r7)
            goto L25
        L1c:
            r6.b0(r0, r5)
            r4.t(r5, r6, r7)
            r6.A()
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.p.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        return ((String[]) obj).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
    public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
        return new p(this, cVar, this.f342311f, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(String[] strArr, JsonGenerator jsonGenerator, A a12) {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i12 = 0;
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342311f;
        if (lVar == null) {
            while (i12 < length) {
                String str = strArr[i12];
                if (str == null) {
                    jsonGenerator.H();
                } else {
                    jsonGenerator.i0(str);
                }
                i12++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i12 < length2) {
            String str2 = strArr[i12];
            if (str2 == null) {
                a12.o(jsonGenerator);
            } else {
                lVar.f(str2, jsonGenerator, a12);
            }
            i12++;
        }
    }

    public p(p pVar, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.l<?> lVar, Boolean bool) {
        super(pVar, cVar, bool);
        this.f342311f = lVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return this;
    }
}
