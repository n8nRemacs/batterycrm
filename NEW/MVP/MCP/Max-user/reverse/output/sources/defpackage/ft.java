package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ft implements lf9, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public ft(int i) throws ErrnoException {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = sharedMemoryCreate;
            this.b = sharedMemoryCreate.mapReadWrite();
            this.c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    @Override // defpackage.lf9
    public final synchronized int P(int i, int i2, int i3, byte[] bArr) {
        int iB;
        this.b.getClass();
        iB = mvi.b(i, i3, getSize());
        mvi.c(i, bArr.length, i2, iB, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final synchronized int Q(int i, int i2, int i3, byte[] bArr) {
        int iB;
        this.b.getClass();
        iB = mvi.b(i, i3, getSize());
        mvi.c(i, bArr.length, i2, iB, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final long Z() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public final void c(lf9 lf9Var, int i) {
        if (!(lf9Var instanceof ft)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        l5j.f(!isClosed());
        ft ftVar = (ft) lf9Var;
        l5j.f(!ftVar.isClosed());
        this.b.getClass();
        ftVar.b.getClass();
        mvi.c(0, ftVar.getSize(), 0, i, getSize());
        this.b.position(0);
        ftVar.b.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        ftVar.b.put(bArr, 0, i);
    }

    @Override // defpackage.lf9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lf9
    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // defpackage.lf9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.a     // Catch: java.lang.Throwable -> Lc
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.isClosed():boolean");
    }

    @Override // defpackage.lf9
    public final long l() {
        return this.c;
    }

    @Override // defpackage.lf9
    public final ByteBuffer o() {
        return this.b;
    }

    @Override // defpackage.lf9
    public final void w(lf9 lf9Var, int i) {
        lf9Var.getClass();
        if (lf9Var.l() == this.c) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.c) + " to AshmemMemoryChunk " + Long.toHexString(lf9Var.l()) + " which are the same ");
            l5j.a(Boolean.FALSE);
        }
        if (lf9Var.l() < this.c) {
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
        l5j.a(Boolean.valueOf(i >= 0));
        if (i >= getSize()) {
            z = false;
        }
        l5j.a(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }
}
