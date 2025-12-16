package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.PooledByteBuffer;
import j.k0;

/* compiled from: MemoryPooledByteBuffer.java */
@J41.d
/* loaded from: classes13.dex */
public class z implements PooledByteBuffer {

    /* renamed from: b, reason: collision with root package name */
    public final int f340490b;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    @k0
    public com.facebook.common.references.a<w> f340491c;

    public z(com.facebook.common.references.a<w> aVar, int i12) {
        aVar.getClass();
        if (!(i12 >= 0 && i12 <= aVar.i().getSize())) {
            throw new IllegalArgumentException();
        }
        this.f340491c = aVar.clone();
        this.f340490b = i12;
    }

    public final synchronized void a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        com.facebook.common.references.a.c(this.f340491c);
        this.f340491c = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int e(int i12, int i13, int i14, byte[] bArr) {
        a();
        if (!(i12 + i14 <= this.f340490b)) {
            throw new IllegalArgumentException();
        }
        return this.f340491c.i().e(i12, i13, i14, bArr);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized boolean isClosed() {
        return !com.facebook.common.references.a.k(this.f340491c);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized byte l(int i12) {
        a();
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i12 < this.f340490b)) {
            throw new IllegalArgumentException();
        }
        return this.f340491c.i().l(i12);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int size() {
        a();
        return this.f340490b;
    }
}
