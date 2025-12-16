package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.z;

/* loaded from: classes4.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    public final z f341520f;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, com.fasterxml.jackson.core.e eVar, z zVar) {
        super(jsonParser, str, eVar);
        this.f341520f = zVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String getMessage() {
        return f();
    }
}
