package com.fasterxml.jackson.databind.jsontype.impl;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.C;
import java.io.Serializable;

/* compiled from: AsWrapperTypeDeserializer.java */
/* loaded from: classes4.dex */
public class i extends q implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object c(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final com.fasterxml.jackson.databind.jsontype.l f(com.fasterxml.jackson.databind.c cVar) {
        return cVar == this.f342165d ? this : new i(this, cVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final JsonTypeInfo.As k() {
        return JsonTypeInfo.As.f340968c;
    }

    public final Object p(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException, JsonGenerationException {
        Object objQ;
        if (jsonParser.b() && (objQ = jsonParser.Q()) != null) {
            return m(jsonParser, fVar, objQ);
        }
        JsonToken jsonTokenF = jsonParser.f();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        com.fasterxml.jackson.databind.h hVar = this.f342164c;
        if (jsonTokenF == jsonToken) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenG0 != jsonToken2) {
                fVar.X(jsonToken2, C0.f(hVar.f341930b, new StringBuilder("need JSON String that contains type id (for subtype of "), ")"), new Object[0]);
                throw null;
            }
        } else if (jsonTokenF != JsonToken.FIELD_NAME) {
            fVar.X(jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class ".concat(hVar.f341930b.getName()), new Object[0]);
            throw null;
        }
        String strL = jsonParser.L();
        com.fasterxml.jackson.databind.i<Object> iVarO = o(fVar, strL);
        jsonParser.g0();
        if (this.f342168g && jsonParser.Y(jsonToken)) {
            C cK2 = fVar.k(jsonParser);
            cK2.e0();
            cK2.G(this.f342167f);
            cK2.i0(strL);
            jsonParser.c();
            jsonParser = com.fasterxml.jackson.core.util.l.n0(cK2.w0(jsonParser), jsonParser);
            jsonParser.g0();
        }
        Object objE = iVarO.e(jsonParser, fVar);
        JsonToken jsonTokenG02 = jsonParser.g0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenG02 == jsonToken3) {
            return objE;
        }
        fVar.X(jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        throw null;
    }
}
