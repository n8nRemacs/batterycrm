package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;

/* compiled from: StdNodeBasedDeserializer.java */
/* loaded from: classes4.dex */
public abstract class F<T> extends C<T> implements com.fasterxml.jackson.databind.deser.t {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341732e;

    @Override // com.fasterxml.jackson.databind.deser.t
    public final void c(com.fasterxml.jackson.databind.f fVar) {
        this.f341732e = fVar.u(fVar.l(com.fasterxml.jackson.databind.j.class));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final T e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return (T) q0();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return q0();
    }

    public abstract Object q0();
}
