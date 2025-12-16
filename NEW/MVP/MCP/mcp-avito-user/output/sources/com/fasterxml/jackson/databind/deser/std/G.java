package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;

/* compiled from: StdScalarDeserializer.java */
/* loaded from: classes4.dex */
public abstract class G<T> extends C<T> {
    private static final long serialVersionUID = 1;

    public G() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public T f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, T t12) throws InvalidDefinitionException {
        fVar.w(this);
        return e(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.e(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342525c;
    }

    @Override // com.fasterxml.jackson.databind.i
    public LogicalType q() {
        return LogicalType.f342444n;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.FALSE;
    }
}
