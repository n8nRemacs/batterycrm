package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.k;

/* compiled from: AsArraySerializerBase.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36476b<T> extends com.fasterxml.jackson.databind.ser.i<T> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342359d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342360e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342361f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f342362g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342363h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342364i;

    /* renamed from: j, reason: collision with root package name */
    public com.fasterxml.jackson.databind.ser.impl.k f342365j;

    public AbstractC36476b() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC36476b(Class<?> cls, com.fasterxml.jackson.databind.h hVar, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<Object> lVar) {
        super(cls, 0);
        boolean z13 = false;
        this.f342359d = hVar;
        if (z12 || (hVar != null && hVar.E())) {
            z13 = true;
        }
        this.f342361f = z13;
        this.f342363h = oVar;
        this.f342360e = null;
        this.f342364i = lVar;
        this.f342365j = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342362g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r8, com.fasterxml.jackson.databind.c r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.jsontype.o r0 = r7.f342363h
            if (r0 == 0) goto L9
            com.fasterxml.jackson.databind.jsontype.o r1 = r0.a(r9)
            goto La
        L9:
            r1 = r0
        La:
            r2 = 0
            if (r9 == 0) goto L24
            com.fasterxml.jackson.databind.z r3 = r8.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r3.d()
            com.fasterxml.jackson.databind.introspect.j r4 = r9.b()
            if (r4 == 0) goto L24
            java.lang.Object r3 = r3.d(r4)
            if (r3 == 0) goto L24
            com.fasterxml.jackson.databind.l r3 = r8.H(r4, r3)
            goto L25
        L24:
            r3 = r2
        L25:
            java.lang.Class<T> r4 = r7.f342353b
            com.fasterxml.jackson.annotation.JsonFormat$b r4 = com.fasterxml.jackson.databind.ser.std.M.l(r8, r9, r4)
            if (r4 == 0) goto L33
            com.fasterxml.jackson.annotation.JsonFormat$Feature r2 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f340929d
            java.lang.Boolean r2 = r4.b(r2)
        L33:
            com.fasterxml.jackson.databind.l<java.lang.Object> r4 = r7.f342364i
            if (r3 != 0) goto L38
            r3 = r4
        L38:
            com.fasterxml.jackson.databind.l r3 = com.fasterxml.jackson.databind.ser.std.M.k(r8, r9, r3)
            if (r3 != 0) goto L50
            com.fasterxml.jackson.databind.h r5 = r7.f342359d
            if (r5 == 0) goto L50
            boolean r6 = r7.f342361f
            if (r6 == 0) goto L50
            boolean r6 = r5.F()
            if (r6 != 0) goto L50
            com.fasterxml.jackson.databind.l r3 = r8.p(r5, r9)
        L50:
            if (r3 != r4) goto L62
            com.fasterxml.jackson.databind.c r8 = r7.f342360e
            if (r9 != r8) goto L62
            if (r0 != r1) goto L62
            java.lang.Boolean r8 = r7.f342362g
            boolean r8 = java.util.Objects.equals(r8, r2)
            if (r8 != 0) goto L61
            goto L62
        L61:
            return r7
        L62:
            com.fasterxml.jackson.databind.ser.std.b r8 = r7.t(r9, r1, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AbstractC36476b.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public void f(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        if (a12.f341330b.p(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && q(t12)) {
            s(t12, jsonGenerator, a12);
            return;
        }
        jsonGenerator.c0(t12);
        s(t12, jsonGenerator, a12);
        jsonGenerator.A();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, t12));
        jsonGenerator.j(t12);
        s(t12, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    public final com.fasterxml.jackson.databind.l<Object> r(com.fasterxml.jackson.databind.ser.impl.k kVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.A a12) {
        k.d dVarB = kVar.b(hVar, a12, this.f342360e);
        com.fasterxml.jackson.databind.ser.impl.k kVar2 = dVarB.f342296b;
        if (kVar != kVar2) {
            this.f342365j = kVar2;
        }
        return dVarB.f342295a;
    }

    public abstract void s(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12);

    public abstract AbstractC36476b<T> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, Boolean bool);

    public AbstractC36476b(AbstractC36476b<?> abstractC36476b, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, Boolean bool) {
        super(abstractC36476b.f342353b, 0);
        this.f342359d = abstractC36476b.f342359d;
        this.f342361f = abstractC36476b.f342361f;
        this.f342363h = oVar;
        this.f342360e = cVar;
        this.f342364i = lVar;
        this.f342365j = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342362g = bool;
    }
}
