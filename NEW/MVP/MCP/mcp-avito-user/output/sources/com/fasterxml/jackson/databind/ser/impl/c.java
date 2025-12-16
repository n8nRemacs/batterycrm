package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.M;

/* compiled from: FailingSerializer.java */
/* loaded from: classes4.dex */
public class c extends M<Object> {

    /* renamed from: d, reason: collision with root package name */
    public final String f342266d;

    public c() {
        super(Object.class);
        this.f342266d = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws JsonMappingException {
        throw new JsonMappingException(a12.y(), this.f342266d, (Throwable) null);
    }
}
