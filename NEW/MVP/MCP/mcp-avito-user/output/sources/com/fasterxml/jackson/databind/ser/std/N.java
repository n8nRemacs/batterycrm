package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import rX0.InterfaceC47610a;

/* compiled from: StringSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public final class N extends L<Object> {
    private static final long serialVersionUID = 1;

    public N() {
        super(String.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0((String) obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        jsonGenerator.i0((String) obj);
    }
}
