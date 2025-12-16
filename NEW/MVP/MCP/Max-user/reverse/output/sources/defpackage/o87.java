package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o87 implements x6f {
    public final wv0 X;
    public int a;
    public int b;
    public int c;
    public int d;
    public int o;

    public o87(wv0 wv0Var) {
        this.X = wv0Var;
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.d;
            wv0 wv0Var = this.X;
            if (i3 == 0) {
                wv0Var.skip(this.o);
                this.o = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iS = yxg.s(wv0Var);
                    this.d = iS;
                    this.a = iS;
                    int i4 = wv0Var.readByte() & 255;
                    this.b = wv0Var.readByte() & 255;
                    Logger logger = p87.d;
                    if (logger.isLoggable(Level.FINE)) {
                        xx0 xx0Var = d87.a;
                        logger.fine(d87.a(true, this.c, this.a, i4, this.b));
                    }
                    i2 = wv0Var.readInt() & Integer.MAX_VALUE;
                    this.c = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jB = wv0Var.b(qu0Var, Math.min(j, i3));
                if (jB != -1) {
                    this.d -= (int) jB;
                    return jB;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.X.m();
    }
}
