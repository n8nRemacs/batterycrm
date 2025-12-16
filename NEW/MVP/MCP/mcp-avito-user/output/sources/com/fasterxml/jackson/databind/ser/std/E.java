package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.sql.Time;
import rX0.InterfaceC47610a;

/* compiled from: SqlTimeSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class E extends L<Time> {
    public E() {
        super(Time.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0(((Time) obj).toString());
    }
}
