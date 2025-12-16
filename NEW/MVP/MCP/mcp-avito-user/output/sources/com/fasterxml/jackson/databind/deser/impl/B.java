package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.Collection;

/* compiled from: TypeWrappedDeserializer.java */
/* loaded from: classes4.dex */
public final class B extends com.fasterxml.jackson.databind.i<Object> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341591b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341592c;

    public B(com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.i<?> iVar) {
        this.f341591b = lVar;
        this.f341592c = iVar;
    }

    @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) {
        return this.f341592c.d(fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return this.f341592c.g(jsonParser, fVar, this.f341591b);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        return this.f341592c.f(jsonParser, fVar, obj);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return this.f341592c.l(fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Collection<Object> m() {
        return this.f341592c.m();
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Class<?> o() {
        return this.f341592c.o();
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return this.f341592c.q();
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return this.f341592c.r(eVar);
    }
}
