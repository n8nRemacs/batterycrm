package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: POJONode.java */
/* loaded from: classes4.dex */
public class u extends y {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f342217b;

    public u(Object obj) {
        this.f342217b = obj;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        Object obj = this.f342217b;
        if (obj == null) {
            a12.o(jsonGenerator);
        } else if (obj instanceof com.fasterxml.jackson.databind.k) {
            ((com.fasterxml.jackson.databind.k) obj).d(jsonGenerator, a12);
        } else {
            a12.getClass();
            a12.v(obj.getClass()).f(obj, jsonGenerator, a12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        Object obj2 = ((u) obj).f342217b;
        Object obj3 = this.f342217b;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        return this.f342217b.hashCode();
    }
}
