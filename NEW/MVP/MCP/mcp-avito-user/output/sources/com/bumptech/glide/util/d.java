package com.bumptech.glide.util;

import com.bumptech.glide.load.resource.bitmap.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: ExceptionCatchingInputStream.java */
/* loaded from: classes5.dex */
public class d extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f339635d;

    /* renamed from: b, reason: collision with root package name */
    public z f339636b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f339637c;

    static {
        char[] cArr = m.f339649a;
        f339635d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f339636b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f339636b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i12) {
        this.f339636b.mark(i12);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f339636b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f339636b.read(bArr);
        } catch (IOException e12) {
            this.f339637c = e12;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f339636b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j12) {
        try {
            return this.f339636b.skip(j12);
        } catch (IOException e12) {
            this.f339637c = e12;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        try {
            return this.f339636b.read(bArr, i12, i13);
        } catch (IOException e12) {
            this.f339637c = e12;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f339636b.read();
        } catch (IOException e12) {
            this.f339637c = e12;
            return -1;
        }
    }
}
