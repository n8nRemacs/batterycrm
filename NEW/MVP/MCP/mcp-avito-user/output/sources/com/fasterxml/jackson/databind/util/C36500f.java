package com.fasterxml.jackson.databind.util;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBackedOutputStream.java */
/* renamed from: com.fasterxml.jackson.databind.util.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36500f extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f342595b;

    public C36500f(ByteBuffer byteBuffer) {
        this.f342595b = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f342595b.put((byte) i12);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) {
        this.f342595b.put(bArr, i12, i13);
    }
}
