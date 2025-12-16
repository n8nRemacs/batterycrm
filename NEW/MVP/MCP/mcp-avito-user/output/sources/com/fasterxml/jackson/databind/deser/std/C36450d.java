package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36450d extends G<AtomicLong> {
    private static final long serialVersionUID = 1;

    public C36450d() {
        super(AtomicLong.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.a0()) {
            return new AtomicLong(jsonParser.A());
        }
        if (Y(jsonParser, fVar, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342437g;
    }
}
