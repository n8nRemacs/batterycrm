package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: NullNode.java */
/* loaded from: classes4.dex */
public class r extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final r f342215b = new r();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        a12.o(jsonGenerator);
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof r);
    }

    public final int hashCode() {
        return 4;
    }

    public Object readResolve() {
        return f342215b;
    }
}
