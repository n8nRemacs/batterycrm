package com.google.android.play.core.assetpacks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class T extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final FileInputStream f358233b;

    /* renamed from: c, reason: collision with root package name */
    public long f358234c;

    public T(FileInputStream fileInputStream, long j12) {
        this.f358233b = fileInputStream;
        this.f358234c = j12;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f358233b.close();
        this.f358234c = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j12 = this.f358234c;
        if (j12 <= 0) {
            return -1;
        }
        this.f358234c = j12 - 1;
        return this.f358233b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        long j12 = this.f358234c;
        if (j12 <= 0) {
            return -1;
        }
        int i14 = this.f358233b.read(bArr, i12, (int) Math.min(i13, j12));
        if (i14 != -1) {
            this.f358234c -= i14;
        }
        return i14;
    }
}
