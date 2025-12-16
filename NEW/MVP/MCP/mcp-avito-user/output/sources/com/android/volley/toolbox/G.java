package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes10.dex */
public class G extends ByteArrayOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final C27628h f67109b;

    public G(C27628h c27628h, int i12) {
        this.f67109b = c27628h;
        ((ByteArrayOutputStream) this).buf = c27628h.a(Math.max(i12, 256));
    }

    public final void a(int i12) {
        int i13 = ((ByteArrayOutputStream) this).count;
        if (i13 + i12 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i14 = (i13 + i12) * 2;
        C27628h c27628h = this.f67109b;
        byte[] bArrA = c27628h.a(i14);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        c27628h.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67109b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f67109b.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i12, int i13) {
        a(i13);
        super.write(bArr, i12, i13);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i12) {
        a(1);
        super.write(i12);
    }
}
