package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: JSONPObject.java */
/* loaded from: classes4.dex */
public class o implements com.fasterxml.jackson.databind.k {
    @Override // com.fasterxml.jackson.databind.k
    public final void a(JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        d(jsonGenerator, a12);
    }

    @Override // com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.X(null);
        jsonGenerator.U('(');
        a12.o(jsonGenerator);
        jsonGenerator.U(')');
    }
}
