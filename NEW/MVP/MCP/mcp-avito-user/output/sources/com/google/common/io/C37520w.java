package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: CountingOutputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37520w extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i12, i13);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i12) throws IOException {
        ((FilterOutputStream) this).out.write(i12);
    }
}
