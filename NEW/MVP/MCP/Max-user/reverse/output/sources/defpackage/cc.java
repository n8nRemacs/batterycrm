package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class cc implements fp5 {
    public final qyg c;
    public final u62 d;
    public jp5 e;
    public long f;
    public boolean h;
    public boolean i;
    public final ec a = new ec(true, null);
    public final qyg b = new qyg(2048);
    public long g = -1;

    public cc(int i) {
        qyg qygVar = new qyg(10);
        this.c = qygVar;
        byte[] bArr = qygVar.a;
        this.d = new u62(bArr, bArr.length, 2, (byte) 0);
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.e = jp5Var;
        this.a.j(jp5Var, new mjg(0, 1, 0, (byte) 0));
        jp5Var.w();
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            qyg qygVar = this.c;
            hp5Var.i(0, qygVar.a, 10);
            qygVar.E(0);
            if (qygVar.u() != 4801587) {
                break;
            }
            qygVar.F(3);
            int iR = qygVar.r();
            i += iR + 10;
            hp5Var.q(iR);
        }
        hp5Var.y();
        hp5Var.q(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            qyg qygVar2 = this.c;
            mm4 mm4Var = (mm4) hp5Var;
            mm4Var.n(qygVar2.a, 0, 2, false);
            qygVar2.E(0);
            if ((qygVar2.x() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                mm4Var.n(qygVar2.a, 0, 4, false);
                u62 u62Var = this.d;
                u62Var.q(14);
                int i5 = u62Var.i(13);
                if (i5 <= 6) {
                    i2++;
                    mm4Var.X = 0;
                    mm4Var.b(i2, false);
                } else {
                    mm4Var.b(i5 - 6, false);
                    i4 += i5;
                }
            } else {
                i2++;
                mm4Var.X = 0;
                mm4Var.b(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws ParserException, EOFException, InterruptedIOException {
        fsi.e(this.e);
        long j = ((mm4) hp5Var).c;
        qyg qygVar = this.b;
        int i = ((mm4) hp5Var).read(qygVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.N(new w16(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        qygVar.E(0);
        qygVar.D(i);
        boolean z2 = this.h;
        ec ecVar = this.a;
        if (!z2) {
            ecVar.e(4, this.f);
            this.h = true;
        }
        ecVar.d(qygVar);
        return 0;
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
