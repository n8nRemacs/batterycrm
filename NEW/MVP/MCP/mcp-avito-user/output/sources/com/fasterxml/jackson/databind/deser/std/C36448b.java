package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AtomicBooleanDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36448b extends G<AtomicBoolean> {
    private static final long serialVersionUID = 1;

    public C36448b() {
        super(AtomicBoolean.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (jsonTokenF == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean boolO = O(jsonParser, fVar, AtomicBoolean.class);
        if (boolO == null) {
            return null;
        }
        return new AtomicBoolean(boolO.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return new AtomicBoolean(false);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342439i;
    }
}
