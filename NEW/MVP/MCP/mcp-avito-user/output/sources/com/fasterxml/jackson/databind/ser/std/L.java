package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;

/* compiled from: StdScalarSerializer.java */
/* loaded from: classes4.dex */
public abstract class L<T> extends M<T> {
    public L() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_STRING, t12));
        f(t12, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
