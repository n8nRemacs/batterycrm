package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;

/* compiled from: ToStringSerializerBase.java */
/* loaded from: classes4.dex */
public abstract class S extends M<Object> {
    public S() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return p(obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.l
    public void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0(p(obj));
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_STRING, obj));
        f(obj, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    public abstract String p(Object obj);
}
