package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class au0 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final vg f383662a;

    public au0(vg vgVar, int i12) {
        this.f383662a = vgVar;
        ((ByteArrayOutputStream) this).buf = vgVar.a(Math.max(i12, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f383662a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f383662a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i12) {
        int i13 = ((ByteArrayOutputStream) this).count + 1;
        if (i13 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f383662a.a(i13 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f383662a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(i12);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i12, int i13) {
        int i14 = ((ByteArrayOutputStream) this).count + i13;
        if (i14 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f383662a.a(i14 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f383662a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(bArr, i12, i13);
    }
}
