package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class cv0 implements lf9, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = System.identityHashCode(this);

    public cv0(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    @Override // defpackage.lf9
    public final synchronized int P(int i, int i2, int i3, byte[] bArr) {
        int iB;
        l5j.f(!isClosed());
        this.a.getClass();
        iB = mvi.b(i, i3, this.b);
        mvi.c(i, bArr.length, i2, iB, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final synchronized int Q(int i, int i2, int i3, byte[] bArr) {
        int iB;
        l5j.f(!isClosed());
        this.a.getClass();
        iB = mvi.b(i, i3, this.b);
        mvi.c(i, bArr.length, i2, iB, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.lf9
    public final long Z() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final void c(lf9 lf9Var, int i) {
        if (!(lf9Var instanceof cv0)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        l5j.f(!isClosed());
        cv0 cv0Var = (cv0) lf9Var;
        l5j.f(!cv0Var.isClosed());
        this.a.getClass();
        mvi.c(0, cv0Var.b, 0, i, this.b);
        this.a.position(0);
        ByteBuffer byteBufferO = cv0Var.o();
        byteBufferO.getClass();
        byteBufferO.position(0);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        byteBufferO.put(bArr, 0, i);
    }

    @Override // defpackage.lf9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    @Override // defpackage.lf9
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.lf9
    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.lf9
    public final long l() {
        return this.c;
    }

    @Override // defpackage.lf9
    public final synchronized ByteBuffer o() {
        return this.a;
    }

    @Override // defpackage.lf9
    public final void w(lf9 lf9Var, int i) {
        lf9Var.getClass();
        if (lf9Var.l() == this.c) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.c) + " to BufferMemoryChunk " + Long.toHexString(lf9Var.l()) + " which are the same ");
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
        if (i >= this.b) {
            z = false;
        }
        l5j.a(Boolean.valueOf(z));
        this.a.getClass();
        return this.a.get(i);
    }
}
