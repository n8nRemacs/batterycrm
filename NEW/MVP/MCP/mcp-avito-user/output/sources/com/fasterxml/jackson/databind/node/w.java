package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;

/* compiled from: TextNode.java */
/* loaded from: classes4.dex */
public class w extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final w f342218c = new w("");
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final String f342219b;

    public w(String str) {
        this.f342219b = str;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        String str = this.f342219b;
        if (str == null) {
            jsonGenerator.H();
        } else {
            jsonGenerator.i0(str);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof w)) {
            return ((w) obj).f342219b.equals(this.f342219b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f342219b.hashCode();
    }
}
