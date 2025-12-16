package com.fasterxml.jackson.databind.jsontype.impl;

/* compiled from: TypeIdResolverBase.java */
/* loaded from: classes4.dex */
public abstract class r implements com.fasterxml.jackson.databind.jsontype.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.n f342171a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342172b;

    public r() {
        this(null, null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public final String b() {
        return e(this.f342172b.f341930b, null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public String c() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public com.fasterxml.jackson.databind.h d(com.fasterxml.jackson.databind.f fVar, String str) {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }

    public r(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.type.n nVar) {
        this.f342172b = hVar;
        this.f342171a = nVar;
    }
}
