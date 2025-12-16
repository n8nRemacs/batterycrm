package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;
import java.math.BigDecimal;

/* compiled from: DecimalNode.java */
/* loaded from: classes4.dex */
public class g extends s {

    /* renamed from: c, reason: collision with root package name */
    public static final g f342194c = new g(BigDecimal.ZERO);

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f342195b;

    static {
        BigDecimal.valueOf(-2147483648L);
        BigDecimal.valueOf(2147483647L);
        BigDecimal.valueOf(Long.MIN_VALUE);
        BigDecimal.valueOf(Long.MAX_VALUE);
    }

    public g(BigDecimal bigDecimal) {
        this.f342195b = bigDecimal;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.O(this.f342195b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof g) && ((g) obj).f342195b.compareTo(this.f342195b) == 0;
    }

    public final int hashCode() {
        return Double.valueOf(this.f342195b.doubleValue()).hashCode();
    }
}
