package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: IntNode.java */
/* loaded from: classes4.dex */
public class j extends s {

    /* renamed from: c, reason: collision with root package name */
    public static final j[] f342198c = new j[12];

    /* renamed from: b, reason: collision with root package name */
    public final int f342199b;

    static {
        for (int i12 = 0; i12 < 12; i12++) {
            f342198c[i12] = new j(i12 - 1);
        }
    }

    public j(int i12) {
        this.f342199b = i12;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.L(this.f342199b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof j) && ((j) obj).f342199b == this.f342199b;
    }

    public final int hashCode() {
        return this.f342199b;
    }
}
