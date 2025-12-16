package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: AsExternalTypeDeserializer.java */
/* loaded from: classes4.dex */
public class e extends a {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final com.fasterxml.jackson.databind.jsontype.l f(com.fasterxml.jackson.databind.c cVar) {
        return cVar == this.f342165d ? this : new e(this, cVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final JsonTypeInfo.As k() {
        return JsonTypeInfo.As.f340970e;
    }
}
