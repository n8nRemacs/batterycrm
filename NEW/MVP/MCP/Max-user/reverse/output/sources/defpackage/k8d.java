package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k8d implements fp5 {
    public final gf6 a;
    public rfg c;
    public int e;
    public long f;
    public int g;
    public int h;
    public final qyg b = new qyg(9);
    public int d = 0;

    public k8d(gf6 gf6Var) {
        this.a = gf6Var;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.d = 0;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        jp5Var.N(new w16(-9223372036854775807L));
        rfg rfgVarB = jp5Var.B(0, 3);
        this.c = rfgVarB;
        rfgVarB.d(this.a);
        jp5Var.w();
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        qyg qygVar = this.b;
        qygVar.B(8);
        ((mm4) hp5Var).n(qygVar.a, 0, 8, false);
        return qygVar.f() == 1380139777;
    }

    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws IOException {
        fsi.e(this.c);
        while (true) {
            int i = this.d;
            qyg qygVar = this.b;
            if (i == 0) {
                qygVar.B(8);
                if (!((mm4) hp5Var).a(qygVar.a, 0, 8, true)) {
                    return -1;
                }
                if (qygVar.f() != 1380139777) {
                    throw new IOException("Input not RawCC");
                }
                this.e = qygVar.s();
                this.d = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.g > 0) {
                        qygVar.B(3);
                        ((mm4) hp5Var).a(qygVar.a, 0, 3, false);
                        this.c.c(3, qygVar);
                        this.h += 3;
                        this.g--;
                    }
                    int i2 = this.h;
                    if (i2 > 0) {
                        this.c.b(this.f, 1, i2, 0, null);
                    }
                    this.d = 1;
                    return 0;
                }
                int i3 = this.e;
                if (i3 == 0) {
                    qygVar.B(5);
                    if (!((mm4) hp5Var).a(qygVar.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (qygVar.t() * 1000) / 45;
                    this.g = qygVar.s();
                    this.h = 0;
                    this.d = 2;
                } else {
                    if (i3 != 1) {
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unsupported version number: ");
                        sb.append(i3);
                        throw ParserException.a(null, sb.toString());
                    }
                    qygVar.B(9);
                    if (!((mm4) hp5Var).a(qygVar.a, 0, 9, true)) {
                        break;
                    }
                    this.f = qygVar.m();
                    this.g = qygVar.s();
                    this.h = 0;
                    this.d = 2;
                }
            }
        }
        this.d = 0;
        return -1;
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
