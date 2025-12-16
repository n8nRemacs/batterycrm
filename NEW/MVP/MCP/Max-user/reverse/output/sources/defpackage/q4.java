package defpackage;

/* loaded from: classes.dex */
public final class q4 implements gp5 {
    public final s4 a = new s4("audio/ac3");
    public final umb b = new umb(2786);
    public boolean c;

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        int iA;
        umb umbVar = new umb(10);
        int i = 0;
        while (true) {
            ip5Var.i(0, umbVar.a, 10);
            umbVar.J(0);
            if (umbVar.A() != 4801587) {
                break;
            }
            umbVar.K(3);
            int iW = umbVar.w();
            i += iW + 10;
            ip5Var.q(iW);
        }
        ip5Var.y();
        ip5Var.q(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ip5Var.i(0, umbVar.a, 6);
            umbVar.J(0);
            if (umbVar.D() != 2935) {
                ip5Var.y();
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                ip5Var.q(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = umbVar.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = yr0.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    break;
                }
                ip5Var.q(iA - 6);
            }
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.a.i(kp5Var, new mjg(0, 1, 1, (byte) 0));
        kp5Var.w();
        kp5Var.Q(new ge0(-9223372036854775807L));
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        umb umbVar = this.b;
        int i = ip5Var.read(umbVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        umbVar.J(0);
        umbVar.I(i);
        boolean z = this.c;
        s4 s4Var = this.a;
        if (!z) {
            s4Var.o = 0L;
            this.c = true;
        }
        s4Var.f(umbVar);
        return 0;
    }
}
