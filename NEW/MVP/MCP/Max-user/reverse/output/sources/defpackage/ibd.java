package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ibd implements vv0 {
    public final qu0 a = new qu0();
    public boolean b;
    public final b4f c;

    public ibd(b4f b4fVar) {
        this.c = b4fVar;
    }

    @Override // defpackage.vv0
    public final vv0 E(int i, byte[] bArr) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.n0(i, bArr);
        l();
        return this;
    }

    @Override // defpackage.vv0
    public final vv0 I(String str) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.w0(str);
        l();
        return this;
    }

    @Override // defpackage.vv0
    public final vv0 K(xx0 xx0Var) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.o0(xx0Var);
        l();
        return this;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.L(qu0Var, j);
        l();
    }

    @Override // defpackage.vv0
    public final vv0 N(long j) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.s0(j);
        l();
        return this;
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        b4f b4fVar = this.c;
        if (this.b) {
            return;
        }
        try {
            qu0 qu0Var = this.a;
            long j = qu0Var.b;
            if (j > 0) {
                b4fVar.L(qu0Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            b4fVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.vv0
    public final vv0 e0(long j) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.r0(j);
        l();
        return this;
    }

    @Override // defpackage.vv0, defpackage.b4f, java.io.Flushable
    public final void flush() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qu0 qu0Var = this.a;
        long j = qu0Var.b;
        b4f b4fVar = this.c;
        if (j > 0) {
            b4fVar.L(qu0Var, j);
        }
        b4fVar.flush();
    }

    @Override // defpackage.vv0
    public final qu0 getBuffer() {
        return this.a;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    public final vv0 l() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qu0 qu0Var = this.a;
        long jW = qu0Var.w();
        if (jW > 0) {
            this.c.L(qu0Var, jW);
        }
        return this;
    }

    @Override // defpackage.b4f
    public final u9g m() {
        return this.c.m();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    @Override // defpackage.vv0
    public final vv0 u() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qu0 qu0Var = this.a;
        long j = qu0Var.b;
        if (j > 0) {
            this.c.L(qu0Var, j);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.a.write(byteBuffer);
        l();
        return iWrite;
    }

    @Override // defpackage.vv0
    public final vv0 writeByte(int i) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.q0(i);
        l();
        return this;
    }

    @Override // defpackage.vv0
    public final vv0 writeInt(int i) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.t0(i);
        l();
        return this;
    }

    @Override // defpackage.vv0
    public final vv0 writeShort(int i) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        this.a.u0(i);
        l();
        return this;
    }

    @Override // defpackage.vv0
    public final vv0 write(byte[] bArr) {
        if (!this.b) {
            this.a.n0(bArr.length, bArr);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
