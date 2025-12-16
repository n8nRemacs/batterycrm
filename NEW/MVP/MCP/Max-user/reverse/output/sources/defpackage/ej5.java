package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class ej5 implements x6f {
    public final long X;
    public final /* synthetic */ gge Y;
    public final x6f a;
    public long b;
    public boolean c = true;
    public boolean d;
    public boolean o;

    public ej5(gge ggeVar, x6f x6fVar, long j) {
        this.Y = ggeVar;
        this.a = x6fVar;
        this.X = j;
        if (j == 0) {
            w(null);
        }
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws IOException {
        if (this.o) {
            throw new IllegalStateException("closed");
        }
        try {
            long jB = this.a.b(qu0Var, j);
            if (this.c) {
                this.c = false;
                this.Y.getClass();
            }
            if (jB == -1) {
                w(null);
                return -1L;
            }
            long j2 = this.b + jB;
            long j3 = this.X;
            if (j3 == -1 || j2 <= j3) {
                this.b = j2;
                if (j2 == j3) {
                    w(null);
                }
                return jB;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw w(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.o) {
            return;
        }
        this.o = true;
        try {
            l();
            w(null);
        } catch (IOException e) {
            throw w(e);
        }
    }

    public final void l() throws IOException {
        this.a.close();
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.a.m();
    }

    public final String toString() {
        return ej5.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException w(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        gge ggeVar = this.Y;
        if (iOException == null && this.c) {
            this.c = false;
            ggeVar.getClass();
        }
        return ggeVar.b(true, false, iOException);
    }
}
