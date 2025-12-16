package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f4h {
    public final jx8 a;
    public final m4h b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public mwf l = mwf.a;

    public f4h(Context context, jx8 jx8Var, long j) {
        this.a = jx8Var;
        this.c = j;
        this.b = new m4h(context, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, defpackage.dq0 r37) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4h.a(long, long, long, long, boolean, boolean, dq0):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = zxg.U(SystemClock.elapsedRealtime());
        m4h m4hVar = this.b;
        m4hVar.b = true;
        m4hVar.k = 0L;
        m4hVar.n = -1L;
        m4hVar.l = -1L;
        j4h j4hVar = (j4h) m4hVar.q;
        if (j4hVar != null) {
            DisplayManager displayManager = j4hVar.b;
            l4h l4hVar = (l4h) m4hVar.r;
            l4hVar.getClass();
            l4hVar.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(j4hVar, zxg.n(null));
            m4h.a((m4h) j4hVar.c, displayManager.getDisplay(0));
        }
        m4hVar.d(false);
    }

    public final void e() {
        this.d = false;
        this.i = -9223372036854775807L;
        m4h m4hVar = this.b;
        m4hVar.b = false;
        j4h j4hVar = (j4h) m4hVar.q;
        if (j4hVar != null) {
            j4hVar.b.unregisterDisplayListener(j4hVar);
            l4h l4hVar = (l4h) m4hVar.r;
            l4hVar.getClass();
            l4hVar.b.sendEmptyMessage(3);
        }
        m4hVar.b();
    }

    public final void f(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.e = Math.min(this.e, 2);
        }
    }

    public final void g(float f) {
        m4h m4hVar = this.b;
        m4hVar.d = f;
        j16 j16Var = (j16) m4hVar.p;
        ((i16) j16Var.d).c();
        ((i16) j16Var.e).c();
        j16Var.a = false;
        j16Var.b = -9223372036854775807L;
        j16Var.c = 0;
        m4hVar.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.n = false;
        m4h m4hVar = this.b;
        if (m4hVar.c != surface) {
            m4hVar.b();
            m4hVar.c = surface;
            m4hVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f) {
        hsi.b(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        m4h m4hVar = this.b;
        m4hVar.g = f;
        m4hVar.k = 0L;
        m4hVar.n = -1L;
        m4hVar.l = -1L;
        m4hVar.d(false);
    }
}
