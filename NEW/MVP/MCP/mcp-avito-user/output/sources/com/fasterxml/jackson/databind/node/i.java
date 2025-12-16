package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: FloatNode.java */
/* loaded from: classes4.dex */
public class i extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f342197b;

    public i(float f12) {
        this.f342197b = f12;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.J(this.f342197b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            return Float.compare(this.f342197b, ((i) obj).f342197b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f342197b);
    }
}
