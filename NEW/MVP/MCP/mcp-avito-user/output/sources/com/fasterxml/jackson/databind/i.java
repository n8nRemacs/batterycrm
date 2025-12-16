package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.Collection;

/* compiled from: JsonDeserializer.java */
/* loaded from: classes4.dex */
public abstract class i<T> implements com.fasterxml.jackson.databind.deser.s {

    /* compiled from: JsonDeserializer.java */
    public static abstract class a extends i<Object> {
    }

    @Override // com.fasterxml.jackson.databind.deser.s
    public Object b(f fVar) {
        return d(fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.s
    public T d(f fVar) {
        return null;
    }

    public abstract T e(JsonParser jsonParser, f fVar);

    public T f(JsonParser jsonParser, f fVar, T t12) throws InvalidDefinitionException {
        fVar.w(this);
        return e(jsonParser, fVar);
    }

    public Object g(JsonParser jsonParser, f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.b(jsonParser, fVar);
    }

    public final Object h(JsonParser jsonParser, f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) throws InvalidDefinitionException {
        fVar.w(this);
        return g(jsonParser, fVar, lVar);
    }

    public com.fasterxml.jackson.databind.deser.v i(String str) {
        StringBuilder sbA = androidx.appcompat.app.r.A("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        sbA.append(getClass().getName());
        sbA.append(" does not support them");
        throw new IllegalArgumentException(sbA.toString());
    }

    public AccessPattern k() {
        return AccessPattern.f342526d;
    }

    public Object l(f fVar) {
        return d(fVar);
    }

    public Collection<Object> m() {
        return null;
    }

    public com.fasterxml.jackson.databind.deser.impl.s n() {
        return null;
    }

    public Class<?> o() {
        return null;
    }

    public boolean p() {
        return this instanceof com.fasterxml.jackson.databind.deser.a;
    }

    public LogicalType q() {
        return null;
    }

    public Boolean r(e eVar) {
        return null;
    }

    public i<T> s(com.fasterxml.jackson.databind.util.t tVar) {
        return this;
    }
}
