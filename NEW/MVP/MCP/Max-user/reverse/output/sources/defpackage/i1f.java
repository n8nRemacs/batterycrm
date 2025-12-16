package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class i1f implements mh4 {
    public final bfb a;
    public final ph4[] e;
    public final qh4[] f;
    public int g;
    public int h;
    public ph4 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public i1f(ph4[] ph4VarArr, qh4[] qh4VarArr) {
        this.e = ph4VarArr;
        this.g = ph4VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = qh4VarArr;
        this.h = qh4VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        bfb bfbVar = new bfb(3, this);
        this.a = bfbVar;
        bfbVar.start();
    }

    @Override // defpackage.mh4
    public final Object c() {
        ph4 ph4Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                hsi.g(this.i == null);
                int i = this.g;
                if (i == 0) {
                    ph4Var = null;
                } else {
                    ph4[] ph4VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    ph4Var = ph4VarArr[i2];
                }
                this.i = ph4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph4Var;
    }

    @Override // defpackage.mh4
    public final void d(long j) {
        synchronized (this.b) {
            try {
                hsi.g(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ph4 f();

    @Override // defpackage.mh4
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                ph4 ph4Var = this.i;
                if (ph4Var != null) {
                    ph4Var.w();
                    ph4[] ph4VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    ph4VarArr[i] = ph4Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    ph4 ph4Var2 = (ph4) this.c.removeFirst();
                    ph4Var2.w();
                    ph4[] ph4VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    ph4VarArr2[i2] = ph4Var2;
                }
                while (!this.d.isEmpty()) {
                    ((qh4) this.d.removeFirst()).x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract qh4 g();

    public abstract DecoderException h(Throwable th);

    public abstract DecoderException i(ph4 ph4Var, qh4 qh4Var, boolean z);

    public final boolean j() {
        boolean z;
        DecoderException decoderExceptionH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            ph4 ph4Var = (ph4) this.c.removeFirst();
            qh4[] qh4VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            qh4 qh4Var = qh4VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (ph4Var.j(4)) {
                qh4Var.a(4);
            } else {
                qh4Var.c = ph4Var.Y;
                if (ph4Var.j(134217728)) {
                    qh4Var.a(134217728);
                }
                long j = ph4Var.Y;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    qh4Var.d = true;
                }
                try {
                    decoderExceptionH = i(ph4Var, qh4Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionH = h(e);
                } catch (RuntimeException e2) {
                    decoderExceptionH = h(e2);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || qh4Var.d) {
                        qh4Var.x();
                    } else {
                        this.d.addLast(qh4Var);
                    }
                    ph4Var.w();
                    ph4[] ph4VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    ph4VarArr[i2] = ph4Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.mh4
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final qh4 b() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (qh4) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mh4
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void e(ph4 ph4Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                hsi.b(ph4Var == this.i);
                this.c.addLast(ph4Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(qh4 qh4Var) {
        synchronized (this.b) {
            qh4Var.w();
            qh4[] qh4VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            qh4VarArr[i] = qh4Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.mh4
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
