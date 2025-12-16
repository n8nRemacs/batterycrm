package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* compiled from: NullifyingDeserializer.java */
/* loaded from: classes4.dex */
public class v extends C<Object> {

    /* renamed from: e, reason: collision with root package name */
    public static final v f341845e = new v();
    private static final long serialVersionUID = 1;

    public v() {
        super((Class<?>) Object.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        if (!jsonParser.Y(JsonToken.FIELD_NAME)) {
            jsonParser.l0();
            return null;
        }
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            if (jsonTokenG0 == null || jsonTokenG0 == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.l0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        int iG2 = jsonParser.g();
        if (iG2 == 1 || iG2 == 3 || iG2 == 5) {
            return lVar.b(jsonParser, fVar);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.FALSE;
    }
}
