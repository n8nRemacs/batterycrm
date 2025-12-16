package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: BufferMemoryChunk.java */
@Nullsafe
/* loaded from: classes13.dex */
public class k implements w, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public ByteBuffer f340476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340477c;

    /* renamed from: d, reason: collision with root package name */
    public final long f340478d = System.identityHashCode(this);

    public k(int i12) {
        this.f340476b = ByteBuffer.allocateDirect(i12);
        this.f340477c = i12;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int a(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        com.facebook.common.internal.o.d(!isClosed());
        this.f340476b.getClass();
        iA2 = y.a(i12, i14, this.f340477c);
        y.b(i12, bArr.length, i13, iA2, this.f340477c);
        this.f340476b.position(i12);
        this.f340476b.put(bArr, i13, iA2);
        return iA2;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final void b(w wVar, int i12) {
        wVar.getClass();
        long uniqueId = wVar.getUniqueId();
        long j12 = this.f340478d;
        if (uniqueId == j12) {
            Long.toHexString(j12);
            Long.toHexString(wVar.getUniqueId());
            com.facebook.common.internal.o.a(Boolean.FALSE);
        }
        if (wVar.getUniqueId() < this.f340478d) {
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
        ByteBuffer byteBuffer;
        if (!(wVar instanceof k)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.o.d(!isClosed());
        k kVar = (k) wVar;
        com.facebook.common.internal.o.d(!kVar.isClosed());
        this.f340476b.getClass();
        y.b(0, kVar.f340477c, 0, i12, this.f340477c);
        this.f340476b.position(0);
        synchronized (kVar) {
            byteBuffer = kVar.f340476b;
        }
        byteBuffer.getClass();
        byteBuffer.position(0);
        byte[] bArr = new byte[i12];
        this.f340476b.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // com.facebook.imagepipeline.memory.w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f340476b = null;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int e(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        com.facebook.common.internal.o.d(!isClosed());
        this.f340476b.getClass();
        iA2 = y.a(i12, i14, this.f340477c);
        y.b(i12, bArr.length, i13, iA2, this.f340477c);
        this.f340476b.position(i12);
        this.f340476b.get(bArr, i13, iA2);
        return iA2;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final int getSize() {
        return this.f340477c;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final long getUniqueId() {
        return this.f340478d;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized boolean isClosed() {
        return this.f340476b == null;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized byte l(int i12) {
        com.facebook.common.internal.o.d(!isClosed());
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 >= 0));
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 < this.f340477c));
        this.f340476b.getClass();
        return this.f340476b.get(i12);
    }
}
