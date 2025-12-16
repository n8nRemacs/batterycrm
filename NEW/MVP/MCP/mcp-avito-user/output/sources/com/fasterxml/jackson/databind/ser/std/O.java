package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.util.TimeZone;

/* compiled from: TimeZoneSerializer.java */
/* loaded from: classes4.dex */
public class O extends L<TimeZone> {
    public O() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0(((TimeZone) obj).getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        TimeZone timeZone = (TimeZone) obj;
        WritableTypeId writableTypeIdD = oVar.d(JsonToken.VALUE_STRING, timeZone);
        writableTypeIdD.f341265b = TimeZone.class;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, writableTypeIdD);
        jsonGenerator.i0(timeZone.getID());
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
