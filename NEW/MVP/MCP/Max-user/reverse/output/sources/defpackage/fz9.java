package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fz9 extends tk0 implements Handler.Callback {
    public final v17 C0;
    public final yl5 D0;
    public final Handler E0;
    public final yy9 F0;
    public saj G0;
    public boolean H0;
    public boolean I0;
    public long J0;
    public ty9 K0;
    public long L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz9(yl5 yl5Var, Looper looper) {
        Handler handler;
        super(5);
        v17 v17Var = v17.y0;
        this.D0 = yl5Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = zxg.a;
            handler = new Handler(looper, this);
        }
        this.E0 = handler;
        this.C0 = v17Var;
        this.F0 = new yy9(1);
        this.L0 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.ty9 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            ry9[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            hf6 r2 = r2.l()
            if (r2 == 0) goto L3e
            v17 r3 = r5.C0
            boolean r4 = r3.z(r2)
            if (r4 == 0) goto L3e
            saj r2 = r3.l(r2)
            r1 = r1[r0]
            byte[] r1 = r1.o()
            r1.getClass()
            yy9 r3 = r5.F0
            r3.w()
            int r4 = r1.length
            r3.y(r4)
            java.nio.ByteBuffer r4 = r3.o
            r4.put(r1)
            r3.z()
            ty9 r1 = r2.b(r3)
            if (r1 == 0) goto L43
            r5.B(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz9.B(ty9, java.util.ArrayList):void");
    }

    public final long C(long j) {
        hsi.g(j != -9223372036854775807L);
        hsi.g(this.L0 != -9223372036854775807L);
        return j - this.L0;
    }

    public final void D(ty9 ty9Var) {
        yl5 yl5Var = this.D0;
        em5 em5Var = yl5Var.a;
        w19 w19Var = em5Var.r1;
        ua8 ua8Var = em5Var.x0;
        u19 u19VarA = w19Var.a();
        int i = 0;
        while (true) {
            ry9[] ry9VarArr = ty9Var.a;
            if (i >= ry9VarArr.length) {
                break;
            }
            ry9VarArr[i].a(u19VarA);
            i++;
        }
        em5Var.r1 = new w19(u19VarA);
        w19 w19VarP0 = em5Var.P0();
        if (!w19VarP0.equals(em5Var.Z0)) {
            em5Var.Z0 = w19VarP0;
            ua8Var.c(14, new wo4(16, yl5Var));
        }
        ua8Var.c(28, new wo4(18, ty9Var));
        ua8Var.b();
    }

    @Override // defpackage.tk0
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        D((ty9) message.obj);
        return true;
    }

    @Override // defpackage.tk0
    public final boolean j() {
        return this.I0;
    }

    @Override // defpackage.tk0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.tk0
    public final void m() {
        this.K0 = null;
        this.G0 = null;
        this.L0 = -9223372036854775807L;
    }

    @Override // defpackage.tk0
    public final void o(long j, boolean z) {
        this.K0 = null;
        this.H0 = false;
        this.I0 = false;
    }

    @Override // defpackage.tk0
    public final void u(hf6[] hf6VarArr, long j, long j2, d99 d99Var) {
        this.G0 = this.C0.l(hf6VarArr[0]);
        ty9 ty9Var = this.K0;
        if (ty9Var != null) {
            long j3 = ty9Var.b;
            long j4 = (this.L0 + j3) - j2;
            if (j3 != j4) {
                ty9Var = new ty9(j4, ty9Var.a);
            }
            this.K0 = ty9Var;
        }
        this.L0 = j2;
    }

    @Override // defpackage.tk0
    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.H0 && this.K0 == null) {
                yy9 yy9Var = this.F0;
                yy9Var.w();
                xt4 xt4Var = this.c;
                xt4Var.clear();
                int iV = v(xt4Var, yy9Var, 0);
                if (iV == -4) {
                    if (yy9Var.j(4)) {
                        this.H0 = true;
                    } else if (yy9Var.Y >= this.v0) {
                        yy9Var.t0 = this.J0;
                        yy9Var.z();
                        saj sajVar = this.G0;
                        String str = zxg.a;
                        ty9 ty9VarB = sajVar.b(yy9Var);
                        if (ty9VarB != null) {
                            ArrayList arrayList = new ArrayList(ty9VarB.a.length);
                            B(ty9VarB, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.K0 = new ty9(C(yy9Var.Y), (ry9[]) arrayList.toArray(new ry9[0]));
                            }
                        }
                    }
                } else if (iV == -5) {
                    hf6 hf6Var = (hf6) xt4Var.c;
                    hf6Var.getClass();
                    this.J0 = hf6Var.s;
                }
            }
            ty9 ty9Var = this.K0;
            if (ty9Var == null || ty9Var.b > C(j)) {
                z = false;
            } else {
                ty9 ty9Var2 = this.K0;
                Handler handler = this.E0;
                if (handler != null) {
                    handler.obtainMessage(1, ty9Var2).sendToTarget();
                } else {
                    D(ty9Var2);
                }
                this.K0 = null;
                z = true;
            }
            if (this.H0 && this.K0 == null) {
                this.I0 = true;
            }
        }
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) {
        if (this.C0.z(hf6Var)) {
            return tk0.b(hf6Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return tk0.b(0, 0, 0, 0);
    }
}
