package com.fasterxml.jackson.databind.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBackedInputStream.java */
/* renamed from: com.fasterxml.jackson.databind.util.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36499e extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f342594b;

    public C36499e(ByteBuffer byteBuffer) {
        this.f342594b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f342594b.remaining();
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f342594b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        ByteBuffer byteBuffer = this.f342594b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i13, byteBuffer.remaining());
        byteBuffer.get(bArr, i12, iMin);
        return iMin;
    }
}
