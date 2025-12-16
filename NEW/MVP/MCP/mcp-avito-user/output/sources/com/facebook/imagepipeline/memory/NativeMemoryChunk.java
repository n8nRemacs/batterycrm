package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import iX0.C41358a;
import j.k0;
import java.io.Closeable;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeMemoryChunk implements w, Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final long f340450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340451c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f340452d;

    static {
        C41358a.c("imagepipeline");
    }

    public NativeMemoryChunk(int i12) {
        if (!(i12 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f340451c = i12;
        this.f340450b = nativeAllocate(i12);
        this.f340452d = false;
    }

    @com.facebook.common.internal.g
    private static native long nativeAllocate(int i12);

    @com.facebook.common.internal.g
    private static native void nativeCopyFromByteArray(long j12, byte[] bArr, int i12, int i13);

    @com.facebook.common.internal.g
    private static native void nativeCopyToByteArray(long j12, byte[] bArr, int i12, int i13);

    @com.facebook.common.internal.g
    private static native void nativeFree(long j12);

    @com.facebook.common.internal.g
    private static native void nativeMemcpy(long j12, long j13, int i12);

    @com.facebook.common.internal.g
    private static native byte nativeReadByte(long j12);

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int a(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        com.facebook.common.internal.o.d(!isClosed());
        iA2 = y.a(i12, i14, this.f340451c);
        y.b(i12, bArr.length, i13, iA2, this.f340451c);
        nativeCopyFromByteArray(this.f340450b + i12, bArr, i13, iA2);
        return iA2;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final void b(w wVar, int i12) {
        wVar.getClass();
        if (wVar.getUniqueId() == this.f340450b) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(wVar));
            Long.toHexString(this.f340450b);
            com.facebook.common.internal.o.a(Boolean.FALSE);
        }
        if (wVar.getUniqueId() < this.f340450b) {
            synchronized (wVar) {
                synchronized (this) {
                    c(wVar, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (wVar) {
                    c(wVar, i12);
                }
            }
        }
    }

    public final void c(w wVar, int i12) {
        if (!(wVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.o.d(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) wVar;
        com.facebook.common.internal.o.d(!nativeMemoryChunk.isClosed());
        y.b(0, nativeMemoryChunk.f340451c, 0, i12, this.f340451c);
        long j12 = 0;
        nativeMemcpy(nativeMemoryChunk.f340450b + j12, this.f340450b + j12, i12);
    }

    @Override // com.facebook.imagepipeline.memory.w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f340452d) {
            this.f340452d = true;
            nativeFree(this.f340450b);
        }
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int e(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        com.facebook.common.internal.o.d(!isClosed());
        iA2 = y.a(i12, i14, this.f340451c);
        y.b(i12, bArr.length, i13, iA2, this.f340451c);
        nativeCopyToByteArray(this.f340450b + i12, bArr, i13, iA2);
        return iA2;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final int getSize() {
        return this.f340451c;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final long getUniqueId() {
        return this.f340450b;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized boolean isClosed() {
        return this.f340452d;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized byte l(int i12) {
        boolean z12 = true;
        com.facebook.common.internal.o.d(!isClosed());
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i12 >= this.f340451c) {
            z12 = false;
        }
        if (!z12) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.f340450b + i12);
    }

    @k0
    public NativeMemoryChunk() {
        this.f340451c = 0;
        this.f340450b = 0L;
        this.f340452d = true;
    }
}
