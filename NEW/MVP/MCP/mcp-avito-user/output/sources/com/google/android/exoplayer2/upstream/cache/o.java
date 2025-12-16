package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: ReusableBufferedOutputStream.java */
/* loaded from: classes6.dex */
final class o extends BufferedOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public boolean f347889b;

    public final void a(OutputStream outputStream) {
        C36585a.d(this.f347889b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f347889b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f347889b = true;
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
        int i12 = U.f348106a;
        throw th;
    }
}
