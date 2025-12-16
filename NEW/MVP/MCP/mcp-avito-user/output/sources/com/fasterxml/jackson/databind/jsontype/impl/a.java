package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.C;
import java.io.Serializable;

/* compiled from: AsArrayTypeDeserializer.java */
/* loaded from: classes4.dex */
public class a extends q implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public Object b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object c(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public Object d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return p(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public com.fasterxml.jackson.databind.jsontype.l f(com.fasterxml.jackson.databind.c cVar) {
        return cVar == this.f342165d ? this : new a(this, cVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public JsonTypeInfo.As k() {
        return JsonTypeInfo.As.f340969d;
    }

    public final Object p(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException, JsonGenerationException {
        String strL;
        Object objQ;
        if (jsonParser.b() && (objQ = jsonParser.Q()) != null) {
            return m(jsonParser, fVar, objQ);
        }
        boolean zB02 = jsonParser.b0();
        boolean zB03 = jsonParser.b0();
        com.fasterxml.jackson.databind.h hVar = this.f342164c;
        if (zB03) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            if (jsonTokenG0 != jsonToken) {
                fVar.X(jsonToken, "need JSON String that contains type id (for subtype of %s)", hVar.f341930b.getName());
                throw null;
            }
            strL = jsonParser.L();
            jsonParser.g0();
        } else {
            if (this.f342166e == null) {
                fVar.X(JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class ".concat(hVar.f341930b.getName()), new Object[0]);
                throw null;
            }
            strL = this.f342163b.b();
        }
        com.fasterxml.jackson.databind.i<Object> iVarO = o(fVar, strL);
        if (this.f342168g && !(this instanceof e) && jsonParser.Y(JsonToken.START_OBJECT)) {
            C cK2 = fVar.k(jsonParser);
            cK2.e0();
            cK2.G(this.f342167f);
            cK2.i0(strL);
            jsonParser.c();
            jsonParser = com.fasterxml.jackson.core.util.l.n0(cK2.w0(jsonParser), jsonParser);
            jsonParser.g0();
        }
        if (zB02 && jsonParser.f() == JsonToken.END_ARRAY) {
            return iVarO.d(fVar);
        }
        Object objE = iVarO.e(jsonParser, fVar);
        if (zB02) {
            JsonToken jsonTokenG02 = jsonParser.g0();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (jsonTokenG02 != jsonToken2) {
                fVar.X(jsonToken2, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
                throw null;
            }
        }
        return objE;
    }
}
