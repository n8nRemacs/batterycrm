package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;

/* compiled from: WritableObjectId.java */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final G<?> f342318a;

    /* renamed from: b, reason: collision with root package name */
    public Object f342319b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f342320c = false;

    public x(G<?> g12) {
        this.f342318a = g12;
    }

    public final void a(JsonGenerator jsonGenerator, A a12, i iVar) throws JsonGenerationException {
        this.f342320c = true;
        if (jsonGenerator.d()) {
            Object obj = this.f342319b;
            jsonGenerator.S(obj == null ? null : String.valueOf(obj));
            return;
        }
        com.fasterxml.jackson.core.io.n nVar = iVar.f342284b;
        if (nVar != null) {
            jsonGenerator.F(nVar);
            iVar.f342286d.f(this.f342319b, jsonGenerator, a12);
        }
    }

    public final boolean b(JsonGenerator jsonGenerator, A a12, i iVar) throws JsonGenerationException {
        if (this.f342319b == null) {
            return false;
        }
        if (!this.f342320c && !iVar.f342287e) {
            return false;
        }
        if (!jsonGenerator.d()) {
            iVar.f342286d.f(this.f342319b, jsonGenerator, a12);
            return true;
        }
        String.valueOf(this.f342319b);
        jsonGenerator.T();
        return true;
    }
}
