package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;

/* compiled from: RawSerializer.java */
/* loaded from: classes4.dex */
public class A<T> extends M<T> {
    public A() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.Z(t12.toString());
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_EMBEDDED_OBJECT, t12));
        f(t12, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
