package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLDisplay;
import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class rr4 implements e4h {
    public static final /* synthetic */ int y = 0;
    public final Context b;
    public final xo8 c;
    public final boolean d;
    public final EGLDisplay e;
    public final x20 f;
    public final iy1 g;
    public final d4h h;
    public final Executor i;
    public final boolean j;
    public final rz5 k;
    public final yn3 m;
    public qr4 n;
    public qr4 o;
    public boolean p;
    public final gf3 s;
    public final uy0 t;
    public final emd u;
    public volatile yj6 v;
    public volatile boolean w;
    public volatile boolean x;
    public final ArrayList q = new ArrayList();
    public final Object r = new Object();
    public final ArrayList l = new ArrayList();

    static {
        e19.a("media3.effect");
    }

    public rr4(Context context, xo8 xo8Var, boolean z, EGLDisplay eGLDisplay, x20 x20Var, iy1 iy1Var, d4h d4hVar, Executor executor, rz5 rz5Var, boolean z2, gf3 gf3Var, uy0 uy0Var, emd emdVar) {
        this.b = context;
        this.c = xo8Var;
        this.d = z;
        this.e = eGLDisplay;
        this.f = x20Var;
        this.g = iy1Var;
        this.h = d4hVar;
        this.i = executor;
        this.j = z2;
        this.s = gf3Var;
        this.u = emdVar;
        this.t = uy0Var;
        this.k = rz5Var;
        yn3 yn3Var = new yn3();
        this.m = yn3Var;
        yn3Var.f();
        fs4 fs4Var = new fs4();
        fs4Var.e = this;
        fs4Var.a = executor;
        fs4Var.b = d4hVar;
        fs4Var.c = iy1Var;
        fs4Var.d = emdVar;
        rz5Var.h.i();
        rz5Var.w = fs4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.qr4 r21, boolean r22) throws androidx.media3.common.VideoFrameProcessingException {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.a(qr4, boolean):void");
    }

    public final void b() {
        qr4 qr4Var;
        this.g.i();
        synchronized (this.r) {
            try {
                qr4Var = this.o;
                if (qr4Var != null) {
                    this.o = null;
                } else {
                    qr4Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qr4Var != null) {
            a(qr4Var, false);
        }
    }

    public final void c() throws ExecutionException, InterruptedException, TimeoutException {
        if (((j3) this.f.j) != null) {
            this.w = false;
            try {
                j3 j3Var = (j3) this.f.j;
                hsi.h(j3Var);
                j3Var.e();
                this.g.a();
                j3Var.s();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                mr4 mr4Var = new mr4(0, countDownLatch);
                synchronized (j3Var.b) {
                    j3Var.c = mr4Var;
                }
                iy1 iy1Var = this.g;
                rz5 rz5Var = this.k;
                Objects.requireNonNull(rz5Var);
                iy1Var.g(new mr4(1, rz5Var), true);
                countDownLatch.await();
                synchronized (j3Var.b) {
                    j3Var.c = null;
                }
                this.g.c(new nr4(this, 0));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.i.execute(new lr4(this, e, 1));
            }
        }
    }

    public final boolean d(Bitmap bitmap, ct3 ct3Var) {
        hsi.g(!this.w);
        boolean z = false;
        if (!this.m.e() || this.x) {
            return false;
        }
        if (gf3.h(this.s)) {
            if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            hsi.a("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", z);
        }
        yj6 yj6Var = this.v;
        yj6Var.getClass();
        j3 j3Var = (j3) this.f.j;
        hsi.h(j3Var);
        j3Var.k(bitmap, yj6Var, ct3Var);
        return true;
    }

    public final boolean e() {
        hsi.g(!this.w);
        hsi.i(this.v, "registerInputStream must be called before registering input frames");
        if (!this.m.e() || this.x) {
            return false;
        }
        j3 j3Var = (j3) this.f.j;
        hsi.h(j3Var);
        j3Var.n(this.v);
        return true;
    }

    public final void f(int i, long j, hf6 hf6Var, List list) {
        hf6 hf6Var2;
        if (this.x) {
            return;
        }
        int i2 = 1;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        float f = hf6Var.A;
        if (f > 1.0f) {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.t = (int) (hf6Var.u * f);
            ff6VarA.z = 1.0f;
            hf6Var2 = new hf6(ff6VarA);
        } else if (f < 1.0f) {
            ff6 ff6VarA2 = hf6Var.a();
            ff6VarA2.u = (int) (hf6Var.v / f);
            ff6VarA2.z = 1.0f;
            hf6Var2 = new hf6(ff6VarA2);
        } else {
            hf6Var2 = hf6Var;
        }
        this.v = new yj6(hf6Var2, j);
        try {
            this.m.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new lr4(this, e, 0));
        }
        synchronized (this.r) {
            try {
                qr4 qr4Var = new qr4(i, j, hf6Var, list);
                if (this.p) {
                    this.o = qr4Var;
                    this.m.d();
                    j3 j3Var = (j3) this.f.j;
                    j3Var.getClass();
                    j3Var.x();
                } else {
                    this.p = true;
                    this.m.d();
                    this.g.g(new o72(this, i2, qr4Var), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        this.x = true;
        try {
            this.g.e(new nr4(this, 1));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final void h(esf esfVar) throws ExecutionException, TimeoutException {
        rz5 rz5Var = this.k;
        rz5Var.getClass();
        try {
            rz5Var.h.c(new o72(rz5Var, 3, esfVar));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            rz5Var.i.execute(new qz5(rz5Var, 0, e));
        }
    }

    public final void i() {
        ah4.a();
        hsi.g(!this.w);
        this.w = true;
        if (this.x) {
            return;
        }
        j3 j3Var = (j3) this.f.j;
        j3Var.getClass();
        j3Var.x();
    }
}
