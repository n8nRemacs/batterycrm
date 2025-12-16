package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: JsonSerializable.java */
/* loaded from: classes4.dex */
public interface k {

    /* compiled from: JsonSerializable.java */
    public static abstract class a implements k {
        public boolean isEmpty() {
            return false;
        }
    }

    void a(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar);

    void d(JsonGenerator jsonGenerator, A a12);
}
