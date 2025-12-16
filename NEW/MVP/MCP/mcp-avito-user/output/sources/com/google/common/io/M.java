package com.google.common.io;

import java.io.IOException;
import java.io.Reader;

/* compiled from: MultiReader.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
class M extends Reader {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public Reader f360313b;

    public M() {
        throw null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.f360313b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f360313b = null;
            }
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i12, int i13) throws IOException {
        cArr.getClass();
        Reader reader = this.f360313b;
        if (reader == null) {
            return -1;
        }
        int i14 = reader.read(cArr, i12, i13);
        if (i14 != -1) {
            return i14;
        }
        close();
        throw null;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        Reader reader = this.f360313b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public final long skip(long j12) throws IOException {
        Reader reader;
        com.google.common.base.M.d("n is negative", j12 >= 0);
        if (j12 <= 0 || (reader = this.f360313b) == null) {
            return 0L;
        }
        long jSkip = reader.skip(j12);
        if (jSkip > 0) {
            return jSkip;
        }
        close();
        throw null;
    }
}
