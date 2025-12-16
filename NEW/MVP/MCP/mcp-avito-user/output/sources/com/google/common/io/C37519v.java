package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: CountingInputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37519v extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f360342b;

    /* renamed from: c, reason: collision with root package name */
    public long f360343c;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i12) {
        ((FilterInputStream) this).in.mark(i12);
        this.f360343c = this.f360342b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 != -1) {
            this.f360342b++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f360343c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f360342b = this.f360343c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j12) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j12);
        this.f360342b += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        int i14 = ((FilterInputStream) this).in.read(bArr, i12, i13);
        if (i14 != -1) {
            this.f360342b += i14;
        }
        return i14;
    }
}
