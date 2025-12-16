package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* loaded from: classes3.dex */
public class JsonGenerationException extends StreamWriteException {
    private static final long serialVersionUID = 123;

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, null, null);
        this.f341130c = jsonGenerator;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.f341130c;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException
    /* renamed from: e */
    public final JsonGenerator c() {
        return this.f341130c;
    }
}
