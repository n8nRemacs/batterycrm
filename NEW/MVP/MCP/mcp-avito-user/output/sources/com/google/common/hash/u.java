package com.google.common.hash;

import aZ0.InterfaceC19845a;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: HashingInputStream.java */
@InterfaceC37497l
@XY0.a
/* loaded from: classes6.dex */
public final class u extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @InterfaceC19845a
    public final int read() throws IOException {
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 == -1) {
            return i12;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @InterfaceC19845a
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        int i14 = ((FilterInputStream) this).in.read(bArr, i12, i13);
        if (i14 == -1) {
            return i14;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i12) {
    }
}
