package com.facebook.imagepipeline.memory;

import android.util.Log;
import defpackage.fz4;
import defpackage.l5j;
import defpackage.lf9;
import defpackage.mvi;
import defpackage.nca;
import java.io.Closeable;
import java.nio.ByteBuffer;

@fz4
/* loaded from: classes.dex */
public class NativeMemoryChunk implements lf9, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        nca.b("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @fz4
    private static native long nativeAllocate(int i);

    @fz4
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @fz4
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @fz4
    private static native void nativeFree(long j);

    @fz4
    private static native void nativeMemcpy(long j, long j2, int i);

    @fz4
    private static native byte nativeReadByte(long j);

    @Override // defpackage.lf9
    public final synchronized int P(int i, int i2, int i3, byte[] bArr) {
        int iB;
        l5j.f(!isClosed());
        iB = mvi.b(i, i3, this.b);
        mvi.c(i, bArr.length, i2, iB, this.b);
        nativeCopyToByteArray(this.a + i, bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final synchronized int Q(int i, int i2, int i3, byte[] bArr) {
        int iB;
        l5j.f(!isClosed());
        iB = mvi.b(i, i3, this.b);
        mvi.c(i, bArr.length, i2, iB, this.b);
        nativeCopyFromByteArray(this.a + i, bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final long Z() {
        return this.a;
    }

    public final void c(lf9 lf9Var, int i) {
        if (!(lf9Var instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        l5j.f(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) lf9Var;
        l5j.f(!nativeMemoryChunk.isClosed());
        mvi.c(0, nativeMemoryChunk.b, 0, i, this.b);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.a + j, this.a + j, i);
    }

    @Override // defpackage.lf9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.lf9
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.lf9
    public final synchronized boolean isClosed() {
        return this.c;
    }

    @Override // defpackage.lf9
    public final long l() {
        return this.a;
    }

    @Override // defpackage.lf9
    public final ByteBuffer o() {
        return null;
    }

    @Override // defpackage.lf9
    public final void w(lf9 lf9Var, int i) {
        lf9Var.getClass();
        if (lf9Var.l() == this.a) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(lf9Var)) + " which share the same address " + Long.toHexString(this.a));
            l5j.a(Boolean.FALSE);
        }
        if (lf9Var.l() < this.a) {
            synchronized (lf9Var) {
                synchronized (this) {
                    c(lf9Var, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (lf9Var) {
                    c(lf9Var, i);
                }
            }
        }
    }

    @Override // defpackage.lf9
    public final synchronized byte y(int i) {
        boolean z = true;
        l5j.f(!isClosed());
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i >= this.b) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.a + i);
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0L;
        this.c = true;
    }
}
