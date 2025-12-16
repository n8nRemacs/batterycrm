package com.google.common.io;

import java.io.InputStream;

/* compiled from: BaseEncoding.java */
/* renamed from: com.google.common.io.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37506h extends InputStream {
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        int i14 = i13 + i12;
        com.google.common.base.M.l(i12, i14, bArr.length);
        if (i12 >= i14) {
            return 0;
        }
        throw null;
    }
}
