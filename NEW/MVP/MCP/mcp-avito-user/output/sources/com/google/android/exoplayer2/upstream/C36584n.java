package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C36585a;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
/* renamed from: com.google.android.exoplayer2.upstream.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36584n extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36583m f347923b;

    /* renamed from: c, reason: collision with root package name */
    public final p f347924c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347926e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f347927f = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f347925d = new byte[1];

    public C36584n(InterfaceC36583m interfaceC36583m, p pVar) {
        this.f347923b = interfaceC36583m;
        this.f347924c = pVar;
    }

    public final void a() {
        if (this.f347926e) {
            return;
        }
        this.f347923b.e(this.f347924c);
        this.f347926e = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f347927f) {
            return;
        }
        this.f347923b.close();
        this.f347927f = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f347925d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        C36585a.d(!this.f347927f);
        a();
        int i14 = this.f347923b.read(bArr, i12, i13);
        if (i14 == -1) {
            return -1;
        }
        return i14;
    }
}
