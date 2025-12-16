package com.yandex.mobile.ads.impl;

import java.io.InputStream;

/* loaded from: classes8.dex */
public final class in extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final gn f386554a;

    /* renamed from: b, reason: collision with root package name */
    private final kn f386555b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f386557d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f386558e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f386556c = new byte[1];

    public in(a71 a71Var, kn knVar) {
        this.f386554a = a71Var;
        this.f386555b = knVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f386558e) {
            return;
        }
        this.f386554a.close();
        this.f386558e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f386556c) == -1) {
            return -1;
        }
        return this.f386556c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        db.b(!this.f386558e);
        if (!this.f386557d) {
            this.f386554a.a(this.f386555b);
            this.f386557d = true;
        }
        int i14 = this.f386554a.read(bArr, i12, i13);
        if (i14 == -1) {
            return -1;
        }
        return i14;
    }
}
