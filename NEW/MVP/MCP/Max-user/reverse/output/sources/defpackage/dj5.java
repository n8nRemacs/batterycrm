package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class dj5 implements b4f {
    public final /* synthetic */ gge X;
    public final b4f a;
    public boolean b;
    public long c;
    public boolean d;
    public final long o;

    public dj5(gge ggeVar, b4f b4fVar, long j) {
        this.X = ggeVar;
        this.a = b4fVar;
        this.o = j;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) throws IOException {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.o;
        if (j2 != -1 && this.c + j > j2) {
            StringBuilder sbL = az1.l(j2, "expected ", " bytes but received ");
            sbL.append(this.c + j);
            throw new ProtocolException(sbL.toString());
        }
        try {
            this.a.L(qu0Var, j);
            this.c += j;
        } catch (IOException e) {
            throw w(e);
        }
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.d = true;
        long j = this.o;
        if (j != -1 && this.c != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            l();
            w(null);
        } catch (IOException e) {
            throw w(e);
        }
    }

    @Override // defpackage.b4f, java.io.Flushable
    public final void flush() throws IOException {
        try {
            y();
        } catch (IOException e) {
            throw w(e);
        }
    }

    public final void l() {
        this.a.close();
    }

    @Override // defpackage.b4f
    public final u9g m() {
        return this.a.m();
    }

    public final String toString() {
        return dj5.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException w(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.X.b(false, true, iOException);
    }

    public final void y() {
        this.a.flush();
    }
}
