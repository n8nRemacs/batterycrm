package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: BooleanNode.java */
/* loaded from: classes4.dex */
public class e extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final e f342190c = new e(true);

    /* renamed from: d, reason: collision with root package name */
    public static final e f342191d = new e(false);
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342192b;

    public e(boolean z12) {
        this.f342192b = z12;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return this.f342192b ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.y(this.f342192b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            return this.f342192b == ((e) obj).f342192b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f342192b ? 3 : 1;
    }

    public Object readResolve() {
        return this.f342192b ? f342190c : f342191d;
    }
}
