package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import rX0.InterfaceC47610a;

/* compiled from: ByteArraySerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36480f extends M<byte[]> {
    private static final long serialVersionUID = 1;

    public C36480f() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        return ((byte[]) obj).length == 0;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        byte[] bArr = (byte[]) obj;
        jsonGenerator.x(a12.f341330b.f341506c.f341481i, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        byte[] bArr = (byte[]) obj;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_EMBEDDED_OBJECT, bArr));
        jsonGenerator.x(a12.f341330b.f341506c.f341481i, bArr, 0, bArr.length);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
