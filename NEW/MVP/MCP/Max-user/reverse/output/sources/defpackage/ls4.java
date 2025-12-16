package defpackage;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class ls4 implements b4f {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public ls4(qu0 qu0Var, Deflater deflater) {
        this.c = new ibd(qu0Var);
        this.d = deflater;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                qoi.a(qu0Var.b, 0L, j);
                while (j > 0) {
                    w9e w9eVar = qu0Var.a;
                    int iMin = (int) Math.min(j, w9eVar.c - w9eVar.b);
                    ((Deflater) obj).setInput(w9eVar.a, w9eVar.b, iMin);
                    c(false);
                    long j2 = iMin;
                    qu0Var.b -= j2;
                    int i2 = w9eVar.b + iMin;
                    w9eVar.b = i2;
                    if (i2 == w9eVar.c) {
                        qu0Var.a = w9eVar.a();
                        oae.a(w9eVar);
                    }
                    j -= j2;
                }
                return;
            default:
                if (this.b) {
                    throw new IllegalStateException("closed");
                }
                long j3 = qu0Var.b;
                byte[] bArr = yxg.a;
                if (j < 0 || 0 > j3 || j3 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((vv0) ((a9) obj).f).L(qu0Var, j);
                return;
        }
    }

    public void c(boolean z) {
        w9e w9eVarM0;
        int iDeflate;
        Deflater deflater = (Deflater) this.d;
        ibd ibdVar = (ibd) this.c;
        qu0 qu0Var = ibdVar.a;
        while (true) {
            w9eVarM0 = qu0Var.m0(1);
            byte[] bArr = w9eVarM0.a;
            if (z) {
                int i = w9eVarM0.c;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = w9eVarM0.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                w9eVarM0.c += iDeflate;
                qu0Var.b += iDeflate;
                ibdVar.l();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (w9eVarM0.b == w9eVarM0.c) {
            qu0Var.a = w9eVarM0.a();
            oae.a(w9eVarM0);
        }
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.d;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    c(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((ibd) this.c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                a9 a9Var = (a9) this.d;
                if (this.b) {
                    return;
                }
                this.b = true;
                xh6 xh6Var = (xh6) this.c;
                u9g u9gVar = xh6Var.e;
                xh6Var.e = u9g.d;
                u9gVar.a();
                u9gVar.b();
                a9Var.a = 3;
                return;
        }
    }

    @Override // defpackage.b4f, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                c(true);
                ((ibd) this.c).flush();
                break;
            default:
                if (!this.b) {
                    ((vv0) ((a9) this.d).f).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.b4f
    public final u9g m() {
        switch (this.a) {
            case 0:
                return ((ibd) this.c).c.m();
            default:
                return (xh6) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((ibd) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public ls4(a9 a9Var) {
        this.d = a9Var;
        this.c = new xh6(((vv0) a9Var.f).m());
    }
}
