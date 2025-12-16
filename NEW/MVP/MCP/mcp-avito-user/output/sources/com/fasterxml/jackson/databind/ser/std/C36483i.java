package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: ClassSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36483i extends L<Class<?>> {
    public C36483i() {
        super(Class.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0(((Class) obj).getName());
    }
}
