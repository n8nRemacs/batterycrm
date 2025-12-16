package com.google.common.io;

import bZ0.InterfaceC25600a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: FileBackedOutputStream.java */
@XY0.d
@XY0.c
@InterfaceC37521x
@XY0.a
/* loaded from: classes6.dex */
public final class A extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC25600a
    public FileOutputStream f360295b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25600a
    public a f360296c;

    /* compiled from: FileBackedOutputStream.java */
    public static class a extends ByteArrayOutputStream {
        public a() {
        }

        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ a(y yVar) {
            this();
        }
    }

    @InterfaceC25600a
    public final void a(int i12) throws IOException {
        a aVar = this.f360296c;
        if (aVar == null || aVar.getCount() + i12 <= 0) {
            return;
        }
        File fileA = T.f360319a.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            fileOutputStream.write(this.f360296c.a(), 0, this.f360296c.getCount());
            fileOutputStream.flush();
            this.f360295b = fileOutputStream;
            this.f360296c = null;
        } catch (IOException e12) {
            fileA.delete();
            throw e12;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f360295b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        this.f360295b.flush();
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i12) {
        a(1);
        this.f360295b.write(i12);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i12, int i13) {
        a(i13);
        this.f360295b.write(bArr, i12, i13);
    }
}
