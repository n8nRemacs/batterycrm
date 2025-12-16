package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ux implements b4f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ux(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        switch (this.a) {
            case 0:
                qoi.a(qu0Var.b, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    w9e w9eVar = qu0Var.a;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += w9eVar.c - w9eVar.b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                w9eVar = w9eVar.f;
                            }
                        }
                    }
                    s87 s87Var = (s87) this.b;
                    s87Var.i();
                    try {
                        try {
                            ((ux) this.c).L(qu0Var, j3);
                            if (s87Var.j()) {
                                throw s87Var.m(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!s87Var.j()) {
                                throw e;
                            }
                            throw s87Var.m(e);
                        }
                    } catch (Throwable th) {
                        s87Var.j();
                        throw th;
                    }
                }
            default:
                qoi.a(qu0Var.b, 0L, j);
                while (j > 0) {
                    ((u9g) this.c).f();
                    w9e w9eVar2 = qu0Var.a;
                    int iMin = (int) Math.min(j, w9eVar2.c - w9eVar2.b);
                    ((OutputStream) this.b).write(w9eVar2.a, w9eVar2.b, iMin);
                    int i = w9eVar2.b + iMin;
                    w9eVar2.b = i;
                    long j4 = iMin;
                    j -= j4;
                    qu0Var.b -= j4;
                    if (i == w9eVar2.c) {
                        qu0Var.a = w9eVar2.a();
                        oae.a(w9eVar2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                s87 s87Var = (s87) this.b;
                s87Var.i();
                try {
                    ((ux) this.c).close();
                    if (s87Var.j()) {
                        throw s87Var.m(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!s87Var.j()) {
                        throw e;
                    }
                    throw s87Var.m(e);
                } finally {
                    s87Var.j();
                }
            default:
                ((OutputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.b4f, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                s87 s87Var = (s87) this.b;
                s87Var.i();
                try {
                    ((ux) this.c).flush();
                    if (s87Var.j()) {
                        throw s87Var.m(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!s87Var.j()) {
                        throw e;
                    }
                    throw s87Var.m(e);
                } finally {
                    s87Var.j();
                }
            default:
                ((OutputStream) this.b).flush();
                return;
        }
    }

    @Override // defpackage.b4f
    public final u9g m() {
        switch (this.a) {
            case 0:
                return (s87) this.b;
            default:
                return (u9g) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((ux) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
