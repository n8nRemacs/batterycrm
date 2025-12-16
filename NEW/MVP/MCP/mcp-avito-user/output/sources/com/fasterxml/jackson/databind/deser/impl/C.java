package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* compiled from: UnsupportedTypeDeserializer.java */
/* loaded from: classes4.dex */
public class C extends com.fasterxml.jackson.databind.deser.std.C<Object> {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341593e;

    /* renamed from: f, reason: collision with root package name */
    public final String f341594f;

    public C(com.fasterxml.jackson.databind.h hVar, String str) {
        super(hVar);
        this.f341593e = hVar;
        this.f341594f = str;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws InvalidDefinitionException {
        Object objX;
        if (jsonParser.f() == JsonToken.VALUE_EMBEDDED_OBJECT && ((objX = jsonParser.x()) == null || this.f341593e.f341930b.isAssignableFrom(objX.getClass()))) {
            return objX;
        }
        fVar.i(this.f341594f);
        throw null;
    }
}
