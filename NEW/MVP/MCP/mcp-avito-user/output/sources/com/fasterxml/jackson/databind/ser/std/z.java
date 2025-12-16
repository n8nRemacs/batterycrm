package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.impl.k;
import java.io.IOException;
import rX0.InterfaceC47610a;

/* compiled from: ObjectArraySerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class z extends AbstractC36475a<Object[]> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342419f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342420g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342421h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342422i;

    /* renamed from: j, reason: collision with root package name */
    public com.fasterxml.jackson.databind.ser.impl.k f342423j;

    public z(com.fasterxml.jackson.databind.h hVar, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<Object> lVar) {
        super(Object[].class);
        this.f342420g = hVar;
        this.f342419f = z12;
        this.f342421h = oVar;
        this.f342423j = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342422i = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r9, com.fasterxml.jackson.databind.c r10) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.jsontype.o r0 = r8.f342421h
            if (r0 == 0) goto La
            com.fasterxml.jackson.databind.jsontype.o r1 = r0.a(r10)
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            r1 = 0
            if (r10 == 0) goto L25
            com.fasterxml.jackson.databind.introspect.j r2 = r10.b()
            com.fasterxml.jackson.databind.z r3 = r9.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r3.d()
            if (r2 == 0) goto L25
            java.lang.Object r3 = r3.d(r2)
            if (r3 == 0) goto L25
            com.fasterxml.jackson.databind.l r2 = r9.H(r2, r3)
            goto L26
        L25:
            r2 = r1
        L26:
            java.lang.Class<T> r3 = r8.f342353b
            com.fasterxml.jackson.annotation.JsonFormat$b r3 = com.fasterxml.jackson.databind.ser.std.M.l(r9, r10, r3)
            if (r3 == 0) goto L34
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f340929d
            java.lang.Boolean r1 = r3.b(r1)
        L34:
            r7 = r1
            com.fasterxml.jackson.databind.l<java.lang.Object> r1 = r8.f342422i
            if (r2 != 0) goto L3a
            r2 = r1
        L3a:
            com.fasterxml.jackson.databind.l r2 = com.fasterxml.jackson.databind.ser.std.M.k(r9, r10, r2)
            if (r2 != 0) goto L54
            com.fasterxml.jackson.databind.h r3 = r8.f342420g
            if (r3 == 0) goto L54
            boolean r4 = r8.f342419f
            if (r4 == 0) goto L54
            boolean r4 = r3.F()
            if (r4 != 0) goto L54
            com.fasterxml.jackson.databind.l r9 = r9.p(r3, r10)
            r6 = r9
            goto L55
        L54:
            r6 = r2
        L55:
            com.fasterxml.jackson.databind.c r9 = r8.f342357d
            if (r9 != r10) goto L67
            if (r6 != r1) goto L67
            if (r0 != r5) goto L67
            java.lang.Boolean r9 = r8.f342358e
            boolean r9 = java.util.Objects.equals(r9, r7)
            if (r9 == 0) goto L67
            r9 = r8
            goto L6f
        L67:
            com.fasterxml.jackson.databind.ser.std.z r9 = new com.fasterxml.jackson.databind.ser.std.z
            r2 = r9
            r3 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L6f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.z.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.A r7) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Object[] r5 = (java.lang.Object[]) r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.z.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new z(this.f342420g, this.f342419f, oVar, this.f342422i);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final boolean q(Object obj) {
        return ((Object[]) obj).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
    public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
        return new z(this, cVar, this.f342421h, this.f342422i, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(Object[] objArr, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws IOException {
        Object obj;
        Object obj2;
        com.fasterxml.jackson.databind.ser.impl.k kVarC;
        com.fasterxml.jackson.databind.h hVar = this.f342420g;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342422i;
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342421h;
        int i12 = 0;
        if (lVar != null) {
            int length2 = objArr.length;
            Object obj3 = null;
            while (i12 < length2) {
                try {
                    obj3 = objArr[i12];
                    if (obj3 == null) {
                        a12.o(jsonGenerator);
                    } else if (oVar == null) {
                        lVar.f(obj3, jsonGenerator, a12);
                    } else {
                        lVar.g(obj3, jsonGenerator, a12, oVar);
                    }
                    i12++;
                } catch (Exception e12) {
                    M.n(a12, e12, obj3, i12);
                    throw null;
                }
            }
            return;
        }
        com.fasterxml.jackson.databind.c cVar = this.f342357d;
        if (oVar != null) {
            int length3 = objArr.length;
            try {
                com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342423j;
                obj2 = null;
                while (i12 < length3) {
                    try {
                        obj2 = objArr[i12];
                        if (obj2 == null) {
                            a12.o(jsonGenerator);
                        } else {
                            Class<?> cls = obj2.getClass();
                            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
                            if (lVarD == null && kVar != (kVarC = kVar.c(cls, (lVarD = a12.q(cls, cVar))))) {
                                this.f342423j = kVarC;
                            }
                            lVarD.g(obj2, jsonGenerator, a12, oVar);
                        }
                        i12++;
                    } catch (Exception e13) {
                        e = e13;
                        M.n(a12, e, obj2, i12);
                        throw null;
                    }
                }
            } catch (Exception e14) {
                e = e14;
                obj2 = null;
            }
        } else {
            try {
                com.fasterxml.jackson.databind.ser.impl.k kVar2 = this.f342423j;
                obj = null;
                while (i12 < length) {
                    try {
                        obj = objArr[i12];
                        if (obj == null) {
                            a12.o(jsonGenerator);
                        } else {
                            Class<?> cls2 = obj.getClass();
                            com.fasterxml.jackson.databind.l<Object> lVarD2 = kVar2.d(cls2);
                            if (lVarD2 == null) {
                                if (hVar.v()) {
                                    k.d dVarB = kVar2.b(a12.n(hVar, cls2), a12, cVar);
                                    com.fasterxml.jackson.databind.ser.impl.k kVar3 = dVarB.f342296b;
                                    if (kVar2 != kVar3) {
                                        this.f342423j = kVar3;
                                    }
                                    lVarD2 = dVarB.f342295a;
                                } else {
                                    lVarD2 = a12.q(cls2, cVar);
                                    com.fasterxml.jackson.databind.ser.impl.k kVarC2 = kVar2.c(cls2, lVarD2);
                                    if (kVar2 != kVarC2) {
                                        this.f342423j = kVarC2;
                                    }
                                }
                            }
                            lVarD2.f(obj, jsonGenerator, a12);
                        }
                        i12++;
                    } catch (Exception e15) {
                        e = e15;
                        M.n(a12, e, obj, i12);
                        throw null;
                    }
                }
            } catch (Exception e16) {
                e = e16;
                obj = null;
            }
        }
    }

    public z(z zVar, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, Boolean bool) {
        super(zVar, cVar, bool);
        this.f342420g = zVar.f342420g;
        this.f342421h = oVar;
        this.f342419f = zVar.f342419f;
        this.f342423j = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342422i = lVar;
    }
}
