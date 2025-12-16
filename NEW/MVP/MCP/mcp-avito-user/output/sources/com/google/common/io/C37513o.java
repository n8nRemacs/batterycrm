package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* compiled from: CharSequenceReader.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37513o extends Reader {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public String f360334b;

    /* renamed from: c, reason: collision with root package name */
    public int f360335c;

    /* renamed from: d, reason: collision with root package name */
    public int f360336d;

    public final void a() throws IOException {
        if (this.f360334b == null) {
            throw new IOException("reader closed");
        }
    }

    public final int b() {
        Objects.requireNonNull(this.f360334b);
        return this.f360334b.length() - this.f360335c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f360334b = null;
    }

    @Override // java.io.Reader
    public final synchronized void mark(int i12) {
        com.google.common.base.M.c(i12, "readAheadLimit (%s) may not be negative", i12 >= 0);
        a();
        this.f360336d = this.f360335c;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final synchronized int read() {
        char cCharAt;
        a();
        Objects.requireNonNull(this.f360334b);
        if (b() > 0) {
            String str = this.f360334b;
            int i12 = this.f360335c;
            this.f360335c = i12 + 1;
            cCharAt = str.charAt(i12);
        } else {
            cCharAt = 65535;
        }
        return cCharAt;
    }

    @Override // java.io.Reader
    public final synchronized boolean ready() {
        a();
        return true;
    }

    @Override // java.io.Reader
    public final synchronized void reset() {
        a();
        this.f360335c = this.f360336d;
    }

    @Override // java.io.Reader
    public final synchronized long skip(long j12) {
        int iMin;
        com.google.common.base.M.e("n (%s) may not be negative", j12 >= 0, j12);
        a();
        iMin = (int) Math.min(b(), j12);
        this.f360335c += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final synchronized int read(char[] cArr, int i12, int i13) {
        com.google.common.base.M.l(i12, i12 + i13, cArr.length);
        a();
        Objects.requireNonNull(this.f360334b);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(i13, b());
        for (int i14 = 0; i14 < iMin; i14++) {
            String str = this.f360334b;
            int i15 = this.f360335c;
            this.f360335c = i15 + 1;
            cArr[i12 + i14] = str.charAt(i15);
        }
        return iMin;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final synchronized int read(CharBuffer charBuffer) {
        charBuffer.getClass();
        a();
        Objects.requireNonNull(this.f360334b);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), b());
        for (int i12 = 0; i12 < iMin; i12++) {
            String str = this.f360334b;
            int i13 = this.f360335c;
            this.f360335c = i13 + 1;
            charBuffer.put(str.charAt(i13));
        }
        return iMin;
    }
}
