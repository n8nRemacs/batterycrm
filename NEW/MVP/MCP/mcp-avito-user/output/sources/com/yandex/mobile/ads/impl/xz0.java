package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes8.dex */
final class xz0 extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private boolean f391863a;

    public xz0(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        db.b(this.f391863a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f391863a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f391863a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        int i12 = pc1.f388768a;
        throw th;
    }

    public xz0(FileOutputStream fileOutputStream, int i12) {
        super(fileOutputStream, i12);
    }
}
