package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.A;
import java.util.Arrays;

/* compiled from: BinaryNode.java */
/* loaded from: classes4.dex */
public class d extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final d f342188c = new d(new byte[0]);
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f342189b;

    public d(byte[] bArr) {
        this.f342189b = bArr;
    }

    @Override // com.fasterxml.jackson.core.p
    public final JsonToken b() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.b, com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        Base64Variant base64Variant = a12.f341330b.f341506c.f341481i;
        byte[] bArr = this.f342189b;
        jsonGenerator.x(base64Variant, bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            return Arrays.equals(((d) obj).f342189b, this.f342189b);
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.f342189b;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }
}
