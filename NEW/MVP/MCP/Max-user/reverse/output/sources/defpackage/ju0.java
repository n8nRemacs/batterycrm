package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ju0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv0 b;

    public /* synthetic */ ju0(wv0 wv0Var, int i) {
        this.a = i;
        this.b = wv0Var;
    }

    private final void l() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.a) {
            case 0:
                jMin = Math.min(((qu0) this.b).b, Integer.MAX_VALUE);
                break;
            default:
                jbd jbdVar = (jbd) this.b;
                if (!jbdVar.b) {
                    jMin = Math.min(jbdVar.a.b, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((jbd) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                qu0 qu0Var = (qu0) this.b;
                if (qu0Var.b > 0) {
                    return qu0Var.readByte() & 255;
                }
                return -1;
            default:
                jbd jbdVar = (jbd) this.b;
                qu0 qu0Var2 = jbdVar.a;
                if (jbdVar.b) {
                    throw new IOException("closed");
                }
                if (qu0Var2.b == 0 && jbdVar.c.b(qu0Var2, 8192) == -1) {
                    return -1;
                }
                return qu0Var2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((qu0) this.b) + ".inputStream()";
            default:
                return ((jbd) this.b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                return ((qu0) this.b).read(bArr, i, i2);
            default:
                jbd jbdVar = (jbd) this.b;
                qu0 qu0Var = jbdVar.a;
                if (!jbdVar.b) {
                    qoi.a(bArr.length, i, i2);
                    if (qu0Var.b == 0 && jbdVar.c.b(qu0Var, 8192) == -1) {
                        return -1;
                    }
                    return qu0Var.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
