package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: ShortNode.java */
/* loaded from: classes4.dex */
public class v extends s {
    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.Q((short) 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
