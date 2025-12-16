package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import com.facebook.infer.annotation.Nullsafe;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.k0;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: AshmemMemoryChunk.java */
@TargetApi(AvailableCode.USER_IGNORE_PREVIOUS_POPUP)
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36383a implements w, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public SharedMemory f340453b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public ByteBuffer f340454c;

    /* renamed from: d, reason: collision with root package name */
    public final long f340455d;

    public C36383a(int i12) throws ErrnoException {
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i12);
            this.f340453b = sharedMemoryCreate;
            this.f340454c = sharedMemoryCreate.mapReadWrite();
            this.f340455d = System.identityHashCode(this);
        } catch (ErrnoException e12) {
            throw new RuntimeException("Fail to create AshmemMemory", e12);
        }
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int a(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        this.f340454c.getClass();
        iA2 = y.a(i12, i14, getSize());
        y.b(i12, bArr.length, i13, iA2, getSize());
        this.f340454c.position(i12);
        this.f340454c.put(bArr, i13, iA2);
        return iA2;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final void b(w wVar, int i12) {
        wVar.getClass();
        long uniqueId = wVar.getUniqueId();
        long j12 = this.f340455d;
        if (uniqueId == j12) {
            Long.toHexString(j12);
            Long.toHexString(wVar.getUniqueId());
            com.facebook.common.internal.o.a(Boolean.FALSE);
        }
        if (wVar.getUniqueId() < this.f340455d) {
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
        if (!(wVar instanceof C36383a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.o.d(!isClosed());
        C36383a c36383a = (C36383a) wVar;
        com.facebook.common.internal.o.d(!c36383a.isClosed());
        this.f340454c.getClass();
        c36383a.f340454c.getClass();
        y.b(0, c36383a.getSize(), 0, i12, getSize());
        this.f340454c.position(0);
        c36383a.f340454c.position(0);
        byte[] bArr = new byte[i12];
        this.f340454c.get(bArr, 0, i12);
        c36383a.f340454c.put(bArr, 0, i12);
    }

    @Override // com.facebook.imagepipeline.memory.w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f340453b;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f340454c;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f340454c = null;
                this.f340453b = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized int e(int i12, int i13, int i14, byte[] bArr) {
        int iA2;
        this.f340454c.getClass();
        iA2 = y.a(i12, i14, getSize());
        y.b(i12, bArr.length, i13, iA2, getSize());
        this.f340454c.position(i12);
        this.f340454c.get(bArr, i13, iA2);
        return iA2;
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final int getSize() {
        this.f340453b.getClass();
        return this.f340453b.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final long getUniqueId() {
        return this.f340455d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // com.facebook.imagepipeline.memory.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.f340454c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.f340453b     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C36383a.isClosed():boolean");
    }

    @Override // com.facebook.imagepipeline.memory.w
    public final synchronized byte l(int i12) {
        com.facebook.common.internal.o.d(!isClosed());
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 >= 0));
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 < getSize()));
        this.f340454c.getClass();
        return this.f340454c.get(i12);
    }

    @k0
    public C36383a() {
        this.f340453b = null;
        this.f340454c = null;
        this.f340455d = System.identityHashCode(this);
    }
}
