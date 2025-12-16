package com.bumptech.glide.load.data;

import j.N;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import shark.AndroidResourceIdNames;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes5.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final FileOutputStream f338852b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f338853c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f338854d;

    /* renamed from: e, reason: collision with root package name */
    public int f338855e;

    public c(@N FileOutputStream fileOutputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f338852b = fileOutputStream;
        this.f338854d = jVar;
        this.f338853c = (byte[]) jVar.d(byte[].class, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f338852b;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f338853c;
            if (bArr != null) {
                this.f338854d.i(bArr);
                this.f338853c = null;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i12 = this.f338855e;
        FileOutputStream fileOutputStream = this.f338852b;
        if (i12 > 0) {
            fileOutputStream.write(this.f338853c, 0, i12);
            this.f338855e = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i12) throws IOException {
        byte[] bArr = this.f338853c;
        int i13 = this.f338855e;
        int i14 = i13 + 1;
        this.f338855e = i14;
        bArr[i13] = (byte) i12;
        if (i14 != bArr.length || i14 <= 0) {
            return;
        }
        this.f338852b.write(bArr, 0, i14);
        this.f338855e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr, int i12, int i13) throws IOException {
        int i14 = 0;
        do {
            int i15 = i13 - i14;
            int i16 = i12 + i14;
            int i17 = this.f338855e;
            FileOutputStream fileOutputStream = this.f338852b;
            if (i17 == 0 && i15 >= this.f338853c.length) {
                fileOutputStream.write(bArr, i16, i15);
                return;
            }
            int iMin = Math.min(i15, this.f338853c.length - i17);
            System.arraycopy(bArr, i16, this.f338853c, this.f338855e, iMin);
            int i18 = this.f338855e + iMin;
            this.f338855e = i18;
            i14 += iMin;
            byte[] bArr2 = this.f338853c;
            if (i18 == bArr2.length && i18 > 0) {
                fileOutputStream.write(bArr2, 0, i18);
                this.f338855e = 0;
            }
        } while (i14 < i13);
    }
}
