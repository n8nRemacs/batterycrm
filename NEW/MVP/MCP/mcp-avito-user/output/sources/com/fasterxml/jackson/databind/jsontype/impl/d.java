package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsExistingPropertyTypeSerializer.java */
/* loaded from: classes4.dex */
public class d extends h {
    @Override // com.fasterxml.jackson.databind.jsontype.impl.h, com.fasterxml.jackson.databind.jsontype.impl.b, com.fasterxml.jackson.databind.jsontype.o
    public final com.fasterxml.jackson.databind.jsontype.o a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new d(this.f342177a, cVar, this.f342147c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.h, com.fasterxml.jackson.databind.jsontype.impl.b, com.fasterxml.jackson.databind.jsontype.o
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f340971f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.h, com.fasterxml.jackson.databind.jsontype.impl.b
    /* renamed from: g */
    public final b a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new d(this.f342177a, cVar, this.f342147c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.h
    /* renamed from: h */
    public final h a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new d(this.f342177a, cVar, this.f342147c);
    }
}
