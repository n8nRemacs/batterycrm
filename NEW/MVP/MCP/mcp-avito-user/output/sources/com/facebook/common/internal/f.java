package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: CountingOutputStream.java */
@Nullsafe
/* loaded from: classes5.dex */
public class f extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f339819b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i12, i13);
        this.f339819b += i13;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i12) throws IOException {
        ((FilterOutputStream) this).out.write(i12);
        this.f339819b++;
    }
}
