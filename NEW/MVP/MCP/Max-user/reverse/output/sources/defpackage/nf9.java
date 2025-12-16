package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class nf9 implements Closeable {
    public final int a;
    public vc3 b;

    public nf9(int i, qk4 qk4Var) {
        qk4Var.getClass();
        if (!(i >= 0 && i <= ((lf9) qk4Var.Z()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.b = qk4Var.clone();
        this.a = i;
    }

    public final synchronized void P(int i, int i2, int i3, byte[] bArr) {
        l();
        if (!(i + i3 <= this.a)) {
            throw new IllegalArgumentException();
        }
        this.b.getClass();
        ((lf9) this.b.Z()).P(i, i2, i3, bArr);
    }

    public final synchronized int Q() {
        l();
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        vc3.P(this.b);
        this.b = null;
    }

    public final synchronized void l() {
        synchronized (this) {
        }
        if (!vc3.i0(this.b)) {
            throw new RuntimeException() { // from class: com.facebook.common.memory.PooledByteBuffer$ClosedException
            };
        }
    }

    public final synchronized ByteBuffer o() {
        this.b.getClass();
        return ((lf9) this.b.Z()).o();
    }

    public final synchronized long w() {
        l();
        this.b.getClass();
        return ((lf9) this.b.Z()).Z();
    }

    public final synchronized byte y(int i) {
        l();
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i < this.a)) {
            throw new IllegalArgumentException();
        }
        this.b.getClass();
        return ((lf9) this.b.Z()).y(i);
    }
}
