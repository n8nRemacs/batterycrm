package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36453g extends G<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public C36453g() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        jsonParser.getClass();
        return ByteBuffer.wrap(jsonParser.i(com.fasterxml.jackson.core.a.f341119b));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C36500f c36500f = new C36500f(byteBuffer);
        jsonParser.i0(fVar.f341921d.f341506c.f341481i, c36500f);
        c36500f.close();
        return byteBuffer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342442l;
    }
}
