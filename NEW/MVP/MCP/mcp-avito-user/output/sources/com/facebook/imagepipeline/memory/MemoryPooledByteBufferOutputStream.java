package com.facebook.imagepipeline.memory;

import androidx.media3.exoplayer.C23179x;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;

@J41.c
@Nullsafe
/* loaded from: classes13.dex */
public class MemoryPooledByteBufferOutputStream extends wW0.i {

    /* renamed from: b, reason: collision with root package name */
    public final x f340447b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public com.facebook.common.references.a<w> f340448c;

    /* renamed from: d, reason: collision with root package name */
    public int f340449d;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(x xVar, int i12) {
        if (!(i12 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f340447b = xVar;
        this.f340449d = 0;
        this.f340448c = com.facebook.common.references.a.n(xVar.get(i12), xVar, com.facebook.common.references.a.f339839g);
    }

    @Override // wW0.i
    public final z a() {
        if (!com.facebook.common.references.a.k(this.f340448c)) {
            throw new InvalidStreamException();
        }
        com.facebook.common.references.a<w> aVar = this.f340448c;
        aVar.getClass();
        return new z(aVar, this.f340449d);
    }

    @Override // wW0.i, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        com.facebook.common.references.a.c(this.f340448c);
        this.f340448c = null;
        this.f340449d = -1;
        super.close();
    }

    @Override // wW0.i
    public final int size() {
        return this.f340449d;
    }

    @Override // java.io.OutputStream
    public final void write(int i12) throws IOException {
        write(new byte[]{(byte) i12});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) throws Throwable {
        if (i12 >= 0 && i13 >= 0 && i12 + i13 <= bArr.length) {
            if (com.facebook.common.references.a.k(this.f340448c)) {
                int i14 = this.f340449d + i13;
                if (com.facebook.common.references.a.k(this.f340448c)) {
                    this.f340448c.getClass();
                    if (i14 > this.f340448c.i().getSize()) {
                        x xVar = this.f340447b;
                        w wVar = xVar.get(i14);
                        this.f340448c.getClass();
                        this.f340448c.i().b(wVar, this.f340449d);
                        this.f340448c.close();
                        this.f340448c = com.facebook.common.references.a.n(wVar, xVar, com.facebook.common.references.a.f339839g);
                    }
                    com.facebook.common.references.a<w> aVar = this.f340448c;
                    aVar.getClass();
                    aVar.i().a(this.f340449d, i12, i13, bArr);
                    this.f340449d += i13;
                    return;
                }
                throw new InvalidStreamException();
            }
            throw new InvalidStreamException();
        }
        StringBuilder sb2 = new StringBuilder("length=");
        C23179x.a(sb2, bArr.length, "; regionStart=", i12, "; regionLength=");
        sb2.append(i13);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
