package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: IterableByteBufferInputStream.java */
/* renamed from: com.google.protobuf.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37674f0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public Iterator<ByteBuffer> f362866b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f362867c;

    /* renamed from: d, reason: collision with root package name */
    public int f362868d;

    /* renamed from: e, reason: collision with root package name */
    public int f362869e;

    /* renamed from: f, reason: collision with root package name */
    public int f362870f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362871g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f362872h;

    /* renamed from: i, reason: collision with root package name */
    public int f362873i;

    /* renamed from: j, reason: collision with root package name */
    public long f362874j;

    public C37674f0() {
        throw null;
    }

    public final boolean a() {
        this.f362869e++;
        Iterator<ByteBuffer> it = this.f362866b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer next = it.next();
        this.f362867c = next;
        this.f362870f = next.position();
        if (this.f362867c.hasArray()) {
            this.f362871g = true;
            this.f362872h = this.f362867c.array();
            this.f362873i = this.f362867c.arrayOffset();
        } else {
            this.f362871g = false;
            this.f362874j = r1.b(this.f362867c);
            this.f362872h = null;
        }
        return true;
    }

    public final void b(int i12) {
        int i13 = this.f362870f + i12;
        this.f362870f = i13;
        if (i13 == this.f362867c.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f362869e == this.f362868d) {
            return -1;
        }
        if (this.f362871g) {
            int i12 = this.f362872h[this.f362870f + this.f362873i] & 255;
            b(1);
            return i12;
        }
        int iF2 = r1.f362946c.f(this.f362870f + this.f362874j) & 255;
        b(1);
        return iF2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        if (this.f362869e == this.f362868d) {
            return -1;
        }
        int iLimit = this.f362867c.limit();
        int i14 = this.f362870f;
        int i15 = iLimit - i14;
        if (i13 > i15) {
            i13 = i15;
        }
        if (this.f362871g) {
            System.arraycopy(this.f362872h, i14 + this.f362873i, bArr, i12, i13);
            b(i13);
        } else {
            int iPosition = this.f362867c.position();
            this.f362867c.position(this.f362870f);
            this.f362867c.get(bArr, i12, i13);
            this.f362867c.position(iPosition);
            b(i13);
        }
        return i13;
    }
}
