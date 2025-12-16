package com.google.common.io;

import java.io.OutputStream;

/* compiled from: BaseEncoding.java */
/* renamed from: com.google.common.io.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37505g extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f360326b;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f360326b <= 0) {
            throw null;
        }
        throw null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f360326b += 8;
        throw null;
    }
}
