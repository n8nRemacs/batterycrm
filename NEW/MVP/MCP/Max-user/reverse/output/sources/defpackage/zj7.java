package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class zj7 implements x6f {
    public int a;
    public boolean b;
    public final jbd c;
    public final Inflater d;

    public zj7(jbd jbdVar, Inflater inflater) {
        this.c = jbdVar;
        this.d = inflater;
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws DataFormatException, IOException {
        do {
            long jC = c(qu0Var, j);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.d;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.c.l());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(qu0 qu0Var, long j) throws DataFormatException, IOException {
        Inflater inflater = this.d;
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                w9e w9eVarM0 = qu0Var.m0(1);
                int iMin = (int) Math.min(j, 8192 - w9eVarM0.c);
                boolean zNeedsInput = inflater.needsInput();
                jbd jbdVar = this.c;
                if (zNeedsInput && !jbdVar.l()) {
                    w9e w9eVar = jbdVar.a.a;
                    int i = w9eVar.c;
                    int i2 = w9eVar.b;
                    int i3 = i - i2;
                    this.a = i3;
                    inflater.setInput(w9eVar.a, i2, i3);
                }
                int iInflate = inflater.inflate(w9eVarM0.a, w9eVarM0.c, iMin);
                int i4 = this.a;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.a -= remaining;
                    jbdVar.skip(remaining);
                }
                if (iInflate > 0) {
                    w9eVarM0.c += iInflate;
                    long j2 = iInflate;
                    qu0Var.b += j2;
                    return j2;
                }
                if (w9eVarM0.b == w9eVarM0.c) {
                    qu0Var.a = w9eVarM0.a();
                    oae.a(w9eVarM0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.d.end();
        this.b = true;
        this.c.close();
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.c.c.m();
    }
}
