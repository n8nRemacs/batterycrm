package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsPropertyTypeSerializer.java */
/* loaded from: classes4.dex */
public class h extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f342147c;

    public h(com.fasterxml.jackson.databind.jsontype.m mVar, com.fasterxml.jackson.databind.c cVar, String str) {
        super(mVar, cVar);
        this.f342147c = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.t, com.fasterxml.jackson.databind.jsontype.o
    public final String b() {
        return this.f342147c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.b, com.fasterxml.jackson.databind.jsontype.o
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f340967b;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new h(this.f342177a, cVar, this.f342147c);
    }
}
