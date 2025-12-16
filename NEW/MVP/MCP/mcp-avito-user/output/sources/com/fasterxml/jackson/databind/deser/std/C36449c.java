package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AtomicIntegerDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36449c extends G<AtomicInteger> {
    private static final long serialVersionUID = 1;

    public C36449c() {
        super(AtomicInteger.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.a0()) {
            return new AtomicInteger(jsonParser.z());
        }
        Integer numX = X(jsonParser, fVar, AtomicInteger.class);
        if (numX == null) {
            return null;
        }
        return new AtomicInteger(numX.intValue());
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342437g;
    }
}
