package com.fasterxml.jackson.databind.util;

import oX0.C44704d;

/* compiled from: TokenBufferReadContext.java */
/* loaded from: classes4.dex */
public class D extends com.fasterxml.jackson.core.g {

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.core.g f342573c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.core.e f342574d;

    /* renamed from: e, reason: collision with root package name */
    public String f342575e;

    /* renamed from: f, reason: collision with root package name */
    public Object f342576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.fasterxml.jackson.core.g gVar) {
        super(gVar);
        com.fasterxml.jackson.core.io.d dVar = com.fasterxml.jackson.core.io.d.f341155f;
        this.f342573c = gVar.c();
        this.f342575e = gVar.a();
        this.f342576f = gVar.b();
        if (!(gVar instanceof C44704d)) {
            this.f342574d = com.fasterxml.jackson.core.e.f341122h;
        } else {
            C44704d c44704d = (C44704d) gVar;
            this.f342574d = new com.fasterxml.jackson.core.e(dVar, -1L, -1L, c44704d.f419831h, c44704d.f419832i);
        }
    }

    @Override // com.fasterxml.jackson.core.g
    public final String a() {
        return this.f342575e;
    }

    @Override // com.fasterxml.jackson.core.g
    public final Object b() {
        return this.f342576f;
    }

    @Override // com.fasterxml.jackson.core.g
    public final com.fasterxml.jackson.core.g c() {
        return this.f342573c;
    }

    @Override // com.fasterxml.jackson.core.g
    public final void g(Object obj) {
        this.f342576f = obj;
    }

    public D(com.fasterxml.jackson.core.g gVar, com.fasterxml.jackson.core.e eVar) {
        super(gVar);
        this.f342573c = gVar.c();
        this.f342575e = gVar.a();
        this.f342576f = gVar.b();
        this.f342574d = eVar;
    }

    public D() {
        super(0);
        this.f342573c = null;
        this.f342574d = com.fasterxml.jackson.core.e.f341122h;
    }

    public D(D d12, int i12) {
        super(i12);
        this.f342573c = d12;
        this.f342574d = d12.f342574d;
    }
}
