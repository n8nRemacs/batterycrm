package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class q87 implements b4f {
    public final qu0 a = new qu0();
    public boolean b;
    public final boolean c;
    public final /* synthetic */ t87 d;

    public q87(t87 t87Var, boolean z) {
        this.d = t87Var;
        this.c = z;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        byte[] bArr = yxg.a;
        qu0 qu0Var2 = this.a;
        qu0Var2.L(qu0Var, j);
        while (qu0Var2.b >= PlaybackStateCompat.ACTION_PREPARE) {
            c(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void c(boolean z) {
        long jMin;
        boolean z2;
        synchronized (this.d) {
            this.d.j.i();
            while (true) {
                try {
                    t87 t87Var = this.d;
                    if (t87Var.c < t87Var.d || this.c || this.b || t87Var.f() != 0) {
                        break;
                    }
                    try {
                        this.d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.d.j.l();
            this.d.b();
            t87 t87Var2 = this.d;
            jMin = Math.min(t87Var2.d - t87Var2.c, this.a.b);
            t87 t87Var3 = this.d;
            t87Var3.c += jMin;
            z2 = z && jMin == this.a.b && t87Var3.f() == 0;
        }
        this.d.j.i();
        try {
            t87 t87Var4 = this.d;
            t87Var4.n.y(t87Var4.m, z2, this.a, jMin);
        } finally {
            this.d.j.l();
        }
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t87 t87Var = this.d;
        byte[] bArr = yxg.a;
        synchronized (t87Var) {
            if (this.b) {
                return;
            }
            boolean z = this.d.f() == 0;
            t87 t87Var2 = this.d;
            if (!t87Var2.h.c) {
                if (this.a.b > 0) {
                    while (this.a.b > 0) {
                        c(true);
                    }
                } else if (z) {
                    t87Var2.n.y(t87Var2.m, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.b = true;
            }
            this.d.n.flush();
            this.d.a();
        }
    }

    @Override // defpackage.b4f, java.io.Flushable
    public final void flush() {
        t87 t87Var = this.d;
        byte[] bArr = yxg.a;
        synchronized (t87Var) {
            this.d.b();
        }
        while (this.a.b > 0) {
            c(false);
            this.d.n.flush();
        }
    }

    @Override // defpackage.b4f
    public final u9g m() {
        return this.d.j;
    }
}
