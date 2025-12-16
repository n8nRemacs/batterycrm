package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: LongNode.java */
/* loaded from: classes4.dex */
public class n extends s {

    /* renamed from: b, reason: collision with root package name */
    public final long f342204b;

    public n(long j12) {
        this.f342204b = j12;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.M(this.f342204b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof n) && ((n) obj).f342204b == this.f342204b;
    }

    public final int hashCode() {
        long j12 = this.f342204b;
        return ((int) (j12 >> 32)) ^ ((int) j12);
    }
}
