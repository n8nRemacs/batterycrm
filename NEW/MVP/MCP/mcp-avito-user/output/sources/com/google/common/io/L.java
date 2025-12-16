package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: MultiInputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
final class L extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public InputStream f360312b;

    public L() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f360312b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f360312b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f360312b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.f360312b;
        if (inputStream == null) {
            return -1;
        }
        int i12 = inputStream.read();
        if (i12 != -1) {
            return i12;
        }
        close();
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j12) throws IOException {
        InputStream inputStream = this.f360312b;
        if (inputStream == null || j12 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j12);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f360312b.skip(j12 - 1) + 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        bArr.getClass();
        InputStream inputStream = this.f360312b;
        if (inputStream == null) {
            return -1;
        }
        int i14 = inputStream.read(bArr, i12, i13);
        if (i14 != -1) {
            return i14;
        }
        close();
        throw null;
    }
}
