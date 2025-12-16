package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import rX0.InterfaceC47610a;

/* compiled from: ToEmptyObjectSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class P extends M<Object> {
    public P() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.l
    public void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.g0(obj);
        jsonGenerator.B();
    }

    @Override // com.fasterxml.jackson.databind.l
    public void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        oVar.f(jsonGenerator, oVar.e(jsonGenerator, oVar.d(JsonToken.START_OBJECT, obj)));
    }
}
