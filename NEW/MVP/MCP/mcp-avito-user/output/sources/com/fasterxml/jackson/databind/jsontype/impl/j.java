package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsWrapperTypeSerializer.java */
/* loaded from: classes4.dex */
public class j extends t {
    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final com.fasterxml.jackson.databind.jsontype.o a(com.fasterxml.jackson.databind.c cVar) {
        return this.f342178b == cVar ? this : new j(this.f342177a, cVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f340968c;
    }
}
