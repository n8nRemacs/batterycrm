package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: MissingNode.java */
/* loaded from: classes4.dex */
public final class o extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final o f342205b = new o();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.node.y, com.fasterxml.jackson.databind.k
    public final void a(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        jsonGenerator.H();
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.H();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 3;
    }

    public Object readResolve() {
        return f342205b;
    }

    @Override // com.fasterxml.jackson.databind.node.b
    public final String toString() {
        return "";
    }
}
