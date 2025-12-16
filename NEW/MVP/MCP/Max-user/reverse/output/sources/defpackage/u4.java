package defpackage;

/* loaded from: classes.dex */
public final class u4 implements gp5 {
    public final s4 a = new s4(null, 0, 1, "audio/ac4");
    public final umb b = new umb(16384);
    public boolean c;

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        int i;
        umb umbVar = new umb(10);
        int i2 = 0;
        while (true) {
            ip5Var.i(0, umbVar.a, 10);
            umbVar.J(0);
            if (umbVar.A() != 4801587) {
                break;
            }
            umbVar.K(3);
            int iW = umbVar.w();
            i2 += iW + 10;
            ip5Var.q(iW);
        }
        ip5Var.y();
        ip5Var.q(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ip5Var.i(0, umbVar.a, 7);
            umbVar.J(0);
            int iD = umbVar.D();
            if (iD == 44096 || iD == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = umbVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iD == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                ip5Var.q(i - 7);
            } else {
                ip5Var.y();
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                ip5Var.q(i4);
                i3 = 0;
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
        int i = ip5Var.read(umbVar.a, 0, 16384);
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
