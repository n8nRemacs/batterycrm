package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ez9 extends sk0 implements Handler.Callback {
    public raj A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public long E0;
    public sy9 F0;
    public final q85 w0;
    public final xl5 x0;
    public final Handler y0;
    public final xy9 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez9(xl5 xl5Var, Looper looper) {
        Handler handler;
        super(5);
        q85 q85Var = q85.x0;
        this.x0 = xl5Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = xxg.a;
            handler = new Handler(looper, this);
        }
        this.y0 = handler;
        this.w0 = q85Var;
        this.z0 = new xy9(1);
        this.E0 = -9223372036854775807L;
    }

    public final void A(sy9 sy9Var) {
        xl5 xl5Var = this.x0;
        dm5 dm5Var = xl5Var.a;
        v19 v19Var = dm5Var.i1;
        cb6 cb6Var = dm5Var.w0;
        t19 t19VarA = v19Var.a();
        int i = 0;
        while (true) {
            qy9[] qy9VarArr = sy9Var.a;
            if (i >= qy9VarArr.length) {
                break;
            }
            qy9VarArr[i].p(t19VarA);
            i++;
        }
        dm5Var.i1 = new v19(t19VarA);
        v19 v19VarL0 = dm5Var.L0();
        if (!v19VarL0.equals(dm5Var.U0)) {
            dm5Var.U0 = v19VarL0;
            cb6Var.i(14, new wo4(15, xl5Var));
        }
        cb6Var.i(28, new wo4(17, sy9Var));
        cb6Var.e();
    }

    @Override // defpackage.sk0
    public final String f() {
        return "MetadataRenderer";
    }

    @Override // defpackage.sk0
    public final boolean h() {
        return this.C0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((sy9) message.obj);
        return true;
    }

    @Override // defpackage.sk0
    public final boolean i() {
        return true;
    }

    @Override // defpackage.sk0
    public final void j() {
        this.F0 = null;
        this.E0 = -9223372036854775807L;
        this.A0 = null;
    }

    @Override // defpackage.sk0
    public final void l(long j, boolean z) {
        this.F0 = null;
        this.E0 = -9223372036854775807L;
        this.B0 = false;
        this.C0 = false;
    }

    @Override // defpackage.sk0
    public final void p(gf6[] gf6VarArr, long j, long j2) {
        this.A0 = this.w0.m(gf6VarArr[0]);
    }

    @Override // defpackage.sk0
    public final void t(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.B0 && this.F0 == null) {
                xy9 xy9Var = this.z0;
                xy9Var.w();
                i5i i5iVar = this.b;
                i5iVar.f();
                int iQ = q(i5iVar, xy9Var, 0);
                if (iQ == -4) {
                    if (xy9Var.j(4)) {
                        this.B0 = true;
                    } else {
                        xy9Var.s0 = this.D0;
                        xy9Var.z();
                        raj rajVar = this.A0;
                        int i = xxg.a;
                        sy9 sy9VarA = rajVar.a(xy9Var);
                        if (sy9VarA != null) {
                            ArrayList arrayList = new ArrayList(sy9VarA.a.length);
                            z(sy9VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.F0 = new sy9(arrayList);
                                this.E0 = xy9Var.X;
                            }
                        }
                    }
                } else if (iQ == -5) {
                    gf6 gf6Var = (gf6) i5iVar.b;
                    gf6Var.getClass();
                    this.D0 = gf6Var.z0;
                }
            }
            sy9 sy9Var = this.F0;
            if (sy9Var == null || this.E0 > j) {
                z = false;
            } else {
                Handler handler = this.y0;
                if (handler != null) {
                    handler.obtainMessage(0, sy9Var).sendToTarget();
                } else {
                    A(sy9Var);
                }
                this.F0 = null;
                this.E0 = -9223372036854775807L;
                z = true;
            }
            if (this.B0 && this.F0 == null) {
                this.C0 = true;
            }
        }
    }

    @Override // defpackage.sk0
    public final int x(gf6 gf6Var) {
        if (this.w0.t(gf6Var)) {
            return sk0.b(gf6Var.O0 == 0 ? 4 : 2, 0, 0);
        }
        return sk0.b(0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.sy9 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            qy9[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            gf6 r2 = r2.l()
            if (r2 == 0) goto L3e
            q85 r3 = r5.w0
            boolean r4 = r3.t(r2)
            if (r4 == 0) goto L3e
            raj r2 = r3.m(r2)
            r1 = r1[r0]
            byte[] r1 = r1.o()
            r1.getClass()
            xy9 r3 = r5.z0
            r3.w()
            int r4 = r1.length
            r3.y(r4)
            java.nio.ByteBuffer r4 = r3.d
            r4.put(r1)
            r3.z()
            sy9 r1 = r2.a(r3)
            if (r1 == 0) goto L43
            r5.z(r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.z(sy9, java.util.ArrayList):void");
    }
}
