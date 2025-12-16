package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import rX0.InterfaceC47610a;

/* compiled from: TokenBufferDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class M extends G<com.fasterxml.jackson.databind.util.C> {
    private static final long serialVersionUID = 1;

    public M() {
        super(com.fasterxml.jackson.databind.util.C.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException, JsonGenerationException {
        JsonToken jsonTokenG0;
        com.fasterxml.jackson.databind.util.C cK2 = fVar.k(jsonParser);
        if (jsonParser.Y(JsonToken.FIELD_NAME)) {
            cK2.e0();
            do {
                cK2.y0(jsonParser);
                jsonTokenG0 = jsonParser.g0();
            } while (jsonTokenG0 == JsonToken.FIELD_NAME);
            JsonToken jsonToken = JsonToken.END_OBJECT;
            if (jsonTokenG0 != jsonToken) {
                throw com.fasterxml.jackson.databind.f.b0(fVar.f341924g, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenG0);
            }
            cK2.B();
        } else {
            cK2.y0(jsonParser);
        }
        return cK2;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342436f;
    }
}
