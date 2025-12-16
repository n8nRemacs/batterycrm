package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsExternalTypeSerializer.java */
/* loaded from: classes4.dex */
public class f extends t {

    /* renamed from: c, reason: collision with root package name */
    public final String f342144c;

    public f(com.fasterxml.jackson.databind.jsontype.m mVar, com.fasterxml.jackson.databind.c cVar, String str) {
        super(mVar, cVar);
        this.f342144c = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final com.fasterxml.jackson.databind.jsontype.o a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new f(this.f342177a, cVar, this.f342144c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.t, com.fasterxml.jackson.databind.jsontype.o
    public final String b() {
        return this.f342144c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f340970e;
    }
}
