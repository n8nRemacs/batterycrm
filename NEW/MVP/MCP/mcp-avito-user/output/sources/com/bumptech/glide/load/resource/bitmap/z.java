package com.bumptech.glide.load.resource.bitmap;

import j.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import shark.AndroidResourceIdNames;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes5.dex */
public class z extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f339414b;

    /* renamed from: c, reason: collision with root package name */
    public int f339415c;

    /* renamed from: d, reason: collision with root package name */
    public int f339416d;

    /* renamed from: e, reason: collision with root package name */
    public int f339417e;

    /* renamed from: f, reason: collision with root package name */
    public int f339418f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339419g;

    /* compiled from: RecyclableBufferedInputStream.java */
    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;
    }

    public z(@N InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        super(inputStream);
        this.f339417e = -1;
        this.f339419g = jVar;
        this.f339414b = (byte[]) jVar.d(byte[].class, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i12 = this.f339417e;
        if (i12 != -1) {
            int i13 = this.f339418f - i12;
            int i14 = this.f339416d;
            if (i13 < i14) {
                if (i12 == 0 && i14 > bArr.length && this.f339415c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i14) {
                        i14 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f339419g.d(byte[].class, i14);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f339414b = bArr2;
                    this.f339419g.i(bArr);
                    bArr = bArr2;
                } else if (i12 > 0) {
                    System.arraycopy(bArr, i12, bArr, 0, bArr.length - i12);
                }
                int i15 = this.f339418f - this.f339417e;
                this.f339418f = i15;
                this.f339417e = 0;
                this.f339415c = 0;
                int i16 = inputStream.read(bArr, i15, bArr.length - i15);
                int i17 = this.f339418f;
                if (i16 > 0) {
                    i17 += i16;
                }
                this.f339415c = i17;
                return i16;
            }
        }
        int i18 = inputStream.read(bArr);
        if (i18 > 0) {
            this.f339417e = -1;
            this.f339418f = 0;
            this.f339415c = i18;
        }
        return i18;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f339414b == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f339415c - this.f339418f) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f339414b != null) {
            this.f339419g.i(this.f339414b);
            this.f339414b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f339414b != null) {
            this.f339419g.i(this.f339414b);
            this.f339414b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i12) {
        this.f339416d = Math.max(this.f339416d, i12);
        this.f339417e = this.f339418f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f339414b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            c();
            throw null;
        }
        if (this.f339418f >= this.f339415c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f339414b && (bArr = this.f339414b) == null) {
            c();
            throw null;
        }
        int i12 = this.f339415c;
        int i13 = this.f339418f;
        if (i12 - i13 <= 0) {
            return -1;
        }
        this.f339418f = i13 + 1;
        return bArr[i13] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f339414b == null) {
            throw new IOException("Stream is closed");
        }
        int i12 = this.f339417e;
        if (-1 == i12) {
            throw new a("Mark has been invalidated, pos: " + this.f339418f + " markLimit: " + this.f339416d);
        }
        this.f339418f = i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j12) {
        if (j12 < 1) {
            return 0L;
        }
        byte[] bArr = this.f339414b;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i12 = this.f339415c;
        int i13 = this.f339418f;
        if (i12 - i13 >= j12) {
            this.f339418f = (int) (i13 + j12);
            return j12;
        }
        long j13 = i12 - i13;
        this.f339418f = i12;
        if (this.f339417e == -1 || j12 > this.f339416d) {
            return j13 + inputStream.skip(j12 - j13);
        }
        if (a(inputStream, bArr) == -1) {
            return j13;
        }
        int i14 = this.f339415c;
        int i15 = this.f339418f;
        if (i14 - i15 >= j12 - j13) {
            this.f339418f = (int) ((i15 + j12) - j13);
            return j12;
        }
        long j14 = (j13 + i14) - i15;
        this.f339418f = i14;
        return j14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@N byte[] bArr, int i12, int i13) {
        int i14;
        int i15;
        byte[] bArr2 = this.f339414b;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i13 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i16 = this.f339418f;
            int i17 = this.f339415c;
            if (i16 < i17) {
                int i18 = i17 - i16;
                if (i18 >= i13) {
                    i18 = i13;
                }
                System.arraycopy(bArr2, i16, bArr, i12, i18);
                this.f339418f += i18;
                if (i18 == i13 || inputStream.available() == 0) {
                    return i18;
                }
                i12 += i18;
                i14 = i13 - i18;
            } else {
                i14 = i13;
            }
            while (true) {
                if (this.f339417e == -1 && i14 >= bArr2.length) {
                    i15 = inputStream.read(bArr, i12, i14);
                    if (i15 == -1) {
                        return i14 != i13 ? i13 - i14 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i14 != i13 ? i13 - i14 : -1;
                    }
                    if (bArr2 != this.f339414b && (bArr2 = this.f339414b) == null) {
                        c();
                        throw null;
                    }
                    int i19 = this.f339415c;
                    int i22 = this.f339418f;
                    i15 = i19 - i22;
                    if (i15 >= i14) {
                        i15 = i14;
                    }
                    System.arraycopy(bArr2, i22, bArr, i12, i15);
                    this.f339418f += i15;
                }
                i14 -= i15;
                if (i14 == 0) {
                    return i13;
                }
                if (inputStream.available() == 0) {
                    return i13 - i14;
                }
                i12 += i15;
            }
        } else {
            c();
            throw null;
        }
    }
}
