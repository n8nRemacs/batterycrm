package com.google.common.hash;

import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: HashingOutputStream.java */
@InterfaceC37497l
@XY0.a
/* loaded from: classes6.dex */
public final class v extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i12) {
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) {
        throw null;
    }
}
