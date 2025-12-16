package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.P;

/* compiled from: UnknownSerializer.java */
/* loaded from: classes4.dex */
public class s extends P {
    public s() {
        super(Object.class, 0);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        if (a12.f341330b.p(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            p(a12, obj);
            throw null;
        }
        super.f(obj, jsonGenerator, a12);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        if (a12.f341330b.p(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            p(a12, obj);
            throw null;
        }
        super.g(obj, jsonGenerator, a12, oVar);
    }

    public final void p(A a12, Object obj) {
        a12.h(this.f342353b, AK.c.k("No serializer found for class ", obj.getClass().getName(), " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)"));
        throw null;
    }
}
