package com.bumptech.glide.util;

import androidx.compose.foundation.H;
import j.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes5.dex */
public final class c extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f339633b;

    /* renamed from: c, reason: collision with root package name */
    public int f339634c;

    public c(@N InputStream inputStream, long j12) {
        super(inputStream);
        this.f339633b = j12;
    }

    public final void a(int i12) throws IOException {
        if (i12 >= 0) {
            this.f339634c += i12;
            return;
        }
        long j12 = this.f339634c;
        long j13 = this.f339633b;
        if (j13 - j12 <= 0) {
            return;
        }
        StringBuilder sbQ = H.q(j13, "Failed to read all expected data, expected: ", ", but read: ");
        sbQ.append(this.f339634c);
        throw new IOException(sbQ.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f339633b - this.f339634c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i12;
        i12 = super.read();
        a(i12 >= 0 ? 1 : -1);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i12, int i13) {
        int i14;
        i14 = super.read(bArr, i12, i13);
        a(i14);
        return i14;
    }
}
