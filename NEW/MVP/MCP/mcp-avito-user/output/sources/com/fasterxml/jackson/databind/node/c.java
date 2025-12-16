package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;
import java.math.BigInteger;

/* compiled from: BigIntegerNode.java */
/* loaded from: classes4.dex */
public class c extends s {

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f342187b;

    static {
        BigInteger.valueOf(-2147483648L);
        BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(Long.MAX_VALUE);
    }

    public c(BigInteger bigInteger) {
        this.f342187b = bigInteger;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.P(this.f342187b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return ((c) obj).f342187b.equals(this.f342187b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f342187b.hashCode();
    }
}
