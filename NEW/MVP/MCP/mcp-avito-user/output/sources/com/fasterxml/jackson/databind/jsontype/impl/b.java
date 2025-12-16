package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsArrayTypeSerializer.java */
/* loaded from: classes4.dex */
public class b extends t {
    @Override // com.fasterxml.jackson.databind.jsontype.o
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f340969d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new b(this.f342177a, cVar);
    }
}
