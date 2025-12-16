package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;

/* compiled from: TypeWrappedSerializer.java */
/* loaded from: classes4.dex */
public final class r extends com.fasterxml.jackson.databind.l<Object> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342313b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342314c;

    public r(com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar) {
        this.f342313b = oVar;
        this.f342314c = lVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(A a12, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.l<?> lVar = this.f342314c;
        com.fasterxml.jackson.databind.l<?> lVarB = lVar instanceof com.fasterxml.jackson.databind.ser.j ? a12.B(lVar, cVar) : lVar;
        return lVarB == lVar ? this : new r(this.f342313b, lVarB);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final Class<Object> c() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        this.f342314c.g(obj, jsonGenerator, a12, this.f342313b);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        this.f342314c.g(obj, jsonGenerator, a12, oVar);
    }
}
