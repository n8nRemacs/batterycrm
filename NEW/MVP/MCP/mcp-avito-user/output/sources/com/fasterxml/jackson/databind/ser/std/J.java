package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: StdKeySerializer.java */
@Deprecated
/* loaded from: classes4.dex */
public class J extends M<Object> {
    public J() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.G(obj.toString());
    }
}
