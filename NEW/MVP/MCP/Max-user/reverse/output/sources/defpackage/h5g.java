package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class h5g extends tk0 implements Handler.Callback {
    public final qha C0;
    public final ph4 D0;
    public jb4 E0;
    public final kof F0;
    public boolean G0;
    public int H0;
    public jof I0;
    public oof J0;
    public a72 K0;
    public a72 L0;
    public int M0;
    public final Handler N0;
    public final yl5 O0;
    public final xt4 P0;
    public boolean Q0;
    public boolean R0;
    public hf6 S0;
    public long T0;
    public long U0;
    public boolean V0;

    public h5g(yl5 yl5Var, Looper looper, kof kofVar) {
        Handler handler;
        super(3);
        this.O0 = yl5Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = zxg.a;
            handler = new Handler(looper, this);
        }
        this.N0 = handler;
        this.F0 = kofVar;
        this.C0 = new qha(17);
        this.D0 = new ph4(1);
        this.P0 = new xt4(19);
        this.U0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.V0 = false;
    }

    public final void B() {
        hsi.f("Legacy decoding is disabled, can't handle " + this.S0.n + " samples (expected application/x-media3-cues).", this.V0 || Objects.equals(this.S0.n, "application/cea-608") || Objects.equals(this.S0.n, "application/x-mp4-cea-608") || Objects.equals(this.S0.n, "application/cea-708"));
    }

    public final long C() {
        if (this.M0 == -1) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        this.K0.getClass();
        return this.M0 >= this.K0.s() ? BuildConfig.MAX_TIME_TO_UPLOAD : this.K0.g(this.M0);
    }

    public final long D(long j) {
        hsi.g(j != -9223372036854775807L);
        return j - this.u0;
    }

    public final void E(ib4 ib4Var) {
        zjd zjdVar = ib4Var.a;
        yl5 yl5Var = this.O0;
        yl5Var.a.x0.f(27, new oh2(2, zjdVar));
        em5 em5Var = yl5Var.a;
        em5Var.i1 = ib4Var;
        em5Var.x0.f(27, new wo4(14, ib4Var));
    }

    public final void F() {
        this.J0 = null;
        this.M0 = -1;
        a72 a72Var = this.K0;
        if (a72Var != null) {
            a72Var.x();
            this.K0 = null;
        }
        a72 a72Var2 = this.L0;
        if (a72Var2 != null) {
            a72Var2.x();
            this.L0 = null;
        }
    }

    @Override // defpackage.tk0
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        E((ib4) message.obj);
        return true;
    }

    @Override // defpackage.tk0
    public final boolean j() {
        return this.R0;
    }

    @Override // defpackage.tk0
    public final boolean l() {
        hf6 hf6Var = this.S0;
        if (hf6Var != null) {
            if (Objects.equals(hf6Var.n, "application/x-media3-cues")) {
                jb4 jb4Var = this.E0;
                jb4Var.getClass();
                if (jb4Var.a(this.T0) == Long.MIN_VALUE) {
                    try {
                        jxd jxdVar = this.s0;
                        jxdVar.getClass();
                        jxdVar.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.R0) {
                    return false;
                }
                if (this.Q0) {
                    a72 a72Var = this.K0;
                    long j = this.T0;
                    if (a72Var == null || a72Var.s() <= 0 || a72Var.g(a72Var.s() - 1) <= j) {
                        a72 a72Var2 = this.L0;
                        long j2 = this.T0;
                        if ((a72Var2 == null || a72Var2.s() <= 0 || a72Var2.g(a72Var2.s() - 1) <= j2) && this.J0 != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.tk0
    public final void m() {
        this.S0 = null;
        this.U0 = -9223372036854775807L;
        ib4 ib4Var = new ib4(D(this.T0), zjd.o);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, ib4Var).sendToTarget();
        } else {
            E(ib4Var);
        }
        this.T0 = -9223372036854775807L;
        if (this.I0 != null) {
            F();
            jof jofVar = this.I0;
            jofVar.getClass();
            jofVar.release();
            this.I0 = null;
            this.H0 = 0;
        }
    }

    @Override // defpackage.tk0
    public final void o(long j, boolean z) {
        this.T0 = j;
        jb4 jb4Var = this.E0;
        if (jb4Var != null) {
            jb4Var.clear();
        }
        ib4 ib4Var = new ib4(D(this.T0), zjd.o);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, ib4Var).sendToTarget();
        } else {
            E(ib4Var);
        }
        this.Q0 = false;
        this.R0 = false;
        this.U0 = -9223372036854775807L;
        hf6 hf6Var = this.S0;
        if (hf6Var == null || Objects.equals(hf6Var.n, "application/x-media3-cues")) {
            return;
        }
        if (this.H0 == 0) {
            F();
            jof jofVar = this.I0;
            jofVar.getClass();
            jofVar.flush();
            jofVar.d(this.v0);
            return;
        }
        F();
        jof jofVar2 = this.I0;
        jofVar2.getClass();
        jofVar2.release();
        this.I0 = null;
        this.H0 = 0;
        this.G0 = true;
        hf6 hf6Var2 = this.S0;
        hf6Var2.getClass();
        jof jofVarI = this.F0.i(hf6Var2);
        this.I0 = jofVarI;
        jofVarI.d(this.v0);
    }

    @Override // defpackage.tk0
    public final void u(hf6[] hf6VarArr, long j, long j2, d99 d99Var) {
        jb4 tg9Var;
        hf6 hf6Var = hf6VarArr[0];
        this.S0 = hf6Var;
        if (Objects.equals(hf6Var.n, "application/x-media3-cues")) {
            if (this.S0.L == 1) {
                tg9Var = new tg9();
            } else {
                jz7 jz7Var = new jz7();
                jz7Var.a = new ArrayList();
                tg9Var = jz7Var;
            }
            this.E0 = tg9Var;
            return;
        }
        B();
        if (this.I0 != null) {
            this.H0 = 1;
            return;
        }
        this.G0 = true;
        hf6 hf6Var2 = this.S0;
        hf6Var2.getClass();
        jof jofVarI = this.F0.i(hf6Var2);
        this.I0 = jofVarI;
        jofVarI.d(this.v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    @Override // defpackage.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5g.w(long, long):void");
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) {
        if (Objects.equals(hf6Var.n, "application/x-media3-cues") || this.F0.f(hf6Var)) {
            return tk0.b(hf6Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return xz9.l(hf6Var.n) ? tk0.b(1, 0, 0, 0) : tk0.b(0, 0, 0, 0);
    }
}
