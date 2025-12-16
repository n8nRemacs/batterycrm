package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes3.dex */
public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 2;

    /* renamed from: c, reason: collision with root package name */
    public transient JsonParser f341129c;

    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.m(), null);
        this.f341129c = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonParser c() {
        return this.f341129c;
    }
}
