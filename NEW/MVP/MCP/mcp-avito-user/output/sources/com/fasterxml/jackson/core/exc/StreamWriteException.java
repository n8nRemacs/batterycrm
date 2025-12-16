package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes3.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    private static final long serialVersionUID = 2;

    /* renamed from: c, reason: collision with root package name */
    public transient JsonGenerator f341130c;

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonGenerator c() {
        return this.f341130c;
    }
}
