package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ByteArrayBuilder.java */
/* loaded from: classes3.dex */
public final class c extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f341283g = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final a f341284b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList<byte[]> f341285c;

    /* renamed from: d, reason: collision with root package name */
    public int f341286d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f341287e;

    /* renamed from: f, reason: collision with root package name */
    public int f341288f;

    public c() {
        this(null);
    }

    public final void a() {
        int length = this.f341286d + this.f341287e.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f341286d = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f341285c.add(this.f341287e);
        this.f341287e = new byte[iMax];
        this.f341288f = 0;
    }

    public final void b(int i12) {
        if (this.f341288f >= this.f341287e.length) {
            a();
        }
        byte[] bArr = this.f341287e;
        int i13 = this.f341288f;
        this.f341288f = i13 + 1;
        bArr[i13] = (byte) i12;
    }

    public final void c(int i12) {
        int i13 = this.f341288f;
        int i14 = i13 + 2;
        byte[] bArr = this.f341287e;
        if (i14 >= bArr.length) {
            b(i12 >> 16);
            b(i12 >> 8);
            b(i12);
            return;
        }
        int i15 = i13 + 1;
        this.f341288f = i15;
        bArr[i13] = (byte) (i12 >> 16);
        this.f341288f = i14;
        bArr[i15] = (byte) (i12 >> 8);
        this.f341288f = i13 + 3;
        bArr[i14] = (byte) i12;
    }

    public final void d(int i12) {
        int i13 = this.f341288f;
        int i14 = i13 + 1;
        byte[] bArr = this.f341287e;
        if (i14 >= bArr.length) {
            b(i12 >> 8);
            b(i12);
        } else {
            this.f341288f = i14;
            bArr[i13] = (byte) (i12 >> 8);
            this.f341288f = i13 + 2;
            bArr[i14] = (byte) i12;
        }
    }

    public final void f() {
        this.f341286d = 0;
        this.f341288f = 0;
        LinkedList<byte[]> linkedList = this.f341285c;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    public final byte[] g() {
        int i12 = this.f341286d + this.f341288f;
        if (i12 == 0) {
            return f341283g;
        }
        byte[] bArr = new byte[i12];
        LinkedList<byte[]> linkedList = this.f341285c;
        Iterator<byte[]> it = linkedList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i13, length);
            i13 += length;
        }
        System.arraycopy(this.f341287e, 0, bArr, i13, this.f341288f);
        int i14 = i13 + this.f341288f;
        if (i14 != i12) {
            throw new RuntimeException(androidx.appcompat.app.r.l(i12, i14, "Internal error: total len assumed to be ", ", copied ", " bytes"));
        }
        if (!linkedList.isEmpty()) {
            f();
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(a aVar) {
        this(aVar, 500);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i12, int i13) {
        while (true) {
            int iMin = Math.min(this.f341287e.length - this.f341288f, i13);
            if (iMin > 0) {
                System.arraycopy(bArr, i12, this.f341287e, this.f341288f, iMin);
                i12 += iMin;
                this.f341288f += iMin;
                i13 -= iMin;
            }
            if (i13 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public c(a aVar, int i12) {
        this.f341285c = new LinkedList<>();
        this.f341284b = aVar;
        this.f341287e = aVar == null ? new byte[i12 > 131072 ? 131072 : i12] : aVar.a(2);
    }

    public c(byte[] bArr, int i12) {
        this.f341285c = new LinkedList<>();
        this.f341284b = null;
        this.f341287e = bArr;
        this.f341288f = i12;
    }

    @Override // java.io.OutputStream
    public final void write(int i12) {
        b(i12);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
