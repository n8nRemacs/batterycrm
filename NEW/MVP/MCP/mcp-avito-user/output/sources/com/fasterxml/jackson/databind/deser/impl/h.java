package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* compiled from: FailingDeserializer.java */
/* loaded from: classes4.dex */
public class h extends com.fasterxml.jackson.databind.deser.std.C<Object> {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final String f341642e;

    public h() {
        super((Class<?>) Object.class);
        this.f341642e = "No _valueDeserializer assigned";
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        fVar.V(this, this.f341642e, new Object[0]);
        throw null;
    }
}
