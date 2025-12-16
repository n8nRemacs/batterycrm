package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.M;

/* compiled from: UnsupportedTypeSerializer.java */
/* loaded from: classes4.dex */
public class t extends M<Object> {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f342315d;

    public t(com.fasterxml.jackson.databind.h hVar, String str) {
        super(Object.class);
        this.f342315d = str;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws InvalidDefinitionException {
        a12.i(this.f342315d);
        throw null;
    }
}
