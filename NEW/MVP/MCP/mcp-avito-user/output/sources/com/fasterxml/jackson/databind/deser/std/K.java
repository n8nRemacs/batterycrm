package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import rX0.InterfaceC47610a;

/* compiled from: StringDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class K extends G<String> {

    /* renamed from: e, reason: collision with root package name */
    public static final K f341760e = new K();
    private static final long serialVersionUID = 1;

    public K() {
        super(String.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return e(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342441k;
    }

    @Override // com.fasterxml.jackson.databind.i
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final String e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        String strV;
        if (jsonParser.Y(JsonToken.VALUE_STRING)) {
            return jsonParser.L();
        }
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.START_ARRAY) {
            return E(jsonParser, fVar);
        }
        if (jsonTokenF == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object objX = jsonParser.x();
            if (objX == null) {
                return null;
            }
            return objX instanceof byte[] ? fVar.f341921d.f341506c.f341481i.e((byte[]) objX) : objX.toString();
        }
        JsonToken jsonToken = JsonToken.START_OBJECT;
        Class<?> cls = this.f341716b;
        if (jsonTokenF == jsonToken) {
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (jsonTokenF.f341103i && (strV = jsonParser.V()) != null) {
            return strV;
        }
        fVar.E(cls, jsonParser);
        throw null;
    }
}
