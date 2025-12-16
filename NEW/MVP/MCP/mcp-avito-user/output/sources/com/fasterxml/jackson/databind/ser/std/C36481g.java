package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.util.C36499e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36481g extends L<ByteBuffer> {
    public C36481g() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
            int iLimit = byteBuffer.limit() - iPosition;
            jsonGenerator.getClass();
            jsonGenerator.x(com.fasterxml.jackson.core.a.f341119b, bArrArray, iArrayOffset, iLimit);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        C36499e c36499e = new C36499e(byteBufferAsReadOnlyBuffer);
        int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
        jsonGenerator.getClass();
        jsonGenerator.u(com.fasterxml.jackson.core.a.f341119b, c36499e, iRemaining);
        c36499e.close();
    }
}
