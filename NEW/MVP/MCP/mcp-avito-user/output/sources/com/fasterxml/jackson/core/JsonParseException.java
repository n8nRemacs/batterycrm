package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* loaded from: classes3.dex */
public class JsonParseException extends StreamReadException {
    private static final long serialVersionUID = 2;

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.f341129c;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* renamed from: e */
    public final JsonParser c() {
        return this.f341129c;
    }
}
