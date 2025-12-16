package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class jv7 implements fp5 {
    public jp5 b;
    public int c;
    public int d;
    public int e;
    public q2a g;
    public hp5 h;
    public v32 i;
    public t3a j;
    public final qyg a = new qyg(6);
    public long f = -1;

    public final void a() {
        b(new qy9[0]);
        jp5 jp5Var = this.b;
        jp5Var.getClass();
        jp5Var.w();
        this.b.N(new w16(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(qy9... qy9VarArr) {
        jp5 jp5Var = this.b;
        jp5Var.getClass();
        rfg rfgVarB = jp5Var.B(1024, 4);
        ef6 ef6Var = new ef6();
        ef6Var.j = "image/jpeg";
        ef6Var.i = new sy9(qy9VarArr);
        rfgVarB.d(new gf6(ef6Var));
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            t3a t3aVar = this.j;
            t3aVar.getClass();
            t3aVar.d(j, j2);
        }
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.b = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        mm4 mm4Var = (mm4) hp5Var;
        qyg qygVar = this.a;
        qygVar.B(2);
        mm4Var.n(qygVar.a, 0, 2, false);
        if (qygVar.x() == 65496) {
            qygVar.B(2);
            mm4Var.n(qygVar.a, 0, 2, false);
            int iX = qygVar.x();
            this.d = iX;
            if (iX == 65504) {
                qygVar.B(2);
                mm4Var.n(qygVar.a, 0, 2, false);
                mm4Var.b(qygVar.x() - 2, false);
                qygVar.B(2);
                mm4Var.n(qygVar.a, 0, 2, false);
                this.d = qygVar.x();
            }
            if (this.d == 65505) {
                mm4Var.b(2, false);
                qygVar.B(6);
                mm4Var.n(qygVar.a, 0, 6, false);
                if (qygVar.t() == 1165519206 && qygVar.x() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015e  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r26, defpackage.n7 r27) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv7.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
        t3a t3aVar = this.j;
        if (t3aVar != null) {
            t3aVar.getClass();
        }
    }
}
