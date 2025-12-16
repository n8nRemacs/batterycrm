package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b87 extends y77 {
    public long d;
    public final /* synthetic */ a9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b87(a9 a9Var, long j) {
        super(a9Var);
        this.o = a9Var;
        this.d = j;
        if (j == 0) {
            l();
        }
    }

    @Override // defpackage.y77, defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jB = super.b(qu0Var, Math.min(j2, j));
        if (jB == -1) {
            ((qbd) this.o.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            l();
            throw protocolException;
        }
        long j3 = this.d - jB;
        this.d = j3;
        if (j3 == 0) {
            l();
        }
        return jB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.b) {
            return;
        }
        if (this.d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zT = yxg.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((qbd) this.o.d).k();
                l();
            }
        }
        this.b = true;
    }
}
